
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyChannelsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyChannelsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyChannelsKeyByKeyGet get() {
        return new ByProjectKeyChannelsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyChannelsKeyByKeyHead head() {
        return new ByProjectKeyChannelsKeyByKeyHead(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyChannelsKeyByKeyPost post(com.commercetools.api.models.channel.ChannelUpdate channelUpdate) {
        return new ByProjectKeyChannelsKeyByKeyPost(apiHttpClient, projectKey, key, channelUpdate);
    }

    public ByProjectKeyChannelsKeyByKeyPostString post(final String channelUpdate) {
        return new ByProjectKeyChannelsKeyByKeyPostString(apiHttpClient, projectKey, key, channelUpdate);
    }

    public ByProjectKeyChannelsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.channel.ChannelUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.channel.ChannelUpdateBuilder.of()).build());
    }

    public ByProjectKeyChannelsKeyByKeyDelete delete() {
        return new ByProjectKeyChannelsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyChannelsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
