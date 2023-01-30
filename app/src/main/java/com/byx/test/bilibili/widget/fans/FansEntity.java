package com.byx.test.bilibili.widget.fans;

/**
 * Created by bob
 * Date : 21-8-31
 * Describe :
 */
public class FansEntity {

        private int follower;
        private int following;
        public  int getFollowing(){ return following; }
        public void setFollowing(int following){this.following = following; }
        public int getFollower() {
            return follower;
        }
        public void setFollower(int follower) {
            this.follower = follower;
        }

}
