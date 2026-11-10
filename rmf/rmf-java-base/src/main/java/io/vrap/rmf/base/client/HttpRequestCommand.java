
package io.vrap.rmf.base.client;

import tools.jackson.core.type.TypeReference;

public interface HttpRequestCommand<TResult> extends CreateHttpRequestCommand {
    TypeReference<TResult> resultType();
}
