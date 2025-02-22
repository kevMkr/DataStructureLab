public class MainInventory {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Item sword = new Item("Sword");
        Item shield = new Item("Shield");
        Item potion = new Item("Health Potion");

        inventory.addItem(sword);
        inventory.addItem(shield);
        inventory.addItem(potion);

        inventory.displayItems();

        System.out.println("Inventory has sword: " + inventory.hasItem(sword));
        inventory.removeItem(shield);
        inventory.displayItems();

        System.out.println("Total items in inventory: " + inventory.getItemCount());
    }
}