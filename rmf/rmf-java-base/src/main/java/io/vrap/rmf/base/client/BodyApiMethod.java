
package io.vrap.rmf.base.client;

import java.util.List;

public abstract class BodyApiMethod<T extends BodyApiMethod<T, TResult, TBody>, TResult, TBody>
        extends ApiMethod<T, TResult> {

    public BodyApiMethod(ApiHttpClient apiHttpClient) {
        super(apiHttpClient);
    }

    public BodyApiMethod(ApiHttpClient apiHttpClient, ApiHttpHeaders headers,
            List<ParamEntry<String, String>> queryParams) {
        super(apiHttpClient, headers, queryParams);
    }

    public BodyApiMethod(BodyApiMethod<T, TResult, TBody> apiMethod) {
        super(apiMethod);
    }

    public TBody getBody() {
        return null;
    }

    public T withBody(TBody body) {
        return null;
    }
}
