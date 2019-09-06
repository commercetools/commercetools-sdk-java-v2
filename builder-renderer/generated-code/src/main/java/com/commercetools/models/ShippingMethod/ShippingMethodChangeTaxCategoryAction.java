package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier;
import java.lang.String;
import com.commercetools.models.ShippingMethod.ShippingMethodChangeTaxCategoryActionImpl;

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
@JsonDeserialize(as = ShippingMethodChangeTaxCategoryActionImpl.class)
public interface ShippingMethodChangeTaxCategoryAction extends ShippingMethodUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("taxCategory")
   public TaxCategoryResourceIdentifier getTaxCategory();

   public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);
   
   public static ShippingMethodChangeTaxCategoryActionImpl of(){
      return new ShippingMethodChangeTaxCategoryActionImpl();
   }
   

   public static ShippingMethodChangeTaxCategoryActionImpl of(final ShippingMethodChangeTaxCategoryAction template) {
      ShippingMethodChangeTaxCategoryActionImpl instance = new ShippingMethodChangeTaxCategoryActionImpl();
      instance.setTaxCategory(template.getTaxCategory());
      return instance;
   }

}