package com.designpattern.art.facade.pattern;

// 具体备份功能外观类：外观角色类
public class CopyFacade {
    private NumberBookManager numberBookManager;
    private SmsManager smsManager;
    private PhotoManager photoManager;
    private SongManager songManager;

    public CopyFacade() {
        this.numberBookManager = new NumberBookManager();
        this.smsManager = new SmsManager();
        this.photoManager = new PhotoManager();
        this.songManager = new SongManager();
    }

    public void oneKeyCopy() {
        numberBookManager.copyNumberBook();
        smsManager.copySms();
        photoManager.copyPhoto();
        songManager.copySong();
    }
}
