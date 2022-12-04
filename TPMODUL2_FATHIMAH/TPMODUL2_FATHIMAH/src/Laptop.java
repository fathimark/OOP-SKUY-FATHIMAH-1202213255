public class Laptop extends Perangkat{
    protected boolean webcam;

    //constructor
    public Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    //void method informasi()
    public void informasi(){
        if (webcam==false){
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu laptop ini TIDAK memiliki webcam");
        }

        else{
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu laptop ini juga memiliki webcam");

        }
    }
    
    //public void bukaGame(String nama_game)
    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }

    //public void kirimEmail(String email)
    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim email ke " + email);
    }

    //public void kirimEmail (String email1, String email2)
    public void kirimEmail (String email1, String email2){
        System.out.println("Laptop berhasil mengirim email ke " + email1 + " dan " + email2);
    }
}
