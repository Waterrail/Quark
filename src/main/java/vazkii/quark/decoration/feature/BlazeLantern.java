/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 *
 * Quark is Open Source and distributed under the
 * CC-BY-NC-SA 3.0 License: https://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB
 *
 * File Created @ [20/03/2016, 22:33:44 (GMT)]
 */
package vazkii.quark.decoration.feature;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import vazkii.arl.block.BlockMod;
import vazkii.arl.util.RecipeHandler;
import vazkii.quark.base.module.Feature;
import vazkii.quark.decoration.block.BlockBlazeLantern;

public class BlazeLantern extends Feature {

	public static BlockMod blaze_lantern;

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		blaze_lantern = new BlockBlazeLantern();

		RecipeHandler.addOreDictRecipe(new ItemStack(blaze_lantern),
				"BPB", "PPP", "BPB",
				'B', new ItemStack(Items.BLAZE_ROD),
				'P', new ItemStack(Items.BLAZE_POWDER));
	}
	
	@Override
	public boolean requiresMinecraftRestartToEnable() {
		return true;
	}

}
