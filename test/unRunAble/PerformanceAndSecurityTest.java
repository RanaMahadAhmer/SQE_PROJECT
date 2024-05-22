package unRunAble;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unRunAble.InterFaces.FrontEndTestInterface;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

/**
 * We are basically running system from start to end and storing packet in file ("src/Captured.txt")
 * and at the end we are checking if the packets were captured and stored in the file
 *
 * For stress and load we have used performance testing (We run the test using IntelliJ Profiler
 *      and monitor CPU usage to measure stress on CPU and performance of our code)
 *
 * For Security testing We run the test using IntelliJ Profiler
 *      and monitor RAM usage to see if our code has memory leakages in it.
 * */

class PerformanceAndSecurityTest {
    FrontEndTestInterface frontEnd;

    @BeforeEach
    void setUp() {
        frontEnd = new FrontEnd();
    }

    @AfterEach
    void tearDown() {
        frontEnd = null;
    }


    @Test
    void testSystem() throws InterruptedException {
        BackEnd mockBackEnd = new BackEnd((FrontEnd) frontEnd);
        frontEnd.setBackEnd(mockBackEnd);
        mockBackEnd.start();
        // Simulate clicking the capture button
        frontEnd.setInterface(5);

        frontEnd.startCapture();
        Thread.sleep(5000);
        // Simulate clicking the stop button
        frontEnd.stopCapture();

        // Simulate clicking the save button
        frontEnd.saveCapture();

        // Check if packet reading is stopped and components are updated
        assertFalse(frontEnd.stopButtonState());
        String filePath = "src/Captured.txt";
        File file = new File(filePath);
        assertTrue(file.length() > 0);

    }
}