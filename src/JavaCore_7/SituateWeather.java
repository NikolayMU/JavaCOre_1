package JavaCore_7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)  // игнорируем недекларированные
public class SituateWeather{   // погодная ситуация
    /*
     * Здесь я игнорирую недекларированные поля, потому что для решения задачи мне не нужна дальнешая детализация
     */
    Long dt;            // это дата
    Main main;
    List<Weather> weather;
    Clouds clouds;
    Wind wind;
    Integer visibility;
    Integer pop;
    Pod pod;
    String dt_txt;

    public SituateWeather() {
    }

    public Long getDt() {
        return dt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Integer getPop() {
        return pop;
    }

    public void setPop(Integer pop) {
        this.pop = pop;
    }

    public Pod getSys() {
        return pod;
    }

    public void setSys(Pod pod) {
        this.pod = pod;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        String result = "\n\t\t" + dt_txt +
                ": \tсредняя температура "+
                main.getTemp()+",\t ветер "+
                wind.getSpeed()+"м/с"+ ",\t состояние - \""+
                weather+
                "\"";
        return result;
    }
}