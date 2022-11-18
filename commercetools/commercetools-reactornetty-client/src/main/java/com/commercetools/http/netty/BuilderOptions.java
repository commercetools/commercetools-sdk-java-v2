
package com.commercetools.http.netty;

import reactor.netty.http.client.HttpClient;

@FunctionalInterface
public interface BuilderOptions {
    HttpClient plus(HttpClient builder);
}
