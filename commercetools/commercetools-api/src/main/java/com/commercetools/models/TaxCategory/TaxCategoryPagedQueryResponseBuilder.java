package com.commercetools.models.TaxCategory;

import com.commercetools.models.TaxCategory.TaxCategory;
import java.lang.Long;
import com.commercetools.models.TaxCategory.TaxCategoryPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxCategoryPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.TaxCategory.TaxCategory> results;
   
   public TaxCategoryPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public TaxCategoryPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public TaxCategoryPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public TaxCategoryPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.TaxCategory.TaxCategory> results) {
      this.results = results;
      return this;
   }
   
   @Nullable
   public java.lang.Long getTotal(){
      return this.total;
   }
   
   
   public java.lang.Long getOffset(){
      return this.offset;
   }
   
   
   public java.lang.Long getCount(){
      return this.count;
   }
   
   
   public java.util.List<com.commercetools.models.TaxCategory.TaxCategory> getResults(){
      return this.results;
   }

   public TaxCategoryPagedQueryResponse build() {
       return new TaxCategoryPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static TaxCategoryPagedQueryResponseBuilder of() {
      return new TaxCategoryPagedQueryResponseBuilder();
   }
   
   public static TaxCategoryPagedQueryResponseBuilder of(final TaxCategoryPagedQueryResponse template) {
      TaxCategoryPagedQueryResponseBuilder builder = new TaxCategoryPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}