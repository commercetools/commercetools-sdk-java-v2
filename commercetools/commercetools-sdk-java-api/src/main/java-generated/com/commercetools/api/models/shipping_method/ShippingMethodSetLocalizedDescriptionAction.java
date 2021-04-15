package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetLocalizedDescriptionActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShippingMethodSetLocalizedDescriptionActionImpl.class)
public interface ShippingMethodSetLocalizedDescriptionAction extends ShippingMethodUpdateAction {

    String SET_LOCALIZED_DESCRIPTION = "setLocalizedDescription";

    
    @Valid
    @JsonProperty("localizedDescription")
    public LocalizedString getLocalizedDescription();

    
    public void setLocalizedDescription(final LocalizedString localizedDescription);
    

    public static ShippingMethodSetLocalizedDescriptionAction of(){
        return new ShippingMethodSetLocalizedDescriptionActionImpl();
    }
    

    public static ShippingMethodSetLocalizedDescriptionAction of(final ShippingMethodSetLocalizedDescriptionAction template) {
        ShippingMethodSetLocalizedDescriptionActionImpl instance = new ShippingMethodSetLocalizedDescriptionActionImpl();
        instance.setLocalizedDescription(template.getLocalizedDescription());
        return instance;
    }

    public static ShippingMethodSetLocalizedDescriptionActionBuilder builder(){
        return ShippingMethodSetLocalizedDescriptionActionBuilder.of();
    }
    
    public static ShippingMethodSetLocalizedDescriptionActionBuilder builder(final ShippingMethodSetLocalizedDescriptionAction template){
        return ShippingMethodSetLocalizedDescriptionActionBuilder.of(template);
    }
    

    default <T> T withShippingMethodSetLocalizedDescriptionAction(Function<ShippingMethodSetLocalizedDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
