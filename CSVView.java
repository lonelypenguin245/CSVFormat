/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSVFormat;

import java.util.ArrayList;

/**
 *
 * @author HI
 */
public class CSVView {
    public void displayMenu() {
        System.out.println("1. Import CSV");
        System.out.println("2. Format Address");
        System.out.println("3. Format Name");
        System.out.println("4. Export CSV");
        System.out.println("5. Exit");
    }

    public void displayData(ArrayList<CSV> csvList) {
        for (int i = 0; i < csvList.size(); i++) {
            System.out.printf("%d,%s,%s,%s,%s\n", csvList.get(i).getId(),
                    csvList.get(i).getName(), csvList.get(i).getEmail(), csvList.get(i).getPhone(),
                    csvList.get(i).getAddress());
        }
    }

    public void printMessage(String message) {
        System.err.println(message);
    }
}
