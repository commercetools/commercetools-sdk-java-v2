package com.commercetools.http.okhttp4;

import okhttp3.OkHttpClient;

@FunctionalInterface
public interface BuilderOptions {
    OkHttpClient.Builder plus(OkHttpClient.Builder builder);
}
