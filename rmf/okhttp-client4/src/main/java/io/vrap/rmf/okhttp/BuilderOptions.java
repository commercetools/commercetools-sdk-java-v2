package io.vrap.rmf.okhttp;

import okhttp3.OkHttpClient;

@FunctionalInterface
public interface BuilderOptions {
    OkHttpClient.Builder plus(OkHttpClient.Builder builder);
}
