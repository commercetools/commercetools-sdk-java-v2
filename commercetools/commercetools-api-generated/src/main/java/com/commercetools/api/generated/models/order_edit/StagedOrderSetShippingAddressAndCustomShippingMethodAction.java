package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl;

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
@JsonDeserialize(as = StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl.class)
public interface StagedOrderSetShippingAddressAndCustomShippingMethodAction extends StagedOrderUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("address")
   public Address getAddress();
   
   @NotNull
   @JsonProperty("shippingMethodName")
   public String getShippingMethodName();
   
   @NotNull
   @Valid
   @JsonProperty("shippingRate")
   public ShippingRateDraft getShippingRate();
   
   @Valid
   @JsonProperty("taxCategory")
   public TaxCategoryResourceIdentifier getTaxCategory();
   
   @Valid
   @JsonProperty("externalTaxRate")
   public ExternalTaxRateDraft getExternalTaxRate();

   public void setAddress(final Address address);
   
   public void setShippingMethodName(final String shippingMethodName);
   
   public void setShippingRate(final ShippingRateDraft shippingRate);
   
   public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);
   
   public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);
   
   public static StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl of(){
      return new StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl();
   }
   

   public static StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl of(final StagedOrderSetShippingAddressAndCustomShippingMethodAction template) {
      StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl instance = new StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl();
      instance.setShippingRate(template.getShippingRate());
      instance.setExternalTaxRate(template.getExternalTaxRate());
      instance.setAddress(template.getAddress());
      instance.setShippingMethodName(template.getShippingMethodName());
      instance.setTaxCategory(template.getTaxCategory());
      return instance;
   }

}