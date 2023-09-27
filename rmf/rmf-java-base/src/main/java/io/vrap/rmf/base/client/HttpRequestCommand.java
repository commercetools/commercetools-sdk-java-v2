
package io.vrap.rmf.base.client;

import com.fasterxml.jackson.core.type.TypeReference;

public interface HttpRequestCommand<TResult> extends CreateHttpRequestCommand {
    TypeReference<TResult> resultType();
}
