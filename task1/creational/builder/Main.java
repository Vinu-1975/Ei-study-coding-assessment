package task1.creational.builder;


public class Main {
    public static void main(String[] args) {
        Computer myComputer = new Computer.ComputerBuilder("Intel Core i7", "16GB")
                .setStorage("512GB NVMe SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setOperatingSystem("Ubuntu 22.04 LTS")
                .setBluetoothEnabled(true)
                .setWifiEnabled(true)
                .build();

        System.out.println(myComputer);
    }
}
