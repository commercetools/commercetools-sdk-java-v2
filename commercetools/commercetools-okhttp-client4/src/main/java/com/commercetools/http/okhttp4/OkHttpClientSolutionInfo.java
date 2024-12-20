
package com.commercetools.http.okhttp4;

import io.vrap.rmf.base.client.SolutionInfo;

import okhttp3.OkHttp;

public class OkHttpClientSolutionInfo extends SolutionInfo {

    public OkHttpClientSolutionInfo() {
        setName("OkHttpClient");
        setVersion(OkHttp.VERSION);
    }
}
