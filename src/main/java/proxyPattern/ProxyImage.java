package proxyPattern;

public class ProxyImage implements Image{
    String fileName;
    RealImage realImageInstance;

    public ProxyImage(String proxyImageFileName, RealImage realImage) {
        fileName = proxyImageFileName;
        realImageInstance = realImage;
    }

    public void display() {
        System.out.println("Cache image before displaying.");
        realImageInstance.display();
    }
}
