
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Shape of the value for cart discounts line item and custom line items target.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeTargetCustomLineItemsChangeValueImpl.class)
public interface ChangeTargetCustomLineItemsChangeValue extends ChangeTargetChangeValue {

    String CUSTOM_LINE_ITEMS = "customLineItems";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    public void setPredicate(final String predicate);

    public static ChangeTargetCustomLineItemsChangeValue of() {
        return new ChangeTargetCustomLineItemsChangeValueImpl();
    }

    public static ChangeTargetCustomLineItemsChangeValue of(final ChangeTargetCustomLineItemsChangeValue template) {
        ChangeTargetCustomLineItemsChangeValueImpl instance = new ChangeTargetCustomLineItemsChangeValueImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    public static ChangeTargetCustomLineItemsChangeValueBuilder builder() {
        return ChangeTargetCustomLineItemsChangeValueBuilder.of();
    }

    public static ChangeTargetCustomLineItemsChangeValueBuilder builder(
            final ChangeTargetCustomLineItemsChangeValue template) {
        return ChangeTargetCustomLineItemsChangeValueBuilder.of(template);
    }

    default <T> T withChangeTargetCustomLineItemsChangeValue(
            Function<ChangeTargetCustomLineItemsChangeValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTargetCustomLineItemsChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTargetCustomLineItemsChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTargetCustomLineItemsChangeValue>";
            }
        };
    }
}
