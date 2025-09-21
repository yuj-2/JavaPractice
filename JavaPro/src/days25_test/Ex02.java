package days25_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		Map<String, ArrayList<String>> hmap = new LinkedHashMap<>();
		String fileName = ".\\src\\days25\\1차_팀편성.txt";
		try (FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr)){
			
			String line = null;
			String key = null;
			ArrayList<String> tlist = null;

			while ((line = br.readLine()) != null) {
				
				String regex = "[: /]";
				String [] tInfo = line.split(regex);
				key = tInfo[0];
				tlist = new ArrayList<>();
				
				for (int i = 1; i < tInfo.length; i++) {
					tlist.add(tInfo[i]);
				}//for
				hmap.put(key,tlist);
			}//while
			printTeam(hmap);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

	private static void printTeam(Map<String, ArrayList<String>> hmap) {
		Set<Entry<String, ArrayList<String>>> es = hmap.entrySet();
		Iterator<Entry<String, ArrayList<String>>> ir = es.iterator();
		
		while (ir.hasNext()) {
			Map.Entry<String, ArrayList<String>> entry = ir.next();
			String key = entry.getKey();
			System.out.printf("[%s]\n", key);
			ArrayList<String> tlist = entry.getValue();
			Iterator<String> ir2 = tlist.iterator();
			char no = 'A';
			while (ir2.hasNext()) {
				String name = ir2.next();
				System.out.printf("\t%c %s\n", no++,name);
			}//ir2 while
		}//ir while
	}
}
