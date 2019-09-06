package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.ExternalTaxRateDraft;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderAddCustomLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderAddCustomLineItemActionBuilder {
   
   @Nullable
   private com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate;
   
   @Nullable
   private java.lang.Integer quantity;
   
   
   private com.commercetools.models.Common.Money money;
   
   @Nullable
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   
   private java.lang.String slug;
   
   @Nullable
   private com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory;
   
   public StagedOrderAddCustomLineItemActionBuilder externalTaxRate(@Nullable final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public StagedOrderAddCustomLineItemActionBuilder quantity(@Nullable final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public StagedOrderAddCustomLineItemActionBuilder money( final com.commercetools.models.Common.Money money) {
      this.money = money;
      return this;
   }
   
   public StagedOrderAddCustomLineItemActionBuilder custom(@Nullable final com.commercetools.models.Type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public StagedOrderAddCustomLineItemActionBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public StagedOrderAddCustomLineItemActionBuilder slug( final java.lang.String slug) {
      this.slug = slug;
      return this;
   }
   
   public StagedOrderAddCustomLineItemActionBuilder taxCategory(@Nullable final com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   @Nullable
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.Common.Money getMoney(){
      return this.money;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.lang.String getSlug(){
      return this.slug;
   }
   
   @Nullable
   public com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public StagedOrderAddCustomLineItemAction build() {
       return new StagedOrderAddCustomLineItemActionImpl(externalTaxRate, quantity, money, custom, name, slug, taxCategory);
   }
   
   public static StagedOrderAddCustomLineItemActionBuilder of() {
      return new StagedOrderAddCustomLineItemActionBuilder();
   }
   
   public static StagedOrderAddCustomLineItemActionBuilder of(final StagedOrderAddCustomLineItemAction template) {
      StagedOrderAddCustomLineItemActionBuilder builder = new StagedOrderAddCustomLineItemActionBuilder();
      builder.externalTaxRate = template.getExternalTaxRate();
      builder.quantity = template.getQuantity();
      builder.money = template.getMoney();
      builder.custom = template.getCustom();
      builder.name = template.getName();
      builder.slug = template.getSlug();
      builder.taxCategory = template.getTaxCategory();
      return builder;
   }
   
}