package com.commercetools.api.generated.models.tax_category;

import com.commercetools.api.generated.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.generated.models.tax_category.TaxCategorySetKeyActionImpl;

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
@JsonDeserialize(as = TaxCategorySetKeyActionImpl.class)
public interface TaxCategorySetKeyAction extends TaxCategoryUpdateAction {

   
   
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static TaxCategorySetKeyActionImpl of(){
      return new TaxCategorySetKeyActionImpl();
   }
   

   public static TaxCategorySetKeyActionImpl of(final TaxCategorySetKeyAction template) {
      TaxCategorySetKeyActionImpl instance = new TaxCategorySetKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}