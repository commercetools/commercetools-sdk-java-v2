
package com.commercetools.api.models.subscription;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SubscriptionSetChangesActionBuilder {

    @Nullable
    private java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes;

    public SubscriptionSetChangesActionBuilder changes(
            @Nullable final com.commercetools.api.models.subscription.ChangeSubscription... changes) {
        this.changes = new ArrayList<>(Arrays.asList(changes));
        return this;
    }

    public SubscriptionSetChangesActionBuilder changes(
            @Nullable final java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes) {
        this.changes = changes;
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> getChanges() {
        return this.changes;
    }

    public SubscriptionSetChangesAction build() {
        return new SubscriptionSetChangesActionImpl(changes);
    }

    public static SubscriptionSetChangesActionBuilder of() {
        return new SubscriptionSetChangesActionBuilder();
    }

    public static SubscriptionSetChangesActionBuilder of(final SubscriptionSetChangesAction template) {
        SubscriptionSetChangesActionBuilder builder = new SubscriptionSetChangesActionBuilder();
        builder.changes = template.getChanges();
        return builder;
    }

}
