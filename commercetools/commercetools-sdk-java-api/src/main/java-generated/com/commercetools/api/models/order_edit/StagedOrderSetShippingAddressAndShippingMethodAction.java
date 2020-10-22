package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetShippingAddressAndShippingMethodActionImpl.class)
public interface StagedOrderSetShippingAddressAndShippingMethodAction extends StagedOrderUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();
    
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodResourceIdentifier getShippingMethod();
    
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setAddress(final Address address);
    
    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);
    
    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static StagedOrderSetShippingAddressAndShippingMethodActionImpl of(){
        return new StagedOrderSetShippingAddressAndShippingMethodActionImpl();
    }
    

    public static StagedOrderSetShippingAddressAndShippingMethodActionImpl of(final StagedOrderSetShippingAddressAndShippingMethodAction template) {
        StagedOrderSetShippingAddressAndShippingMethodActionImpl instance = new StagedOrderSetShippingAddressAndShippingMethodActionImpl();
        instance.setAddress(template.getAddress());
        instance.setShippingMethod(template.getShippingMethod());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    default <T extends Accessor<StagedOrderSetShippingAddressAndShippingMethodAction>> T withStagedOrderSetShippingAddressAndShippingMethodAction(Function<StagedOrderSetShippingAddressAndShippingMethodAction, T> helper) {
        return helper.apply(this);
    }
}
