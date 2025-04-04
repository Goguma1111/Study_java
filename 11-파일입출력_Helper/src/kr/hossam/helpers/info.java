package kr.hossam.helpers;
import java.io.UnsupportedEncodingException;

public class info {
    public static void main(String[] args) throws Exception {
        String filePath = "info.txt";
        String content = "이것은 정보들 입니다.";
        String name = "박진아";  
        String num = "010-2222-3333";
        String age = "23세";
        String height = "160cm";

        byte[] data = null;
        
        try {
            data = content.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


            /** 저장 테스트 */
            try {
                FileHelper.getInstance().write(filePath, data);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            /** 읽기 테스트 */
            try {
                byte[] read = FileHelper.getInstance().read(filePath);
                System.out.println(new String(read, "utf-8"));
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
     
        
        System.out.println("이름: " + name);
        System.out.println("전화번호: " + num);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
    }
}
    

