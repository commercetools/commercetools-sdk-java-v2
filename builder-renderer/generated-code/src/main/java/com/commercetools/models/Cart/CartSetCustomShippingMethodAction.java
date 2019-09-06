package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ExternalTaxRateDraft;
import com.commercetools.models.ShippingMethod.ShippingRateDraft;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Cart.CartSetCustomShippingMethodActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartSetCustomShippingMethodActionImpl.class)
public interface CartSetCustomShippingMethodAction extends CartUpdateAction {

   
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

   public void setShippingMethodName(final String shippingMethodName);
   
   public void setShippingRate(final ShippingRateDraft shippingRate);
   
   public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);
   
   public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);
   
   public static CartSetCustomShippingMethodActionImpl of(){
      return new CartSetCustomShippingMethodActionImpl();
   }
   

   public static CartSetCustomShippingMethodActionImpl of(final CartSetCustomShippingMethodAction template) {
      CartSetCustomShippingMethodActionImpl instance = new CartSetCustomShippingMethodActionImpl();
      instance.setShippingRate(template.getShippingRate());
      instance.setExternalTaxRate(template.getExternalTaxRate());
      instance.setShippingMethodName(template.getShippingMethodName());
      instance.setTaxCategory(template.getTaxCategory());
      return instance;
   }

}