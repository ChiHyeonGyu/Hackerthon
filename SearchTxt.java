import java.io.*;

public class SearchTxt { // Txt������ line���� check�Ͽ� ���� �ִ��� Ȯ��

	static String menuTitle = "";

	public SearchTxt() {
	}

	public static boolean haveMenu(String checkFile, String checkLine) { // checkFile = üũ�ϰ���� txt����, checkLine = �˰����
																			// String����

		BufferedReader br = null;
		String line; // �޴�����
		boolean check = false;
		int rowCount = 0; // ���° �ִ� �������� check

		// ���Ͽ� �˻��� ���� �ִ��� ������ Ȯ��
		try {
			br = new BufferedReader(new FileReader(checkFile)); // �Ű����� = üũ�ϰ���� txt����

			while ((line = br.readLine()) != null) {
				if (line.equals(checkLine)) { // �˰���� Line
					// System.out.println("ã������ : " + line);
					check = true;
					break;
				} else {
					// System.out.println("menu.txt �� �����ϴ�");
					check = false;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("���� ����");
		} catch (IOException e) {
			System.out.println("���� �б����");
		}

		finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		return check;

	}
	
	//public int whereRow(String )
}
