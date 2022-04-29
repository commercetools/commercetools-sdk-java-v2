
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetLocalizedNameActionImpl.class)
public interface ShippingMethodSetLocalizedNameAction extends ShippingMethodUpdateAction {

    String SET_LOCALIZED_NAME = "setLocalizedName";

    @Valid
    @JsonProperty("localizedName")
    public LocalizedString getLocalizedName();

    public void setLocalizedName(final LocalizedString localizedName);

    public static ShippingMethodSetLocalizedNameAction of() {
        return new ShippingMethodSetLocalizedNameActionImpl();
    }

    public static ShippingMethodSetLocalizedNameAction of(final ShippingMethodSetLocalizedNameAction template) {
        ShippingMethodSetLocalizedNameActionImpl instance = new ShippingMethodSetLocalizedNameActionImpl();
        instance.setLocalizedName(template.getLocalizedName());
        return instance;
    }

    public static ShippingMethodSetLocalizedNameActionBuilder builder() {
        return ShippingMethodSetLocalizedNameActionBuilder.of();
    }

    public static ShippingMethodSetLocalizedNameActionBuilder builder(
            final ShippingMethodSetLocalizedNameAction template) {
        return ShippingMethodSetLocalizedNameActionBuilder.of(template);
    }

    default <T> T withShippingMethodSetLocalizedNameAction(Function<ShippingMethodSetLocalizedNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetLocalizedNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetLocalizedNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetLocalizedNameAction>";
            }
        };
    }
}
