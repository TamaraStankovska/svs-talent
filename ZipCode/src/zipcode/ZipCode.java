package zipcode;

public class ZipCode {
    String code;

    public ZipCode(String value){
        setValue(value);
    }

    public void setValue(String code){


        int length = code.length();
        if(length<5 || length>9)
        {

            System.out.println("Must have length between 5 and 9.");

        }
        else{
            this.code=code;
            System.out.println(code);
        }


    }

    public static void main(String[] args){

       // ZipCode zip=new ZipCode();
       // zip.setZipCode("123456");
       // System.out.println(zip.toString());

        ZipCode zip1=new ZipCode("1393939");





    }
}
