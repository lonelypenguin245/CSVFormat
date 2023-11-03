/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSVFormat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HI
 */
public class CSVController {
    private CSVModel model;
    private CSVView view;
    private static final Scanner in = new Scanner(System.in);

    public CSVController(CSVModel model, CSVView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        ArrayList<CSV> csvList = model.getCSVList();
        view.displayMenu();

        while (true) {
            System.out.print("Please choose an option: ");
            int n = checkIntLimit(1, 5);
            switch (n) {
                case 1:
                    System.out.print("Enter Path: ");
                    String fileName = in.nextLine().trim();
                    model.importCSV(fileName);
                    view.displayData(csvList);
                    break;
                case 2:
                    model.formatAddress();
                    view.displayData(csvList);
                    break;
                case 3:
                    model.formatName();
                    view.displayData(csvList);
                    break;
                case 4:
                    System.out.print("Enter Path: ");
                    String exportFileName = in.nextLine();
                    model.exportCSV(exportFileName);
                    break;
                case 5:
                    return;
            }
        }
    }

    private int checkIntLimit(int min, int max) {
        while (true) {
            try {
                int n = Integer.parseInt(in.nextLine());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }
}
