
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeSubscriptionImpl.class)
public interface ChangeSubscription {

    @NotNull
    @JsonProperty("resourceTypeId")
    public String getResourceTypeId();

    public void setResourceTypeId(final String resourceTypeId);

    public static ChangeSubscription of() {
        return new ChangeSubscriptionImpl();
    }

    public static ChangeSubscription of(final ChangeSubscription template) {
        ChangeSubscriptionImpl instance = new ChangeSubscriptionImpl();
        instance.setResourceTypeId(template.getResourceTypeId());
        return instance;
    }

    public static ChangeSubscriptionBuilder builder() {
        return ChangeSubscriptionBuilder.of();
    }

    public static ChangeSubscriptionBuilder builder(final ChangeSubscription template) {
        return ChangeSubscriptionBuilder.of(template);
    }

    default <T> T withChangeSubscription(Function<ChangeSubscription, T> helper) {
        return helper.apply(this);
    }
}
