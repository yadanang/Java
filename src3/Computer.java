public class Computer  {

    public void powerOn() {
        System.out.println("打开电脑");
    }


    public void powerOff() {
        System.out.println("关闭电脑");
    }

    public void  useDevice(Iusb usb){
         usb.openDevice();
         if(usb instanceof Mouse){
             Mouse mouse = (Mouse) usb;
             mouse.click();
         }else if ( usb instanceof Keyboaed){
             Keyboaed keyboaed = (Keyboaed) usb;
             keyboaed.inPut();
         }
         usb.closeDevice();

    }
}


 class TestUSB{
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.powerOn();
        computer.useDevice(new  Mouse());
        computer.useDevice(new Keyboaed());

        computer.powerOff();


    }
}