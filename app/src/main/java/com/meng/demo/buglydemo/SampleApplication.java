package com.meng.demo.buglydemo;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.meng.demo.buglydemo.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}