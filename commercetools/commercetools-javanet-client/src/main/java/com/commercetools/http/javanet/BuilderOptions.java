
package com.commercetools.http.javanet;

import java.net.http.HttpClient;

@FunctionalInterface
public interface BuilderOptions {
    HttpClient.Builder plus(HttpClient.Builder builder);
}
