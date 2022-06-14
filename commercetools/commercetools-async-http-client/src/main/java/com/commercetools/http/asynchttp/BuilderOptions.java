
package com.commercetools.http.asynchttp;

import org.asynchttpclient.DefaultAsyncHttpClientConfig;

@FunctionalInterface
public interface BuilderOptions {
    DefaultAsyncHttpClientConfig.Builder plus(DefaultAsyncHttpClientConfig.Builder builder);
}
