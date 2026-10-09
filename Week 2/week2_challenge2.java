void main() {
    String input = IO.readln("Enter some text: ") + " ";
    String[] words = input.split(" ");
    HashMap<String, Integer> counts = new HashMap<>();

    for(String str : words) {
        if(!counts.containsKey(str)) counts.put(str, 1);
        else counts.put(str, counts.get(str) + 1);
    }

    counts.forEach((key, value) -> IO.println(key + " = " + value));
}