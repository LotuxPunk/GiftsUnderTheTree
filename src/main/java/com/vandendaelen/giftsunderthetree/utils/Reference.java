package com.vandendaelen.giftsunderthetree.utils;

public class Reference {
    public static final String MODID ="giftsunderthetree";
    public static final String NAME = "Gifts Under the Tree";
    public static final String DEPENDENCIES = "required:forge@[14.23.4.2784,)";

    //public static final String UPDATE_JSON = "https://raw.githubusercontent.com/LotuxPunk/.../master/update.json";

    public static final String CLIENT_PROXY = "com.vandendaelen.giftsunderthetree.client.ClientProxy";
    public static final String SERVER_PROXY = "com.vandendaelen.giftsunderthetree.server.ServerProxy";

    public static class Version{
        public static final String MCVERSION = "1.12.2";
        public static final String MAJORMOD = "0";
        public static final String MAJORAPI = "0";
        public static final String MINOR = "0";
        public static final String PATCH = "1";
        public static final String VERSION = MCVERSION+"-"+MAJORMOD+"."+MAJORAPI+"."+MINOR+"."+PATCH;
    }
}
