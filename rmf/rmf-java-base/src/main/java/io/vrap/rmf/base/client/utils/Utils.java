
package io.vrap.rmf.base.client.utils;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletionException;
import java.util.function.Function;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

public final class Utils {

    public static <U, V> Function<U, V> wrapToCompletionException(final ExceptionalFunction<U, V> exceptionalFunction) {
        return u -> {
            try {
                return exceptionalFunction.apply(u);
            }
            catch (Exception e) {
                throw new CompletionException(e);
            }
        };
    }

    public static String bytesToString(final byte[] input) {
        if (input == null) {
            return null;
        }
        return new String(input);
    }

    public static String bytesToUTF8String(final byte[] input) {
        if (input == null) {
            return null;
        }
        return new String(input, StandardCharsets.UTF_8);
    }

    public static <I, O> ApiHttpResponse<O> convertResponse(final ApiHttpResponse<byte[]> response,
            final Class<O> outputType) {
        if (response.getBody() == null) {
            return (ApiHttpResponse<O>) response;
        }
        O newBody = JsonUtils.fromJsonByteArray(response.getBody(), outputType);
        return new ApiHttpResponse<>(response.getStatusCode(), response.getHeaders(), newBody);
    }
}
