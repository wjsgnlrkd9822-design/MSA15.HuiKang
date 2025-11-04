package day11.Ex03_CharacterStream;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriterEx {

	public static void main(String[] args) {
		// 파일 경로
		String filePath = "sample.txt";
		
		try (
			FileWriter fw = new FileWriter(filePath);
			BufferedWriter bw = new BufferedWriter(fw);
		) {
			bw.write("Hello Java~! \n");              
			bw.write("This is Java \n");              
			System.out.println("sample.txt 파일을 저장하였습니다");  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
