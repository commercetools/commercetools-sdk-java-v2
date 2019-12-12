package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFields;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomLineItemDraftImpl implements CustomLineItemDraft {

   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   private Integer quantity;
   
   private com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   private com.commercetools.api.generated.models.common.Money money;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private String slug;
   
   private com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

   @JsonCreator
   CustomLineItemDraftImpl(@JsonProperty("externalTaxRate") final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate, @JsonProperty("quantity") final Integer quantity, @JsonProperty("shippingDetails") final com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails, @JsonProperty("money") final com.commercetools.api.generated.models.common.Money money, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("slug") final String slug, @JsonProperty("taxCategory") final com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.externalTaxRate = externalTaxRate;
      this.quantity = quantity;
      this.shippingDetails = shippingDetails;
      this.money = money;
      this.custom = custom;
      this.name = name;
      this.slug = slug;
      this.taxCategory = taxCategory;
   }
   public CustomLineItemDraftImpl() {
      
   }
   
   /**
   *  <p>An external tax rate can be set if the cart has the <code>External</code> TaxMode.</p>
   */
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   /**
   *  <p>The amount of a CustomLineItemin the cart.
   *  Must be a positive integer.</p>
   */
   public Integer getQuantity(){
      return this.quantity;
   }
   
   /**
   *  <p>Container for custom line item specific address(es).</p>
   */
   public com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getMoney(){
      return this.money;
   }
   
   /**
   *  <p>The custom fields.</p>
   */
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public String getSlug(){
      return this.slug;
   }
   
   /**
   *  <p>The given tax category will be used to select a tax rate when a cart has the TaxMode <code>Platform</code>.</p>
   */
   public com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public void setExternalTaxRate(final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate){
      this.externalTaxRate = externalTaxRate;
   }
   
   public void setQuantity(final Integer quantity){
      this.quantity = quantity;
   }
   
   public void setShippingDetails(final com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails){
      this.shippingDetails = shippingDetails;
   }
   
   public void setMoney(final com.commercetools.api.generated.models.common.Money money){
      this.money = money;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
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