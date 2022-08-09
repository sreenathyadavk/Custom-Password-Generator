//FOR MORE VIST:-https://github.com/sreenathyadavk
package Generator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author SREENATH YADAV
 * */
public class RandomizerPassword{
    private final Random r = new Random();
    private String randAlphaInt;
     private int position1 , position2,position3;
     private int passSize;

        /**
        This is the main method for generating password
        * provide --PRIMANRY KEY-- as parameter
        * @author SREENATH YADAV
        * */
     public void start(String pass) {
    	 System.out.println("START METHOD CALLED! & STARTING ANALIZER FUNCTION. ");
    	 analize(pass);
     }
    String analize(String pass){
        passSize = pass.length();

        ArrayList<String> array = instalizingPassword(pass);
        randAlphaInt = alphaInt();
        return analyzer(array);
    }//END OF ANALIZER MAIN METHOD;

    /**
     * @author SREENATH YADAV
     * */
private ArrayList<String> instalizingPassword(String pass) {
    String[] p = pass.split("");
    ArrayList<String> array  = new ArrayList<>();
    for (String s : p) {
        System.out.println(s);
        array.add(s);
    }
    return array;
}
/**
 * @author SREENATH YADAV
 * */
private String  analyzer(ArrayList<String> array) {
//    Positioning(passSize);
position1 = 3;
position2 = 6;
position3 = passSize;


    analyzer1(array);
    analyzer2(array);
    analyzer3(array);
    StringBuilder password = new StringBuilder();
    for (int i = 0; i < array.size(); i++) {
        password.append(array.get(i));
    }
    System.out.println("Final : " + password);
    System.out.println("Final Result : " + password);
    return password.toString();
}
/**
 * Returns random symbols
* @author SREENATH YADAV
 * */
private String getRandomSymbol(String symbols,ArrayList<String> symbol){
    int ranSymbolIndex2 = r.nextInt(symbols.length());
    return symbol.get(ranSymbolIndex2);
}
/**
 * @author SREENATH YADAV
 * */
private void analyzer1(ArrayList<String> array) {
    char c = (char)(r.nextInt(26) + 'a');// get's random alphabet
    if(randAlphaInt.equals("Alpha")){
        int a = r.nextInt(position1);
        String cc = String.valueOf(c);
        String ran = String.valueOf(r.nextInt(10));
        array.set(a, String.valueOf(cc+ran));
        System.out.println("index : "+a +" Char : " + c+" Array" + array);

    }else {
        int a = r.nextInt(position1);
        String cc = String.valueOf(c);
        String ran = String.valueOf(r.nextInt(8));
        array.set(a, String.valueOf(cc+ran));
        System.out.println("index  : "+a+" Array" + array);
    }
}
/**
 * @author SREENATH YADAV
 * */
private void analyzer2(ArrayList<String> array) {
    char c = (char)(r.nextInt(26) + 'a');// get's random alphabet
    if(randAlphaInt.equals("Alpha")){
        int a = r.nextInt(position2);
        String cc = String.valueOf(c);
        String ran = String.valueOf(r.nextInt(6));
        array.set(a, String.valueOf(cc+ran));
        System.out.println("index : "+a +" Char : " + c+" Array" + array);

    }else {
        int a = r.nextInt(position1);
        String cc = String.valueOf(c);
        String ran = String.valueOf(r.nextInt(7));
        array.set(a, String.valueOf(cc+ran));
        System.out.println("index  : "+a+" Array" + array);
    }
}
/**
 * @author SREENATH YADAV
 * */
private void analyzer3(ArrayList<String> array) {
    String symbols = "!@#$%^&*)(?/><`~*-+";
    ArrayList<String> symbol = new ArrayList<>(Arrays.asList(symbols.split("")));
        int a = r.nextInt(position3);
        String ranSymbol1 = getRandomSymbol(symbols,symbol);
        array.set(position3-3, ranSymbol1);//change random symbol to positon and save to -3 and @last
        String ranSymbol2 = getRandomSymbol(symbols,symbol);

        if(ranSymbol1.equals(ranSymbol2)){
            analyzer3(array);
        }
        ArrayList<Integer> spaces = new ArrayList<Integer>();
        for (int i = 0; i < array.size(); i++) {
        String spacePo = array.get(i);
        System.out.println(i);
        if(spacePo.equals(" ")) {
            spaces.add(i);
        }
            for (Integer space : spaces) {
                array.set(space, getRandomSymbol(symbols, symbol));
            }
    }
    System.out.println(spaces);

            array.set(position3-1, ranSymbol2);
            System.out.println("index  : "+a+" Array" + array);
    }
/**
 * This method return whether alphabet or integer should be placed
 *@author SREENATH YADAV

 * */
private String alphaInt(){
        if(r.nextInt(100)%2 == 0) {//if true then alphabet will return
            return "Alpha";
        }
        return "Int";
    }
}//THANK YOU...


/**
 * @author SREENATH YADAV
 * */
//-----------------------OPTIONAL CASE TO RUN THIS DEMO--------------------------------
//public class Test {
// 	public static void main(String[] args){
		
// 		Scanner scanner = new Scanner(System.in);
// 		System.out.println("ENTER THE PRIMARY-KEY : ");
// 		String key = scanner.nextLine();
// 		RandomizerPassword random = new RandomizerPassword();//THIS CLASS SHOUHLD NOT EXTEDED BY MAIN METHOD,AS MAIN METHOD IS STATIC.
// 		random.analize(key);
// 		scanner.close();
// 		System.out.println("'FINAL RESULT ' is the generated password...");
		
// 	}
//}


