# Hello World RMI Application

A minimal Java RMI (Remote Method Invocation) client/server example.

The server registers a remote object named `HelloWorld` on port 1099 (configurable).
The client looks it up and prints the greeting returned by `display()`.

## Prerequisites

- JDK 8 or newer (`java`, `javac`)

## Compile

```sh
./compile.sh
# or
javac *.java
```

## Run

Start the server (default port 1099):

```sh
./run-server.sh
# or with a custom port
./run-server.sh 1100
```

In another terminal, run the client:

```sh
./run-client.sh
# or with host/port
./run-client.sh localhost 1100
```

Expected client output:

```
Hello, World!
```

## Test

```sh
./test.sh
```

## Project layout

- `HelloWorld.java` - remote interface
- `HelloImpl.java` - server-side implementation
- `HelloServer.java` - RMI server / registry
- `HelloClient.java` - RMI client

## Troubleshooting

- `Address already in use` / port in use: stop the existing server or use a different port.
- `Connection refused`: make sure the server is running and reachable on the given host/port.
- Classpath issues: run commands from this directory so `*.class` files are found.

