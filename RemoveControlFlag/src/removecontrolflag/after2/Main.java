package removecontrolflag.after2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		SimpleDataBase dataBase = new SimpleDataBase(new FileReader("data.txt"));

		Iterator<String> ir = dataBase.iterator();
		
		while(ir.hasNext()) {
			String key = ir.next();
			System.out.println("key :" + key);
			System.out.println("value :" + dataBase.getValue(key));
			System.out.println();
		}
	}

}
