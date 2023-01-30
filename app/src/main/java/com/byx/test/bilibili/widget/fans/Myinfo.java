package com.byx.test.bilibili.widget.fans;

/**
 * Created by bob
 * Date : 21-8-31
 * Describe :
 */
public class Myinfo {
        private String face;
        public String getFace() {
            return face;
        }
        public void setFace(String face) {
            this.face = face;
        }

        public class Vip{
            private String avatar_subscript_url;
            public String getAvatar_subscript_url() {
                return avatar_subscript_url;
            }
            public void setAvatar_subscript_url(String avatar_subscript_url) {
                this.avatar_subscript_url = avatar_subscript_url;
            }
        }
        private Vip vip;
        public Vip getVip() {
            return vip;
        }
        public void setVip(Vip vip) {
            this.vip = vip;
        }
}
