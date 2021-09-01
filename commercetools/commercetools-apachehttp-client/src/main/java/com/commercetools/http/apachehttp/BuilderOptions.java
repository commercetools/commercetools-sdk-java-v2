
package com.commercetools.http.apachehttp;

import org.apache.hc.client5.http.impl.async.HttpAsyncClientBuilder;

@FunctionalInterface
public interface BuilderOptions {
    HttpAsyncClientBuilder plus(HttpAsyncClientBuilder builder);
}
