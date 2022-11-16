package com.emmy.looplearning.stringloop;

public class Loop {
    public static void main(String[] args) {
        String str = "We have a large inventory of things in our warehouse falling in "
                + "the category: apperal and the slightly " +
                "more in demand category: makeup along with the category: furniture and ...";

//        System.out.println(str.length());
//        System.out.println(str.indexOf("furniture", 160));
//        System.out.println(str.substring(160, 167));

        sortCategory(str);
    }

    public static void sortCategory(String str){
        int i = 0;
        while(true){
            int found = str.indexOf("category", i);
            if(found == -1){
                break;
            }

            int start = found + 10;
            int end = str.indexOf(" ", start);
            System.out.println(str.substring(start, end));
            i = end ;

        }
    }
}
