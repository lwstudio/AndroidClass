import java.io.*;

/*
	finally块释放资源的代码
*/
public class Demo11{
	public static void main(String[] args) {
		FileReader fileReader = null;
		
		try {
			//  找到目标文件
			File file = new File("C://Users/adolph/Desktop/Hello.txt");
			//  建立程序与文件的数据通道
			fileReader = new FileReader(file);
			//  读取文件
			char[] buf = new char[1024];
			int length = 0;
			length = fileReader.read(buf);
			System.out.println("读取到的内容：" + new String(buf, 0, length));
		} catch (IOException e) {
			System.out.println("读取资源失败");
		} finally {
			try {
				fileReader.close();
				System.out.println("释放资源成功");
			} catch (IOException e) {
				System.out.println("读取资源失败，请手动释放资源");
			}
		}
	}
}