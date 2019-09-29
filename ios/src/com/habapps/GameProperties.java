package com.habapps;

import org.robovm.apple.foundation.NSBundle;

import libgdx.constants.GameIdEnum;

public enum GameProperties {

    skelgame(
            GameIdEnum.colordrop,
            NSBundle.getMainBundle().getLocalizedString("language","en","InfoPlist"),
            NSBundle.getMainBundle().getLocalizedString("CFBundleDisplayName","en","InfoPlist"),
            "ca-app-pub-9432399956064043~5692002154",
            "ca-app-pub-9432399956064043/3065838812",
            "ca-app-pub-9432399956064043/8126593807",
            "ca-app-pub-9432399956064043/9730964295",
            "1480525685",
            "1480526446");

    private GameIdEnum gameIdEnum;
    private String language;
    private String appName;
    private String adMobAppId;
    private String bannerAdId;
    private String interstitialAdId;
    private String rewardAdId;
    private String storeAppId;
    private String proVersionStoreAppId;

    GameProperties(GameIdEnum gameIdEnum,
                   String language,
                   String appName,
                   String adMobAppId,
                   String bannerAdId,
                   String interstitialAdId,
                   String rewardAdId,
                   String storeAppId,
                   String proVersionStoreAppId) {
        this.gameIdEnum = gameIdEnum;
        this.language = language;
        this.appName = appName;
        this.adMobAppId = adMobAppId;
        this.bannerAdId = bannerAdId;
        this.interstitialAdId = interstitialAdId;
        this.rewardAdId = rewardAdId;
        this.storeAppId = storeAppId;
        this.proVersionStoreAppId = proVersionStoreAppId;
    }

    public GameIdEnum getGameIdEnum() {
        return gameIdEnum;
    }

    public String getLanguage() {
        return language;
    }

    public String getAppName() {
        return appName;
    }

    public String getAdMobAppId() {
        return adMobAppId;
    }

    public String getBannerAdId() {
        return bannerAdId;
    }

    public String getInterstitialAdId() {
        return interstitialAdId;
    }

    public String getRewardAdId() {
        return rewardAdId;
    }

    public String getStoreAppId() {
        return storeAppId;
    }

    public String getProVersionStoreAppId() {
        return proVersionStoreAppId;
    }
}
