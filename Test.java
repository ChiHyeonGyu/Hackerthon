import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

		int count = 0;

		FileReader fr = new FileReader("Menu.txt");
		BufferedReader br = new BufferedReader(fr);
		String readLine;
		while ((readLine = br.readLine()) != null) {
			System.out.println(readLine);
			count++;
		}

		System.out.println(count);

		SearchTxt mSearch = new SearchTxt();
		if (mSearch.haveMenu("Menu.txt", "���κ��")) { // "���ε��"�� menu.txt�� ���� > �޴��߰� �� �ʿ����
			System.out.println("�޴��߰� �Ұ�");
		}

		else { // "���ε��"�� menu.txt�� ���� { "���ε��"�� menu.txt�� ���� > �޴��߰� ����
			System.out.println("�޴��߰� ����");
		}
	}

}
