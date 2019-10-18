package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import com.commercetools.api.generated.models.cart.CartAddCustomLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartAddCustomLineItemActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   
   private Integer quantity;
   
   
   private com.commercetools.api.generated.models.common.Money money;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   
   private String slug;
   
   @Nullable
   private com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
   
   public CartAddCustomLineItemActionBuilder externalTaxRate(@Nullable final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public CartAddCustomLineItemActionBuilder quantity( final Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public CartAddCustomLineItemActionBuilder money( final com.commercetools.api.generated.models.common.Money money) {
      this.money = money;
      return this;
   }
   
   public CartAddCustomLineItemActionBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public CartAddCustomLineItemActionBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public CartAddCustomLineItemActionBuilder slug( final String slug) {
      this.slug = slug;
      return this;
   }
   
   public CartAddCustomLineItemActionBuilder taxCategory(@Nullable final com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getMoney(){
      return this.money;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public String getSlug(){
      return this.slug;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public CartAddCustomLineItemAction build() {
       return new CartAddCustomLineItemActionImpl(externalTaxRate, quantity, money, custom, name, slug, taxCategory);
   }
   
   public static CartAddCustomLineItemActionBuilder of() {
      return new CartAddCustomLineItemActionBuilder();
   }
   
   public static CartAddCustomLineItemActionBuilder of(final CartAddCustomLineItemAction template) {
      CartAddCustomLineItemActionBuilder builder = new CartAddCustomLineItemActionBuilder();
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