import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Online_shopping {

    public int a;

     public Object inFile;
    public static void main(String args[]) throws IOException {
        System.out.println("/**welcome to online shopping**/");
        Scanner sc = new Scanner(System.in);
        int cart_c=0,cart_m,cart_e,cart_s,code_cloth=0;
        boolean exit_gate = true;
        int total__price=0;
        int total_1_price=0;
        int total_2_price=0;
        int total_3_price=0;
        while(exit_gate){
        System.out.println("Select category :");
        System.out.println("1.Clothing"+"_"+"2.medicine"+""+"3.Electronics"+"_"+"4.sport_item");
        System.out.println("select the category from listed item:");
        int a = sc.nextInt();
        if(a==1) {
            FileReader fr = new FileReader("C:\\Users\\vkg15\\IdeaProjects\\Online_shopping\\src\\P1\\clothing.txt");
            Scanner inFile = new Scanner(fr);
            while (inFile.hasNext()) {
                String line = inFile.nextLine();
                System.out.println(line);}
        }
        else if(a==2){
            FileReader fr = new FileReader("C:\\Users\\vkg15\\IdeaProjects\\Online_shopping\\src\\P1\\medicine.txt");
            Scanner inFile_2 = new Scanner(fr);
            while(inFile_2.hasNext())
            {
                String line = inFile_2.nextLine();
                System.out.println(line);}}
    else if(a==3){
            FileReader fr = new FileReader("C:\\Users\\vkg15\\IdeaProjects\\Online_shopping\\src\\P1\\electronics.txt");
            Scanner inFile_3 = new Scanner(fr);
            while(inFile_3.hasNext())
            {String line = inFile_3.nextLine();
                System.out.println(line);}}
    else if(a==4){
            FileReader fr = new FileReader("C:\\Users\\vkg15\\IdeaProjects\\Online_shopping\\src\\P1\\sport_item.txt");
            Scanner inFile_4 = new Scanner(fr);
            while(inFile_4.hasNext())
            {String line = inFile_4.nextLine();
                System.out.println(line);}}
    else{System.out.println("invalid input");}

    switch(a){
        case 1:
            System.out.println("no. of items you want to buy from given category");
            int n = sc.nextInt();
            cart_c = cart_c +n;
        File scan = new File("C:\\Users\\vkg15\\IdeaProjects\\Online_shopping\\src\\P1\\clothing_price.txt");
        try{
            Scanner vk = new Scanner(scan);
            int[] vikas = new int[1000];
            int[] code = new int[1000];
            int[] quantity = new int[1000];
            int q;
            for(int j=0;j<n;j++){
                System.out.print("enter code:");
                code[j] = sc.nextInt();
                code_cloth =code_cloth + code[j];
                System.out.print("enter quantity:");
                quantity[j] = sc.nextInt();
                }
            int h =0;
                while (vk.hasNext()) {
                        int y = vk.nextInt();
                        vikas[h] = y;
                        h++;
                }
            for(int b=0;b<n;b++) {
                for(int hk=0;hk<4;hk++){
                    if(hk==code[b])
                total_price = total_price+ quantity[b]*vikas[hk];}
            }
            System.out.println("total_price=" + total_price);

            vk.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }break;

        case 2:
            System.out.println("no. of items you want to buy from given category");
            int n_1 = sc.nextInt();
            cart_m =n_1;
            File scan_1 = new File("C:\\Users\\vkg15\\IdeaProjects\\Online_shopping\\src\\P1\\medicine_price.txt");
            try {
                Scanner vk = new Scanner(scan_1);
                int[] vikas = new int[1000];
                int i = 0;
                int[] code = new int[1000];
                int[] quantity = new int[1000];
                int q;
                for (int j = 0; j < n_1; j++) {
                    System.out.print("enter code:");
                    code[j] = sc.nextInt();
                    System.out.print("enter quantity:");
                    quantity[j] = sc.nextInt();
                }

                while (vk.hasNext()) {
                    int y = vk.nextInt();
                    vikas[i] = y;
                    i++;
                }
                for(int b=0;b<n_1;b++){
                for (int h = 0; h < 4; h++) {
                    if (code[b] == h)
                        total_1_price = total_1_price + vikas[h] * quantity[b];
                }}
                System.out.println("total__price="+total_1_price);
                vk.close();
            }
            catch(FileNotFoundException e){
                e.printStackTrace();
            }break;

        case 3:
            System.out.println("no. of items you want to buy from given category");
            int n_2 = sc.nextInt();
            cart_e =n_2;
            File scan_2 = new File("C:\\Users\\vkg15\\IdeaProjects\\Online_shopping\\src\\P1\\electronics_price.txt");
            try{
                Scanner vk = new Scanner(scan_2);
                int[] vikas = new int[1000];
                int i=0;
                int[] code = new int[1000];
                int[] quantity = new int[1000];
                int q;
                for(int j=0;j<n_2;j++){
                    System.out.print("enter code:");
                    code[j] = sc.nextInt();
                    System.out.print("enter quantity:");
                    quantity[j] = sc.nextInt();
                }

                while (vk.hasNext()){
                    int y = vk.nextInt();
                    vikas[i]=y;
                    i++;}
                for(int b=0;b<n_2;b++) {
                    for (int h = 0; h < 4; h++) {
                        if (code[b] == h)
                            total_2_price = total_2_price + vikas[h] * quantity[b];
                    }
                }

                System.out.println("total__price="+total_2_price);
                vk.close();
            }
            catch(FileNotFoundException e){
                e.printStackTrace();
            }break;

        case 4:
            System.out.println("no. of items you want to buy from given category");
            int n_3 = sc.nextInt();
            cart_s =n_3;
            File scan_3 = new File("C:\\Users\\vkg15\\IdeaProjects\\Online_shopping\\src\\P1\\sport_item_price.txt");
            try{
                Scanner vk = new Scanner(scan_3);
                int[] vikas = new int[1000];
                int i=0;
                int[] code = new int[1000];
                int[] quantity = new int[1000];
                int q;
                for(int j=0;j<n_3;j++){
                    System.out.print("enter code:");
                    code[j] = sc.nextInt();
                    System.out.print("enter quantity:");
                    quantity[j] = sc.nextInt();
                }

                while (vk.hasNext()){
                    int y = vk.nextInt();
                    vikas[i]=y;
                i++;}
                for(int b1=0;b1<n_3;b1++){
                    for(int h=0;h<4;h++){
                        if(code[b1]==h)
                            total_3_price = total_3_price + vikas[h]*quantity[b1];}
                }
                System.out.println("total__price="+total_3_price);
                vk.close();
            }
            catch(FileNotFoundException e){
                e.printStackTrace();
            }break;
    }


System.out.println("do you want to buy more?yes(press:1) or press any key for exit");
int exit_1 = sc.nextInt();
if(exit_1!=1) {
    exit_gate = false;
}
if(exit_1==1){
    exit_gate =true;
}
        }
        int total_amount ;
        total_amount = total_1_price + total__price +total_2_price +total_3_price ;
        System.out.println("Total_Payable_amount = "+total_amount);
        System.out.println(" to visit shopping cart?(press 1 )");
        int cart = sc.nextInt();
        if(cart ==1){
            if(total__price!=0){

                System.out.println("clothing_item ="+total__price);
            }
            if(total_1_price!=0){  System.out.println("clothing_item ="+total__price);}
            if(total_2_price!=0){  System.out.println("clothing_item ="+total__price);}
            if(total_3_price!=0){  System.out.println("clothing_item ="+total__price);}
        }
        if(total__price!=0 && cart==1) {

                String line2;
            try(
                BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\vkg15\\IdeaProjects\\Online_shopping\\src\\P1\\clothing.txt")))

                {
                    for (int i = 0; i < cart_c; i++) {
                        for(int k=0;k<4;k++){
                        bfr.readLine();
                        if(code_cloth ==0) {
                        }line2 = bfr.readLine();
                        System.out.println(line2);}
                    }
                } catch(Exception e)

                {
                }
        }
    }}