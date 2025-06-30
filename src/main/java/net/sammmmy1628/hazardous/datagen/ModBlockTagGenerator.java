package net.sammmmy1628.hazardous.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.sammmmy1628.hazardous.Hazardous;
import net.sammmmy1628.hazardous.block.HazardousBlocks;
import net.sammmmy1628.hazardous.util.HazardousTags;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Hazardous.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(HazardousBlocks.IRON_GRATE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(HazardousBlocks.IRON_GRATE.get());

    }
}
