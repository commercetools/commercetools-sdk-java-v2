package com.commercetools.models.ShippingMethod;

import com.commercetools.models.Common.BaseResource;
import com.commercetools.models.ShippingMethod.ZoneRate;
import com.commercetools.models.TaxCategory.TaxCategoryReference;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.ShippingMethod.ShippingMethodImpl;

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
@JsonDeserialize(as = ShippingMethodImpl.class)
public interface ShippingMethod extends BaseResource {

   
   
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("description")
   public String getDescription();
   
   @NotNull
   @Valid
   @JsonProperty("taxCategory")
   public TaxCategoryReference getTaxCategory();
   
   @NotNull
   @Valid
   @JsonProperty("zoneRates")
   public List<ZoneRate> getZoneRates();
   
   @NotNull
   @JsonProperty("isDefault")
   public Boolean getIsDefault();
   
   
   @JsonProperty("predicate")
   public String getPredicate();

   public void setKey(final String key);
   
   public void setName(final String name);
   
   public void setDescription(final String description);
   
   public void setTaxCategory(final TaxCategoryReference taxCategory);
   
   public void setZoneRates(final List<ZoneRate> zoneRates);
   
   public void setIsDefault(final Boolean isDefault);
   
   public void setPredicate(final String predicate);
   
   public static ShippingMethodImpl of(){
      return new ShippingMethodImpl();
   }
   

   public static ShippingMethodImpl of(final ShippingMethod template) {
      ShippingMethodImpl instance = new ShippingMethodImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setZoneRates(template.getZoneRates());
      instance.setPredicate(template.getPredicate());
      instance.setIsDefault(template.getIsDefault());
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      instance.setKey(template.getKey());
      instance.setTaxCategory(template.getTaxCategory());
      return instance;
   }

}