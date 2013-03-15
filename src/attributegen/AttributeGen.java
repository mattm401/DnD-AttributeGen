package attributegen;

import attributegen.classes.*;
import attributegen.races.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AttributeGen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BaseClass[] _classes = {new Ardent(), new Avenger(), new Barbarian(),
            new Bard(), new Battlemind(), new Cleric(), new Druid(),
            new Fighter(), new Invoker(), new Monk(), new Paladin(), new Psion(),
            new Ranger(), new Rogue(), new RunePriest(), new Seeker(),
            new Shaman(), new Sorcerer(), new Warden(), new Warlock(),
            new Warlord(), new Wizard()};
        BaseRace[] _races = {new Deva(), new Dragonborn(), new Dwarf(),
            new Eladrin(), new Elf(), new Githzerai(1), new Githzerai(3),
            new Gnome(), new Goliath(), new HalfElf(), new HalfOrc(),
            new Halfling(), new Human(0), new Human(1), new Human(2),
            new Human(3), new Human(4), new Human(5), new Minotaur(2),
            new Minotaur(4), new Shardmind(4), new Shardmind(5), new Shifter(),
            new Tiefling(), new Wilden(2), new Wilden(1)};
        try {
            String content = "Class,Race,Role,STR,DEX,CON,INT,WIS,CHA,Class Average,Total Average\n";
            for (BaseClass bc : _classes) {
                for (BaseRace br : _races) {
                    content += bc.getName() + "," + br.getName() + "," + bc.getRole();
                    int[] cBonuses = bc.getBonuses();
                    int[] rBonuses = br.getBonuses();
                    int[] cRanks = bc.getRank();
                    int[] sums = {0, 0, 0, 0, 0, 0};
                    for (int i = 0; i < 6; i++) {
                        sums[i] = (cBonuses[i] + rBonuses[i]);
                        content += "," + sums[i];
                    }
                    float average = 0;
                    for (int i = 0; i < 3; i++) {
                        average += sums[cRanks[i]];
                    }
                    content += "," + String.format("%2.1f", average / 3);
                    average = 0;
                    for (int i : sums) {
                        average += i;
                    }
                    content += "," + String.format("%2.1f", average / 6);
                    content += "\n";
                }
            }
            File file = new File("C:\\Users\\Mike\\Documents\\characters.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(content);
            }
            System.out.println("Done");
        } catch (IOException e) {
        }
    }
}
