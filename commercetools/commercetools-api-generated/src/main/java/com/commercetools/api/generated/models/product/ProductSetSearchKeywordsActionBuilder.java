package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.SearchKeywords;
import com.commercetools.api.generated.models.product.ProductSetSearchKeywordsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetSearchKeywordsActionBuilder {
   
   
   private com.commercetools.api.generated.models.product.SearchKeywords searchKeywords;
   
   @Nullable
   private Boolean staged;
   
   public ProductSetSearchKeywordsActionBuilder searchKeywords( final com.commercetools.api.generated.models.product.SearchKeywords searchKeywords) {
      this.searchKeywords = searchKeywords;
      return this;
   }
   
   public ProductSetSearchKeywordsActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.product.SearchKeywords getSearchKeywords(){
      return this.searchKeywords;
   }
   
   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }

   public ProductSetSearchKeywordsAction build() {
       return new ProductSetSearchKeywordsActionImpl(searchKeywords, staged);
   }
   
   public static ProductSetSearchKeywordsActionBuilder of() {
      return new ProductSetSearchKeywordsActionBuilder();
   }
   
   public static ProductSetSearchKeywordsActionBuilder of(final ProductSetSearchKeywordsAction template) {
      ProductSetSearchKeywordsActionBuilder builder = new ProductSetSearchKeywordsActionBuilder();
      builder.searchKeywords = template.getSearchKeywords();
      builder.staged = template.getStaged();
      return builder;
   }
   
}