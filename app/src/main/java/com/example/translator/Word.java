package com.example.translator;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mimageResourceId;
    private boolean imageTracker=false;
    private int mAudioResourceId;

    public Word(String defaultTranslation,String miwokTranslation,int audio){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudioResourceId=audio;
    }

    public Word(String defaultTranslation,String miwokTranslation,int imageId,int audio){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mimageResourceId=imageId;
        imageTracker=true;
        mAudioResourceId=audio;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mimageResourceId;
    }

    public boolean hasImage(){
        return imageTracker;
    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    }
}
