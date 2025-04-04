/* class Solution {            // 두 수의 덧셈
    public static int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(2,3));
        System.out.println(solution(100, 2));
    }
}

*/


/*class Solution {    // 두 수의 차
    public static int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 3));
        System.out.println(solution(100, 2));        
    }
} */


/* 
class Solution { // 두 수의 곱
    public static int solution(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }



    public static void main(String[] args) {
        System.out.println(solution(3, 4));
        System.out.println(solution(27, 19));
    }
}
   */

   


/* 
class Solution { // 몫 구하기
    public static int solution(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(10, 5));
        System.out.println(solution(7, 2));
    }
}
    
*/



/* 
class Solution { // 나머지 구하기
    public static int solution(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(10, 5));
    }
}

*/



/*
class Solution { // 나이 출력
    public static int solution(int age) {
        int answer = 2025 - age + 1;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(23));
    }
}

*/

/*
class Solution { // 양꼬치
    public static int solution(int n, int k) {
        int answer = 0;
        answer = (n * 12000) + ((k-(n/10)) * 2000);
        return answer;    
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 3));
    }

}

*/



/*
class Solution { // 개미군단
    public static int solution(int hp) {
        int answer = 0;

        answer += (hp / 5);
            hp %= 5;

        answer += (hp / 3);
            hp %= 3;
            
        answer += (hp / 1);    
        
        return answer;    
    }


    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(24));
    }
}
    */
    

/*    
class Solution {    // 종이 자르기
    public static int solution(int M, int N) {

        int answer = (M-1) + M * (N-1);
            return answer;

        }

    public static void main(String[] args) {
        System.out.println(solution(2, 2));
        System.out.println(solution(2, 5));
        System.out.println(solution(1, 1));
        
        }
    }    

*/




// 코딩 기초 트레이닝



/* 
import java.util.Scanner; // a와 b 출력하기

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("a = %d\nb = %d \n",a,b);

        sc.close();
    }
}

*/



/* 
import java.util.Scanner; // 문자열 출력하기

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.print(a);
        sc.close();
    }
}
*/

/* 
import java.util.Scanner;

class Solution { // 덧셈 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d", a, b, a + b);


        sc.close();
    }
}


*/


/* 
import java.util.Scanner; 

class Solution {    // 문자열 붙여서 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();


        System.out.print(a+b);
        sc.close();
    }
}

*/


/* 
class Solution { //특수문자 출력하기
    public static void main(String[] args) {
        System.out.print("!@#$%^&*(\\'\"<>?:;");
    }
}
*/



/* 
import java.util.Scanner;

class Solution { // 홀짝 구분하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        if (n % 2 == 0) {
            System.out.printf("%d is even",n);
        }

        else {
            System.out.printf("%d is odd",n);
        }

        sc.close(); 

    }
}



*/


/* 
import java.util.Scanner;

class Solution { // 문자열 반복해서 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {
            System.out.print(str);
        }


    sc.close();
    }
}

*/



/* 
class Solution { // 두 수의 연산값 비교하기
    public static int solution(int a, int b) {

        int answer = 0;

        int c = a + b;
        int d = 2 * a * b;


        answer = c == d ;
        

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 91));
    }
}

*/

/* 
class Solution { // n의 배수
    public static int solution(int num, int n) {
        int answer = 0;

        answer = num % n == 0 ? 1 : 0; // 삼항연산자

        return answer;

    
        
    }
    public static void main(String[] args) {
        System.out.println(solution(98, 2));
        System.out.println(solution(34, 3));
    }
}
*/


/* 
class Solution { // 소문자로 바꾸기
    public static String solution(String myString) {
        String answer = myString.toLowerCase();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("aBcDefG"));
    }
}
*/

/* 
class Solution { // 대문자로 바꾸기
    public static String solution(String myString) {
        String answer = myString.toUpperCase();
        return answer;
    }


    public static void main(String[] args) {

        System.out.println(solution("abcDEFG"));

    }
}
*/

/* 
class Solution { // rny_string
    public static  String solution(String rny_string) {
        String answer = rny_string.replace("m","rn");
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution("masterpiece"));
    }
}

*/


/* 
class Solution { // 간단한식 계산하기
    public static int solution(String binomial) {
        int answer = 0;
        int a, b;
        String op;
        op = ;

        if(){

        }else if() {

        }else {

        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("43+12"));
    }
}
*/

/* 
class Solution { // 각도기
    public static int solution(int angle) {
        int answer = 0;
        if (0 < angle && angle <90) {
            return answer = 1;
        } 
        else if(angle == 90) {
            return answer = 2;
        }
         else if (90 < angle && angle < 180) {
            return answer = 3;
        }
         else {
            return answer = 4;
        }

    }
    public static void main(String[] args) {
        System.out.println(solution(70));
        System.out.println(solution(91));
        System.out.println(solution(180));
    }
}

*/

/* 
class Solution { // 숫자비교하기
    public static int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 == num2 ? 1 : -1;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 3));
        System.out.println(solution(11, 11));
        System.out.println(solution(7, 99));
    }
}
*/


