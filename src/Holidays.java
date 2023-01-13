import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Holidays {

  private Map<String, String> holidays = new HashMap<String, String>();

  public Holidays() {
    this.holidays.put("01/01/2023", "Confraternização mundial");
    this.holidays.put("21/02/2023", "Carnaval");
    this.holidays.put("17/04/2023", "Páscoa");
    this.holidays.put("21/04/2023", "Tiradentes");
    this.holidays.put("01/05/2023", "Dia do trabalho");
    this.holidays.put("08/06/2023", "Corpus Christi");
    this.holidays.put("07/09/2023", "Independência do Brasil");
    this.holidays.put("12/10/2023", "Nossa Senhora Aparecida");
    this.holidays.put("02/11/2023", "Finados");
    this.holidays.put("15/11/2023", "Proclamação da República");
    this.holidays.put("25/12/2023", "Natal");
  }

  public String getHoliday(String el) {
    return this.holidays.get(el);
  }

  public Collection<String> getAllHolidays() {
    return this.holidays.values();
  }
}