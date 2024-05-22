# Packet Sniffer
A java project that uses swing for frontend and Jpcap library to capture and monitor real time network traffic on multitude of hardware and virtual network interfaces.
## Capabilities
1. We can capture live network traffic with JpCap library.
2. The packet types that are implemented are TCP, UDP and ICMP.
3. We can export the packets in .txt file.
## Dependencies
1. JpCap library (jpcap.jar)
2. JpCap.dll
3. javax.xml.bind.jar
## Tests
For running valid test cases make sure that you modify the interface number in test case files with method call as  ".setInterface(5);".
Check your interface number by running main.java and checking interface lists.
1. Unit test of PacketContents file in "src/unRunAble" directory
2. Integration tests of frontEnd and backEnd class in "src/unRunAble" directory
3. GUI testing of frontEnd class in "src/unRunAble" directory
4. For system testing I have tested entire system from selecting interface to saving packet in file.
5. For performance testing I have repeated system test and run it with IntelliJ profiler provided by IntelliJ Idea to monitor CPU and RAM usage.
## Note
To execute, we need to add third party library dependencies that are present in "lib" directory.
In intelliJ Idea we can add the library dependencies in project "Module" settings.
After this we can run our "main" method under "src" directory.
## Reference
Original Project at https://github.com/RanaMahadAhmer/PacketSniffer