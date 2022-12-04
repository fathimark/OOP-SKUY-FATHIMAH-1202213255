public class Handphone extends Perangkat {
    
    //protected variable
    protected boolean fingerprint;

    //constructor
    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint; 
    }

    //method void informasi()
    public void informasi(){
        if (fingerprint==false){
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + " Ghz. Selain itu laptop ini TIDAK memiliki fingerprint");
        }
        else{
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + " Ghz. Selain itu laptop ini memiliki fingerprint");
        }
    }

    //method void telfon(int no_hp)
    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke No " + no_hp);
    }

    //method void kirimSMS (int no_hp1)
    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp);
    }

    //method void kirimSMS (int no_hp1, int no_hp2)
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp1 + " dan " + no_hp2);
    }
}