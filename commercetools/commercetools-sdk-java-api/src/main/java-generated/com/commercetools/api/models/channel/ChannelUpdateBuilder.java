
package com.commercetools.api.models.channel;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChannelUpdateBuilder {

    private Long version;

    private java.util.List<com.commercetools.api.models.channel.ChannelUpdateAction> actions;

    public ChannelUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ChannelUpdateBuilder actions(final com.commercetools.api.models.channel.ChannelUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public ChannelUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.channel.ChannelUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.channel.ChannelUpdateAction> getActions() {
        return this.actions;
    }

    public ChannelUpdate build() {
        return new ChannelUpdateImpl(version, actions);
    }

    public static ChannelUpdateBuilder of() {
        return new ChannelUpdateBuilder();
    }

    public static ChannelUpdateBuilder of(final ChannelUpdate template) {
        ChannelUpdateBuilder builder = new ChannelUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
