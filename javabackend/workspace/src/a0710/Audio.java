package a0710;

public class Audio implements RemoteControl {
    private int volume;
    @Override public void turnOn() {
        System.out.println("Audio 켭니다.");

    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");

    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.Max_Volume) {
            this.volume = RemoteControl.Max_Volume;
        } else if (volume < RemoteControl.Min_Volume) {
            this.volume = RemoteControl.Min_Volume;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: " + this.volume);
    }

}
