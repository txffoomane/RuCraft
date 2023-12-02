
package ethan.rucraft.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

import ethan.rucraft.ElementsRucraftMod;

@ElementsRucraftMod.ModElement.Tag
public class TabRuCraft extends ElementsRucraftMod.ModElement {
	public TabRuCraft(ElementsRucraftMod instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabru_craft") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.PLANKS, (int) (1), 4);
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
