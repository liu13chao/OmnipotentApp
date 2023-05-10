package com.bagen.mykoom;

import android.app.Application;
import android.content.Context;

import com.kwai.koom.base.MonitorLog;
import com.kwai.koom.base.MonitorManager;
import com.kwai.koom.javaoom.monitor.OOMHprofUploader;
import com.kwai.koom.javaoom.monitor.OOMMonitor;
import com.kwai.koom.javaoom.monitor.OOMMonitorConfig;
import com.kwai.koom.javaoom.monitor.OOMReportUploader;

import java.io.File;

public class KoomManager {

    public static void run(Application application) {
        /*
         * Init OOMMonitor
         */
        OOMMonitorInitTask.INSTANCE.init(application);
        OOMMonitor.INSTANCE.startLoop(true, false,5_000L);
    }
}
