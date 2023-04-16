package oopHW1;

public class Program {
    private static void ShowProducts(Product[] all){
        for (Product product : all) {
            System.out.println(product);
            System.out.println("----");
        }
    }
    public static void main(String[] args) {
        Product milk = new Milk("Простоквашино", 60, 6, "Литр", "5 дней", 3);
        Product lemonade = new Drinks("Дюшес", 50, 12, "Литр", 2);
        Product bread = new Bread("Богородский", 35, 1, "шт", "3 дня", "1 сорт");
        Product eggs = new Eggs("Таганрогское", 90, 10, "шт", "3 нед", 10);
        Product masks = new Masks("Чистая линия", 500, 12, "шт", 12);
        Product paper = new ToiletPaper("Zeva", 300, 12, "шт", 12, 2);
        Product diapers = new Diapers("Huggies", 1200, 56, "шт.", 2, "да", 12, 5, 7, "Дышаший");
        Product nipple = new Nipple("Соска", 250, 1, "шт.", 1, "да");

        Product[] all = new Product[] {milk, lemonade, bread, eggs, masks, paper, diapers, nipple};

        ShowProducts(all);
    }

}
