/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcdonalds.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.mcdonalds.block.MCdonaldsworkstationBlock;
import net.mcreator.mcdonalds.McdonaldsMod;

public class McdonaldsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(McdonaldsMod.MODID);
	public static final DeferredBlock<Block> M_CDONALDSWORKSTATION = REGISTRY.register("m_cdonaldsworkstation", MCdonaldsworkstationBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}