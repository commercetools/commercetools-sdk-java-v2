
package io.vrap.rmf.base.client;

import java.util.List;

public abstract class StringBodyApiMethod<T extends StringBodyApiMethod<T, TResult>, TResult>
        extends BodyApiMethod<T, TResult, String> {

    public StringBodyApiMethod(ApiHttpClient apiHttpClient) {
        super(apiHttpClient);
    }

    public StringBodyApiMethod(ApiHttpClient apiHttpClient, ApiHttpHeaders headers,
            List<ParamEntry<String, String>> queryParams) {
        super(apiHttpClient, headers, queryParams);
    }

    public StringBodyApiMethod(StringBodyApiMethod<T, TResult> apiMethod) {
        super(apiMethod);
    }

    public String getBody() {
        return null;
    }

    public T withBody(String body) {
        return null;
    }
}
