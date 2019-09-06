package com.commercetools.models.TaxCategory;

import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.TaxCategory.TaxRate;
import java.lang.String;
import com.commercetools.models.TaxCategory.TaxCategoryImpl;

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
@JsonDeserialize(as = TaxCategoryImpl.class)
public interface TaxCategory extends LoggedResource {

   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("description")
   public String getDescription();
   
   @NotNull
   @Valid
   @JsonProperty("rates")
   public List<TaxRate> getRates();
   
   
   @JsonProperty("key")
   public String getKey();

   public void setName(final String name);
   
   public void setDescription(final String description);
   
   public void setRates(final List<TaxRate> rates);
   
   public void setKey(final String key);
   
   public static TaxCategoryImpl of(){
      return new TaxCategoryImpl();
   }
   

   public static TaxCategoryImpl of(final TaxCategory template) {
      TaxCategoryImpl instance = new TaxCategoryImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setRates(template.getRates());
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      instance.setKey(template.getKey());
      return instance;
   }

}