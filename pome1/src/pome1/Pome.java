package pome1;
public class Pome {
	  public static void main(String pome,String word,String words) {
		  try {
			  int count = 0;
			  int wcount = 0;
			  char chars[] = pome.toCharArray();
			  StringBuffer listBuffer = new StringBuffer();
			  
			  for (int i = 0; i < pome.length(); i++) {
		          	listBuffer.append(chars[i]);
		          	for (int k = 0;k<pome.length()/7;k++) {
		          		if (i == (2*k-1)*7-1) {
		          			listBuffer.append(",");
		          		}
		          		if (i == (2*k)*7-1) {
		          			listBuffer.append("。");
		          			listBuffer.append("\n");
		          		}
		          	
		          	}
		          	if (word.charAt(0)==chars[i]) {
		          		count++;
		          	}
		      for (int j=0; j < pome.length()-words.length() ;j++){
		    	  StringBuffer wordsBuffer = new StringBuffer();
		    	  for (int m = j; m < j + words.length();m++) {
			    	  wordsBuffer.append(chars[m]);
			    	  if (chars.equals(words)) {
			    		  wcount++;   
		    	   }

		    	   }
		       }
		       
			  }

		      listBuffer.append("······");
		      System.out.println(listBuffer);
		      System.out.println("“" + word + "”" + "在古诗中出现的次数为：" + count);
		      System.out.println("“" + words + "”" + "在古诗中出现的次数为：" + wcount);
		  }
		  catch (Exception exception) {
			  System.out.println("发生错误，原因为：" + exception);
		  }
	  }
}
