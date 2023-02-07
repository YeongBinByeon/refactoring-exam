package removecontrolflag.after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDataBase {
	
	private Map<String, String> map = new HashMap<String, String>();

	public SimpleDataBase(Reader reader) throws IOException {
		
		BufferedReader br = new BufferedReader(reader);
		boolean reading = false;
		
		String line;
		while(!reading) {
			
			line = br.readLine();
			if(line == null) {
				reading = true;
			}
			else {
				boolean scanningKey = true;
				
				StringBuffer keyBuffer = new StringBuffer();
				StringBuffer valueBuffer = new StringBuffer();
				
				for(int i=0; i<line.length(); i++) {
					char ch = line.charAt(i);
					
					if(scanningKey) { // key
						if(ch == '=') {
							scanningKey= false;
						}
						else {
							keyBuffer.append(ch);
						}
					}
					else { // value
						valueBuffer.append(ch);
					}
				}
				String key = keyBuffer.toString();
				String value = valueBuffer.toString();
				map.put(key, value);
			}
		}
	}
	

	public Iterator<String> iterator(){
		return map.keySet().iterator();
	}
	
	public String getValue(String key) {
		return map.get(key);
	}

}