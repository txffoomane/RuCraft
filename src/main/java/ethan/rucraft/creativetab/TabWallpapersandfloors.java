
package ethan.rucraft.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import ethan.rucraft.block.BlockWallpaper0;
import ethan.rucraft.ElementsRucraftMod;

@ElementsRucraftMod.ModElement.Tag
public class TabWallpapersandfloors extends ElementsRucraftMod.ModElement {
	public TabWallpapersandfloors(ElementsRucraftMod instance) {
		super(instance, 77);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabwallpapersandfloors") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockWallpaper0.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
