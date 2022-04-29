
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Shape of the value for cart discounts shipping target.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeTargetShippingChangeValueImpl.class)
public interface ChangeTargetShippingChangeValue extends ChangeTargetChangeValue {

    String SHIPPING = "shipping";

    @NotNull
    @JsonProperty("type")
    public String getType();

    public static ChangeTargetShippingChangeValue of() {
        return new ChangeTargetShippingChangeValueImpl();
    }

    public static ChangeTargetShippingChangeValue of(final ChangeTargetShippingChangeValue template) {
        ChangeTargetShippingChangeValueImpl instance = new ChangeTargetShippingChangeValueImpl();
        return instance;
    }

    public static ChangeTargetShippingChangeValueBuilder builder() {
        return ChangeTargetShippingChangeValueBuilder.of();
    }

    public static ChangeTargetShippingChangeValueBuilder builder(final ChangeTargetShippingChangeValue template) {
        return ChangeTargetShippingChangeValueBuilder.of(template);
    }

    default <T> T withChangeTargetShippingChangeValue(Function<ChangeTargetShippingChangeValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTargetShippingChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTargetShippingChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTargetShippingChangeValue>";
            }
        };
    }
}
