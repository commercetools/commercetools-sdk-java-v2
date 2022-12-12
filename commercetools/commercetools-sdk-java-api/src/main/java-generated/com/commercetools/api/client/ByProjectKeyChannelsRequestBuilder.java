
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyChannelsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyChannelsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyChannelsGet get() {
        return new ByProjectKeyChannelsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyChannelsPost post(com.commercetools.api.models.channel.ChannelDraft channelDraft) {
        return new ByProjectKeyChannelsPost(apiHttpClient, projectKey, channelDraft);
    }

    public ByProjectKeyChannelsPost post(UnaryOperator<com.commercetools.api.models.channel.ChannelDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.channel.ChannelDraftBuilder.of()).build());
    }

    public ByProjectKeyChannelsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyChannelsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyChannelsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.channel.Channel> channel,
            java.util.List<com.commercetools.api.models.channel.ChannelUpdateAction> actions) {
        return withId(channel.getId()).post(builder -> com.commercetools.api.models.channel.ChannelUpdate.builder()
                .version(channel.getVersion())
                .actions(actions));
    }

    public ByProjectKeyChannelsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.channel.Channel> channel,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.channel.ChannelUpdateAction, com.commercetools.api.models.channel.ChannelUpdateActionBuilder>> op) {
        return withId(channel.getId()).post(builder -> com.commercetools.api.models.channel.ChannelUpdate.builder()
                .version(channel.getVersion())
                .actions(op.apply(UpdateActionBuilder
                        .of(com.commercetools.api.models.channel.ChannelUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.channel.ChannelUpdateAction, com.commercetools.api.models.channel.ChannelUpdateActionBuilder, ByProjectKeyChannelsByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.channel.Channel> channel) {
        return builder -> withId(channel.getId()).post(b -> com.commercetools.api.models.channel.ChannelUpdate.builder()
                .version(channel.getVersion())
                .actions(builder.apply(UpdateActionBuilder
                        .of(com.commercetools.api.models.channel.ChannelUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyChannelsByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.channel.Channel> channel) {
        return withId(channel.getId()).delete().withVersion(channel.getVersion());
    }

    public ByProjectKeyChannelsPost create(com.commercetools.api.models.channel.ChannelDraft channelDraft) {
        return post(channelDraft);
    }

    public ByProjectKeyChannelsPost create(UnaryOperator<com.commercetools.api.models.channel.ChannelDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.channel.ChannelDraftBuilder.of()).build());
    }

}
