package net.sammmmy1628.zonezero.item;

import net.minecraft.ChatFormatting;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class HealthPackItem extends Item {
    private static final int USE_DURATION = 80; // 4 seconds (in ticks)
    private static final int COOLDOWN_TICKS = 200; // 10 seconds

    public HealthPackItem(Properties properties) {
        super(properties);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.BLOCK; // Optional visual
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (player.getCooldowns().isOnCooldown(this)) {
            return InteractionResultHolder.fail(player.getItemInHand(hand));
        }

        player.startUsingItem(hand);
        return InteractionResultHolder.consume(player.getItemInHand(hand));
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return USE_DURATION;
    }

    @Override
    public void onUseTick(Level level, LivingEntity entity, ItemStack stack, int remainingUseTicks) {
        if (!(entity instanceof Player player)) return;

        int elapsed = getUseDuration(stack) - remainingUseTicks;

        if (elapsed == USE_DURATION) {
            if (!level.isClientSide) {
                float healAmount = 6.0f; // 3 hearts
                player.heal(healAmount);

                ((ServerLevel) level).sendParticles(ParticleTypes.HEART,
                        player.getX(), player.getY() + 1, player.getZ(),
                        6, 0.3, 0.5, 0.3, 0.1);

                level.playSound(null, player.blockPosition(), SoundEvents.GENERIC_DRINK, SoundSource.PLAYERS, 1.0F, 1.0F);

                player.getCooldowns().addCooldown(this, COOLDOWN_TICKS);
            }
        }
    }

    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.literal("Hold to heal 3 hearts").withStyle(ChatFormatting.GREEN));
        tooltip.add(Component.literal("Cooldown: 10 seconds").withStyle(ChatFormatting.GRAY));
    }

}
