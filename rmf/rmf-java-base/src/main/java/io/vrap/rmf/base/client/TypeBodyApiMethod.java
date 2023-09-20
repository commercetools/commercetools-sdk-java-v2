
package io.vrap.rmf.base.client;

import java.util.List;

public abstract class TypeBodyApiMethod<T extends TypeBodyApiMethod<T, TResult, TBody>, TResult, TBody>
        extends BodyApiMethod<T, TResult, TBody> implements HttpRequestCommand<TResult> {

    public TypeBodyApiMethod(ApiHttpClient apiHttpClient) {
        super(apiHttpClient);
    }

    public TypeBodyApiMethod(ApiHttpClient apiHttpClient, ApiHttpHeaders headers,
            List<ParamEntry<String, String>> queryParams) {
        super(apiHttpClient, headers, queryParams);
    }

    public TypeBodyApiMethod(TypeBodyApiMethod<T, TResult, TBody> apiMethod) {
        super(apiMethod);
    }

    public TBody getBody() {
        return null;
    }

    public T withBody(TBody body) {
        return null;
    }
}
