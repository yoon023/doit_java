package Stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandonAccessFileTest {
	public static void main(String[] args) throws IOException {
	RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
	rf .write(100);
	System.out.println("파일 포인터 위치:" +rf.getFilePointer());
	rf.writeDouble(3.14);
	System.out.println("파일 포인터 위치:" +rf.getFilePointer());
	rf.writeUTF("안녕하세요");
	System.out.println("파일 포인터 위치:" +rf.getFilePointer());
	
	int i = rf.readInt();
	double d = rf.readDouble();
	String str = rf.readUTF();
	
	System.out.println("파일 포인터 위치:" +rf.getFilePointer());
	
	}
}
