package default1;

public class TestString1 {

	public static void main(String[] args) {
        // 把最后一个two单词首字母大写
        String s = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
        int index = s.lastIndexOf("two");
         
        char[] cs = s.toCharArray();
        cs[index] = Character.toUpperCase(cs[index]);
        String result = new String(cs);
        System.out.printf(result);
 
    }
	
	/*public static void main(String[] args) {
        // 把 lengendary 最后一个字母变大写
        String s = "lengendary";
        char[] cs = s.toCharArray();
        cs[cs.length - 1] = Character.toUpperCase(cs[cs.length-1]);
        String result = new String(cs);
        System.out.printf(result);
 
    }*/
	
	/*public static void main(String[] args) {
//      把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy 
        String s = "lengendary";
        char[] cs =s.toCharArray();
        int count= 0;
        for (int i = 0; i < cs.length; i++) {
            if(0==i%2)
                cs[i] = Character.toUpperCase(cs[i]);
        }
        String result = new String(cs);
        System.out.println(result);
 
    }*/
	
	/*public static void main(String[] args) {
//      peter piper picked a peck of pickled peppers
//      统计这段绕口令有多少个以p开头的单词
        String s = "peter piper picked a peck of pickled peppers";
        System.out.println(s);
        String[] words = s.split(" ");
        int count= 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firstWord =word.charAt(0);
            if(firstWord=='p')
                count++;
 
        }
        System.out.printf("总共有%d个p开头的单词",count);
 
    }*/
	
	/*public static void main(String[] args) {
//      给出一句英文句子： "let there be light"
//      得到一个新的字符串，每个单词的首字母都转换为大写
        String s = "let there be light";
        System.out.println(s);
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char upperCaseFirstWord =Character.toUpperCase(word.charAt(0));
            String rest = word.substring(1);
            String capitalizedWord = upperCaseFirstWord + rest;
            words[i]  = capitalizedWord;
        }
        String result = "";
        for (String word : words) {
            result+= word + " ";
        }
        result= result.trim();
        System.out.println(result);
    }*/
	
	/*public static void main(String[] args) {
		   
        String sentence = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
 
        String temp = sentence.replaceAll("击杀", "被击杀"); //替换所有的
         
        temp = temp.replaceAll("超神", "超鬼");
         
        System.out.println(temp);
         
        temp = sentence.replaceFirst(",","");//只替换第一个
         
        System.out.println(temp);
         
    }*/
	
	/*public static void main(String[] args) {
	    
        String sentence = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
  
        System.out.println(sentence.indexOf('8')); //字符第一次出现的位置
          
        System.out.println(sentence.indexOf("超神")); //字符串第一次出现的位置
          
        System.out.println(sentence.lastIndexOf("了")); //字符串最后出现的位置
          
        System.out.println(sentence.indexOf(',',5)); //从位置5开始，出现的第一次,的位置
          
        System.out.println(sentence.contains("击杀")); //是否包含字符串"击杀"
          
    }*/
	
	/*public static void main(String[] args) {
		   
        String sentence = "Garen";
         
        //全部变成小写
        System.out.println(sentence.toLowerCase());
        //全部变成大写
        System.out.println(sentence.toUpperCase());
         
    }*/
	
	/*public static void main(String[] args) {
		   
        String sentence = "        盖伦,在进行了      连续8次击杀v   后,获得了 超神 的称号      ";
         
        System.out.println(sentence);
        //去掉首尾空格
        System.out.println(sentence.trim());
    }*/
	
	/*public static void main(String[] args) {
		   
        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";
         
        //根据,进行分割，得到3个子字符串
        String subSentences[] = sentence.split(",");
        for (String sub : subSentences) {
            System.out.println(sub);
        }
           
    }*/
	
	/*public static void main(String[] args) {
		   
        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";
         
        //截取从第3个开始的字符串 （基0）
        String subString1 = sentence.substring(3);
         
        System.out.println(subString1);
         
        //截取从第3个开始的字符串 （基0）
        //到5-1的位置的字符串
        //左闭右开
        String subString2 = sentence.substring(3,5);
         
        System.out.println(subString2);
         
    }*/
	
	/*public static void main(String[] args) {
		   
        String sentence = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
 
        char[] cs = sentence.toCharArray(); //获取对应的字符数组
        for(char aa : cs){
        	System.out.print(aa);
        }
        System.out.println(); 
        System.out.println(sentence.length() == cs.length);
         
    }*/
	
	/*public static void main(String[] args) {
		   
        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";
         
        char c = sentence.charAt(0);
         
        System.out.println(c);
           
    }*/
	
}
