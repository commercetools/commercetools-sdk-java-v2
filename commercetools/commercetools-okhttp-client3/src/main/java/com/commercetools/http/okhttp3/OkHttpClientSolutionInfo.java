
package com.commercetools.http.okhttp3;

import io.vrap.rmf.base.client.SolutionInfo;
import io.vrap.rmf.base.client.VersionLoader;

public class OkHttpClientSolutionInfo extends SolutionInfo {

    public OkHttpClientSolutionInfo() {
        setName("OkHttpClient");
        setVersion(VersionLoader.loadVersionInfo("com.squareup.okhttp3", "okhttp", "pom.properties", "version",
            this.getClass().getClassLoader()));
    }
}
