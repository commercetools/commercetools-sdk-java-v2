
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyChannelsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyChannelsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyChannelsByIDGet get() {
        return new ByProjectKeyChannelsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyChannelsByIDPost post(com.commercetools.api.models.channel.ChannelUpdate channelUpdate) {
        return new ByProjectKeyChannelsByIDPost(apiHttpClient, projectKey, ID, channelUpdate);
    }

    public ByProjectKeyChannelsByIDDelete delete() {
        return new ByProjectKeyChannelsByIDDelete(apiHttpClient, projectKey, ID);
    }

}
