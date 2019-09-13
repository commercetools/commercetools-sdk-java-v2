package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.common.Address;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
      instance.setExternalTaxRate(template.getExternalTaxRate());
      instance.setAddress(template.getAddress());
      instance.setShippingMethod(template.getShippingMethod());
      return instance;
   }

}