package shift.sextiarysector.nei;

import shift.sextiarysector.gui.GuiFluidFurnace;
import shift.sextiarysector.gui.GuiFoodSmokers;
import shift.sextiarysector.gui.GuiFreezer;
import shift.sextiarysector.gui.GuiLargeFurnace;
import shift.sextiarysector.gui.GuiLoom;
import shift.sextiarysector.gui.GuiMagicFurnace;
import shift.sextiarysector.gui.GuiMillstone;
import shift.sextiarysector.gui.GuiPulverizer;
import shift.sextiarysector.gui.GuiRollingMachine;
import shift.sextiarysector.gui.GuiSawmill;
import shift.sextiarysector.gui.GuiTimeMachine;
import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;

public class NEISextiarySectorConfig implements IConfigureNEI {

	@Override
	public void loadConfig() {


		API.registerRecipeHandler(new MillstoneRecipeHandler());
		API.registerUsageHandler(new MillstoneRecipeHandler());

		API.registerRecipeHandler(new LoomRecipeHandler());
		API.registerUsageHandler(new LoomRecipeHandler());

		API.registerRecipeHandler(new SawmillRecipeHandler());
		API.registerUsageHandler(new SawmillRecipeHandler());

		API.registerRecipeHandler(new PulverizerRecipeHandler());
		API.registerUsageHandler(new PulverizerRecipeHandler());

		API.registerRecipeHandler(new RollingMachineRecipeHandler());
		API.registerUsageHandler(new RollingMachineRecipeHandler());

		API.registerRecipeHandler(new TimeMachineRecipeHandler());
		API.registerUsageHandler(new TimeMachineRecipeHandler());

		/*
		API.registerRecipeHandler(new LoomRecipeHandler());
		API.registerUsageHandler(new LoomRecipeHandler());

		API.registerRecipeHandler(new CentrifugalSeparatorRecipeHandler());
		API.registerUsageHandler(new CentrifugalSeparatorRecipeHandler());
		*/

		API.registerRecipeHandler(new FurnaceShapedRecipeHandler());
		API.registerUsageHandler(new FurnaceShapedRecipeHandler());
		API.registerRecipeHandler(new FurnaceShapelessRecipeHandler());
		API.registerUsageHandler(new FurnaceShapelessRecipeHandler());

		API.registerRecipeHandler(new FluidFurnaceRecipeHandler());
		API.registerUsageHandler(new FluidFurnaceRecipeHandler());
		API.registerRecipeHandler(new FoodSmokersRecipeHandler());
		API.registerUsageHandler(new FoodSmokersRecipeHandler());

		API.registerRecipeHandler(new MagicFurnaceRecipeHandler());
		API.registerUsageHandler(new MagicFurnaceRecipeHandler());
		API.registerRecipeHandler(new MagicFuelRecipeHandler());
		API.registerUsageHandler(new MagicFuelRecipeHandler());

		API.registerRecipeHandler(new FreezerRecipeHandler());
		API.registerUsageHandler(new FreezerRecipeHandler());
		API.registerRecipeHandler(new IceFuelRecipeHandler());
		API.registerUsageHandler(new IceFuelRecipeHandler());

		API.registerRecipeHandler(new FertilizerFarmlandRecipeHandler());
		API.registerUsageHandler(new FertilizerFarmlandRecipeHandler());

		API.registerRecipeHandler(new FertilizerPaddyRecipeHandler());
		API.registerUsageHandler(new FertilizerPaddyRecipeHandler());

		/*
		API.registerRecipeHandler(new BrewingRecipeHandler());
		API.registerUsageHandler(new BrewingRecipeHandler());

		API.registerRecipeHandler(new ShapedOreRecipeHandler());
		API.registerUsageHandler(new ShapedOreRecipeHandler());
		API.registerRecipeHandler(new ShapelessOreRecipeHandler());
		API.registerUsageHandler(new ShapelessOreRecipeHandler());
		*/

		//API.registerGuiOverlay(GuiMillstone.class, "SextiarySectorMillstone");
		//API.registerGuiOverlay(GuiLoom.class, "SextiarySectorLoom");
		API.registerGuiOverlay(GuiLargeFurnace.class, "furnaceCrafting");

		API.registerGuiOverlay(GuiFluidFurnace.class, "SS_FluidFurnace");
		API.registerGuiOverlay(GuiFoodSmokers.class, "SS_FoodSmokers");
		API.registerGuiOverlay(GuiMagicFurnace.class, "SS_MagicFurnace");
		API.registerGuiOverlay(GuiFreezer.class, "SS_Freezer");

		API.registerGuiOverlay(GuiMillstone.class, "SS_Millstone");
		API.registerGuiOverlay(GuiLoom.class, "SS_Loom");
		API.registerGuiOverlay(GuiSawmill.class, "SS_Sawmill");
		API.registerGuiOverlay(GuiPulverizer.class, "SS_Pulverizer");
		API.registerGuiOverlay(GuiRollingMachine.class, "SS_RollingMachine");
		API.registerGuiOverlay(GuiTimeMachine.class, "SS_TimeMachine");
		//API.registerGuiOverlay(GuiBrewingStand.class, "SextiarySectorBrewing");

	}

	@Override
	public String getName() {
		return "Sextiary Sector NEI Plugin";
	}

	@Override
	public String getVersion() {
		return "0.0.3";
	}

}
