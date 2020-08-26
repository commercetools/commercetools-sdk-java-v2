package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodChangeNameActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShippingMethodChangeNameActionImpl.class)
public interface ShippingMethodChangeNameAction extends ShippingMethodUpdateAction {

    
    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setName(final String name);

    public static ShippingMethodChangeNameActionImpl of(){
        return new ShippingMethodChangeNameActionImpl();
    }
    

    public static ShippingMethodChangeNameActionImpl of(final ShippingMethodChangeNameAction template) {
        ShippingMethodChangeNameActionImpl instance = new ShippingMethodChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

}
