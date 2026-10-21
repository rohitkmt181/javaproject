# RMI (Remote Method Invocation) Experiment

This repository contains the complete execution flow for a standard RMI application.

## Files Required
1. `Adder.java` - Remote Interface
2. `AdderImpl.java` - Remote Implementation
3. `Server.java` - RMI Server (binds the object to the registry)
4. `Client.java` - RMI Client (looks up and calls the `add()` method)

## How to Execute the Experiment
1. **Compile all Java files:**
   ```bash
   javac *.java
   ```

2. **Start the RMI Server:**
   (This will automatically start the RMI registry and bind the object)
   ```bash
   java Server
   ```

3. **Run the RMI Client:**
   Open a **new terminal/command prompt** in the same folder and run:
   ```bash
   java Client
   ```

## Key Concepts Covered
- **Remote Interface:** Extends `java.rmi.Remote`.
- **Remote Object:** Extends `UnicastRemoteObject`.
- **rebind():** Used in the Server to register the object.
- **lookup():** Used in the Client to find the remote object.
