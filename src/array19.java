/*
 * # �迭 ��Ʈ�ѷ�[1�ܰ�] : �߰�
 */
//11:47-11:57

import java.util.Scanner;

public class array19 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10,20,0,0,0};
		int count = 2;
		
		while(true)
		{
			
			for(int i=0; i<count; i++)
			{
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			System.out.println("[1] �߰�");
			
			System.out.println("�޴� ����: ");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				if(count == 5)
				{
					System.out.println("�� �̻� �߰��� �� �����ϴ�.");
					continue;
				}
				System.out.println("�߰��� �� �Է� : ");
				int data = sc.nextInt();
				
				arr[count] = data;
				
				count++;
			}
		}
	}
}
