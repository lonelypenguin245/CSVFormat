/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSVFormat;

/**
 *
 * @author HI
 */
public class Main {
    public static void main(String[] args) {
        CSVModel model = new CSVModel();
        CSVView view = new CSVView();
        CSVController controller = new CSVController(model, view);

        controller.run();
    }
}
