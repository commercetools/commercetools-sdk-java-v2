package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.cart.CartSetShippingMethodActionImpl;

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
@JsonDeserialize(as = CartSetShippingMethodActionImpl.class)
public interface CartSetShippingMethodAction extends CartUpdateAction {

    
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodResourceIdentifier getShippingMethod();
    
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);
    
    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static CartSetShippingMethodActionImpl of(){
        return new CartSetShippingMethodActionImpl();
    }
    

    public static CartSetShippingMethodActionImpl of(final CartSetShippingMethodAction template) {
        CartSetShippingMethodActionImpl instance = new CartSetShippingMethodActionImpl();
        instance.setShippingMethod(template.getShippingMethod());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

}
