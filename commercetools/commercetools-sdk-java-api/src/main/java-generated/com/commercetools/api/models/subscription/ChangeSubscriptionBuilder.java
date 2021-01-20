
package com.commercetools.api.models.subscription;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.subscription.ChangeSubscription;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeSubscriptionBuilder {

    private String resourceTypeId;

    public ChangeSubscriptionBuilder resourceTypeId(final String resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
        return this;
    }

    public String getResourceTypeId() {
        return this.resourceTypeId;
    }

    public ChangeSubscription build() {
        return new ChangeSubscriptionImpl(resourceTypeId);
    }

    public static ChangeSubscriptionBuilder of() {
        return new ChangeSubscriptionBuilder();
    }

    public static ChangeSubscriptionBuilder of(final ChangeSubscription template) {
        ChangeSubscriptionBuilder builder = new ChangeSubscriptionBuilder();
        builder.resourceTypeId = template.getResourceTypeId();
        return builder;
    }

}
