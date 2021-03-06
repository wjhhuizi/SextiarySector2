package shift.sextiarysector.recipe;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import shift.sextiarysector.SSBlocks;
import shift.sextiarysector.SSItems;

public class RecipesMachine {

	public static void addRecipes(CraftingManager p_77608_1_)
    {

        p_77608_1_.addRecipe(new ItemStack(SSBlocks.LargeFurnace, 1),
        		new Object[] {
        	"xyx", "xax", "xzx",
        	'x', Blocks.stone,
        	'y', Blocks.crafting_table,
        	'z', Blocks.chest,
        	'a', Blocks.furnace
        	});

        p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(SSItems.energyReactor, 2),
				new Object[] { "xxx", "xyx","xxx",
			Character.valueOf('y'), "ingotBluestone",
			Character.valueOf('x'), "ingotYellowstone"
			}));

        p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(SSItems.objectReactor, 2),
				new Object[] { "xxx", "xyx","xxx",
			Character.valueOf('y'), "ingotNinja",
			Character.valueOf('x'), "ingotYellowstone"
			}));

        Object[] material = new Object[]{"plankWood", "stone", "ingotSteel", "ingotNinja", "gemOrichalcum"};
        Item[] gear = new Item[]{SSItems.woodGear, SSItems.stoneGear, SSItems.steelGear, SSItems.ninjaGear, SSItems.orichalcumGear};
        String[] gearOre = new String[]{"gearWood", "gearStone", "gearSteel", "gearNinja", "gearOrichalcum"};
		Item[] unit = new Item[]{SSItems.woodUnitGear, SSItems.stoneUnitGear, SSItems.steelUnitGear, SSItems.ninjaUnitGear, SSItems.orichalcumUnitGear};
		Item[] storage = new Item[]{SSItems.woodGFStorage, SSItems.stoneGFStorage, SSItems.steelGFStorage, SSItems.ninjaGFStorage, SSItems.orichalcumGFStorage};
		Block[] shaft = new Block[]{SSBlocks.woodShaft, SSBlocks.stoneShaft, SSBlocks.steelShaft, SSBlocks.ninjaShaft, SSBlocks.orichalcumShaft};
		Block[] tank = new Block[]{SSBlocks.woodGFTank, SSBlocks.stoneGFTank, SSBlocks.steelGFTank, SSBlocks.ninjaGFTank, SSBlocks.orichalcumGFTank};
		Block[] box = new Block[]{SSBlocks.woodGearBox, SSBlocks.stoneGearBox, SSBlocks.steelGearBox, SSBlocks.ninjaGearBox, SSBlocks.orichalcumGearBox};

        //GF Block
        p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(SSBlocks.smallWindmill, 1),
				new Object[] { "xzx", "zyz","xzx",
			Character.valueOf('y'), SSItems.blueStoneSlimeBall,
			Character.valueOf('x'), "plankWood",
			Character.valueOf('z'), Blocks.wool
			}));

        p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(SSItems.canvas, 1),
				new Object[] { "xxy", "xxy","  y",
			Character.valueOf('y'), Blocks.fence,
			Character.valueOf('x'), SSItems.cloth
			}));

        p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(SSBlocks.windmill, 1),
				new Object[] { " x ", "xyx"," x ",
			Character.valueOf('y'), SSItems.blueStoneSlimeBall,
			Character.valueOf('x'), SSItems.canvas
			}));

        p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(SSBlocks.smallWaterwheel, 1),
				new Object[] { "xxx", "xyx","xxx",
			Character.valueOf('x'), "plateWood",
			Character.valueOf('y'), SSBlocks.steelShaft
			}));

        for(int i=0;i<5;i++){

        	p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(shaft[i], 4),
    				new Object[] { "xzx", "xyx","xzx",
    			Character.valueOf('y'), "dustBluestone",
    			Character.valueOf('x'), material[i],
    			Character.valueOf('z'), SSItems.blueStoneSlimeBall
    			}));

            p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(tank[i], 1),
    				new Object[] { "yay", "xzx","yxy",
    			Character.valueOf('y'), material[i],
    			Character.valueOf('x'), storage[i],
    			Character.valueOf('z'), unit[i],
    			Character.valueOf('a'), gearOre[i]
    			}));

            p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(box[i], 1),
    				new Object[] { "yxy", "xzx","yxy",
    			Character.valueOf('y'), material[i],
    			Character.valueOf('x'), gearOre[i],
    			Character.valueOf('z'), unit[i]
    			}));

        }

        Block[] gearShaft = new Block[]{SSBlocks.woodStoneGearShaft, SSBlocks.stoneSteelGearShaft, SSBlocks.steelNinjaGearShaft, SSBlocks.ninjaOrichalcumGearShaft};

        for(int i=0;i<4;i++){

        	p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(gearShaft[i], 1, 1),
    				new Object[] { "y", "z", "x",
    			Character.valueOf('y'), shaft[i],
    			Character.valueOf('x'), shaft[i+1],
    			Character.valueOf('z'), SSItems.energyReactor
    			}));

        	p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(gearShaft[i], 1, 0),
    				new Object[] { "y", "z", "x",
    			Character.valueOf('y'), shaft[i+1],
    			Character.valueOf('x'), shaft[i],
    			Character.valueOf('z'), SSItems.energyReactor
    			}));

        }

        p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(SSBlocks.millstone, 1),
				new Object[] { "yyy", "aza","yxy",
			Character.valueOf('y'), "plankWood",
			Character.valueOf('x'), SSItems.woodGFStorage,
			Character.valueOf('z'), SSItems.woodUnitGear,
			Character.valueOf('a'), "stone"
			}));

        p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(SSBlocks.loom, 1),
				new Object[] { "yyy", "aza","yxy",
			Character.valueOf('y'), "plankWood",
			Character.valueOf('x'), SSItems.woodGFStorage,
			Character.valueOf('z'), SSItems.woodUnitGear,
			Character.valueOf('a'), "stickWood"
			}));

        p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(SSBlocks.sawmill, 1),
				new Object[] { "yyy", "aza","yxy",
			Character.valueOf('y'), "plankWood",
			Character.valueOf('x'), SSItems.stoneGFStorage,
			Character.valueOf('z'), SSItems.stoneUnitGear,
			Character.valueOf('a'), "ingotIron"
			}));

        p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(SSBlocks.pulverizer, 1),
				new Object[] { "yay", "aza","yxy",
			Character.valueOf('y'), "plankWood",
			Character.valueOf('x'), SSItems.steelGFStorage,
			Character.valueOf('z'), SSItems.steelUnitGear,
			Character.valueOf('a'), "gemDiamond"
			}));

        p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(SSBlocks.fan, 1),
				new Object[] { "yay", "zxz","zbz",
			Character.valueOf('y'), "ingotBrass",
			Character.valueOf('x'), "plateWood",
			Character.valueOf('z'), "stone",
			Character.valueOf('a'), Blocks.iron_bars,
			Character.valueOf('b'), SSBlocks.steelShaft
			}));

        p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(SSBlocks.rollingMachine, 1),
				new Object[] { "yay", "aza","yxy",
			Character.valueOf('y'), "plankWood",
			Character.valueOf('x'), SSItems.ninjaGFStorage,
			Character.valueOf('z'), SSItems.ninjaUnitGear,
			Character.valueOf('a'), "ingotIron"
			}));

        p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(SSBlocks.timeMachine, 1),
				new Object[] { "yay", "aza","yxy",
			Character.valueOf('y'), "plankWood",
			Character.valueOf('x'), SSItems.orichalcumGFStorage,
			Character.valueOf('z'), SSItems.orichalcumUnitGear,
			Character.valueOf('a'), SSBlocks.chunkLoader
			}));

        //GF Item

		for(int i=0;i<5;i++){

			p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(gear[i], 2),
					new Object[] { " x ", "xyx"," x ",
				Character.valueOf('y'), SSItems.blueStoneDust,
				Character.valueOf('x'), material[i]
				}));



	        p_77608_1_.getRecipeList().add(new ShapelessOreRecipe(new ItemStack(unit[i], 1),
					new Object[] {
				SSItems.unit,
				gearOre[i]
				}));

		}


		for(int i=0;i<5;i++){

			 p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(storage[i], 1),
						new Object[] { " y ", "xzx","xzx",
					Character.valueOf('z'), SSItems.blueStoneDust,
					Character.valueOf('x'), material[i],
					Character.valueOf('y'), gearOre[i],
					}));

		}

    }

}
