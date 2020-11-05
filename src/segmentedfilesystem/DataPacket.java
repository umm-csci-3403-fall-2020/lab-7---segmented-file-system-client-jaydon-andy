package segmentedfilesystem;

import java.net.DatagramPacket;
import java.util.Arrays;

public class DataPacket {
    byte status;
    byte[] data;
    byte id;
    byte[] packetNumber;

    public DataPacket(DatagramPacket rawBytes){
        status = rawBytes.getData()[0];
        id = rawBytes.getData()[1];
        packetNumber[0] = rawBytes.getData()[2];
        packetNumber[1] = rawBytes.getData()[3];
        data = Arrays.copyOfRange(rawBytes.getData(),4,rawBytes.getLength());
    }

    //TODO: checks to see if packet is last one being sent
    public boolean isLastPacket(){
        return false;
    }


    //TODO: Not 100% how this should work, but I'm imagining it just returns the byte that the packet should be holding
    public int getData{
        return -1;
    }

}
