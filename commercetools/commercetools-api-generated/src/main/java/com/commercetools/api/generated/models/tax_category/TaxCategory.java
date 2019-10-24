package com.commercetools.api.generated.models.tax_category;

import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.tax_category.TaxRate;
import com.commercetools.api.generated.models.tax_category.TaxCategoryImpl;

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