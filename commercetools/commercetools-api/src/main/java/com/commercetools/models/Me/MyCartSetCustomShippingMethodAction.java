package com.commercetools.models.me;

import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.me.MyCartUpdateAction;
import com.commercetools.models.shipping_method.ShippingRateDraft;
import com.commercetools.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.models.me.MyCartSetCustomShippingMethodActionImpl;

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
@JsonDeserialize(as = MyCartSetCustomShippingMethodActionImpl.class)
public interface MyCartSetCustomShippingMethodAction extends MyCartUpdateAction {

   
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
   
   public static MyCartSetCustomShippingMethodActionImpl of(){
      return new MyCartSetCustomShippingMethodActionImpl();
   }
   

   public static MyCartSetCustomShippingMethodActionImpl of(final MyCartSetCustomShippingMethodAction template) {
      MyCartSetCustomShippingMethodActionImpl instance = new MyCartSetCustomShippingMethodActionImpl();
      instance.setShippingRate(template.getShippingRate());
      instance.setExternalTaxRate(template.getExternalTaxRate());
      instance.setShippingMethodName(template.getShippingMethodName());
      instance.setTaxCategory(template.getTaxCategory());
      return instance;
   }

}