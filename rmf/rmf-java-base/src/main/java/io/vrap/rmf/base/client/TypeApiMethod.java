
package io.vrap.rmf.base.client;

import java.util.List;

public abstract class TypeApiMethod<T extends TypeApiMethod<T, TResult>, TResult> extends ApiMethod<T, TResult>
        implements HttpRequestCommand<TResult> {
    public TypeApiMethod(ApiHttpClient apiHttpClient) {
        super(apiHttpClient);
    }

    public TypeApiMethod(ApiHttpClient apiHttpClient, ApiHttpHeaders headers,
            List<ParamEntry<String, String>> queryParams) {
        super(apiHttpClient, headers, queryParams);
    }

    public TypeApiMethod(ApiMethod<T, TResult> apiMethod) {
        super(apiMethod);
    }
}
