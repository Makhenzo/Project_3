package project3;

import project3.CaseUtil;

public class ImplementCases implements CaseUtil {


    @Override
    public String asCamelCase(String text) {

        int count= 0;
        int textLength = text.length();
        char ch[] = text.toCharArray();
        int res_ind = 0;

        for (int i = 0; i < textLength ; i++)
        {

            if (ch[i] == ' ')
            {
                count++;

                ch[i + 1] = Character.toUpperCase(ch[i + 1]);
                continue;
            }

            else
                ch[res_ind++] = ch[i];
        }


        return String.valueOf(ch, 0, textLength - count);

    }


    @Override
    public String asSnakeCase(String text) {

        String finalSentence="";

        for(int i = 0 ; i < text.length() ; i++ ){

            if(text.charAt(i) == ' '){
                finalSentence = finalSentence + '_';
            }else
            {
                finalSentence = finalSentence + Character.toLowerCase(text.charAt(i));
            }
        }

        return finalSentence;
    }

    @Override
    public String asHumanReadableText(String text) {


        String finalSentence;

        finalSentence = text.replaceAll("[^a-zA-Z0-9]", " ");

        finalSentence=finalSentence.toLowerCase();

        return  finalSentence.substring(0,1).toUpperCase()+finalSentence.substring(1);

    }
}
