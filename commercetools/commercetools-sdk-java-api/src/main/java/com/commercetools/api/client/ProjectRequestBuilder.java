
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;

public interface ProjectRequestBuilder<TMethod> {
    public TMethod build(ApiHttpClient client, String projectKey);
}
