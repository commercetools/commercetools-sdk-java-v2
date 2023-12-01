
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMessagesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyMessagesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMessagesGet get() {
        return new ByProjectKeyMessagesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyMessagesHead head() {
        return new ByProjectKeyMessagesHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyMessagesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyMessagesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

}
