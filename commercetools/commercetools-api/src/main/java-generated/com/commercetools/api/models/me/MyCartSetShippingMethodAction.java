package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.me.MyCartSetShippingMethodActionImpl;

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
@JsonDeserialize(as = MyCartSetShippingMethodActionImpl.class)
public interface MyCartSetShippingMethodAction extends MyCartUpdateAction {

    
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodResourceIdentifier getShippingMethod();
    
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);
    
    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static MyCartSetShippingMethodActionImpl of(){
        return new MyCartSetShippingMethodActionImpl();
    }
    

    public static MyCartSetShippingMethodActionImpl of(final MyCartSetShippingMethodAction template) {
        MyCartSetShippingMethodActionImpl instance = new MyCartSetShippingMethodActionImpl();
        instance.setShippingMethod(template.getShippingMethod());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

}
