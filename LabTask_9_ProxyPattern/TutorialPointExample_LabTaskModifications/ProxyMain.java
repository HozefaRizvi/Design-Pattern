/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProxyDesignPattern;

/**
 *
 * @author TechEnclave Computer
 */
public class ProxyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Image virtualProxyImage = new VirtualProxyImage("test_10mb.jpg");

        // Image will be loaded from disk (on-demand loading)
        virtualProxyImage.display();
        System.out.println("");

        // Image will not be loaded from disk (already loaded)
        virtualProxyImage.display();
        System.out.println("");

        // Smart Proxy
        Image smartProxyImageJpg = new SmartProxyImage("test_10mb.jpg");
        Image smartProxyImagePng = new SmartProxyImage("test_image.png");

        // Image will be loaded from disk (jpg supported)
        smartProxyImageJpg.display();
        System.out.println("");

        // Displaying a placeholder for unsupported image type (png)
        smartProxyImagePng.display();
        System.out.println("");
    }
    
}
