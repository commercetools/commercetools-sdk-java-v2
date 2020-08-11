package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.product.ProductSetProductPriceCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetProductPriceCustomTypeActionBuilder {

   @Nullable
   private Boolean staged;

   @Nullable
   private com.commercetools.api.models.type.FieldContainer fields;

   @Nullable
   private com.commercetools.api.models.type.TypeResourceIdentifier type;


   private String priceId;

   public ProductSetProductPriceCustomTypeActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }

   public ProductSetProductPriceCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }

   public ProductSetProductPriceCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }

   public ProductSetProductPriceCustomTypeActionBuilder priceId( final String priceId) {
      this.priceId = priceId;
      return this;
   }

   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }

   @Nullable
   public com.commercetools.api.models.type.FieldContainer getFields(){
      return this.fields;
   }

   @Nullable
   public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }


   public String getPriceId(){
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
