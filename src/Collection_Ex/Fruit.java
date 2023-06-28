package Collection_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Fruit {
    public static void main(String[] args) {
        //1. 빈 List(ArrayList)를 생성하세요.
        List<String> list = new ArrayList<String >();

        //2. List에 "사과", "바나나", "체리"를 순서대로 추가하세요.
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        //3. List에 있는 요소의 개수를 출력하세요.
        System.out.println("_____________________");
        System.out.println(list.size());

        //4. List의 두 번째 요소를 출력하세요.
        System.out.println("_____________________");
        System.out.println(list.get(1));

        //5. List에서 "바나나"를 제거하세요.
        list.remove(1);

        //6. List에 "딸기"를 추가하고, "사과"와 "딸기" 사이에 "오렌지"를 삽입하세요.
        list.add(1,"Strawberry");
        list.add(1,"Orange");

        //7. List에 있는 모든 요소를 출력하세요.
        System.out.println("_____________________");
        for (String name : list) {
            System.out.println(name);
        }

        //8. List가 비어 있는지 확인하세요.
        System.out.println("_____________________");
        if (list.isEmpty()) {
            System.out.println("리스트가 비어 있습니다.");
        } else {
            System.out.println("공백이 없습니다.");
        }

        //9. List에 있는 요소들을 알파벳순으로 정렬하세요.
        Collections.sort(list);
        System.out.println("_____________________");
        System.out.println("정렬된 리스트:");
        for (String element : list) {
            System.out.println(element);
        }

        //10. List에 있는 요소들 중에서 가장 긴 문자열을 찾아 출력하세요.
        String longest = null;
        for (String element : list) {
            if (longest == null || element.length() > longest.length()) {
                longest = element;
            }
        }
        System.out.println("_____________________");
        System.out.println("가장 긴 문자열: " + longest);

        //11. List에 있는 요소들 중에서 가장 짧은 문자열을 찾아 출력하세요.
        String shortest = null;

        for (String element : list) {
            if (shortest == null || element.length() < shortest.length()) {
                shortest = element;
            }
        }
        System.out.println("_____________________");
        System.out.println("가장 짧은 문자열: " + shortest);

        //12. List의 모든 요소를 대문자로 변환하세요.
        List<String> upperCaseList = new ArrayList<>();
        for (String element : list) {
            String upperCaseElement = element.toUpperCase();
            upperCaseList.add(upperCaseElement);
        }
        System.out.println("_____________________");
        System.out.println("원본 리스트: " + list);
        System.out.println("_____________________");
        System.out.println("대문자로 변환된 리스트: " + upperCaseList);

        //13. List에 있는 요소들을 거꾸로 배치하세요.
        Collections.reverse(list);
        System.out.println("_____________________");
        System.out.println("순서 반대로 변경된 리스트: " + list);

        //14. List에 있는 "체리"가 있는지 확인하세요.
        boolean containsCherry = list.contains("Cherry");

        System.out.println("_____________________");
        if (containsCherry) {
            System.out.println("리스트에 체리가 있습니다.");
        } else {
            System.out.println("리스트에 체리가 없습니다.");
        }

        //15. List의 마지막 요소를 제거하세요.
        int last = list.size();
        System.out.println(last);
        list.remove(last-1);
        System.out.println("_____________________");
        for (String name : list) {
            System.out.println(name);
        }
    }
}
