package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.shipping_method.ZoneRateDraft;
import com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingMethodDraftImpl implements ShippingMethodDraft {

   private java.util.List<com.commercetools.api.generated.models.shipping_method.ZoneRateDraft> zoneRates;
   
   private String predicate;
   
   private Boolean isDefault;
   
   private String name;
   
   private String description;
   
   private String key;
   
   private com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

   @JsonCreator
   ShippingMethodDraftImpl(@JsonProperty("zoneRates") final java.util.List<com.commercetools.api.generated.models.shipping_method.ZoneRateDraft> zoneRates, @JsonProperty("predicate") final String predicate, @JsonProperty("isDefault") final Boolean isDefault, @JsonProperty("name") final String name, @JsonProperty("description") final String description, @JsonProperty("key") final String key, @JsonProperty("taxCategory") final com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.zoneRates = zoneRates;
      this.predicate = predicate;
      this.isDefault = isDefault;
      this.name = name;
      this.description = description;
      this.key = key;
      this.taxCategory = taxCategory;
   }
   public ShippingMethodDraftImpl() {
      
   }
   
   /**
   	
   */
   public java.util.List<com.commercetools.api.generated.models.shipping_method.ZoneRateDraft> getZoneRates(){
      return this.zoneRates;
   }
   
   /**
   	<p>A Cart predicate which can be used to more precisely select a shipping method for a cart.</p>
   */
   public String getPredicate(){
      return this.predicate;
   }
   
   /**
   	<p>If <code>true</code> the shipping method will be the default one in a project.</p>
   */
   public Boolean getIsDefault(){
      return this.isDefault;
   }
   
   /**
   	
   */
   public String getName(){
      return this.name;
   }
   
   /**
   	
   */
   public String getDescription(){
      return this.description;
   }
   
   /**
   	
   */
   public String getKey(){
      return this.key;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public void setZoneRates(final java.util.List<com.commercetools.api.generated.models.shipping_method.ZoneRateDraft> zoneRates){
      this.zoneRates = zoneRates;
   }
   
   public void setPredicate(final String predicate){
      this.predicate = predicate;
   }
   
   public void setIsDefault(final Boolean isDefault){
      this.isDefault = isDefault;
   }
   
   public void setName(final String name){
      this.name = name;
   }
   
   public void setDescription(final String description){
      this.description = description;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setTaxCategory(final com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory){
      this.taxCategory = taxCategory;
   }

}