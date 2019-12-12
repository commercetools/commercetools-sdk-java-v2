package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.generated.models.cart.CartSetCustomShippingMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetCustomShippingMethodActionBuilder {
   
   
   private com.commercetools.api.generated.models.shipping_method.ShippingRateDraft shippingRate;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   
   private String shippingMethodName;
   
   @Nullable
   private com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
   
   public CartSetCustomShippingMethodActionBuilder shippingRate( final com.commercetools.api.generated.models.shipping_method.ShippingRateDraft shippingRate) {
      this.shippingRate = shippingRate;
      return this;
   }
   
   public CartSetCustomShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public CartSetCustomShippingMethodActionBuilder shippingMethodName( final String shippingMethodName) {
      this.shippingMethodName = shippingMethodName;
      return this;
   }
   
   public CartSetCustomShippingMethodActionBuilder taxCategory(@Nullable final com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.shipping_method.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public String getShippingMethodName(){
      return this.shippingMethodName;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public CartSetCustomShippingMethodAction build() {
       return new CartSetCustomShippingMethodActionImpl(shippingRate, externalTaxRate, shippingMethodName, taxCategory);
   }
   
   public static CartSetCustomShippingMethodActionBuilder of() {
      return new CartSetCustomShippingMethodActionBuilder();
   }
   
   public static CartSetCustomShippingMethodActionBuilder of(final CartSetCustomShippingMethodAction template) {
      CartSetCustomShippingMethodActionBuilder builder = new CartSetCustomShippingMethodActionBuilder();
      builder.shippingRate = template.getShippingRate();
      builder.externalTaxRate = template.getExternalTaxRate();
      builder.shippingMethodName = template.getShippingMethodName();
      builder.taxCategory = template.getTaxCategory();
      return builder;
   }
   
}