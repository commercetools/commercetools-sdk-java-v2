package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import com.commercetools.models.type.FieldContainer;
import com.commercetools.models.type.TypeResourceIdentifier;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.product.ProductSetProductPriceCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetProductPriceCustomTypeActionBuilder {
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private com.commercetools.models.type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.type.TypeResourceIdentifier type;
   
   
   private java.lang.String priceId;
   
   public ProductSetProductPriceCustomTypeActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetProductPriceCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public ProductSetProductPriceCustomTypeActionBuilder type(@Nullable final com.commercetools.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   public ProductSetProductPriceCustomTypeActionBuilder priceId( final java.lang.String priceId) {
      this.priceId = priceId;
      return this;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   @Nullable
   public com.commercetools.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   
   public java.lang.String getPriceId(){
      return this.priceId;
   }

   public ProductSetProductPriceCustomTypeAction build() {
       return new ProductSetProductPriceCustomTypeActionImpl(staged, fields, type, priceId);
   }
   
   public static ProductSetProductPriceCustomTypeActionBuilder of() {
      return new ProductSetProductPriceCustomTypeActionBuilder();
   }
   
   public static ProductSetProductPriceCustomTypeActionBuilder of(final ProductSetProductPriceCustomTypeAction template) {
      ProductSetProductPriceCustomTypeActionBuilder builder = new ProductSetProductPriceCustomTypeActionBuilder();
      builder.staged = template.getStaged();
      builder.fields = template.getFields();
      builder.type = template.getType();
      builder.priceId = template.getPriceId();
      return builder;
   }
   
}