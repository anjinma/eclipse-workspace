package filter;

import java.io.PrintWriter;
import java.io.StringWriter;
// 출력 버퍼!!
public class ResponseBufferWriter extends PrintWriter{

	public ResponseBufferWriter() {
		super(new StringWriter(4096));
	}
	
	public String toString() {
		return ((StringWriter)super.out).toString();
	}
}
