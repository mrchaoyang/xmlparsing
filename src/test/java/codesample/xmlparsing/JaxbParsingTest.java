package codesample.xmlparsing;

import org.junit.Test;

import static org.junit.Assert.*;

public class JaxbParsingTest {
    JaxbParsing instance;

    @org.junit.Before
    public void setUp() throws Exception {
        instance = new JaxbParsing();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void unmarshalFileTest() throws Exception {
        String fileName = "src/test/resources/sample2.xml";
        ItemlistType itemlist = instance.unmarshalFile(fileName);
        assertNotNull(itemlist);
        assertTrue(itemlist.getItems().getItem().size()>0);
    }

}