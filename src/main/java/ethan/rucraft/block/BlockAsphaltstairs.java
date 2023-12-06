
package ethan.rucraft.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.Block;

import ethan.rucraft.creativetab.TabRuCraft;
import ethan.rucraft.ElementsRucraftMod;

@ElementsRucraftMod.ModElement.Tag
public class BlockAsphaltstairs extends ElementsRucraftMod.ModElement {
	@GameRegistry.ObjectHolder("rucraft:asphaltstairs")
	public static final Block block = null;
	public BlockAsphaltstairs(ElementsRucraftMod instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("asphaltstairs"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("rucraft:asphaltstairs", "inventory"));
	}
	public static class BlockCustom extends BlockStairs {
		public BlockCustom() {
			super(new Block(Material.ROCK).getDefaultState());
			setUnlocalizedName("asphaltstairs");
			setSoundType(SoundType.STONE);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabRuCraft.tab);
		}
	}
}
