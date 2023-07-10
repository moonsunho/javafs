package a0710;

public interface RemoteControl {
    int Max_Volume = 10;
    int Min_Volume = 0;

    void turnOn();
    void turnOff();
    void setVolume (int volume);
}
