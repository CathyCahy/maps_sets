import java.util.*;

public class Main {
    public static void main(String[] args) {
       //task 1
        List<Integer> nums = new ArrayList<>(List.of(11, 12, 13, 14, 25, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 9, 8, 6, 44, 21, 333, 789, 10987));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.println(nums.get(i));
            }
        }
        //task 2
        List<Integer> nums2 = new ArrayList<>(List.of(10,18,1, 1, 2, 3, 4, 4, 5, 5, 6,6,6,7,8));
        List<Integer> nums3 = new ArrayList<>();

        int num = 0;
        Collections.sort(nums2);
        for (int i = 0; i < nums2.size(); i++) {
            if (nums2.get(i)%2==0 && !nums3.contains(nums2.get(i))) {
               nums3.add(nums2.get(i));
            }
        }
        System.out.println(nums3.toString());

        //task 3
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три", "один", "четыре", "четыре"));
        List<String> strings2 = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            if (!strings2.contains(strings.get(i))) {
                strings2.add(strings.get(i));
            }
        }
        System.out.println(strings2.toString());

        //task4
        List<String> strings3 = new ArrayList<>(List.of("один", "два","два", "три", "три", "три", "один", "четыре", "четыре", "четыре", "четыре"));
        List<String> strings4 = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < strings3.size(); i++) {
            if (!strings4.contains(strings3.get(i))) {
                strings4.add(strings.get(i));
            }
        }

        for (int i = 0; i < strings4.size(); i++) {

            System.out.println(Collections.frequency(strings3,strings4.get(i)));
        }

        


    }
}