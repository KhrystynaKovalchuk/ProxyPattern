package proxyPattern;

public class RealImage implements Image{
    String fileName;
    public RealImage(String realImageFileName) {
        fileName = realImageFileName;
    }

    public void display() {
        System.out.println("Display RealImage.");
    }

    public void loadFromDisk() {
        System.out.println("Loading the ReadImage to the disk.");
    }
}
