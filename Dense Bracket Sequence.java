import java.io.DataInputStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        initializeIO();
        try {
            int times = nextInt(), l, r, count;
            StringBuilder sb = new StringBuilder();
            while(times -- > 0) {
                skipLine(); skipLine();
                next(sb);
                l = 0; r = sb.length() - 1; count = 0;
                while(l < r) {
                    if(sb.charAt(l) == ')') {
                        l ++;
                    } else if(sb.charAt(r) == '(') {
                        r --;
                    } else {
                        l ++; r --; count += 2;
                    }
                }
                outData.append(sb.length() - count).append('\n');
            }
        } catch(IllegalArgumentException iae) {
            close();
            throw iae;
        }
        close();
    }
    private static DataInputStream dis;
    private static byte[] buffer;
    private static int bytesRead, bufferPos;
    private static StringBuilder outData;
    private static void initializeIO() {
        dis = new DataInputStream(System.in);
        buffer = new byte[1 << 16];
        read();
        outData = new StringBuilder();
    }
    private static void close() {
        try {
            System.out.print(outData);
            dis.close();
        }
        catch(IOException e) {
        }
    }
    private static byte c;
    private static boolean neg;
    private static int nextInt() throws IllegalArgumentException {
        skipWhiteSpace();
        int temp = 0;
        
        neg = (c == '-');
        if(neg) {
            read();
        }
   	   	do {
   	   	    if(!isDigit()) {
   	   	        throw new IllegalArgumentException();
   	   	    }
     		temp = temp * 10 + c - '0';
    		read();
     	} while(!(c == '\n' || c == ' ' || c == '\r') && (c != -1));
        
        return neg ? -temp : temp;
    }
    private static long nextLong() throws IllegalArgumentException {
        skipWhiteSpace();
		long temp = 0;

		neg = (c == '-');
		if (neg) {
			read();
		}
   	   	do {
   	   	    if(!isDigit()) {
   	   	        throw new IllegalArgumentException();
   	   	    }
     		temp = temp * 10L + c - '0';
    		read();
     	} while(!(c == '\n' || c == ' ' || c == '\r') && (c != -1));
		return neg ? -temp : temp;
	}
	private static double nextDouble() {
	    skipWhiteSpace();
	    double temp = 0.0d;
	    neg = (c == '-');
	    if(neg) {
	        read();
	    }
	    if(c != '.') {
	        do {
   	   	        if(!isDigit()) {
   	   	            throw new IllegalArgumentException();
   	       	    }
     	    	temp = temp * 10.0d + c - '0';
    	    	read();
	        } while(c != '.' && !(c == '\n' || c == ' ' || c == '\r') && (c != -1));
	    }
	    if(c == '.') {
	        double div = 1.0d;
	        read();
	        while(!(c == '\n' || c == ' ' || c == '\r') && (c != -1)) {
   	   	        if(!isDigit()) {
   	   	            throw new IllegalArgumentException();
   	       	    }
     	    	temp = temp * 10.0d + c - '0';
     	    	div *= 10.0d;
    	    	read();
	        }
	        temp /= div;
	    }
	    return neg ? -temp : temp;
	}
	private static boolean isDigit() {
	    return (c >= '0' && c <= '9');
	}
    private static int length;
    private static void getLine(StringBuilder sb) throws IllegalArgumentException {
        sb.setLength(0);
        while(c != -1) {
            if(c == '\n' || c == '\r') {
                break;
            }
            sb.append((char)c);
            read();
        }
        if(sb.length() == 0) {
            throw new IllegalArgumentException();
        }
    }
    private static void nextLine(StringBuilder sb) {
        skipLine(); getLine(sb);
    }
    private static void next(StringBuilder sb) throws IllegalArgumentException {
        skipWhiteSpace();
        sb.setLength(0);
        while(c != -1) {
            if(c == ' ' || c == '\n' || c == '\r') {
                break;
            }
            sb.append((char)c);
            read();
        }
        if(sb.length() == 0) {
            throw new IllegalArgumentException();
        }
    }
    private static void skipWhiteSpace() {
        while((c == '\n' || c == ' ' || c == '\r') && (c != -1)) {
            read();
        }
    }
    private static void skipSpace() {
        while(c == ' ' && c != -1) {
            read();
        }
    }
    private static void skipLine() {
        while(c != '\n' && c != -1 && c != '\r') {
            read();
        }
        read();
    }
    private static void fillBuffer() throws IOException {
        bytesRead = dis.read(buffer, bufferPos = 0, buffer.length);
        if(bytesRead == -1) {
            buffer[0] = -1;
        }
    }
    private static void read() {
        if(bufferPos >= bytesRead) {
            try {
                fillBuffer();
            }
            catch(IOException e) {
            }
        }
        c = buffer[bufferPos ++];
    }
}
