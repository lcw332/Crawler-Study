package com.lcw.app.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created By lcw332
 * Time : 2020 06 19 19:03
 * Describe : bilibili视频信息VO
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BiliVideoVo {

        private int code;
        private String message;
        private int ttl;
        private Data data;

        @lombok.Data
        @AllArgsConstructor
        @NoArgsConstructor
        public static class Data {
            private String bvid;
            private int aid;
            private int videos;
            private int tid;
            private String tname;
            private int copyright;
            private String pic;
            private String title;
            private int pubdate;
            private int ctime;
            private String desc;
            private int state;
            private int attribute;
            private int duration;
            private Rights rights;
            private Owner owner;
            private Stat stat;
            private String dynamic;
            private int cid;
            private Dimension dimension;
            @JsonProperty("no_cache")
            private boolean noCache;
            private List<Pages> pages;
            private Subtitle subtitle;
            private Label label;

            @lombok.Data
            @AllArgsConstructor
            @NoArgsConstructor
            public static class Rights {

                private int bp;
                private int elec;
                private int download;
                private int movie;
                private int pay;
                private int hd5;
                @JsonProperty("no_reprint")
                private int noReprint;
                private int autoplay;
                @JsonProperty("ugc_pay")
                private int ugcPay;
                @JsonProperty("is_cooperation")
                private int isCooperation;
                @JsonProperty("ugc_pay_preview")
                private int ugcPayPreview;
                @JsonProperty("no_background")
                private int noBackground;
            }

            @lombok.Data
            @AllArgsConstructor
            @NoArgsConstructor
            private static class Stat {
                private int aid;
                private int view;
                private int danmaku;
                private int reply;
                private int favorite;
                private int coin;
                private int share;
                @JsonProperty("now_rank")
                private int nowRank;
                @JsonProperty("his_rank")
                private int hisRank;
                private int like;
                private int dislike;
                private String evaluation;
            }

            @lombok.Data
            @AllArgsConstructor
            @NoArgsConstructor
            private static class Owner {
                private int mid;
                private String name;
                private String face;
            }
            @lombok.Data
            @AllArgsConstructor
            @NoArgsConstructor
            private static class Dimension {
                private int width;
                private int height;
                private int rotate;
            }

            @lombok.Data
            @AllArgsConstructor
            @NoArgsConstructor
            private static class Subtitle{
                @JsonProperty("allow_submit")
                private boolean allowSubmit;
                private List<String> list;
            }

            @lombok.Data
            @AllArgsConstructor
            @NoArgsConstructor
            private static class Label{
                private int type;
            }

            @lombok.Data
            @AllArgsConstructor
            @NoArgsConstructor
            public static class Pages {
                private int cid;
                private int page;
                private String from;
                private String part;
                private int duration;
                private String vid;
                private String weblink;
                private Dimension dimension;
            }
        }



}
