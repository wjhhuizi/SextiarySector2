package shift.sextiarysector.recipe;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import shift.sextiarysector.SSItems;

public class RecipesTool {

	public static void addRecipes(CraftingManager p_77608_1_)
    {

		//Scoop
		Object[] material = new Object[]{"plankWood","cobblestone","ingotIron","ingotGold","gemDiamond"};
		Item[] scoop = new Item[]{SSItems.woodScoop,SSItems.stoneScoop,SSItems.ironScoop,SSItems.goldScoop,SSItems.diamondScoop};
		for(int i = 0;i<material.length;i++){
			 p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(scoop[i], 1),
						new Object[] { "y", "x",
					Character.valueOf('y'), material[i],
					Character.valueOf('x'), "stickWood",
					}));
		}

		//Knife
		Item[] knife = new Item[]{SSItems.woodKnife,SSItems.stoneKnife,SSItems.ironKnife,SSItems.goldKnife,SSItems.diamondKnife};
		for(int i = 0;i<material.length;i++){
			 p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(knife[i], 1),
						new Object[] { " y","x ",
					Character.valueOf('y'), material[i],
					Character.valueOf('x'), "stickWood",
					}));
		}


		Item[] wateringCan = new Item[]{SSItems.woodWateringCan};
		for(int i = 0;i<wateringCan.length;i++){

			 p_77608_1_.getRecipeList().add(new ShapedOreRecipe(new ItemStack(wateringCan[i], 1,(wateringCan[i].getMaxDamage()-1)),
						new Object[] { "yyy", " yy",
					Character.valueOf('y'), material[i],
					}));
		}

		Item[] ironTool = new Item[]{Items.iron_axe, Items.iron_hoe, Items.iron_pickaxe, Items.iron_shovel, Items.iron_sword};

		String[] materialIron = new String[]{"plateIron","fluidIron"};

		for(int i = 0;i<materialIron.length;i++){

			ItemStack axe = new ItemStack(ironTool[0],1);
			if(i==0){
				axe.addEnchantment(Enchantment.efficiency, 3);
			}else{
				axe.addEnchantment(Enchantment.unbreaking, 3);
			}
			addAxe(p_77608_1_, materialIron[i], "ingotIron", axe);

			ItemStack hoe = new ItemStack(ironTool[1],1);
			if(i==0){
				hoe.addEnchantment(Enchantment.efficiency, 3);
			}else{
				hoe.addEnchantment(Enchantment.unbreaking, 3);
			}
			addHoe(p_77608_1_, materialIron[i], "ingotIron", hoe);

			ItemStack pickaxe = new ItemStack(ironTool[2],1);
			if(i==0){
				pickaxe.addEnchantment(Enchantment.efficiency, 3);
			}else{
				pickaxe.addEnchantment(Enchantment.unbreaking, 3);
			}
			addPickaxe(p_77608_1_, materialIron[i], "ingotIron", pickaxe);

			ItemStack shovel = new ItemStack(ironTool[3],1);
			if(i==0){
				shovel.addEnchantment(Enchantment.efficiency, 3);
			}else{
				shovel.addEnchantment(Enchantment.unbreaking, 3);
			}
			addShovel(p_77608_1_, materialIron[i], shovel);

			ItemStack sword = new ItemStack(ironTool[4],1);
			if(i==0){
				sword.addEnchantment(Enchantment.efficiency, 3);
			}else{
				sword.addEnchantment(Enchantment.unbreaking, 3);
			}
			addSword(p_77608_1_, materialIron[i], sword);

		}

		Item[] goldTool = new Item[]{Items.golden_axe, Items.golden_hoe, Items.golden_pickaxe, Items.golden_shovel, Items.golden_sword};

		String[] materialGold = new String[]{"plateGold","fluidGold"};

		for(int i = 0;i<materialGold.length;i++){

			ItemStack axe = new ItemStack(goldTool[0],1);
			if(i==0){
				axe.addEnchantment(Enchantment.efficiency, 3);
			}else{
				axe.addEnchantment(Enchantment.unbreaking, 3);
			}
			addAxe(p_77608_1_, materialGold[i], "ingotGold", axe);

			ItemStack hoe = new ItemStack(goldTool[1],1);
			if(i==0){
				hoe.addEnchantment(Enchantment.efficiency, 3);
			}else{
				hoe.addEnchantment(Enchantment.unbreaking, 3);
			}
			addHoe(p_77608_1_, materialGold[i], "ingotGold", hoe);

			ItemStack pickaxe = new ItemStack(goldTool[2],1);
			if(i==0){
				pickaxe.addEnchantment(Enchantment.efficiency, 3);
			}else{
				pickaxe.addEnchantment(Enchantment.unbreaking, 3);
			}
			addPickaxe(p_77608_1_, materialGold[i], "ingotGold", pickaxe);

			ItemStack shovel = new ItemStack(goldTool[3],1);
			if(i==0){
				shovel.addEnchantment(Enchantment.efficiency, 3);
			}else{
				shovel.addEnchantment(Enchantment.unbreaking, 3);
			}
			addShovel(p_77608_1_, materialGold[i], shovel);

			ItemStack sword = new ItemStack(goldTool[4],1);
			if(i==0){
				sword.addEnchantment(Enchantment.efficiency, 3);
			}else{
				sword.addEnchantment(Enchantment.unbreaking, 3);
			}
			addSword(p_77608_1_, materialGold[i], sword);

		}


    }

	private static void addAxe(CraftingManager p_77608_1_, String material ,String material2, ItemStack item){

		p_77608_1_.getRecipeList().add(new ShapedOreRecipe(item,
				new Object[] { "yz","yx"," x",
			Character.valueOf('y'), material,
			Character.valueOf('z'), material2,
			Character.valueOf('x'), "stickWood",
			}));

	}

	private static void addHoe(CraftingManager p_77608_1_, String material ,String material2, ItemStack item){

		p_77608_1_.getRecipeList().add(new ShapedOreRecipe(item,
				new Object[] { "yz"," x"," x",
			Character.valueOf('y'), material,
			Character.valueOf('z'), material2,
			Character.valueOf('x'), "stickWood",
			}));

	}

	private static void addPickaxe(CraftingManager p_77608_1_, String material ,String material2, ItemStack item){

		p_77608_1_.getRecipeList().add(new ShapedOreRecipe(item,
				new Object[] { "yzy"," x "," x ",
			Character.valueOf('y'), material,
			Character.valueOf('z'), material2,
			Character.valueOf('x'), "stickWood",
			}));

	}

	private static void addShovel(CraftingManager p_77608_1_, String material, ItemStack item){

		p_77608_1_.getRecipeList().add(new ShapedOreRecipe(item,
				new Object[] { "y","x","x",
			Character.valueOf('y'), material,
			Character.valueOf('x'), "stickWood",
			}));

	}

	private static void addSword(CraftingManager p_77608_1_, String material, ItemStack item){

		p_77608_1_.getRecipeList().add(new ShapedOreRecipe(item,
				new Object[] { "y","y","x",
			Character.valueOf('y'), material,
			Character.valueOf('x'), "stickWood",
			}));

	}

}
