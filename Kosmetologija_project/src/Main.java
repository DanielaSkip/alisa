import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main extends JFrame {
    private JPanel rootPanel;
    private JComboBox<String> comboBox1;
    private JTextField textField1;
    private JLabel JName;
    private JButton clickButton;

    Main(){
        createUIComponents(); // Вызов метода для инициализации компонентов
        setContentPane(rootPanel);
        setTitle("My first GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);

        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) comboBox1.getSelectedItem();
                String message = "Welcome, " + textField1.getText() + "!";
                JOptionPane.showMessageDialog(Main.this, message);
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }

    private void createUIComponents() {
        comboBox1 = new JComboBox<>();
        comboBox1.addItem("Dr");
        comboBox1.addItem("Miss");
        comboBox1.addItem("Mr");
        comboBox1.addItem("Mrs");
        comboBox1.addItem("Ms");
        comboBox1.addItem("Prof");
        comboBox1.addItem("Rev");

        // Создаем rootPanel и добавляем туда компоненты
        rootPanel = new JPanel();
        rootPanel.setLayout(new BoxLayout(rootPanel, BoxLayout.Y_AXIS));

        // Создаем поле ввода для имени
        textField1 = new JTextField(15);
        rootPanel.add(textField1);

        // Добавляем ComboBox
        rootPanel.add(comboBox1);
    }

    // Приветствие с визуальным оформлением
    public static void printClientInfo(Client klient, ArrayList<Service> services, int clientNumber) {
        System.out.println("=================================================");
        System.out.println("Client " + clientNumber + ": " + klient.getName());
        System.out.println("Age: " + klient.getAge() + " years");
        System.out.println("Allergy: " + klient.getAllergy());
        System.out.println("Total Services: " + services.size() + "\n");

        System.out.println("Services Details:");
        for (Service service : services) {
            System.out.println("  - " + service.getName());
            System.out.println("    Duration: " + service.getDuration() + " min");
            System.out.println("    Rate: " + service.getRate() + " EUR/min");
            System.out.println("    Zones: " + service.getZones());
            System.out.println("    Estimated Cost: " + service.calculateCost() + " EUR\n");
        }
        System.out.println("=================================================");
    }

    // Запись данных клиентов в файл
    public static void writeAllClientsToFile(String filename, Client klient1, ArrayList<Service> services1,
                                             Client klient2, ArrayList<Service> services2,
                                             Client klient3, ArrayList<Service> services3) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("=================================================");
            writer.println("            Clients List               ");
            writer.println("=================================================");

            // Информация о клиенте 1
            writer.println("\nClient 1:");
            writer.println(klient1);
            for (Service service : services1) {
                writer.println(service);
                writer.println("Cost: " + service.calculateCost() + " EUR\n");
            }

            // Информация о клиенте 2
            writer.println("\nClient 2:");
            writer.println(klient2);
            for (Service service : services2) {
                writer.println(service);
                writer.println("Cost: " + service.calculateCost() + " EUR\n");
            }

            // Информация о клиенте 3
            writer.println("\nClient 3:");
            writer.println(klient3);
            for (Service service : services3) {
                writer.println(service);
                writer.println("Cost: " + service.calculateCost() + " EUR\n");
            }

            writer.println("=================================================");
            writer.println("Data successfully saved to the file: " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
