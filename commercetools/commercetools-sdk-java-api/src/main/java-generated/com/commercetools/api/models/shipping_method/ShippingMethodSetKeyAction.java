
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetKeyActionImpl.class)
public interface ShippingMethodSetKeyAction extends ShippingMethodUpdateAction {

    String SET_KEY = "setKey";

    /**
    *  <p>If <code>key</code> is absent or <code>null</code>, it is removed if it exists.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ShippingMethodSetKeyAction of() {
        return new ShippingMethodSetKeyActionImpl();
    }

    public static ShippingMethodSetKeyAction of(final ShippingMethodSetKeyAction template) {
        ShippingMethodSetKeyActionImpl instance = new ShippingMethodSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ShippingMethodSetKeyActionBuilder builder() {
        return ShippingMethodSetKeyActionBuilder.of();
    }

    public static ShippingMethodSetKeyActionBuilder builder(final ShippingMethodSetKeyAction template) {
        return ShippingMethodSetKeyActionBuilder.of(template);
    }

    default <T> T withShippingMethodSetKeyAction(Function<ShippingMethodSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetKeyAction>";
            }
        };
    }
}
