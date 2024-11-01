public class Main {
    public static void main(String[] args) {
        String znaki = "mamakota";

        char[] charArray = znaki.toCharArray();
        int countM=0;
        int countA=0;
        int countK=0;
        int countO=0;
        int countT=0;


        for (int i = 0; i <charArray.length ; i++) {
            if (charArray[i]=='m'){
                countM+=1;
            } else if (charArray[i]=='a') {
                countA+=1;
            }else if(charArray[i]=='k'){
                countK+=1;
            }else if(charArray[i]=='o'){
                countO+=1;
            }else if(charArray[i]=='t'){
                countT+=1;
            }
        }

        System.out.println("Wyniki :\n"+"m="+countM);
        System.out.println("Wyniki :\n"+"a="+countA);
        System.out.println("Wyniki :\n"+"k="+countK);
        System.out.println("Wyniki :\n"+"o="+countO);
        System.out.println("Wyniki :\n"+"t="+countT);
    }
}
