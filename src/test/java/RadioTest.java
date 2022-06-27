import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseToMaxVolume() { //повышение до макс границы
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void shouldNotIncreaseFromMaxVolume() { //повышение на макс границе
//        Radio radio = new Radio();
//        radio.setCurrentVolume(10);
//
//        radio.increaseVolume();
//
//        int expected = 10;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }

    @Test
    public void shouldIncreaseVolumeFromMinVolume() { // повышение на мин границе
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeInsideTheBorders() { // повышение с 1 внутри границ
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolume() { //понижение c предмакс границы
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.decreaseVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseFromMaxVolume() { //понижение на макс границе
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseFromMinVolume() { // понижение на мин границе
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeInsideTheBorders() { //понижение с 1 внутри границ
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotBeLessThanTheLimitVolume() { // не может быть меньше нижней границы
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//   public void shouldNotBeGreaterThanTheLimitVolume() { // не может быть больше верхней границы
//        Radio radio = new Radio();
//        radio.setCurrentVolume(11);
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }

// --------------------------------------------------------------------------

    @Test
    public void shouldNextToMaxStation() { // увеличение до макс
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextToMinStation() { // увеличение на макс границе
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextFromMinStation() { // увеличение с мин границы
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextInsideTheBorders() { // увеличение с 1 в рамках границ
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldPrevInsideTheBorders() { // уменьшение с предмакс значения
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.prev();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevFromMaxStation() { // уменьшение с макс границы
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevFromMinStation() { // уменьшение с мин границы
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevToMinStation() { // уменьшение с 1 в рамках границ
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotBeLessThanTheLimit() { // не может быть меньше нижней границы
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotBeGreaterThanTheLimit() { // не может быть больше верхней границы
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    // ---------------------------------------------- Java-HW11

    @Test
    public void shouldNotIncreaseFromMaxVolumeIfChangeTo100() { //повышение на макс границе
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotBeGreaterThanTheLimitVolumeIfChangeTo100() { // не может быть больше верхней границы
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //-----------------------

    @Test
    public void shouldNextToMaxStationIfChangeStationsCount() { // увеличение до макс
        Radio radio = new Radio(55);
        radio.setCurrentRadioStation(53);

        radio.next();

        int expected = 54;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextToMinStationIfChangeStationsCount() { // увеличение на макс границе
        Radio radio = new Radio(55);
        radio.setCurrentRadioStation(54);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextFromMinStationIfChangeStationsCount() { // увеличение с мин границы
        Radio radio = new Radio(55);
        radio.setCurrentRadioStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextInsideTheBordersIfChangeStationsCount() { // увеличение с 1 в рамках границ
        Radio radio = new Radio(55);
        radio.setCurrentRadioStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldPrevInsideTheBordersIfChangeStationsCount() { // уменьшение с предмакс значения
        Radio radio = new Radio(55);
        radio.setCurrentRadioStation(53);

        radio.prev();

        int expected = 52;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevFromMaxStationIfChangeStationsCount() { // уменьшение с макс границы
        Radio radio = new Radio(55);
        radio.setCurrentRadioStation(54);

        radio.prev();

        int expected = 53;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevFromMinStationIfChangeStationsCount() { // уменьшение с мин границы
        Radio radio = new Radio(55);
        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 54;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevToMinStationIfChangeStationsCount() { // уменьшение с 1 в рамках границ
        Radio radio = new Radio(55);
        radio.setCurrentRadioStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotBeLessThanTheLimitIfChangeStationsCount() { // не может быть меньше нижней границы
        Radio radio = new Radio(55);
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotBeGreaterThanTheLimitIfChangeStationsCount() { // не может быть больше верхней границы
        Radio radio = new Radio(55);
        radio.setCurrentRadioStation(55);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}