/* 
class Solution { //옷가게 할인받기
    public static int solution(int price) {
        int answer = 0;
        if( price >= 500000) {
            return answer = price * (int) 0.8;
        }

         else if (price >= 300000) {
            return answer = price * (int) 0.9;
         }

          else {
            return answer = price * (int) 0.95; 
         } 
    }

    public static void main(String[] args) {
        System.out.println(solution(150000));
    }
}

*/

/* 
class Solution { // 피자 나눠 먹기 1
    public static int solution(int n) {
        int answer = 0;
        if (n % 7 != 0) {
            return  answer = n/7+1;
        } else {
            answer =  n/7;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(7));
        System.out.println(solution(1));
        System.out.println(solution(15));
    }
}
*/

/* 
class Solution { //피자나눠먹기 3
    public static int solution(int slice, int n) {
        int answer = 0;
        if(n% slice ==0) {
            return answer = n / slice;
        }else {
            return answer = n/ slice + 1;
        }    
    }

    public static void main(String[] args) {
        System.out.println(solution(7, 10));
        System.out.println(solution(4, 12));
    }
}
*/

/* 
class Solution { // 치킨쿠폰 할인받기
    public static int solution(int chicken) {
        int answer = 0;

        while (chicken/10 != 0){
            int coupon =0;
            answer += chicken / 10;
            coupon = chicken % 10;
            chicken /= 10;
            chicken += coupon;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(100));
    }
}

*/

/* 
class Solution { // 구슬을 나누는 경우의 수
    public static int solution(int balls, int share) {
        long answer = 1;
        
        int[] num1 = new int[share];
        int[] num2 = new int[share];
        
        int index = 0;
        
        for (int i = balls; i > balls - share; i--) {
            num1[index++] = i;
        }
        
        for (int i = 1; i <= share; i++) {
            num2[i - 1] = i;
        }
        
        for (int i = 0; i < num1.length; i++) {
            answer = answer * num1[i] / num2[i];
        }
        
        return Integer.parseInt(answer + "");
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(5, 3));
    }
}

*/

/* 
(다른풀이)
// 불필요한 곱셉을 줄이고 필요한 값만 계산하여 효율적으로 조합을 구함
// 팩토리얼을 직접 계산하면 수가 매우 커져서 오버플로우 위험이 있음
public class Solution {
    public int solution(int balls, int share) {
    
    return combination(balls, share);
 }

 public int combination(int n, int r) {
    if (r > n - r) {
    r = n - r; // 조합의 대칭성: C(n, r) == C(n, n-r)
    }

    long result = 1; // 결과값을 저장할 변수 (오버플로우 방지 위해 long 사용)

    // (n-r+1)부터 n까지 곱하고, 동시에 1부터 r까지 나눠서 계산
    
    for (int i = 0; i < r; i++) {
        result *= (n - i);
        result /= (i + 1);
    }

    return (int) result; // 결과 반환
    
    }

    public static void main(String[] args) {
    Solution s = new Solution();

    // 테스트 예제 실행
    System.out.println(s.solution(3, 2)); // 3
    System.out.println(s.solution(5, 3)); // 10
    System.out.println(s.solution(30, 15)); // 155117520
 }
}
 */
/* 
 public class solution {
    public static void main(int balls, int share) {
        
    // n개 중에 m개를 선택하는 경우의 수는
    // n개 중에서 n-m를 선택하지 않는 경우의 수와 같다
    // mrhk n-m 중에서 작은값을 사용하는 것이 효율이 좋다.
    int n = balls;
    int m = share;


    if (m >n-m) {
        m = n-m;
    }

    long answer = 1;


    for(int i = 0; i <m; i++){
        answer *= (n-i);
        answer /= (i+1);
    }
    return (int) answer;
    }
    public static void main(String[] args) {
        System.out.println(s.solution(3, 2)); // 3
        System.out.println(s.solution(5, 3)); // 10
    }
 }

 */
/* 
class Solution { // 순서바꾸기
    public static int[] solution(int[] num_list, int n) {
        int[] answer = num_list;
        for(int i =0; i < num_list.length; i++) {
            answer[i] = num_list.
        } 
        return answer;
    }
}

*/

/* 
class Solution { // 문자열 뒤집기
    public static String solution(String my_string, int s, int e) {
        String answer = "" ;
        for ( ) {
            my_string.replace(, answer);
        }
        return answer = ;

    }

    public static void main(String[] args) {
        System.out.println(solution("Progra21Sremm3", 6, 12));
    }
}


*/


/* 

class Solution { //공배수 구하기
    public static int solution(int number, int n, int m) {
        int answer = 0;
        answer = number % n == 0 && number % m==0 ? 1 : 0; //삼항연산자
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(60, 2, 3));
        System.out.println(solution(55, 10, 5));
    }
}

*/

/* 
class Solution { // 제곱수 판별하기
    public static int solution(int n) {
        int answer = 0;

        answer = answer * answer == 0 ? 1 : 2;


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(976));
    }
}
*/


