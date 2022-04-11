
package com.commercetools.api.models.channel;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ChannelUpdateBuilder implements Builder<ChannelUpdate> {

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

    public ChannelUpdateBuilder plusActions(final com.commercetools.api.models.channel.ChannelUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    public ChannelUpdateBuilder plusActions(
            Function<com.commercetools.api.models.channel.ChannelUpdateActionBuilder, Builder<? extends com.commercetools.api.models.channel.ChannelUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.channel.ChannelUpdateActionBuilder.of()).build());
        return this;
    }

    public ChannelUpdateBuilder withActions(
            Function<com.commercetools.api.models.channel.ChannelUpdateActionBuilder, Builder<? extends com.commercetools.api.models.channel.ChannelUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.channel.ChannelUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.channel.ChannelUpdateAction> getActions() {
        return this.actions;
    }

    public ChannelUpdate build() {
        Objects.requireNonNull(version, ChannelUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ChannelUpdate.class + ": actions is missing");
        return new ChannelUpdateImpl(version, actions);
    }

    /**
     * builds ChannelUpdate without checking for non null required values
     */
    public ChannelUpdate buildUnchecked() {
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
