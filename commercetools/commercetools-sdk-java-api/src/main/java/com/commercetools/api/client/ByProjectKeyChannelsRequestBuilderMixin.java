
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.channel.Channel;
import com.commercetools.api.models.channel.ChannelDraft;
import com.commercetools.api.models.channel.ChannelDraftBuilder;
import com.commercetools.api.models.channel.ChannelUpdate;
import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.channel.ChannelUpdateActionBuilder;

public interface ByProjectKeyChannelsRequestBuilderMixin {
    public ByProjectKeyChannelsByIDRequestBuilder withId(String ID);

    public ByProjectKeyChannelsPost post(ChannelDraft channelDraft);

    public default ByProjectKeyChannelsByIDPost update(Versioned<Channel> channel, List<ChannelUpdateAction> actions) {
        return withId(channel.getId())
                .post(builder -> ChannelUpdate.builder().version(channel.getVersion()).actions(actions));
    }

    public default ByProjectKeyChannelsByIDPost update(Versioned<Channel> channel,
            UnaryOperator<UpdateActionBuilder<ChannelUpdateAction, ChannelUpdateActionBuilder>> op) {
        return withId(channel.getId()).post(builder -> ChannelUpdate.builder()
                .version(channel.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(ChannelUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<ChannelUpdateAction, ChannelUpdateActionBuilder, ByProjectKeyChannelsByIDPost> update(
            Versioned<Channel> channel) {
        return builder -> withId(channel.getId()).post(b -> ChannelUpdate.builder()
                .version(channel.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(ChannelUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyChannelsByIDDelete delete(Versioned<Channel> channel) {
        return withId(channel.getId()).delete().withVersion(channel.getVersion());
    }

    public default ByProjectKeyChannelsPost create(ChannelDraft channelDraft) {
        return post(channelDraft);
    }

    public default ByProjectKeyChannelsPost create(UnaryOperator<ChannelDraftBuilder> op) {
        return post(op.apply(ChannelDraftBuilder.of()).build());
    }
}
