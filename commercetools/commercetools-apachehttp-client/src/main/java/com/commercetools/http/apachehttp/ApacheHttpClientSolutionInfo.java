
package com.commercetools.http.apachehttp;

import io.vrap.rmf.base.client.SolutionInfo;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.core5.util.VersionInfo;

public class ApacheHttpClientSolutionInfo extends SolutionInfo {
    public ApacheHttpClientSolutionInfo() {
        setName("ApacheHttpAsyncClient");
        setVersion(
            VersionInfo.loadVersionInfo("org.apache.hc.client5", HttpClient.class.getClassLoader()).getRelease());
    }
}
