package com.byx.test.bilibili.widget.fans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by bob
 * Date : 21-8-31
 * Describe :
 */
public class Myinfo {
    /**
     * mid : 2873132
     * name : 奇兹纳・亚斯汀
     * sex : 保密
     * face : https://i2.hdslb.com/bfs/face/2e07e22e9e89082e9bc542693755ae1d04d3d4ab.jpg
     * face_nft : 0
     * face_nft_type : 0
     * sign : “希望这一天永远持续下去”
     * rank : 10000
     * level : 6
     * jointime : 0
     * moral : 0
     * silence : 0
     * coins : 0
     * fans_badge : false
     * fans_medal : {"show":true,"wear":true,"medal":{"uid":2873132,"target_id":194484313,"medal_id":85550,"level":12,"medal_name":"ASAKI","medal_color":9272486,"intimacy":7132,"next_intimacy":10000,"day_limit":1500,"medal_color_start":9272486,"medal_color_end":9272486,"medal_color_border":9272486,"is_lighted":1,"light_status":1,"wearing_status":1,"score":32033}}
     * official : {"role":0,"title":"","desc":"","type":-1}
     * vip : {"type":2,"status":1,"due_date":1757433600000,"vip_pay_type":0,"theme_type":0,"label":{"path":"","text":"年度小会员","label_theme":"fools_day_annual_vip","text_color":"#FFFFFF","bg_style":1,"bg_color":"#3EB559","border_color":"","use_img_label":true,"img_label_uri_hans":"","img_label_uri_hant":"","img_label_uri_hans_static":"","img_label_uri_hant_static":""},"avatar_subscript":2,"nickname_color":"#6DC781","role":3,"avatar_subscript_url":"","tv_vip_status":0,"tv_vip_pay_type":0}
     * pendant : {"pid":217,"name":"citrus","image":"https://i2.hdslb.com/bfs/face/f2d3a85b611eb2ef13cb64415187e3e9fd487ec8.png","expire":0,"image_enhance":"https://i2.hdslb.com/bfs/face/f2d3a85b611eb2ef13cb64415187e3e9fd487ec8.png","image_enhance_frame":""}
     * nameplate : {"nid":74,"name":"大会员2018年度勋章","image":"https://i2.hdslb.com/bfs/face/421179426c929dfeaed4117461c83f5d07ffb148.png","image_small":"https://i1.hdslb.com/bfs/face/682001c2e1c2ae887bdf2a0e18eef61180c48f84.png","level":"稀有勋章","condition":"2018.6.26-7.8某一天是年度大会员"}
     * user_honour_info : {"mid":0,"colour":null,"tags":[]}
     * is_followed : false
     * top_photo : http://i2.hdslb.com/bfs/space/cb1c3ef50e22b6096fde67febe863494caefebad.png
     * theme : {}
     * sys_notice : {}
     * live_room : {"roomStatus":1,"liveStatus":0,"url":"https://live.bilibili.com/705840?broadcast_type=0&is_room_feed=0","title":"雀魂","cover":"http://i0.hdslb.com/bfs/live/7a12d4aa9eb7ba3578d53205e59e6f6821e62449.jpg","roomid":705840,"roundStatus":0,"broadcast_type":0,"watched_show":{"switch":true,"num":0,"text_small":"0","text_large":"0人看过","icon":"https://i0.hdslb.com/bfs/live/a725a9e61242ef44d764ac911691a7ce07f36c1d.png","icon_location":"","icon_web":"https://i0.hdslb.com/bfs/live/8d9d0f33ef8bf6f308742752d13dd0df731df19c.png"}}
     * birthday : 09-21
     * school : {"name":""}
     * profession : {"name":"","department":"","title":"","is_show":0}
     * tags : null
     * series : {"user_upgrade_status":3,"show_upgrade_window":false}
     * is_senior_member : 0
     * mcn_info : null
     * gaia_res_type : 0
     * gaia_data : null
     * is_risk : false
     * elec : {"show_info":{"show":true,"state":1,"title":"","icon":"","jump_url":""}}
     * contract : null
     */

