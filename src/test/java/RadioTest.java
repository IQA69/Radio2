import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void station0() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.prev();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation9() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation9() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.loud();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.quiet();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMaximum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.loud();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeBelowMinimum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.quiet();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}