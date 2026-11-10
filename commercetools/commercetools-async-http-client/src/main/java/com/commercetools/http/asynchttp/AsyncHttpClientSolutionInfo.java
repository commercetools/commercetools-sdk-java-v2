
package com.commercetools.http.asynchttp;

import io.vrap.rmf.base.client.SolutionInfo;

import org.asynchttpclient.config.AsyncHttpClientConfigDefaults;

public class AsyncHttpClientSolutionInfo extends SolutionInfo {

    public AsyncHttpClientSolutionInfo() {
        setName("AsyncHttpAsyncClient");
        setVersion(AsyncHttpClientConfigDefaults.AHC_VERSION);
    }
}
