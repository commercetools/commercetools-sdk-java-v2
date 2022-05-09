
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceChangeValueActionImpl.class, name = StandalonePriceChangeValueAction.CHANGE_VALUE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceSetCustomFieldActionImpl.class, name = StandalonePriceSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceSetCustomTypeActionImpl.class, name = StandalonePriceSetCustomTypeAction.SET_CUSTOM_TYPE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = StandalonePriceUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = StandalonePriceUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface StandalonePriceUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<StandalonePriceUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.standalone_price.StandalonePriceChangeValueActionBuilder changeValueBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceChangeValueActionBuilder.of();
    }

    public static com.commercetools.api.models.standalone_price.StandalonePriceSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceSetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.standalone_price.StandalonePriceSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceSetCustomTypeActionBuilder.of();
    }

    default <T> T withStandalonePriceUpdateAction(Function<StandalonePriceUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceUpdateAction>";
            }
        };
    }
}
