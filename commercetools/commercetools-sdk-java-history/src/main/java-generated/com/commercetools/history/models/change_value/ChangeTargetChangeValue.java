
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeTargetCustomLineItemsChangeValueImpl.class, name = ChangeTargetCustomLineItemsChangeValue.CUSTOM_LINE_ITEMS),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeTargetLineItemsChangeValueImpl.class, name = ChangeTargetLineItemsChangeValue.LINE_ITEMS),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeTargetMultiBuyCustomLineItemsChangeValueImpl.class, name = ChangeTargetMultiBuyCustomLineItemsChangeValue.MULTI_BUY_CUSTOM_LINE_ITEMS),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeTargetMultiBuyLineItemsChangeValueImpl.class, name = ChangeTargetMultiBuyLineItemsChangeValue.MULTI_BUY_LINE_ITEMS),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeTargetShippingChangeValueImpl.class, name = ChangeTargetShippingChangeValue.SHIPPING) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ChangeTargetChangeValueImpl.class, visible = true)
@JsonDeserialize(as = ChangeTargetChangeValueImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ChangeTargetChangeValue {

    @NotNull
    @JsonProperty("type")
    public String getType();

    public static com.commercetools.history.models.change_value.ChangeTargetCustomLineItemsChangeValueBuilder customLineItemsBuilder() {
        return com.commercetools.history.models.change_value.ChangeTargetCustomLineItemsChangeValueBuilder.of();
    }

    public static com.commercetools.history.models.change_value.ChangeTargetLineItemsChangeValueBuilder lineItemsBuilder() {
        return com.commercetools.history.models.change_value.ChangeTargetLineItemsChangeValueBuilder.of();
    }

    public static com.commercetools.history.models.change_value.ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder multiBuyCustomLineItemsBuilder() {
        return com.commercetools.history.models.change_value.ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder.of();
    }

    public static com.commercetools.history.models.change_value.ChangeTargetMultiBuyLineItemsChangeValueBuilder multiBuyLineItemsBuilder() {
        return com.commercetools.history.models.change_value.ChangeTargetMultiBuyLineItemsChangeValueBuilder.of();
    }

    public static com.commercetools.history.models.change_value.ChangeTargetShippingChangeValueBuilder shippingBuilder() {
        return com.commercetools.history.models.change_value.ChangeTargetShippingChangeValueBuilder.of();
    }

    default <T> T withChangeTargetChangeValue(Function<ChangeTargetChangeValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTargetChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTargetChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTargetChangeValue>";
            }
        };
    }
}
