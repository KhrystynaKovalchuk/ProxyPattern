package proxyPattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        RealImage realImage = new RealImage("realImg.png");
        ProxyImage proxyImage = new ProxyImage("proxyImg.png", realImage);

        proxyImage.display();

    }
}
