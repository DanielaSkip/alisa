import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

class ClientManager {
    private ArrayList<Client> clients = new ArrayList<>();
    private ArrayList<ArrayList<Service>> servicesList = new ArrayList<>();

    // Метод для добавления клиента и его услуг
    public void addClient(Client client, ArrayList<Service> services) {
        clients.add(client);
        servicesList.add(services);
    }

    // Метод для записи всех клиентов в файл
    public void writeAllClientsToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            // Записываем каждого клиента и его услуги
            for (int i = 0; i < clients.size(); i++) {
                Client client = clients.get(i);
                ArrayList<Service> services = servicesList.get(i);

                writer.println(client); // Записываем информацию о клиенте
                for (Service service : services) {
                    writer.println(service); // Записываем информацию о сервисах
                    writer.println("Cost: " + service.calculateCost() + " EUR\n"); // Записываем стоимость
                }
            }
            System.out.println("Data saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
