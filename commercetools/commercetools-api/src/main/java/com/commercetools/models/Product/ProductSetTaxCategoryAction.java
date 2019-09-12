package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Product.ProductSetTaxCategoryActionImpl;

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
@JsonDeserialize(as = ProductSetTaxCategoryActionImpl.class)
public interface ProductSetTaxCategoryAction extends ProductUpdateAction {

   
   @Valid
   @JsonProperty("taxCategory")
   public TaxCategoryResourceIdentifier getTaxCategory();

   public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);
   
   public static ProductSetTaxCategoryActionImpl of(){
      return new ProductSetTaxCategoryActionImpl();
   }
   

   public static ProductSetTaxCategoryActionImpl of(final ProductSetTaxCategoryAction template) {
      ProductSetTaxCategoryActionImpl instance = new ProductSetTaxCategoryActionImpl();
      instance.setTaxCategory(template.getTaxCategory());
      return instance;
   }

}