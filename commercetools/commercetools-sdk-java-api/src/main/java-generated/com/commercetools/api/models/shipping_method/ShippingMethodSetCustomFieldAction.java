
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetCustomFieldActionImpl.class)
public interface ShippingMethodSetCustomFieldAction extends ShippingMethodUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    /**
    *  <p>Name of the <a href="/../api/projects/custom-fields">Custom Field</a>.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists.
    *  Trying to remove a field that does not exist will fail with an <a href="/../api/errors#general-400-invalid-operation">InvalidOperation</a> error.
    *  If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
    */

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static ShippingMethodSetCustomFieldAction of() {
        return new ShippingMethodSetCustomFieldActionImpl();
    }

    public static ShippingMethodSetCustomFieldAction of(final ShippingMethodSetCustomFieldAction template) {
        ShippingMethodSetCustomFieldActionImpl instance = new ShippingMethodSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static ShippingMethodSetCustomFieldActionBuilder builder() {
        return ShippingMethodSetCustomFieldActionBuilder.of();
    }

    public static ShippingMethodSetCustomFieldActionBuilder builder(final ShippingMethodSetCustomFieldAction template) {
        return ShippingMethodSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withShippingMethodSetCustomFieldAction(Function<ShippingMethodSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetCustomFieldAction>";
            }
        };
    }
}
