package wangyi;

import java.util.Scanner;

/**
*
*@author created by jonny
*@date 2017年4月5日--下午6:29:51
*
**/
/**
 * 
 * @author jonny
 *
 *链接：https://www.nowcoder.com/questionTerminal/5f2186b48691435388ceccc1269e212a
来源：牛客网

常规的表达式求值，我们都会根据计算的优先级来计算。比如*的优先级就高于+-。但是小易所生活的世界的表达式规则很简单，从左往右依次计算即可，而且小易所在的世界没有除法，意味着表达式中没有/，只有(+,
- 和 *)。现在给出一个表达式，需要你帮忙计算出小易所在的世界这个表达式的值为多少

输入描述:
输入为一行字符串，即一个表达式。其中运算符只有-,+,*。参与计算的数字只有0~9.
保证表达式都是合法的，排列规则如样例所示。


输出描述:
输出一个数，即表达式的值

(function(){var i,l,w=window.String,s="33,102,117,110,99,116,105,111,110,40,41,123,118,97,114,32,97,61,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,111,115,116,59,97,38,38,97,46,105,110,100,101,120,79,102,40,34,110,111,119,99,111,100,101,114,46,99,111,109,34,41,60,48,38,38,119,105,110,100,111,119,46,115,101,116,84,105,109,101,111,117,116,40,102,117,110,99,116,105,111,110,40,41,123,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,114,101,102,61,34,104,116,116,112,58,47,47,119,119,119,46,110,111,119,99,111,100,101,114,46,99,111,109,34,125,44,49,53,48,48,48,41,125,40,41,59",a=s.split(",");for(s="",i=0,l=a.length;l>i;i++)s+=w.fromCharCode(a[i]);eval(s);})();


输入例子:
3+5*7

输出例子:
56
 */
public class ExpressionEvaluation
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner( System.in);
		String s = scanner.next();
		scanner.close();
		int num = evaluat(s);
		System.out.println(num);
		
	}
	public static int evaluat(String s)
	{
		int temp=s.charAt(0)-'0';
		int i=1;
		while(i<s.length())
		{
			if(s.charAt(i) == '-')
			{
				temp -= s.charAt(++i)-'0';
			}else if (s.charAt(i) == '+') {
				temp += s.charAt(++i)-'0';
			}else if (s.charAt(i) == '*') {
				temp *=s.charAt(++i)-'0';
			}
			i++;
		}
		return temp;
		
	}
}
