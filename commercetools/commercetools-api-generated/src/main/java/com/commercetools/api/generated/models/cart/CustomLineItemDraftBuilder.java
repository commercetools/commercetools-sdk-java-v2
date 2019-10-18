package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFields;
import com.commercetools.api.generated.models.cart.CustomLineItemDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomLineItemDraftBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   
   private Integer quantity;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   
   private com.commercetools.api.generated.models.common.Money money;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   
   private String slug;
   
   @Nullable
   private com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
   
   public CustomLineItemDraftBuilder externalTaxRate(@Nullable final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public CustomLineItemDraftBuilder quantity( final Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public CustomLineItemDraftBuilder shippingDetails(@Nullable final com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public CustomLineItemDraftBuilder money( final com.commercetools.api.generated.models.common.Money money) {
      this.money = money;
      return this;
   }
   
   public CustomLineItemDraftBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public CustomLineItemDraftBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public CustomLineItemDraftBuilder slug( final String slug) {
      this.slug = slug;
      return this;
   }
   
   public CustomLineItemDraftBuilder taxCategory(@Nullable final com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
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
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getMoney(){
      return this.money;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
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

   public CustomLineItemDraft build() {
       return new CustomLineItemDraftImpl(externalTaxRate, quantity, shippingDetails, money, custom, name, slug, taxCategory);
   }
   
   public static CustomLineItemDraftBuilder of() {
      return new CustomLineItemDraftBuilder();
   }
   
   public static CustomLineItemDraftBuilder of(final CustomLineItemDraft template) {
      CustomLineItemDraftBuilder builder = new CustomLineItemDraftBuilder();
      builder.externalTaxRate = template.getExternalTaxRate();
      builder.quantity = template.getQuantity();
      builder.shippingDetails = template.getShippingDetails();
      builder.money = template.getMoney();
      builder.custom = template.getCustom();
      builder.name = template.getName();
      builder.slug = template.getSlug();
      builder.taxCategory = template.getTaxCategory();
      return builder;
   }
   
}