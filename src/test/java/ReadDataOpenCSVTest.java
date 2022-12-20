import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class ReadDataOpenCSVTest {
    @Test
    public void testGetPersonLinkedList() throws IOException {


        Settings settings = new Settings();
        ClassLoader loader = Settings.class.getClassLoader();

        try(InputStream io = loader.getResourceAsStream("app.properties")) {
            settings.load(io);
        }

        ReadDataOpenCSV readDataOpenCSV = new ReadDataOpenCSV(settings.getValue("foreign_names.path"));
        assertEquals(25898, readDataOpenCSV.getPersonLinkedList().size());
        assertEquals(28281, readDataOpenCSV.getPersonLinkedList().getFirst().getId());
        assertEquals(54178, readDataOpenCSV.getPersonLinkedList().getLast().getId());
        assertEquals(
                readDataOpenCSV.getPersonLinkedList().get(4).getDivision().getId(),
                readDataOpenCSV.getPersonLinkedList().getLast().getDivision().getId()
        );

        ReadDataOpenCSV readDataOpenCSV1 = new ReadDataOpenCSV(settings.getValue("foreign_names_Test1.path"));
        assertEquals(3, readDataOpenCSV1.getPersonLinkedList().size());
        assertEquals(28281, readDataOpenCSV1.getPersonLinkedList().getFirst().getId());
        assertEquals(28283, readDataOpenCSV1.getPersonLinkedList().getLast().getId());
        assertEquals(
                readDataOpenCSV1.getPersonLinkedList().getFirst().getDivision().getId(),
                readDataOpenCSV1.getPersonLinkedList().getLast().getDivision().getId()
        );
        ReadDataOpenCSV readDataOpenCSV2 = new ReadDataOpenCSV(settings.getValue("foreign_names_Test2.path"));
        assertEquals(6, readDataOpenCSV2.getPersonLinkedList().size());
        assertEquals(28303, readDataOpenCSV2.getPersonLinkedList().getFirst().getId());
        assertEquals(28308, readDataOpenCSV2.getPersonLinkedList().getLast().getId());
        assertEquals(
                readDataOpenCSV2.getPersonLinkedList().getFirst().getDivision().getId(),
                readDataOpenCSV2.getPersonLinkedList().getLast().getDivision().getId()
        );
        ReadDataOpenCSV readDataOpenCSV3 = new ReadDataOpenCSV(settings.getValue("foreign_names_Test3.path"));
        assertEquals(7, readDataOpenCSV3.getPersonLinkedList().size());
        assertEquals(42733, readDataOpenCSV3.getPersonLinkedList().getFirst().getId());
        assertEquals(42739, readDataOpenCSV3.getPersonLinkedList().getLast().getId());
        assertEquals(
                readDataOpenCSV3.getPersonLinkedList().getFirst().getDivision().getId(),
                readDataOpenCSV3.getPersonLinkedList().getLast().getDivision().getId()
        );
        ReadDataOpenCSV readDataOpenCSV4 = new ReadDataOpenCSV(settings.getValue("foreign_names_Test4.path"));
        assertEquals(7, readDataOpenCSV4.getPersonLinkedList().size());
        assertEquals(54143, readDataOpenCSV4.getPersonLinkedList().getFirst().getId());
        assertEquals(54149, readDataOpenCSV4.getPersonLinkedList().getLast().getId());
        assertEquals(
                readDataOpenCSV4.getPersonLinkedList().getFirst().getDivision().getId(),
                readDataOpenCSV4.getPersonLinkedList().getLast().getDivision().getId()
        );
    }

}