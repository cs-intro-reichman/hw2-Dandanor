public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addmin = Integer.parseInt(args[1]);
        int newhour= (hours + addmin/60)%24;
        int newmin= minutes + addmin%60;
        if (newmin>=60){
            newmin-=60;
            newhour+=1;
        }
        if (newhour==24){
            newhour=0;
        }
        if(newhour<10&&newmin<10){
        System.out.println("0"+newhour+ ":0"+ newmin); 
        }
        else if (newhour<10&&newmin>=10){
        System.out.println("0"+newhour+ ":"+ newmin); 
        }
        else if (newhour>=10&&newmin<10){
        System.out.println(newhour+ ":0"+ newmin); 
        }
        else{
        System.out.println(newhour+ ":"+ newmin);
        }
    }
}
