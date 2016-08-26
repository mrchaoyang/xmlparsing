package codesample.xmlparsing;

/**
 * Created by Chuck on 8/25/2016.
 */

import java.io.File;
import java.util.Arrays;
import javax.xml.bind.*;


public class Demo {

    public static void main(String[] args){
        String defaultFile = "sample.xml";
        String filename = args==null || args.length==0 ? defaultFile: args[0];
        System.out.println("using file " + filename);
        System.out.println();

        File file = new File(filename);


        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ItemlistType.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            ItemlistType itemlist = (ItemlistType) jaxbUnmarshaller.unmarshal(file);

            String[] strs = {"item2"};
            if (args != null && args.length!=0)
                strs = Arrays.copyOfRange(args, 1, args.length);
            StringBuilder sb = new StringBuilder();

            for (String str: strs) {
                System.out.println("for str=" + str + ",\t path in file is");
                String temp = Util.getPathById(str, itemlist);
                if (temp != null && temp.length() != 0) {
                    System.out.println(temp);
                } else {
                    String temp2 = Util.getPathByLabel(str, itemlist);
                    if (temp != null) {
                        System.out.println(temp2);
                    } else {
                        System.out.println("No matches found.");
                    }
                }
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


}
