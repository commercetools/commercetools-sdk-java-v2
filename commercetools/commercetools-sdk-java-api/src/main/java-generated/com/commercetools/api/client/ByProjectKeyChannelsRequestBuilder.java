
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyChannelsRequestBuilder implements ByProjectKeyChannelsRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyChannelsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyChannelsGet get() {
        return new ByProjectKeyChannelsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyChannelsHead head() {
        return new ByProjectKeyChannelsHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyChannelsPost post(com.commercetools.api.models.channel.ChannelDraft channelDraft) {
        return new ByProjectKeyChannelsPost(apiHttpClient, projectKey, channelDraft);
    }

    public ByProjectKeyChannelsPostString post(final String channelDraft) {
        return new ByProjectKeyChannelsPostString(apiHttpClient, projectKey, channelDraft);
    }

    public ByProjectKeyChannelsPost post(UnaryOperator<com.commercetools.api.models.channel.ChannelDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.channel.ChannelDraftBuilder.of()).build());
    }

    public ByProjectKeyChannelsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyChannelsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

}
