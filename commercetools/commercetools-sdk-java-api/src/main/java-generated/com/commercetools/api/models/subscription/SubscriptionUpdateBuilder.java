
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SubscriptionUpdateBuilder {

    private Long version;

    private java.util.List<com.commercetools.api.models.subscription.SubscriptionUpdateAction> actions;

    public SubscriptionUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public SubscriptionUpdateBuilder actions(
            final com.commercetools.api.models.subscription.SubscriptionUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public SubscriptionUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.subscription.SubscriptionUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.subscription.SubscriptionUpdateAction> getActions() {
        return this.actions;
    }

    public SubscriptionUpdate build() {
        return new SubscriptionUpdateImpl(version, actions);
    }

    public static SubscriptionUpdateBuilder of() {
        return new SubscriptionUpdateBuilder();
    }

    public static SubscriptionUpdateBuilder of(final SubscriptionUpdate template) {
        SubscriptionUpdateBuilder builder = new SubscriptionUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
