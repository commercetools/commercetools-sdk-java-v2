
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Shape of the value for cart discounts line item target.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeTargetLineItemsChangeValueImpl.class)
public interface ChangeTargetLineItemsChangeValue extends ChangeTargetChangeValue {

    String LINE_ITEMS = "lineItems";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    public void setPredicate(final String predicate);

    public static ChangeTargetLineItemsChangeValue of() {
        return new ChangeTargetLineItemsChangeValueImpl();
    }

    public static ChangeTargetLineItemsChangeValue of(final ChangeTargetLineItemsChangeValue template) {
        ChangeTargetLineItemsChangeValueImpl instance = new ChangeTargetLineItemsChangeValueImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    public static ChangeTargetLineItemsChangeValueBuilder builder() {
        return ChangeTargetLineItemsChangeValueBuilder.of();
    }

    public static ChangeTargetLineItemsChangeValueBuilder builder(final ChangeTargetLineItemsChangeValue template) {
        return ChangeTargetLineItemsChangeValueBuilder.of(template);
    }

    default <T> T withChangeTargetLineItemsChangeValue(Function<ChangeTargetLineItemsChangeValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTargetLineItemsChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTargetLineItemsChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTargetLineItemsChangeValue>";
            }
        };
    }
}
