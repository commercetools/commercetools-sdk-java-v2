package io.vrap.rmf.base.client.utils;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.IOException;
import java.util.concurrent.CompletionException;
import java.util.function.Function;

public final class Utils {


    public static <U, V> Function<U, V> wrapToCompletionException(ExceptionalFunction<U, V> exceptionalFunction) {
        return u -> {
            try {
                return exceptionalFunction.apply(u);
            } catch (Exception e) {
                throw new CompletionException(e);
            }
        };
    }

    public static String bytesToString(byte[] input) {
        if (input == null) {
            return null;
        }
        return new String(input);
    }

    public static <I, O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, Class<O> outputType) {
        try {
            if (response.getBody() == null) {
                return (ApiHttpResponse<O>) response;
            }
            O newBody = VrapJsonUtils.fromJsonByteArray(response.getBody(), outputType);
            return new ApiHttpResponse<>(response.getStatusCode(), response.getHeaders(), newBody);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
