package lecture202342;

public class lectrure07 {
    public static void main(String[] args) {
        //정수형 배열
        int[] intArr = {1,2,3,4,5};

        //String형 배열
        String[] strArr = {"월, 화, 수, 목, 금, 토, 일"};

        //배열의 길이
        int intArrLength = intArr.length;
        int strArrLength = strArr.length;

        //배열의 모든 요소 출력
        for (int i = 0; i < intArrLength; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < strArrLength; i++) {
            System.out.println(i);
        }
    }
}
