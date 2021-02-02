
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SubscriptionChangeDestinationActionImpl.class)
public interface SubscriptionChangeDestinationAction extends SubscriptionUpdateAction {

    String CHANGE_DESTINATION = "changeDestination";

    @NotNull
    @Valid
    @JsonProperty("destination")
    public Destination getDestination();

    public void setDestination(final Destination destination);

    public static SubscriptionChangeDestinationAction of() {
        return new SubscriptionChangeDestinationActionImpl();
    }

    public static SubscriptionChangeDestinationAction of(final SubscriptionChangeDestinationAction template) {
        SubscriptionChangeDestinationActionImpl instance = new SubscriptionChangeDestinationActionImpl();
        instance.setDestination(template.getDestination());
        return instance;
    }

    public static SubscriptionChangeDestinationActionBuilder builder() {
        return SubscriptionChangeDestinationActionBuilder.of();
    }

    public static SubscriptionChangeDestinationActionBuilder builder(
            final SubscriptionChangeDestinationAction template) {
        return SubscriptionChangeDestinationActionBuilder.of(template);
    }

    default <T> T withSubscriptionChangeDestinationAction(Function<SubscriptionChangeDestinationAction, T> helper) {
        return helper.apply(this);
    }
}
