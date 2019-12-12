package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderAddCustomLineItemActionImpl implements StagedOrderAddCustomLineItemAction {

   private String action;
   
   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   private Integer quantity;
   
   private com.commercetools.api.generated.models.common.Money money;
   
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private String slug;
   
   private com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

   @JsonCreator
   StagedOrderAddCustomLineItemActionImpl(@JsonProperty("externalTaxRate") final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate, @JsonProperty("quantity") final Integer quantity, @JsonProperty("money") final com.commercetools.api.generated.models.common.Money money, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFieldsDraft custom, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("slug") final String slug, @JsonProperty("taxCategory") final com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.externalTaxRate = externalTaxRate;
      this.quantity = quantity;
      this.money = money;
      this.custom = custom;
      this.name = name;
      this.slug = slug;
      this.taxCategory = taxCategory;
      this.action = "addCustomLineItem";
   }
   public StagedOrderAddCustomLineItemActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getMoney(){
      return this.money;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public String getSlug(){
      return this.slug;
   }
   
   
   public com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public void setExternalTaxRate(final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate){
      this.externalTaxRate = externalTaxRate;
   }
   
   public void setQuantity(final Integer quantity){
      this.quantity = quantity;
   }
   
   public void setMoney(final com.commercetools.api.generated.models.common.Money money){
      this.money = money;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setSlug(final String slug){
      this.slug = slug;
   }
   
   public void setTaxCategory(final com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory){
      this.taxCategory = taxCategory;
   }

}