/*
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i = 0; i <= n; i++) {
        
            
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }    
        System.out.println();
        }

        sc.close();
    }
}
*/



/* 
class Solution { //짝수의 합
    public static int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i+2){
                answer += i;
            } 
             
            
            

           
        }
         return answer;
    }    

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(4));
    }
}


*/

/* 
class Solution { // 합성수 찾기
    public static int solution(int n) {
        int answer = 0;

        for(int i = 4; i <= n; i++){
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
    }
}

*/

/* 
class Solution { //순서쌍의 개수
    public static int solution(int n) {
        int answer = 0;
        for (int i =  1; i <= n; i++){
            if (n % i == 0){
                answer++;
            }
        }

        
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(20));
    }
    
}
    */

/*  
class Solution { // 피자판수 구하기


    public static int solution(int n) {
        int answer = 1;
        while((answer % 6) %  n != 0 ){
            answer++;


        }
            return answer;
        }


        public static void main(String[] args) {
            System.out.println(solution(6));
        }
    }

*/

/* 
class Solution { //분수의 덧셈
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
  
    int numer3 = numer1 * denom2 + numer2 * denom1;
    int denom3 = denom1 * denom2;

    int a =  a(numer3, denom3);


    return new int[]{numer3 / a, denom3 / a};
    }


    public static void main(String[] args) {
        System.out.println(solution(1, 2, 3, 4));
    }
}
*/   


/* 
class Solution { //공배수 구하기
    public static int solution(int number, int n, int m) {
        int answer = 0;
        answer = number % n == 0 && number % m==0 ? 1 : 0; //삼항연산자
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(60, 2, 3));
        System.out.println(solution(55, 10, 5));
    }
}

*/

/* 
class Solution { // 정수찾기
    public static int solution(int[] num_list, int n) {
        int answer = 0;
        if (num_list == n){
        return answer = 1;    

        } else {
        return answer = 0;
        }

    public static void main(String[] args) {
           
    }
}

*/


/* 
class Solution { //원하는 문자열 찾기
    public static int solution(String myString, String pat) {
        int answer = 0;
        answer = 
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("AbCdEfG", "aBc"));
        System.out.println(solution("aaAA", "aaaaa"));
    }
}

*/

/** 
class Solution { 369
    public static int solution(int order) {
        int answer = 0;
        answer = str(order).replace("3","1");
        }
        

    public static void main(String[] args) {
        System.out.println(solution(3));
    }
}
    */

/*
class Solution { // 7의 개수
    public static int solution(int[] array) {
        int answer = 0;
        for(int i =0; i< array.length; i++) {
            if(array[i] == 7) {
                answer++;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution([7,77, 17]));
    }

}    

*/

/** 
class Solution { // 대문자와 소문자
    public static String solution(String my_string) {
        String answer = "";
        if (my_string == "abcdefghijklmnopqrstuvwsyz") {
            return answer = my_string.toUpperCase(); 
        } else {
            return answer = my_string.toLowerCase();
        }
        


        }

    
        public static void main(String[] args) {
            System.out.println(solution("AbcdefgEL"));
        }
    }



*/


/** 
class Solution { // 문자 반복 출력하기
    public static String solution(String my_string, int n) {
        String answer = "";
        for(int i = 0; i < n; i++){
            System.out.print(my_string);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("hello", 3));
    }
}

*/

/** 
class Solution { // 문자열 계산하기
    public static int solution(String my_string) {
        int answer = Integer.parseInt(my_string);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("4 + 3"));
    }
}

*/


/** 
class Solution { // 뒤집힌 문자열
    public static String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length() -1 ; i >= 0; i--){
            answer += my_string.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("jaron"));
    }
}

*/

/* 
class Solution { // 숫자찾기
    public static int solution(int num, int k) {
       
        String n = String.valueOf(num);
        String ks = String.valueOf(k);

        int answer = n.indexOf(ks);


        return answer < 0 ? -1 : answer + 1 ;


        }
       public static void main(String[] args) {
            System.out.println(solution(29183, 1));
       }
    }

*/

/** 
    class Solution { // 암호 해독
        public static String solution(String cipher, int code) {
            String answer = "";

            for(int i = 1; i <= cipher.length() / code; i++){
                answer += cipher.charAt((code * i) -1 );
            }
            return answer;
        }

        public static void main(String[] args) {
            System.out.println(solution("pfqallllabwaoclk", 2));
        }
    }

*/

/** 
class Solution { // 인덱스 바꾸기
    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        return answer;
    }
}

*/


/** 
class Solution { // 특정문자 제거하기
    public static String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replace(letter, "");
        return answer;

    }
    public static void main(String[] args) {
        System.out.println(solution("abcdefg", "g"));
    }
}

*/


class Solution { // k의 개수
    public static int solution(int i, int j, int k) {
        int answer = 0;

        String target = String.valueOf(k); 
        
        for (int num = i; num <= j; num++) {
            String strNum = String.valueOf(num); 
            
            for (char ch : strNum.toCharArray()) { 
                if (String.valueOf(ch).equals(target)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 13, 1)); 
    }
}

