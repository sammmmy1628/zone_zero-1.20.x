package net.sammmmy1628.zonezero.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.zonezero.ZoneZero;
import net.sammmmy1628.zonezero.block.zzBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ZoneZero.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(zzBlocks.IRON_GRATE);
        blockWithItem(zzBlocks.IRON_GRATE_EXPOSED);
        blockWithItem(zzBlocks.IRON_GRATE_OXIDIZED);
        blockWithItem(zzBlocks.IRON_SCAFFOLDING);
        blockWithItem(zzBlocks.IRON_SCAFFOLDING_EXPOSED);
        blockWithItem(zzBlocks.IRON_SCAFFOLDING_OXIDIZED);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}