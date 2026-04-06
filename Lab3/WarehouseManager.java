import java.util.HashMap;

public class WarehouseManager {
    private HashMap<String, Product> inventory = new HashMap<>();

    public void addProduct(String barcode, Product product) {
        inventory.put(barcode, product);
        System.out.println("Товар со штрихкодом " + barcode + " добавлен.");
    }

    public Product findProduct(String barcode) {
        return inventory.get(barcode);
    }

    public void removeProduct(String barcode) {
        if (inventory.containsKey(barcode)) {
            inventory.remove(barcode);
            System.out.println("Товар " + barcode + " удален со склада.");
        } else {
            System.out.println("Ошибка: товар с таким штрихкодом не найден.");
        }
    }

    public void printAll() {
        System.out.println("--- Текущее состояние склада ---");
        for (String barcode : inventory.keySet()) {
            System.out.println("Штрихкод: " + barcode + " | " + inventory.get(barcode));
        }
    }
}
