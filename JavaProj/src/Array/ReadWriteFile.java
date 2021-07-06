package Array;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class ReadWriteFile {

	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream(new File("M:/VM Cancel reason.docx"));
			BufferedInputStream bis=new BufferedInputStream(fis);
			FileOutputStream fos=new FileOutputStream(new File("M:/reason.docx"));
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			int info;
			while((info=bis.read())!=-1) {
				bos.write(info);
			}
			bis.close();
			bos.close();
	
	}

}
