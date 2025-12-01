
package com.commercetools.http.okhttp5;

import okhttp3.OkHttpClient;

@FunctionalInterface
public interface BuilderOptions {
    OkHttpClient.Builder plus(OkHttpClient.Builder builder);
}
