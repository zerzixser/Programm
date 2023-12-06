package Entity;

public class Travel {
    private String number_bus;
    private String road;

    private String middle;
    private String time;
    private String days;
    private String free_places;

    public Travel(String number_bus, String road, String middle, String time, String days, String free_places) {
        this.number_bus = number_bus;
        this.road = road;
        this.middle = middle;
        this.time = time;
        this.days = days;
        this.free_places = free_places;
    }

    public String getNumber_bus() {
        return number_bus;
    }

    public void setNumber_bus(String number_bus) {
        this.number_bus = number_bus;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getFree_places() {
        return free_places;
    }

    public void setFree_places(String free_places) {
        this.free_places = free_places;
    }

    public Travel() {
    }

    @Override
    public String toString() {
        return "Рейс: " +
                " Номер рейса: " + number_bus +
                " Маршрут: " + road + '\'' +
                " Пункты промежуточной посадки: " + middle + '\'' +
                " Время отправления: " + time + '\'' +
                " Дни отправления: " + days + '\'' +
                " Кол-во свободных мест: " + free_places +
                "";
    }
}
