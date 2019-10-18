package com.commercetools.api.generated.models.tax_category;

import com.commercetools.api.generated.models.tax_category.TaxCategory;
import com.commercetools.api.generated.models.tax_category.TaxCategoryPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxCategoryPagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.api.generated.models.tax_category.TaxCategory> results;
   
   public TaxCategoryPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public TaxCategoryPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public TaxCategoryPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public TaxCategoryPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public TaxCategoryPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.generated.models.tax_category.TaxCategory> results) {
      this.results = results;
      return this;
   }
   
   @Nullable
   public Long getTotal(){
      return this.total;
   }
   
   
   public Long getOffset(){
      return this.offset;
   }
   
   
   public Long getCount(){
      return this.count;
   }
   
   
   public Long getLimit(){
      return this.limit;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.tax_category.TaxCategory> getResults(){
      return this.results;
   }

   public TaxCategoryPagedQueryResponse build() {
       return new TaxCategoryPagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static TaxCategoryPagedQueryResponseBuilder of() {
      return new TaxCategoryPagedQueryResponseBuilder();
   }
   
   public static TaxCategoryPagedQueryResponseBuilder of(final TaxCategoryPagedQueryResponse template) {
      TaxCategoryPagedQueryResponseBuilder builder = new TaxCategoryPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}