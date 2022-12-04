public class Main {
    public static void main(String[] args) {
        Perangkat perangkat_1 = new Perangkat("Adata", 2, 1.80f);
        perangkat_1.informasi();
        System.out.println();

        Laptop laptop_1 = new Laptop("Seagate", 8, 2.40f, true);
        laptop_1.informasi();
        laptop_1.bukaGame("Dota 2");
        laptop_1.kirimEmail("niceyuk@gmail.com");
        laptop_1.kirimEmail("aanarji@gmail.com", "rusmangc@gmail.com");
        System.out.println();
        
        Handphone handphone_1 = new Handphone("Sandisk", 3, 2.20f, false);
        handphone_1.informasi();
        handphone_1.telfon(628122122);
        handphone_1.kirimSMS(62852112);
        handphone_1.kirimSMS(629292211, 628121212);
    }
}
