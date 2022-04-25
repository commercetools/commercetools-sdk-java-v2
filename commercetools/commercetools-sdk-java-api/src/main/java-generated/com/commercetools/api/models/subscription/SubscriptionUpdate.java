
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
@JsonDeserialize(as = SubscriptionUpdateImpl.class)
public interface SubscriptionUpdate extends
        com.commercetools.api.models.ResourceUpdate<SubscriptionUpdate, SubscriptionUpdateAction, SubscriptionUpdateBuilder> {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<SubscriptionUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final SubscriptionUpdateAction... actions);

    public void setActions(final List<SubscriptionUpdateAction> actions);

    public static SubscriptionUpdate of() {
        return new SubscriptionUpdateImpl();
    }

    public static SubscriptionUpdate of(final SubscriptionUpdate template) {
        SubscriptionUpdateImpl instance = new SubscriptionUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static SubscriptionUpdateBuilder builder() {
        return SubscriptionUpdateBuilder.of();
    }

    public static SubscriptionUpdateBuilder builder(final SubscriptionUpdate template) {
        return SubscriptionUpdateBuilder.of(template);
    }

    default <T> T withSubscriptionUpdate(Function<SubscriptionUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SubscriptionUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SubscriptionUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<SubscriptionUpdate>";
            }
        };
    }
}
