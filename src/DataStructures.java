
public class DataStructures {

    public static void main(String args[]) {

        ArrayList<String> catArray = new ArrayList<>();
        catArray.add("catOne"):
        catArray.add("catTwo"):
        catArray.add("catThree"):
        catArray.add("catFour"):
        catArray.add("catFive"):
        for (int i = 0; i < catArray.size(); i++) {
            System.out.println(catArray.get(i));
        }

        HashMap<String, Integer> groupProject = new HashMap<>();
        groupProject.put("Geo", 00);
        groupProject.put("Luis", 00);
        groupProject.put("Michelle", 00)

        Set<Map.Entry<String, Integer>> hashSet = groupProject.entrySet();
        for (Entry  group : hashSet) {
            System.out.println(group.getKey() + group.getValue());

        }
    }

    public static void mostFrequentElement(ArrayList<Integer> arrayList) {
        HashMap<Integer, Inetger> elementMap = new HashMap<Integer, Integer>();
        int element 0;
        int frequency = 1;

        for (int i : arrayList) {
            if (elementMap.containsKey(i)) {
                elementMap.put(i, elementMap.get(i) + 1);
            } else {
                elementMap.put(i, 1);
            }
        }
        for (int i : elementMap.keySet()) {
            if (elementMap.get(i) > frequency) {
                element = i;
                frequency = elementMap.get(i);
            }
        }
        System.out.println(element);
        System.out.println(frequency);
    }


}
