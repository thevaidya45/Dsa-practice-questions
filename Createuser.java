import java.util.*;

public class Createuser {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("Enter the username");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String username = sc.nextLine();
            if (!map.containsKey(username)) {
                System.out.println("OK");
                map.put(username, 1);
            } else {
                int count = map.get(username);
                String newUsername = username + count;
                    System.out.println(newUsername);
                map.put(username, count + 1);
                map.put(newUsername, 1);
            }
        }
    }
}
