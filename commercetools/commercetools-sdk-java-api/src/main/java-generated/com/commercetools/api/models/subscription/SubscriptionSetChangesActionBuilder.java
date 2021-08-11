
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SubscriptionSetChangesActionBuilder implements Builder<SubscriptionSetChangesAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes;

    public SubscriptionSetChangesActionBuilder changes(
            @Nullable final com.commercetools.api.models.subscription.ChangeSubscription... changes) {
        this.changes = new ArrayList<>(Arrays.asList(changes));
        return this;
    }

    public SubscriptionSetChangesActionBuilder withChanges(
            Function<com.commercetools.api.models.subscription.ChangeSubscriptionBuilder, com.commercetools.api.models.subscription.ChangeSubscriptionBuilder> builder) {
        this.changes = new ArrayList<>();
        this.changes
                .add(builder.apply(com.commercetools.api.models.subscription.ChangeSubscriptionBuilder.of()).build());
        return this;
    }

    public SubscriptionSetChangesActionBuilder plusChanges(
            Function<com.commercetools.api.models.subscription.ChangeSubscriptionBuilder, com.commercetools.api.models.subscription.ChangeSubscriptionBuilder> builder) {
        if (this.changes == null) {
            this.changes = new ArrayList<>();
        }
        this.changes
                .add(builder.apply(com.commercetools.api.models.subscription.ChangeSubscriptionBuilder.of()).build());
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

    /**
     * builds SubscriptionSetChangesAction without checking for non null required values
     */
    public SubscriptionSetChangesAction buildUnchecked() {
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
