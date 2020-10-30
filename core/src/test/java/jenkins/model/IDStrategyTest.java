package jenkins.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class IDStrategyTest {

    @Test public void hex() throws Exception {
        String fn = "$0041";
        IdStrategy.CaseSensitive cs = new IdStrategy.CaseSensitive();
        assertEquals("A", cs.idFromFilename(fn));
    }
    
    @Test public void empty() throws Exception {
    	String fn = "";
    	IdStrategy.CaseSensitive cs = new IdStrategy.CaseSensitive();
    	assertEquals("", cs.idFromFilename(fn));
    }

}