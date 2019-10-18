package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.PriceDraft;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductChangePriceAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductChangePriceActionBuilder {
   
   
   private com.commercetools.api.generated.models.common.PriceDraft price;
   
   @Nullable
   private Boolean staged;
   
   
   private String priceId;
   
   public ProductChangePriceActionBuilder price( final com.commercetools.api.generated.models.common.PriceDraft price) {
      this.price = price;
      return this;
   }
   
   public ProductChangePriceActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductChangePriceActionBuilder priceId( final String priceId) {
      this.priceId = priceId;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.PriceDraft getPrice(){
      return this.price;
   }
   
   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public String getPriceId(){
      return this.priceId;
   }

   public ProductChangePriceAction build() {
       return new ProductChangePriceActionImpl(price, staged, priceId);
   }
   
   public static ProductChangePriceActionBuilder of() {
      return new ProductChangePriceActionBuilder();
   }
   
   public static ProductChangePriceActionBuilder of(final ProductChangePriceAction template) {
      ProductChangePriceActionBuilder builder = new ProductChangePriceActionBuilder();
      builder.price = template.getPrice();
      builder.staged = template.getStaged();
      builder.priceId = template.getPriceId();
      return builder;
   }
   
}