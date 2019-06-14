package pl.coderstrust.processor;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(JUnitParamsRunner.class)
public class ProcessorTest {

    @Mock
    NumbersProcessor numbersProcessor;
    @Mock
    FileProcessor fileProcessor;

    @InjectMocks
    Processor processor;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @Parameters({"2    3  5   7     11  13  17 19   23 29, 2+3+5+7+11+13+17+19+23+29=129",
            "127  131   137 139 149   151 157   163 167   173, 127+131+137+139+149+151+157+163+167+173=1494"})
    public void process(String line, String processedLine) {
        when(fileProcessor.readLinesFromFile("testInput.txt")).thenReturn(Arrays.asList(line));
        when(numbersProcessor.processLine(line)).thenReturn(processedLine);

        processor.process("testInput.txt", "testOutput.txt");

        verify(fileProcessor).readLinesFromFile("testInput.txt");
        verify(numbersProcessor).processLine(line);
        verify(fileProcessor).writeLinesToFile(Arrays.asList(processedLine), "testOutput.txt");
    }

}
