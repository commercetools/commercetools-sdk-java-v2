
package com.commercetools.http.netty;

import io.vrap.rmf.base.client.SolutionInfo;

import reactor.netty.http.client.HttpClient;

public class NettyHttpClientSolutionInfo extends SolutionInfo {

    public NettyHttpClientSolutionInfo() {
        setName("NettyHttpClient");
        setVersion(HttpClient.class.getPackage().getImplementationVersion());
    }
}
