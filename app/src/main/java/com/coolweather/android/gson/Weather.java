package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    //private NowBean now1;

    //public NowBean getNow() {
    //    return now1;
    //}

   // public void setNow(NowBean now1) {
    //    this.now1 = now1;
   // }

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

//    public static class NowBean {
//        /**
//         * cloud : 91
//         * cond_code : 101
//         * cond_txt : 多云
//         * fl : 13
//         * hum : 29
//         * pcpn : 0.0
//         * pres : 1014
//         * tmp : 17
//         * vis : 9
//         * wind_deg : 273
//         * wind_dir : 西风
//         * wind_sc : 3
//         * wind_spd : 19
//         */
//
//        private String cond_code;
//        private String cond_txt;
//        @SerializedName("fl")
//        private String body_tmp;
//        private String hum;
//        @SerializedName("pcpn")
//        private String rainy_amount;
//        @SerializedName("pres")
//        private String pressure;
//        private String tmp;
//        private String wind_dir;
//        private String wind_sc;
//
//        public String getCond_code() {
//            return cond_code;
//        }
//
//        public void setCond_code(String cond_code) {
//            this.cond_code = cond_code;
//        }
//
//        public String getCond_txt() {
//            return cond_txt;
//        }
//
//        public void setCond_txt(String cond_txt) {
//            this.cond_txt = cond_txt;
//        }
//
//        public String getBody_tmp() {
//            return body_tmp;
//        }
//
//        public void setBody_tmp(String body_tmp) {
//            this.body_tmp = body_tmp;
//        }
//
//        public String getHum() {
//            return hum;
//        }
//
//        public void setHum(String hum) {
//            this.hum = hum;
//        }
//
//        public String getRainy_amount() {
//            return rainy_amount;
//        }
//
//        public void setRainy_amount(String rainy_amount) {
//            this.rainy_amount = rainy_amount;
//        }
//
//        public String getPressure() {
//            return pressure;
//        }
//
//        public void setPressure(String pressure) {
//            this.pressure = pressure;
//        }
//
//        public String getTmp() {
//            return tmp;
//        }
//
//        public void setTmp(String tmp) {
//            this.tmp = tmp;
//        }
//
//        public String getWind_dir() {
//            return wind_dir;
//        }
//
//        public void setWind_dir(String wind_dir) {
//            this.wind_dir = wind_dir;
//        }
//
//        public String getWind_sc() {
//            return wind_sc;
//        }
//
//        public void setWind_sc(String wind_sc) {
//            this.wind_sc = wind_sc;
//        }
//
//        @Override
//        public String toString() {
//            return "NowBean{" +
//                    "cond_code='" + cond_code + '\'' +
//                    ", cond_txt='" + cond_txt + '\'' +
//                    ", body_tmp='" + body_tmp + '\'' +
//                    ", hum='" + hum + '\'' +
//                    ", rainy_amount='" + rainy_amount + '\'' +
//                    ", pressure='" + pressure + '\'' +
//                    ", tmp='" + tmp + '\'' +
//                    ", wind_dir='" + wind_dir + '\'' +
//                    ", wind_sc='" + wind_sc + '\'' +
//                    '}';
//        }
//    }
}
