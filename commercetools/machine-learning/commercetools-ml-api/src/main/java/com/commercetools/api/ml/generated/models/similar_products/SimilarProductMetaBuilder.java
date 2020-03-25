package com.commercetools.api.ml.generated.models.similar_products;

import com.commercetools.api.ml.generated.models.common.LocalizedString;
import com.commercetools.api.ml.generated.models.common.Money;
import com.commercetools.api.ml.generated.models.similar_products.SimilarProductMeta;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SimilarProductMetaBuilder {
   
   @Nullable
   private LocalizedString name;
   
   @Nullable
   private LocalizedString description;
   
   @Nullable
   private Money price;
   
   @Nullable
   private Long variantCount;
   
   public SimilarProductMetaBuilder name(@Nullable final LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public SimilarProductMetaBuilder description(@Nullable final LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public SimilarProductMetaBuilder price(@Nullable final Money price) {
      this.price = price;
      return this;
   }
   
   public SimilarProductMetaBuilder variantCount(@Nullable final Long variantCount) {
      this.variantCount = variantCount;
      return this;
   }
   
   @Nullable
   public LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public Money getPrice(){
      return this.price;
   }
   
   @Nullable
   public Long getVariantCount(){
      return this.variantCount;
   }

   public SimilarProductMeta build() {
       return new SimilarProductMetaImpl(name, description, price, variantCount);
   }
   
   public static SimilarProductMetaBuilder of() {
      return new SimilarProductMetaBuilder();
   }
   
   public static SimilarProductMetaBuilder of(final SimilarProductMeta template) {
      SimilarProductMetaBuilder builder = new SimilarProductMetaBuilder();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.price = template.getPrice();
      builder.variantCount = template.getVariantCount();
      return builder;
   }
   
}
