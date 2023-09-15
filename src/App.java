import java.util.ArrayList;

import commands.TurnOffAllDevices;
import commands.TurnOffRadio;
import commands.TurnOffTelevision;
import commands.TurnOnRadio;
import commands.TurnOnTelevision;
import commands.VolumeUpRadio;
import commands.VolumeUpTelevision;
import devices.ElectronicDevice;
import devices.Radio;
import devices.Television;

public class App {
    public static void main(String[] args) throws Exception {
        // Crea el dispositivo electronico Televisor
        ElectronicDevice televisionOne = new Television("SAMSUNG");

        // Encender televisor
        TurnOnTelevision onCommand = new TurnOnTelevision(televisionOne);
        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();

        // Apagar televisor
        TurnOffTelevision offCommand = new TurnOffTelevision(televisionOne);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();

        // Subir volumen televisor
        VolumeUpTelevision volUpCommand = new VolumeUpTelevision(televisionOne);
        onPressed = new DeviceButton(volUpCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();

        // Crear dispositivo electronico Radio
        ElectronicDevice radioOne = new Radio("SONY");
        TurnOnRadio onCommadRadio = new TurnOnRadio(radioOne);
        DeviceButton onPressedRadio = new DeviceButton(onCommadRadio);
        onPressedRadio.press();

        TurnOffRadio offCommandRadio = new TurnOffRadio(radioOne);
        onPressedRadio = new DeviceButton(offCommandRadio);
        onPressedRadio.press();

        // Subir volumen radio
        VolumeUpRadio volUpCommandRadio = new VolumeUpRadio(radioOne);
        onPressedRadio = new DeviceButton(volUpCommandRadio);
        onPressedRadio.press();
        onPressedRadio.press();
        onPressedRadio.press();
        System.out.println("\n");

        Television televisionTwo = new Television("LG");
        Radio radioTwo = new Radio("SONY2");
        ArrayList<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();

        allDevices.add(televisionOne);
        allDevices.add(radioOne);
        allDevices.add(televisionTwo);
        allDevices.add(radioTwo);

        TurnOffAllDevices offAllDevices = new TurnOffAllDevices(allDevices);
        DeviceButton offPressedAllDevices = new DeviceButton(offAllDevices);

        System.out.println("Encendiendo dispositivos...\n");
        offPressedAllDevices.press();
        System.out.println("\n");
        System.out.println("Apagando dispositivos...\n");
        offPressedAllDevices.pressUndo();
    }
}
