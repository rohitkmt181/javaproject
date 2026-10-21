# Network Programming - Client & Server

This repository contains a basic TCP Client-Server program in Java, as provided in the "Server and Client.pdf" document.

## Files Required
1. `Server.java` - Waits for requests from clients and provides services (Listens on port 5000).
2. `Client.java` - Requests a service from the server.

## How to Execute the Experiment
Because they represent different processes, they must be compiled and run separately:

1. **Compile both files:**
   ```bash
   javac Server.java
   javac Client.java
   ```

2. **Start the Server:**
   Open a terminal and run:
   ```bash
   java Server
   ```

3. **Start the Client:**
   Open a **second terminal** and run:
   ```bash
   java Client
   ```

## Conceptual Communication Flow
```text
CLIENT                                      SERVER
                                  <---- Connection Accepted
---- Hello Server -------------->
<--- Hello Client ---------------
---- Close --------------------->
```

## Important Exam Differences (TCP vs UDP)
| TCP | UDP |
|-----|-----|
| Connection-oriented | Connectionless |
| Reliable | Less reliable |
| Ordered data | No guarantee of order |
| Uses Socket/ServerSocket | Uses DatagramSocket |
| More overhead | Less overhead |

## Packages Used
- `java.io.*`: Provides classes for input and output operations (BufferedReader, InputStreamReader, PrintWriter).
- `java.net.*`: Provides classes for network programming (Socket, ServerSocket).
