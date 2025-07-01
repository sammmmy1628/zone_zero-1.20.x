package net.sammmmy1628.zonezero.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.sammmmy1628.zonezero.ZoneZero;
import net.sammmmy1628.zonezero.block.zzBlocks;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ZoneZero.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(zzBlocks.IRON_GRATE.get())
                .add(zzBlocks.IRON_GRATE_EXPOSED.get())
                .add(zzBlocks.IRON_GRATE_OXIDIZED.get())

                .add(zzBlocks.IRON_SCAFFOLDING.get())
                .add(zzBlocks.IRON_SCAFFOLDING_EXPOSED.get())
                .add(zzBlocks.IRON_SCAFFOLDING_OXIDIZED.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(zzBlocks.IRON_GRATE.get())
                .add(zzBlocks.IRON_GRATE_EXPOSED.get())
                .add(zzBlocks.IRON_GRATE_OXIDIZED.get())

                .add(zzBlocks.IRON_SCAFFOLDING.get())
                .add(zzBlocks.IRON_SCAFFOLDING_EXPOSED.get())
                .add(zzBlocks.IRON_SCAFFOLDING_OXIDIZED.get());

    }
}
