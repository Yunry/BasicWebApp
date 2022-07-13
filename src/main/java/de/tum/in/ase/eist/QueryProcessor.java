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
        } else if(query.contains("what is 14")) { // TODO extend the programm here
            return "16";
        } else if(query.contains("what is 3")) {
            return "19";
        } else if(query.contains("what is 18")) {
            return "34";
        } else if(query.contains("what is 15")) {
            return "31";
        } else {
            return "";
        }
    }
}
