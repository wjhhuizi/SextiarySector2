package shift.sextiarysector.plugin;

import net.minecraft.block.Block;
import shift.sextiarysector.api.SextiarySectorAPI;
import shift.sextiarysector.block.BlockTofuMotor;
import shift.sextiarysector.item.ItemBlockDirection;
import shift.sextiarysector.renderer.block.RendererTofuMotor;
import shift.sextiarysector.tileentity.TileEntityTofuMotor;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PluginTofu  implements IPlugin{

	@Override
	public String getModName() {
		return "TofuCraft";
	}

	public static int tofuMotorType;
	public static Block tofuMotor;

	@Override
	public void prePlugin(FMLPreInitializationEvent event) {
		tofuMotor = new BlockTofuMotor().setBlockName("ss.tofu_motor").setCreativeTab(SextiarySectorAPI.TabSSIndustry);
		GameRegistry.registerBlock(tofuMotor, ItemBlockDirection.class, "TofuMotor");
		GameRegistry.registerTileEntity(TileEntityTofuMotor.class, "TofuMotor");

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void preClientPlugin(FMLPreInitializationEvent event) {

		tofuMotorType = cpw.mods.fml.client.registry.RenderingRegistry.getNextAvailableRenderId();
		cpw.mods.fml.client.registry.RenderingRegistry.registerBlockHandler(new RendererTofuMotor());
		cpw.mods.fml.client.registry.ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTofuMotor.class, new RendererTofuMotor());

	}

	@Override
	public void initPlugin(FMLInitializationEvent event) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void postPlugin(FMLPostInitializationEvent event) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
