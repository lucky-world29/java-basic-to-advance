Java Brings various Streams with its I/O package that helps the user to perform all the input-output operations.
These streams support all the types of objects,data-types,characters,files etc to fully execute the I/O operations .

        input stream                       output stream

SOURCE ===============> Java Application =================> Destination
READ WRITE

STREAM :

1. It is a logical connection between java program and a file .

2. To store the data in the persistence media there should be a way to connect to persistent media from java application either physically or logically.
   Stream provides logical connection.

It can be defined as :
"It is a continuous flow of data between java program and persistent media "

eg

class A {
PSVM(String args[]){
int a =10;
int b =20;

            int c = a+b;
    }

}

Types :
2 types

1. InputStream
2. OutputStream

InputStream : The stream that allows data to come into the java application from the persistent media is called Input Stream.

OutputStream : The stream that allows data to send out from the java application to be stored into persistent media is called Output Stream.

Basically InputStream are used to read data from a persistence media,and OutputStream are used to write or store data in a persistent media from a java application.

Java Stream

in java streams are divided into parts

Binary Streams ==> Streams which read and write data in the format of bytes is called binary streams( b_t_y_e stream )

Character Streams ==> Streams which read and write data in the format of character is called Character streams

==============================

3 streams ARE created automatically
1.System.out
2.System.in
3.System.err

Compiled from "System.java"

public final class java.lang.System {
public static final java.io.InputStream in;
public static final java.io.PrintStream out;
public static final java.io.PrintStream err;
static java.lang.ModuleLayer bootLayer;
public static void setIn(java.io.InputStream);
public static void setOut(java.io.PrintStream);
public static void setErr(java.io.PrintStream);
public static java.io.Console console();
public static java.nio.channels.Channel inheritedChannel() throws java.io.IOException;
public static void setSecurityManager(java.lang.SecurityManager);
public static java.lang.SecurityManager getSecurityManager();
public static native long currentTimeMillis();
public static native long nanoTime();
public static native void arraycopy(java.lang.Object, int, java.lang.Object, int, int);
public static native int identityHashCode(java.lang.Object);
public static java.util.Properties getProperties();
public static java.lang.String lineSeparator();
public static void setProperties(java.util.Properties);
public static java.lang.String getProperty(java.lang.String);
public static java.lang.String getProperty(java.lang.String, java.lang.String);
public static java.lang.String setProperty(java.lang.String, java.lang.String);
public static java.lang.String clearProperty(java.lang.String);
public static java.lang.String getenv(java.lang.String);
public static java.util.Map<java.lang.String, java.lang.String> getenv();
public static java.lang.System$Logger getLogger(java.lang.String);
  public static java.lang.System$Logger getLogger(java.lang.String, java.util.ResourceBundle);
public static void exit(int);
public static void gc();
public static void runFinalization();
public static void load(java.lang.String);
public static void loadLibrary(java.lang.String);
public static native java.lang.String mapLibraryName(java.lang.String);
static {};
}



Compiled from "InputStream.java"
public abstract class java.io.InputStream implements java.io.Closeable {
  public java.io.InputStream();
  public static java.io.InputStream nullInputStream();
  public abstract int read() throws java.io.IOException;
  public int read(byte[]) throws java.io.IOException;
  public int read(byte[], int, int) throws java.io.IOException;
  public byte[] readAllBytes() throws java.io.IOException;
  public byte[] readNBytes(int) throws java.io.IOException;
  public int readNBytes(byte[], int, int) throws java.io.IOException;
  public long skip(long) throws java.io.IOException;
  public void skipNBytes(long) throws java.io.IOException;
  public int available() throws java.io.IOException;
  public void close() throws java.io.IOException;
  public void mark(int);
  public void reset() throws java.io.IOException;
  public boolean markSupported();
  public long transferTo(java.io.OutputStream) throws java.io.IOException;
}

interface 

 marker interface 
