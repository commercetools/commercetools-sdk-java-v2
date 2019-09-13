package com.commercetools.models.tax_category;

import com.commercetools.models.tax_category.TaxCategoryUpdateAction;
import java.lang.String;
import com.commercetools.models.tax_category.TaxCategoryChangeNameActionImpl;

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
@JsonDeserialize(as = TaxCategoryChangeNameActionImpl.class)
public interface TaxCategoryChangeNameAction extends TaxCategoryUpdateAction {

   
   @NotNull
   @JsonProperty("name")
   public String getName();

   public void setName(final String name);
   
   public static TaxCategoryChangeNameActionImpl of(){
      return new TaxCategoryChangeNameActionImpl();
   }
   

   public static TaxCategoryChangeNameActionImpl of(final TaxCategoryChangeNameAction template) {
      TaxCategoryChangeNameActionImpl instance = new TaxCategoryChangeNameActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}