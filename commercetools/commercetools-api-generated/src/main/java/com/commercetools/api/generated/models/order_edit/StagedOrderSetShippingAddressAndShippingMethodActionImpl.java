package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetShippingAddressAndShippingMethodActionImpl implements StagedOrderSetShippingAddressAndShippingMethodAction {

   private String action;
   
   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   private com.commercetools.api.generated.models.common.Address address;
   
   private com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

   @JsonCreator
   StagedOrderSetShippingAddressAndShippingMethodActionImpl(@JsonProperty("externalTaxRate") final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate, @JsonProperty("address") final com.commercetools.api.generated.models.common.Address address, @JsonProperty("shippingMethod") final com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
      this.externalTaxRate = externalTaxRate;
      this.address = address;
      this.shippingMethod = shippingMethod;
      this.action = "setShippingAddressAndShippingMethod";
   }
   public StagedOrderSetShippingAddressAndShippingMethodActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }
   
   
   public com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod(){
      return this.shippingMethod;
   }

   public void setExternalTaxRate(final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate){
      this.externalTaxRate = externalTaxRate;
   }
   
   public void setAddress(final com.commercetools.api.generated.models.common.Address address){
      this.address = address;
   }
   
   public void setShippingMethod(final com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod){
      this.shippingMethod = shippingMethod;
   }

}