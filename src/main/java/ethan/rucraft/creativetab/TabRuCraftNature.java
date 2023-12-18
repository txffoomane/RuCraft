
package ethan.rucraft.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

import ethan.rucraft.ElementsRucraftMod;

@ElementsRucraftMod.ModElement.Tag
public class TabRuCraftNature extends ElementsRucraftMod.ModElement {
	public TabRuCraftNature(ElementsRucraftMod instance) {
		super(instance, 66);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabru_craft_nature") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.LEAVES, (int) (1), 2);
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
