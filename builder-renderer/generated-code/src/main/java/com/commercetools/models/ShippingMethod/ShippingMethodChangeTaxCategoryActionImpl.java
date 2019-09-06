package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier;
import java.lang.String;
import javax.annotation.Generated;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingMethodChangeTaxCategoryActionImpl implements ShippingMethodChangeTaxCategoryAction {

   private java.lang.String action;
   
   private com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory;

   @JsonCreator
   ShippingMethodChangeTaxCategoryActionImpl(@JsonProperty("taxCategory") final com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      this.action = "changeTaxCategory";
   }
   public ShippingMethodChangeTaxCategoryActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public void setTaxCategory(final com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory){
      this.taxCategory = taxCategory;
   }

}