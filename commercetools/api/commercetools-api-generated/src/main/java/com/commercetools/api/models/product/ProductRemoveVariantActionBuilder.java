package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductRemoveVariantAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductRemoveVariantActionBuilder {

   @Nullable
   private Boolean staged;

   @Nullable
   private Long id;

   @Nullable
   private String sku;

   public ProductRemoveVariantActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }

   public ProductRemoveVariantActionBuilder id(@Nullable final Long id) {
      this.id = id;
      return this;
   }

   public ProductRemoveVariantActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }

   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }

   @Nullable
   public Long getId(){
      return this.id;
   }

   @Nullable
   public String getSku(){
      return this.sku;
   }

   public ProductRemoveVariantAction build() {
       return new ProductRemoveVariantActionImpl(staged, id, sku);
   }

   public static ProductRemoveVariantActionBuilder of() {
      return new ProductRemoveVariantActionBuilder();
   }

   public static ProductRemoveVariantActionBuilder of(final ProductRemoveVariantAction template) {
      ProductRemoveVariantActionBuilder builder = new ProductRemoveVariantActionBuilder();
      builder.staged = template.getStaged();
      builder.id = template.getId();
      builder.sku = template.getSku();
      return builder;
   }

}
