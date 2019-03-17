package com.jennyni.fallproject.Bean;

import java.util.List;

/**
 * 请求跌倒设备的最新数据
 * Created by Jenny on 2019/3/4.
 */

public class AskFallInfoLIstBean {
  //  private static final long serialVersionUID = 1L;

    /**
     * status : 200
     * msg : succeed
     * result : {"id":5,"card_id":"18255000000","lng":"120.411234","lat":"31.321234","rssi":20,"power":40,"fall":0,"alert":0,"steps":5000,"calor":56,"time":1543823607,"dname":"朱颖康"}
     */

    private int status;
    private String msg;
    private List<ResultBean> result;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         "id":9308,
         "card_id":863320040763623,
         "lng":"120.4173",
         "lat":"31.325084",
         "rssi":3,
         "power":4,
         "fall":0,
         "alert":0,
         "fence":0,
         "loctype":0,
         "steps":0,
         "calor":0,
         "time":1552821956,
         "name":"嫦娥"
         */

        private int id;
        private String card_id;
        private String lng;
        private String lat;
        private int rssi;
        private int power;
        private int fall;
        private int alert;
        private int fence;
        private int loctype;
        private int steps;
        private int calor;
        private String name;
        private String time;
        private String reason;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCard_id() {
            return card_id;
        }

        public void setCard_id(String card_id) {
            this.card_id = card_id;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public int getRssi() {
            return rssi;
        }

        public void setRssi(int rssi) {
            this.rssi = rssi;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public int getFall() {
            return fall;
        }

        public void setFall(int fall) {
            this.fall = fall;
        }

        public int getAlert() {
            return alert;
        }

        public void setAlert(int alert) {
            this.alert = alert;
        }

        public int getFence() {
            return fence;
        }

        public void setFence(int fence) {
            this.fence = fence;
        }

        public int getLoctype() {
            return loctype;
        }

        public void setLoctype(int loctype) {
            this.loctype = loctype;
        }

        public int getSteps() {
            return steps;
        }

        public void setSteps(int steps) {
            this.steps = steps;
        }

        public int getCalor() {
            return calor;
        }

        public void setCalor(int calor) {
            this.calor = calor;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getDname() {
            return name;
        }

        public void setDname(String dname) {
            this.name = dname;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }
    }
}
