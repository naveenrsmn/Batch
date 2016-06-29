import java.io.*;
class B extends A {
public B() throws IOException {
try {
throw new IOException();
} catch (IOException e) {
System.out.print("IOException is thrown in B");
throw new IOException();
}
}
}