    private int mid;
    private String name;
    private String sex;
    private String face;
    private int face_nft;
    private int face_nft_type;
    private String sign;
    private int rank;
    private int level;
    private int jointime;
    private int moral;
    private int silence;
    private int coins;
    private boolean fans_badge;
    private FansMedalBean fans_medal;
    private OfficialBean official;
    private VipBean vip;
    private PendantBean pendant;
    private NameplateBean nameplate;
    private UserHonourInfoBean user_honour_info;
    private boolean is_followed;
    private String top_photo;
    private ThemeBean theme;
    private SysNoticeBean sys_notice;
    private LiveRoomBean live_room;
    private String birthday;
    private SchoolBean school;
    private ProfessionBean profession;
    private Object tags;
    private SeriesBean series;
    private int is_senior_member;
    private Object mcn_info;
    private int gaia_res_type;
    private Object gaia_data;
    private boolean is_risk;
    private ElecBean elec;
    private Object contract;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public int getFace_nft() {
        return face_nft;
    }

    public void setFace_nft(int face_nft) {
        this.face_nft = face_nft;
    }

    public int getFace_nft_type() {
        return face_nft_type;
    }

    public void setFace_nft_type(int face_nft_type) {
        this.face_nft_type = face_nft_type;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getJointime() {
        return jointime;
    }

    public void setJointime(int jointime) {
        this.jointime = jointime;
    }

    public int getMoral() {
        return moral;
    }

    public void setMoral(int moral) {
        this.moral = moral;
    }

    public int getSilence() {
        return silence;
    }

    public void setSilence(int silence) {
        this.silence = silence;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public boolean isFans_badge() {
        return fans_badge;
    }

    public void setFans_badge(boolean fans_badge) {
        this.fans_badge = fans_badge;
    }

    public FansMedalBean getFans_medal() {
        return fans_medal;
    }

    public void setFans_medal(FansMedalBean fans_medal) {
        this.fans_medal = fans_medal;
    }

    public OfficialBean getOfficial() {
        return official;
    }

    public void setOfficial(OfficialBean official) {
        this.official = official;
    }

    public VipBean getVip() {
        return vip;
    }

    public void setVip(VipBean vip) {
        this.vip = vip;
    }

    public PendantBean getPendant() {
        return pendant;
    }

    public void setPendant(PendantBean pendant) {
        this.pendant = pendant;
    }

    public NameplateBean getNameplate() {
        return nameplate;
    }

    public void setNameplate(NameplateBean nameplate) {
        this.nameplate = nameplate;
    }

    public UserHonourInfoBean getUser_honour_info() {
        return user_honour_info;
    }

    public void setUser_honour_info(UserHonourInfoBean user_honour_info) {
        this.user_honour_info = user_honour_info;
    }

    public boolean isIs_followed() {
        return is_followed;
    }

    public void setIs_followed(boolean is_followed) {
        this.is_followed = is_followed;
    }

    public String getTop_photo() {
        return top_photo;
    }

    public void setTop_photo(String top_photo) {
        this.top_photo = top_photo;
    }

    public ThemeBean getTheme() {
        return theme;
    }

    public void setTheme(ThemeBean theme) {
        this.theme = theme;
    }

    public SysNoticeBean getSys_notice() {
        return sys_notice;
    }

    public void setSys_notice(SysNoticeBean sys_notice) {
        this.sys_notice = sys_notice;
    }

    public LiveRoomBean getLive_room() {
        return live_room;
    }

    public void setLive_room(LiveRoomBean live_room) {
        this.live_room = live_room;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public SchoolBean getSchool() {
        return school;
    }

    public void setSchool(SchoolBean school) {
        this.school = school;
    }

    public ProfessionBean getProfession() {
        return profession;
    }

    public void setProfession(ProfessionBean profession) {
        this.profession = profession;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public SeriesBean getSeries() {
        return series;
    }

    public void setSeries(SeriesBean series) {
        this.series = series;
    }

    public int getIs_senior_member() {
        return is_senior_member;
    }

    public void setIs_senior_member(int is_senior_member) {
        this.is_senior_member = is_senior_member;
    }

    public Object getMcn_info() {
        return mcn_info;
    }

    public void setMcn_info(Object mcn_info) {
        this.mcn_info = mcn_info;
    }

    public int getGaia_res_type() {
        return gaia_res_type;
    }

    public void setGaia_res_type(int gaia_res_type) {
        this.gaia_res_type = gaia_res_type;
    }

    public Object getGaia_data() {
        return gaia_data;
    }

    public void setGaia_data(Object gaia_data) {
        this.gaia_data = gaia_data;
    }

    public boolean isIs_risk() {
        return is_risk;
    }

    public void setIs_risk(boolean is_risk) {
        this.is_risk = is_risk;
    }

    public ElecBean getElec() {
        return elec;
    }

    public void setElec(ElecBean elec) {
        this.elec = elec;
    }

    public Object getContract() {
        return contract;
    }

    public void setContract(Object contract) {
        this.contract = contract;
    }

    public static class FansMedalBean {
        /**
         * show : true
         * wear : true
         * medal : {"uid":2873132,"target_id":194484313,"medal_id":85550,"level":12,"medal_name":"ASAKI","medal_color":9272486,"intimacy":7132,"next_intimacy":10000,"day_limit":1500,"medal_color_start":9272486,"medal_color_end":9272486,"medal_color_border":9272486,"is_lighted":1,"light_status":1,"wearing_status":1,"score":32033}
         */

        private boolean show;
        private boolean wear;
        private MedalBean medal;

        public boolean isShow() {
            return show;
        }

        public void setShow(boolean show) {
            this.show = show;
        }

        public boolean isWear() {
            return wear;
        }

        public void setWear(boolean wear) {
            this.wear = wear;
        }

        public MedalBean getMedal() {
            return medal;
        }

        public void setMedal(MedalBean medal) {
            this.medal = medal;
        }

        public static class MedalBean {
            /**
             * uid : 2873132
             * target_id : 194484313
             * medal_id : 85550
             * level : 12
             * medal_name : ASAKI
             * medal_color : 9272486
             * intimacy : 7132
             * next_intimacy : 10000
             * day_limit : 1500
             * medal_color_start : 9272486
             * medal_color_end : 9272486
             * medal_color_border : 9272486
             * is_lighted : 1
             * light_status : 1
             * wearing_status : 1
             * score : 32033
             */

            private int uid;
            private int target_id;
            private int medal_id;
            private int level;
            private String medal_name;
            private int medal_color;
            private int intimacy;
            private int next_intimacy;
            private int day_limit;
            private int medal_color_start;
            private int medal_color_end;
            private int medal_color_border;
            private int is_lighted;
            private int light_status;
            private int wearing_status;
            private int score;

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public int getTarget_id() {
                return target_id;
            }

            public void setTarget_id(int target_id) {
                this.target_id = target_id;
            }

            public int getMedal_id() {
                return medal_id;
            }

            public void setMedal_id(int medal_id) {
                this.medal_id = medal_id;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public String getMedal_name() {
                return medal_name;
            }

            public void setMedal_name(String medal_name) {
                this.medal_name = medal_name;
            }

            public int getMedal_color() {
                return medal_color;
            }

            public void setMedal_color(int medal_color) {
                this.medal_color = medal_color;
            }

            public int getIntimacy() {
                return intimacy;
            }

            public void setIntimacy(int intimacy) {
                this.intimacy = intimacy;
            }

            public int getNext_intimacy() {
                return next_intimacy;
            }

            public void setNext_intimacy(int next_intimacy) {
                this.next_intimacy = next_intimacy;
            }

            public int getDay_limit() {
                return day_limit;
            }

            public void setDay_limit(int day_limit) {
                this.day_limit = day_limit;
            }

            public int getMedal_color_start() {
                return medal_color_start;
            }

            public void setMedal_color_start(int medal_color_start) {
                this.medal_color_start = medal_color_start;
            }

            public int getMedal_color_end() {
                return medal_color_end;
            }

            public void setMedal_color_end(int medal_color_end) {
                this.medal_color_end = medal_color_end;
            }

            public int getMedal_color_border() {
                return medal_color_border;
            }

            public void setMedal_color_border(int medal_color_border) {
                this.medal_color_border = medal_color_border;
            }

            public int getIs_lighted() {
                return is_lighted;
            }

            public void setIs_lighted(int is_lighted) {
                this.is_lighted = is_lighted;
            }

            public int getLight_status() {
                return light_status;
            }

            public void setLight_status(int light_status) {
                this.light_status = light_status;
            }

            public int getWearing_status() {
                return wearing_status;
            }

            public void setWearing_status(int wearing_status) {
                this.wearing_status = wearing_status;
            }

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }
        }
    }

    public static class OfficialBean {
        /**
         * role : 0
         * title :
         * desc :
         * type : -1
         */

        private int role;
        private String title;
        private String desc;
        private int type;

        public int getRole() {
            return role;
        }

        public void setRole(int role) {
            this.role = role;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }

    public static class VipBean {
        /**
         * type : 2
         * status : 1
         * due_date : 1757433600000
         * vip_pay_type : 0
         * theme_type : 0
         * label : {"path":"","text":"年度小会员","label_theme":"fools_day_annual_vip","text_color":"#FFFFFF","bg_style":1,"bg_color":"#3EB559","border_color":"","use_img_label":true,"img_label_uri_hans":"","img_label_uri_hant":"","img_label_uri_hans_static":"","img_label_uri_hant_static":""}
         * avatar_subscript : 2
         * nickname_color : #6DC781
         * role : 3
         * avatar_subscript_url :
         * tv_vip_status : 0
         * tv_vip_pay_type : 0
         */

        private int type;
        private int status;
        private long due_date;
        private int vip_pay_type;
        private int theme_type;
        private LabelBean label;
        private int avatar_subscript;
        private String nickname_color;
        private int role;
        private String avatar_subscript_url;
        private int tv_vip_status;
        private int tv_vip_pay_type;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public long getDue_date() {
            return due_date;
        }

        public void setDue_date(long due_date) {
            this.due_date = due_date;
        }

        public int getVip_pay_type() {
            return vip_pay_type;
        }

        public void setVip_pay_type(int vip_pay_type) {
            this.vip_pay_type = vip_pay_type;
        }

        public int getTheme_type() {
            return theme_type;
        }

        public void setTheme_type(int theme_type) {
            this.theme_type = theme_type;
        }

        public LabelBean getLabel() {
            return label;
        }

        public void setLabel(LabelBean label) {
            this.label = label;
        }

        public int getAvatar_subscript() {
            return avatar_subscript;
        }

        public void setAvatar_subscript(int avatar_subscript) {
            this.avatar_subscript = avatar_subscript;
        }

        public String getNickname_color() {
            return nickname_color;
        }

        public void setNickname_color(String nickname_color) {
            this.nickname_color = nickname_color;
        }

        public int getRole() {
            return role;
        }

        public void setRole(int role) {
            this.role = role;
        }

        public String getAvatar_subscript_url() {
            return avatar_subscript_url;
        }

        public void setAvatar_subscript_url(String avatar_subscript_url) {
            this.avatar_subscript_url = avatar_subscript_url;
        }

        public int getTv_vip_status() {
            return tv_vip_status;
        }

        public void setTv_vip_status(int tv_vip_status) {
            this.tv_vip_status = tv_vip_status;
        }

        public int getTv_vip_pay_type() {
            return tv_vip_pay_type;
        }

        public void setTv_vip_pay_type(int tv_vip_pay_type) {
            this.tv_vip_pay_type = tv_vip_pay_type;
        }

        public static class LabelBean {
            /**
             * path :
             * text : 年度小会员
             * label_theme : fools_day_annual_vip
             * text_color : #FFFFFF
             * bg_style : 1
             * bg_color : #3EB559
             * border_color :
             * use_img_label : true
             * img_label_uri_hans :
             * img_label_uri_hant :
             * img_label_uri_hans_static :
             * img_label_uri_hant_static :
             */

            private String path;
            private String text;
            private String label_theme;
            private String text_color;
            private int bg_style;
            private String bg_color;
            private String border_color;
            private boolean use_img_label;
            private String img_label_uri_hans;
            private String img_label_uri_hant;
            private String img_label_uri_hans_static;
            private String img_label_uri_hant_static;

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getLabel_theme() {
                return label_theme;
            }

            public void setLabel_theme(String label_theme) {
                this.label_theme = label_theme;
            }

            public String getText_color() {
                return text_color;
            }

            public void setText_color(String text_color) {
                this.text_color = text_color;
            }

            public int getBg_style() {
                return bg_style;
            }

            public void setBg_style(int bg_style) {
                this.bg_style = bg_style;
            }

            public String getBg_color() {
                return bg_color;
            }

            public void setBg_color(String bg_color) {
                this.bg_color = bg_color;
            }

            public String getBorder_color() {
                return border_color;
            }

            public void setBorder_color(String border_color) {
                this.border_color = border_color;
            }

            public boolean isUse_img_label() {
                return use_img_label;
            }

            public void setUse_img_label(boolean use_img_label) {
                this.use_img_label = use_img_label;
            }

            public String getImg_label_uri_hans() {
                return img_label_uri_hans;
            }

            public void setImg_label_uri_hans(String img_label_uri_hans) {
                this.img_label_uri_hans = img_label_uri_hans;
            }

            public String getImg_label_uri_hant() {
                return img_label_uri_hant;
            }

            public void setImg_label_uri_hant(String img_label_uri_hant) {
                this.img_label_uri_hant = img_label_uri_hant;
            }

            public String getImg_label_uri_hans_static() {
                return img_label_uri_hans_static;
            }

            public void setImg_label_uri_hans_static(String img_label_uri_hans_static) {
                this.img_label_uri_hans_static = img_label_uri_hans_static;
            }

            public String getImg_label_uri_hant_static() {
                return img_label_uri_hant_static;
            }

            public void setImg_label_uri_hant_static(String img_label_uri_hant_static) {
                this.img_label_uri_hant_static = img_label_uri_hant_static;
            }
        }
    }

    public static class PendantBean {
        /**
         * pid : 217
         * name : citrus
         * image : https://i2.hdslb.com/bfs/face/f2d3a85b611eb2ef13cb64415187e3e9fd487ec8.png
         * expire : 0
         * image_enhance : https://i2.hdslb.com/bfs/face/f2d3a85b611eb2ef13cb64415187e3e9fd487ec8.png
         * image_enhance_frame :
         */

        private int pid;
        private String name;
        private String image;
        private int expire;
        private String image_enhance;
        private String image_enhance_frame;

        public int getPid() {
            return pid;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getExpire() {
            return expire;
        }

        public void setExpire(int expire) {
            this.expire = expire;
        }

        public String getImage_enhance() {
            return image_enhance;
        }

        public void setImage_enhance(String image_enhance) {
            this.image_enhance = image_enhance;
        }

        public String getImage_enhance_frame() {
            return image_enhance_frame;
        }

        public void setImage_enhance_frame(String image_enhance_frame) {
            this.image_enhance_frame = image_enhance_frame;
        }
    }

    public static class NameplateBean {
        /**
         * nid : 74
         * name : 大会员2018年度勋章
         * image : https://i2.hdslb.com/bfs/face/421179426c929dfeaed4117461c83f5d07ffb148.png
         * image_small : https://i1.hdslb.com/bfs/face/682001c2e1c2ae887bdf2a0e18eef61180c48f84.png
         * level : 稀有勋章
         * condition : 2018.6.26-7.8某一天是年度大会员
         */

        private int nid;
        private String name;
        private String image;
        private String image_small;
        private String level;
        private String condition;

        public int getNid() {
            return nid;
        }

        public void setNid(int nid) {
            this.nid = nid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getImage_small() {
            return image_small;
        }

        public void setImage_small(String image_small) {
            this.image_small = image_small;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getCondition() {
            return condition;
        }

        public void setCondition(String condition) {
            this.condition = condition;
        }
    }

    public static class UserHonourInfoBean {
        /**
         * mid : 0
         * colour : null
         * tags : []
         */

        private int mid;
        private Object colour;
        private List<?> tags;

        public int getMid() {
            return mid;
        }

        public void setMid(int mid) {
            this.mid = mid;
        }

        public Object getColour() {
            return colour;
        }

        public void setColour(Object colour) {
            this.colour = colour;
        }

        public List<?> getTags() {
            return tags;
        }

        public void setTags(List<?> tags) {
            this.tags = tags;
        }
    }

    public static class ThemeBean {
    }

    public static class SysNoticeBean {
    }

    public static class LiveRoomBean {
        /**
         * roomStatus : 1
         * liveStatus : 0
         * url : https://live.bilibili.com/705840?broadcast_type=0&is_room_feed=0
         * title : 雀魂
         * cover : http://i0.hdslb.com/bfs/live/7a12d4aa9eb7ba3578d53205e59e6f6821e62449.jpg
         * roomid : 705840
         * roundStatus : 0
         * broadcast_type : 0
         * watched_show : {"switch":true,"num":0,"text_small":"0","text_large":"0人看过","icon":"https://i0.hdslb.com/bfs/live/a725a9e61242ef44d764ac911691a7ce07f36c1d.png","icon_location":"","icon_web":"https://i0.hdslb.com/bfs/live/8d9d0f33ef8bf6f308742752d13dd0df731df19c.png"}
         */

        private int roomStatus;
        private int liveStatus;
        private String url;
        private String title;
        private String cover;
        private int roomid;
        private int roundStatus;
        private int broadcast_type;
        private WatchedShowBean watched_show;

        public int getRoomStatus() {
            return roomStatus;
        }

        public void setRoomStatus(int roomStatus) {
            this.roomStatus = roomStatus;
        }

        public int getLiveStatus() {
            return liveStatus;
        }

        public void setLiveStatus(int liveStatus) {
            this.liveStatus = liveStatus;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public int getRoomid() {
            return roomid;
        }

        public void setRoomid(int roomid) {
            this.roomid = roomid;
        }

        public int getRoundStatus() {
            return roundStatus;
        }

        public void setRoundStatus(int roundStatus) {
            this.roundStatus = roundStatus;
        }

        public int getBroadcast_type() {
            return broadcast_type;
        }

        public void setBroadcast_type(int broadcast_type) {
            this.broadcast_type = broadcast_type;
        }

        public WatchedShowBean getWatched_show() {
            return watched_show;
        }

        public void setWatched_show(WatchedShowBean watched_show) {
            this.watched_show = watched_show;
        }

        public static class WatchedShowBean {
            /**
             * switch : true
             * num : 0
             * text_small : 0
             * text_large : 0人看过
             * icon : https://i0.hdslb.com/bfs/live/a725a9e61242ef44d764ac911691a7ce07f36c1d.png
             * icon_location :
             * icon_web : https://i0.hdslb.com/bfs/live/8d9d0f33ef8bf6f308742752d13dd0df731df19c.png
             */

            @SerializedName("switch")
            private boolean switchX;
            private int num;
            private String text_small;
            private String text_large;
            private String icon;
            private String icon_location;
            private String icon_web;

            public boolean isSwitchX() {
                return switchX;
            }

            public void setSwitchX(boolean switchX) {
                this.switchX = switchX;
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }

            public String getText_small() {
                return text_small;
            }

            public void setText_small(String text_small) {
                this.text_small = text_small;
            }

            public String getText_large() {
                return text_large;
            }

            public void setText_large(String text_large) {
                this.text_large = text_large;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getIcon_location() {
                return icon_location;
            }

            public void setIcon_location(String icon_location) {
                this.icon_location = icon_location;
            }

            public String getIcon_web() {
                return icon_web;
            }

            public void setIcon_web(String icon_web) {
                this.icon_web = icon_web;
            }
        }
    }

    public static class SchoolBean {
        /**
         * name :
         */

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class ProfessionBean {
        /**
         * name :
         * department :
         * title :
         * is_show : 0
         */

        private String name;
        private String department;
        private String title;
        private int is_show;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getIs_show() {
            return is_show;
        }

        public void setIs_show(int is_show) {
            this.is_show = is_show;
        }
    }

    public static class SeriesBean {
        /**
         * user_upgrade_status : 3
         * show_upgrade_window : false
         */

        private int user_upgrade_status;
        private boolean show_upgrade_window;

        public int getUser_upgrade_status() {
            return user_upgrade_status;
        }

        public void setUser_upgrade_status(int user_upgrade_status) {
            this.user_upgrade_status = user_upgrade_status;
        }

        public boolean isShow_upgrade_window() {
            return show_upgrade_window;
        }

        public void setShow_upgrade_window(boolean show_upgrade_window) {
            this.show_upgrade_window = show_upgrade_window;
        }
    }

    public static class ElecBean {
        /**
         * show_info : {"show":true,"state":1,"title":"","icon":"","jump_url":""}
         */

        private ShowInfoBean show_info;

        public ShowInfoBean getShow_info() {
            return show_info;
        }

        public void setShow_info(ShowInfoBean show_info) {
            this.show_info = show_info;
        }

        public static class ShowInfoBean {
            /**
             * show : true
             * state : 1
             * title :
             * icon :
             * jump_url :
             */

            private boolean show;
            private int state;
            private String title;
            private String icon;
            private String jump_url;

            public boolean isShow() {
                return show;
            }

            public void setShow(boolean show) {
                this.show = show;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getJump_url() {
                return jump_url;
            }

            public void setJump_url(String jump_url) {
                this.jump_url = jump_url;
            }
        }
    }
}
