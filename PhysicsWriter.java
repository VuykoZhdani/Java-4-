package ua.lviv.iot;
import ua.lviv.iot.Physics;
import ua.lviv.iot.Main;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;
public class PhysicsWriter {


    public class ComputerPartWriter {

        public static void writeToFile(List<Equipment> details) throws IOException {

            try (FileWriter writer = new FileWriter("Equipment.csv", StandardCharsets.UTF_8)) {

                details.sort(Comparator.comparing(Equipment::getType));
                String previousType = "";

                for (var detail: details) {
                    if (!detail.getName().equals(previousName)) {
                        writer.write(detail.getHeaders());
                        writer.write("\r\n");
                        previousType = detail.getName();
                    }
                    writer.write(detail.toCSV());
                    writer.write("\r\n");
                }

                writer.flush();

            }

        }
    }
}
