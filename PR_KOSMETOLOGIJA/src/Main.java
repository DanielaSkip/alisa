public class Main {
    public static void main(String[] args) {
        // Создаем клиентов и их услуги
        Client klient1 = new Client("Dinka Skibidi", 29, "No allergy");
        ArrayList<Service> services1 = new ArrayList<>();
        services1.add(new FaceService("Facial Cleansing", 40, 1.8, "Sensitive"));
        services1.add(new BodyService("Relax Massage", 60, 2.2, "Strong", "Therapeutic"));
        services1.add(new SkincareService("Acid Peeling", 45, 2.5, 3.2, "Peeling"));

        Client klient2 = new Client("Sergey Ivanov", 35, "Lactose intolerant");
        ArrayList<Service> services2 = new ArrayList<>();
        services2.add(new FaceService("Deep Pore Cleansing", 50, 2.0, "Oily"));
        services2.add(new BodyService("Sport Massage", 70, 2.8, "Medium", "Recovery"));
        services2.add(new SkincareService("Vitamin C Treatment", 30, 2.2, 2.9, "Hydration"));

        Client klient3 = new Client("Pipka Kurjanova", 42, "Pollen allergy");
        ArrayList<Service> services3 = new ArrayList<>();
        services3.add(new FaceService("Anti-Aging Facial", 52, 2.3, "Dry"));
        services3.add(new BodyService("Lymphatic Drainage", 50, 2.6, "Gentle", "Detox"));
        services3.add(new SkincareService("Enzyme Therapy", 40, 2.7, 3.5, "Regeneration"));

        // Создаем менеджера для записи данных
        ClientManager clientManager = new ClientManager();
        clientManager.addClient(klient1, services1);
        clientManager.addClient(klient2, services2);
        clientManager.addClient(klient3, services3);

        // Записываем информацию о клиентах в файл
        clientManager.writeAllClientsToFile("all_clients_info.txt");
    }
}
