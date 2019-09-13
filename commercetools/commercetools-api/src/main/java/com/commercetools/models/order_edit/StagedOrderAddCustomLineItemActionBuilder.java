package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.Money;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.models.type.CustomFieldsDraft;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderAddCustomLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderAddCustomLineItemActionBuilder {
   
   @Nullable
   private com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   @Nullable
   private java.lang.Integer quantity;
   
   
   private com.commercetools.models.common.Money money;
   
   @Nullable
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   
   private java.lang.String slug;
   
   @Nullable
   private com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
   
   public StagedOrderAddCustomLineItemActionBuilder externalTaxRate(@Nullable final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public StagedOrderAddCustomLineItemActionBuilder quantity(@Nullable final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public StagedOrderAddCustomLineItemActionBuilder money( final com.commercetools.models.common.Money money) {
      this.money = money;
      return this;
   }
   
   public StagedOrderAddCustomLineItemActionBuilder custom(@Nullable final com.commercetools.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public StagedOrderAddCustomLineItemActionBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public StagedOrderAddCustomLineItemActionBuilder slug( final java.lang.String slug) {
      this.slug = slug;
      return this;
   }
   
   public StagedOrderAddCustomLineItemActionBuilder taxCategory(@Nullable final com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   @Nullable
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.common.Money getMoney(){
      return this.money;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.lang.String getSlug(){
      return this.slug;
   }
   
   @Nullable
   public com.commercetools.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
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