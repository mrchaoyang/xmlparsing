package codesample.xmlparsing;

/**
 * Created by Chuck on 8/25/2016.
 */

import java.util.Arrays;
import javax.xml.bind.*;
import javax.xml.transform.stream.StreamSource;


@SuppressWarnings("Since15")
public class JaxbParsing {

    public JaxbParsing() {
    }

    public ItemlistType unmarshalFile(String fileName) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(ItemlistType.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        JAXBElement<ItemlistType> my = jaxbUnmarshaller.unmarshal(new StreamSource(fileName), ItemlistType.class);
        ItemlistType itemlist = my.getValue();
        return itemlist;
    }

    public static void main(String[] args){
        String defaultFile = "src/main/resources/sample.xml";
        String filename = args==null || args.length==0 ? defaultFile: args[0];
        System.out.println("using file " + filename);
        System.out.println();

        JaxbParsing myInstance = new JaxbParsing();

        try{
            ItemlistType itemlist = myInstance.unmarshalFile(filename);

            String[] strs = {"item2"};
            if (args != null && args.length!=0)
                strs = Arrays.copyOfRange(args, 1, args.length);

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
