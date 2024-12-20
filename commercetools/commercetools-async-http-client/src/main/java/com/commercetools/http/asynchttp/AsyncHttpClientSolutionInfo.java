
package com.commercetools.http.asynchttp;

import io.vrap.rmf.base.client.SolutionInfo;
import io.vrap.rmf.base.client.VersionLoader;

public class AsyncHttpClientSolutionInfo extends SolutionInfo {

    public AsyncHttpClientSolutionInfo() {
        setName("AsyncHttpAsyncClient");
        setVersion(VersionLoader.loadVersionInfo("org.asynchttpclient", "async-http-client", "pom.properties",
            "version", this.getClass().getClassLoader()));
    }
}
