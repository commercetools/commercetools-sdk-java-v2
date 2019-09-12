package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Product.ProductSetProductPriceCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetProductPriceCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Boolean staged;
   
   
   private java.lang.String priceId;
   
   @Nullable
   private java.lang.Object value;
   
   public ProductSetProductPriceCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public ProductSetProductPriceCustomFieldActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetProductPriceCustomFieldActionBuilder priceId( final java.lang.String priceId) {
      this.priceId = priceId;
      return this;
   }
   
   public ProductSetProductPriceCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.String getPriceId(){
      return this.priceId;
   }
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }

   public ProductSetProductPriceCustomFieldAction build() {
       return new ProductSetProductPriceCustomFieldActionImpl(name, staged, priceId, value);
   }
   
   public static ProductSetProductPriceCustomFieldActionBuilder of() {
      return new ProductSetProductPriceCustomFieldActionBuilder();
   }
   
   public static ProductSetProductPriceCustomFieldActionBuilder of(final ProductSetProductPriceCustomFieldAction template) {
      ProductSetProductPriceCustomFieldActionBuilder builder = new ProductSetProductPriceCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.staged = template.getStaged();
      builder.priceId = template.getPriceId();
      builder.value = template.getValue();
      return builder;
   }
   
}