package com.example.servicebestpractice;

/**
 * Created by 她是龙 on 2018/3/28.
 */

public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCaneled();
}
