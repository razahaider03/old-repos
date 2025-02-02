# Networking

Java Networking is a concept of connecting two or more computing devices together so that we can share resources.

Java Socket Programming provides facility to share data between different computing devices.

**Advantage of Java Networking :**
-	sharing resources
-	centralized software management

## Java Networking Terminology :

Some of the widely used java networking terminologies are as follows:

1.	IP Address
    - IP address is a unique number assigned to a node of a network e.g. 192.168.0.1. It is composed of octets that range from 0 to 255.
It is a logical address that can be changed.

2.	Protocol
    - A protocol is a set of rules basically that is followed for communication. For example: TCP, FTP, Telnet, SMTP, POP, etc.

3.	Port Number
    - The port number is used to uniquely identify different applications. It acts as a communication endpoint between applications. The port number is associated with the IP address for communication between two applications.

4.	MAC Address
    - MAC (Media Access Control) Address is a unique identifier of NIC (Network Interface Controller). A network node can have multiple NIC but each with unique MAC. The main difference between MAC and IP address is that, MAC Address is used to ensure the physical address of computer. It uniquely identifies the devices on a network. While IP address are used to uniquely identifies the connection of network with that device take part in a network.

5.	Socket
    - A socket is an endpoint between two way communication. More details in "Socket" section below.

6.	Connection-oriented protocol
    - In connection-oriented protocol, acknowledgement is sent by the receiver. So, it is reliable but slow. The example of connection-oriented protocol is TCP.

7.  Connection-less protocol
    - In connection-less protocol, acknowledgement is not sent by the receiver. So, it is not reliable but fast. The example of connection-less protocol is UDP.

## java.net package
The java.net package provides many classes to deal with networking applications in Java. A list of these classes is given below:

- Authenticator
- CacheRequest
- CacheResponse
- ContentHandler
- CookieHandler
- CookieManager
- DatagramPacket
- DatagramSocket
- DatagramSocketImpl
- InterfaceAddress
- JarURLConnection
- MulticastSocket
- InetSocketAddress
- InetAddress
- Inet4Address
- Inet6Address
- IDN
- HttpURLConnection
- HttpCookie
- NetPermission
- NetworkInterface
- PasswordAuthentication
- Proxy
- ProxySelector
- ResponseCache
- SecureCacheResponse
- ServerSocket
- Socket
- SocketAddress
- SocketImpl
- SocketPermission
- StandardSocketOptions
- URI
- URL
- URLClassLoader
- URLConnection
- URLDecoder
- URLEncoder
- URLStreamHandler

## Java Socket Programming

Java Socket programming is used for communication between the applications running on different JRE. Java Socket programming can be connection-oriented or connection-less.

Socket and ServerSocket classes are used for connection-oriented socket programming and DatagramSocket and DatagramPacket classes are used for connection-less socket programming.

The client in socket programming must know two information:
1.	IP Address of Server
2.	Port number.

### Socket Class :

A socket is simply an endpoint for communications between the machines. The Socket class can be used to create a socket.

![socket-programming](https://user-images.githubusercontent.com/2780145/68625991-64f2e400-0500-11ea-9616-3702cb213cdd.png)

**Important methods :**
<table class="alt">
<tbody><tr><th>Method</th><th>Description</th></tr>
<tr><td>1) public InputStream getInputStream()</td><td>returns the InputStream attached with this socket.</td></tr>
<tr><td>2) public OutputStream getOutputStream()</td><td>returns the OutputStream attached with this socket.</td></tr>
<tr><td>3) public synchronized void close()</td><td>closes this socket</td></tr>
</tbody></table>

### ServerSocket Class :

The ServerSocket class can be used to create a server socket. This object is used to establish communication with the clients.

**Important methods :**
<table class="alt">
<tbody><tr><th>Method</th><th>Description</th></tr>
<tr><td>1) public Socket accept()</td><td>returns the socket and establish a connection between server and client.</td></tr>
<tr><td>2) public synchronized void close()</td><td>closes the server socket.</td></tr>
</tbody></table>

## Example of Java Socket Programming

### Creating Server :
```java
ServerSocket ss = new ServerSocket(6666);  
Socket s = ss.accept(); //establishes connection and waits for the client   
```

### Creating Client :
```java
Socket s = new Socket("localhost",6666);  
```
