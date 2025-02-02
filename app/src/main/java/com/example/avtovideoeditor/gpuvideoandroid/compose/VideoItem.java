package com.example.avtovideoeditor.gpuvideoandroid.compose;

import android.os.Parcel;
import android.os.Parcelable;

public class VideoItem implements Parcelable {
    private final String path;
    private final int duration;
    private final int width;
    private final int height;

    public VideoItem(String path, int duration, int width, int height) {
        this.path = path;
        this.duration = duration;
        this.width = width;
        this.height = height;
    }

    public String getPath() {
        return path;
    }

    public int getDuration() {
        return duration;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.path);
        dest.writeInt(this.duration);
        dest.writeInt(this.width);
        dest.writeInt(this.height);
    }

    protected VideoItem(Parcel in) {
        this.path = in.readString();
        this.duration = in.readInt();
        this.width = in.readInt();
        this.height = in.readInt();
    }

    public static final Creator<VideoItem> CREATOR = new Creator<VideoItem>() {
        @Override
        public VideoItem createFromParcel(Parcel source) {
            return new VideoItem(source);
        }

        @Override
        public VideoItem[] newArray(int size) {
            return new VideoItem[size];
        }
    };
}



