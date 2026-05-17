# Java Chat Messenger

A simple client-server chat messenger application developed using Java Socket Programming.

## Features
- Real-time chatting between client and server
- Two-way communication using sockets
- Timestamp for each message
- Chat history stored in `chatlog.txt`
- Continuous messaging using loop
- Exit chat using `end`

## Technologies Used
- Java
- Socket Programming
- File Handling
- VS Code / Command Prompt

## Files Included
- `ChatClientLoop.java`
- `ChatServerLoop.java`
- `chatlog.txt`

## How to Run

### Step 1: Compile Files
    javac ChatServerLoop
    javac ChatClientLoop
### Step 2: Run Server
    java ChatServerLoop
### Step 3: Run Client in Another CMD
    java ChatClientLoop
### Port Used
   5100
### Sample Chat
   Client : Hello Server
   Server : Hello Client
### Chat Log Example
   [17-05-2026 10:30:12] Client : Hello
   [17-05-2026 10:30:20] Server : Hi
### Concepts Used
  ServerSocket ,
  Socket ,
  BufferedReader ,
  PrintStream ,
  FileWriter ,
  PrintWriter ,
  LocalDateTime

# Author : Sakshi Kachare

```bash
javac ChatServerLoop.java
javac ChatClientLoop.java
