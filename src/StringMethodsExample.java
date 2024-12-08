public class StringMethodsExample {
    public static void main(String[] args) {
        
        String name = "Andres";

        System.out.println("name.length() = " + name.length());
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("name.toLowerCase() = " + name.toLowerCase());
        System.out.println("name.equals(\"Andres\") = " + name.equals("Andres"));
        System.out.println("name.equals(\"andres\") = " + name.equals("andres"));
        System.out.println("name.equalsIgnoreCase(\"andres\") = " + name.equalsIgnoreCase("andres"));
        System.out.println("name.compareTo(\"Andres\") = " + name.compareTo("Andres"));
        System.out.println("name.compareTo(\"Aaron\") = " + name.compareTo("Aaron"));
        System.out.println("name.charAt(0) = " + name.charAt(0));
        System.out.println("name.charAt(1) = " + name.charAt(1));
        System.out.println("name.charAt(name.length()-1) = " + name.charAt(name.length()-1));

        System.out.println("name.substring(1) = " + name.substring(1));
        System.out.println("name.substring(1, 4) = " + name.substring(1, 4));
        System.out.println("name.substring(name.length()-2) = " + name.substring(name.length()-2));

        String tonguetwister = "tonguetwister";
        System.out.println("tonguetwister = " + tonguetwister.replace("a", "."));
        System.out.println("tonguetwister = " + tonguetwister);
        System.out.println("tonguetwister.indexOf('a') = " + tonguetwister.indexOf('a'));
        System.out.println("tonguetwister.lastIndexOf('a') = " + tonguetwister.lastIndexOf('a'));
        System.out.println("tonguetwister.indexOf('t') = " + tonguetwister.indexOf("lenguas"));
        System.out.println("tonguetwister.contains('t') = " + tonguetwister.contains("lenguas"));
        System.out.println("tonguetwister.startsWith(\"tr\") = " + tonguetwister.startsWith("tr"));
        System.out.println("tonguetwister.endsWith(\"s\") = " + tonguetwister.endsWith("s"));
        System.out.println("  tonguetwister ");
        System.out.println("  tonguetwister ".trim());
        
    }
}
