package com.commercetools.models.Category;

import com.commercetools.models.Category.Category;
import java.lang.Long;
import com.commercetools.models.Category.CategoryPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.Category.Category> results;
   
   public CategoryPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public CategoryPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public CategoryPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public CategoryPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.Category.Category> results) {
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
   
   
   public java.util.List<com.commercetools.models.Category.Category> getResults(){
      return this.results;
   }

   public CategoryPagedQueryResponse build() {
       return new CategoryPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static CategoryPagedQueryResponseBuilder of() {
      return new CategoryPagedQueryResponseBuilder();
   }
   
   public static CategoryPagedQueryResponseBuilder of(final CategoryPagedQueryResponse template) {
      CategoryPagedQueryResponseBuilder builder = new CategoryPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}