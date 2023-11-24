/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProxyDesignPattern;

/**
 *
 * @author TechEnclave Computer
 */
public class SmartProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public SmartProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            if (fileName.endsWith(".jpg")) {
                realImage = new RealImage(fileName);
            } else {
                // Create a placeholder image for unsupported types
                realImage = new RealImage("placeholder.jpg");
                System.out.println("Displaying a placeholder for unsupported image type: " + fileName);
            }
        }
        realImage.display();
    }
}

