import javax.swing.*;

public class ArrayForStatement {
    public static void main(String[] args) {

        String[] names = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        int count = names.length;
        for(int i = 0; i < count; i++){
            if(names[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                    names[i].toLowerCase().contains("pePa".toLowerCase())){
                continue;
            }
            System.out.println( i + ".- " + names[i]);
        }
        
        String search = JOptionPane.showInputDialog("Type a name, example \"Pepe\" o \"Maria\":");
        System.out.println("search = " + search);

        boolean found = false;
        for(int i = 0; i < count; i++){
            if(names[i].equalsIgnoreCase(search)){
                found = true;
                break;
            }
            System.out.println("names = " + names[i]);
        }
        if(found){
            JOptionPane.showMessageDialog(null, search + " is found!");
        } else {
            JOptionPane.showMessageDialog(null, search + " don't exists in the system!");
        }
    }
}
