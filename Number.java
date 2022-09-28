public class Number {
    private String tmp;
    private String line;

    public Number() {
        this.tmp = "";
        this.line = "";
    }

    public void extractNumbers(String line) {
        this.line = line;
        tmp = line;
        tmp = tmp.replaceAll("[^0-9]", " ");
        tmp = tmp.replaceAll(" +", " ");
        tmp = tmp.trim();
    }

    public void extractHigher() {
        String[] parts = tmp.split(" ");
        for (String part: parts) {
            if (Integer.valueOf(part) >= 10) {
                System.out.println(line);
            }
        }
    }
}