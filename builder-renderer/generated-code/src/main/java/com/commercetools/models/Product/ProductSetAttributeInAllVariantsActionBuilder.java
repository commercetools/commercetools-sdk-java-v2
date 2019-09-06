package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Product.ProductSetAttributeInAllVariantsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetAttributeInAllVariantsActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private java.lang.Object value;
   
   public ProductSetAttributeInAllVariantsActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public ProductSetAttributeInAllVariantsActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetAttributeInAllVariantsActionBuilder value(@Nullable final java.lang.Object value) {
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
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }

   public ProductSetAttributeInAllVariantsAction build() {
       return new ProductSetAttributeInAllVariantsActionImpl(name, staged, value);
   }
   
   public static ProductSetAttributeInAllVariantsActionBuilder of() {
      return new ProductSetAttributeInAllVariantsActionBuilder();
   }
   
   public static ProductSetAttributeInAllVariantsActionBuilder of(final ProductSetAttributeInAllVariantsAction template) {
      ProductSetAttributeInAllVariantsActionBuilder builder = new ProductSetAttributeInAllVariantsActionBuilder();
      builder.name = template.getName();
      builder.staged = template.getStaged();
      builder.value = template.getValue();
      return builder;
   }
   
}