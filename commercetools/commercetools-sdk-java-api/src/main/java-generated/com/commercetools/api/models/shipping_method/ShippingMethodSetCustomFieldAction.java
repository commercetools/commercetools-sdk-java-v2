
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

    @NotNull
    @JsonProperty("name")
    public String getName();

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
}
