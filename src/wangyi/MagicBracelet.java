package wangyi;

import java.util.Scanner;

/**
*
*@author created by jonny
*@date 2017��4��5��--����4:07:24
*
**/

/**
 * 
 * @author jonny
 *���ӣ�https://www.nowcoder.com/questionTerminal/79c639e02bc94e6b919e3372c8e1dc5e
��Դ��ţ����

С��ӵ��һ��ӵ��ħ�����ֻ�������n������(����һ����),�����ħ���ֻ�ÿ��ʹ��ħ����ʱ��ͻᷢ��һ�����صı仯��ÿ�����ֻ����Լ�������һ�����ֵĺ�(���һ�����ֵĺ���һ�������ǵ�һ��),һ��ĳ��λ�õ����ִ��ڵ���100�����϶�100ȡģ(����ĳ��λ�ñ�Ϊ103,�ͻ��Զ���Ϊ3).���ڸ������ħ���ֻ��Ĺ��ɣ���������ʹ��k��ħ��֮��ħ���ֻ���״̬��

��������:
�������ݰ������У�
��һ��Ϊ��������n(2 �� n �� 50)��k(1 �� k �� 2000000000),�Կո�ָ�
�ڶ���Ϊħ���ֻ���ʼ��n�������Կո�ָ�����Χ����0��99.


�������:
���ħ���ֻ�ʹ��k��֮���״̬���Կո�ָ�����ĩ�޿ո�

(function(){var i,l,w=window.String,s="33,102,117,110,99,116,105,111,110,40,41,123,118,97,114,32,97,61,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,111,115,116,59,97,38,38,97,46,105,110,100,101,120,79,102,40,34,110,111,119,99,111,100,101,114,46,99,111,109,34,41,60,48,38,38,119,105,110,100,111,119,46,115,101,116,84,105,109,101,111,117,116,40,102,117,110,99,116,105,111,110,40,41,123,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,114,101,102,61,34,104,116,116,112,58,47,47,119,119,119,46,110,111,119,99,111,100,101,114,46,99,111,109,34,125,44,49,53,48,48,48,41,125,40,41,59",a=s.split(",");for(s="",i=0,l=a.length;l>i;i++)s+=w.fromCharCode(a[i]);eval(s);})();


��������:
3 2
1 2 3


�������:
8 9 7
 *
 */
public class MagicBracelet
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = scanner.nextInt();
		}
		scanner.close();
		while(k!=0)
		{
			a=find(a, n);
			k--;
		}
		for(int i=0;i<n-1;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(a[n-1]);
	}
	public static int[] find(int a[],int n){
		int[] temp = new int[n];
		for(int i =0;i<n;i++){
			if (i == n-1)
			{
				temp[i] = a[i]+a[0];
			}else temp[i] = a[i]+a[i+1];
			if(temp[i]>100) temp[i] %= 100;
			
		}
		return temp;
	}
//	public static int[] useKTimes(int[] a,int n,int k)
//	{
//		if(k < 1 || k> 2000000000) return null;
//		int[] newa = new int[n];
//		while(k != 0)
//		{
//			for(int i=0;i<n;i++){
//				if(i == n-1){
//					newa[i] = a[i]+a[1];
//				}else{
//					newa[i] = a[i] + a[i+1];
//				}
//				if (newa[i] >= 100)
//				{
//					newa[i] %= 100; 
//				}
//				k--;
//			}
//			for (int i = 0; i < newa.length; i++)
//			{
//				a[i] = newa[i];
//			}
//		}
//		return a;
//	}
}
