package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Player";
        } else if(query.contains("which of the following numbers is the largest")) {
            String[] arr = query.split(": ");
            String[] numarr = arr[1].split(", ");
            String max = "0";
            for(String s : numarr) {
                if(Integer.parseInt(s) > Integer.parseInt(max)) {
                    max = s;
                }
            }
            return max;
        } else if(query.contains("multiplied")) {
            String[] arr = query.split("multiplied");
            String a = arr[0];
            String b = arr[1];
            String cleanA = a.replaceAll("\\D+","");
            String cleanB = b.replaceAll("\\D+","");
            int result = Integer.parseInt(cleanA) * Integer.parseInt(cleanB);
            System.out.println(result);
            return result + "";
        } else if(query.contains("which of the following numbers are primes:")) {
            String[] arr = query.split(": ");
            String[] numarr = arr[1].split(", ");
            boolean flag = false;
            for(String s : numarr) {
                for(int i = 2; i <= Integer.parseInt(s) / 2; i++) {
                    if(Integer.parseInt(s) == 0) {
                        flag = true;
                        break;
                    }
                }
                if(!flag) {
                    return s;
                }
            }

            return "-1";
        }else {
            return "";
        }
    }

//    public static void main(String[] args) {
//        QueryProcessor test = new QueryProcessor();
//        test.process("which of the following numbers is the largest: 87, 58, 512, 59");
//        test.process("3 multiplied by 5");
//        test.process("\"which of the following numbers are primes: 333, 31, 39");
//    }
}
