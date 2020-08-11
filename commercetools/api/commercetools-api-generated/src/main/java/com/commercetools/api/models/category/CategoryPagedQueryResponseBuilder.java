package com.commercetools.api.models.category;

import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategoryPagedQueryResponseBuilder {

   @Nullable
   private Long total;


   private Long offset;


   private Long count;


   private Long limit;


   private java.util.List<com.commercetools.api.models.category.Category> results;

   public CategoryPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }

   public CategoryPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }

   public CategoryPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }

   public CategoryPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }

   public CategoryPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.models.category.Category> results) {
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


   public java.util.List<com.commercetools.api.models.category.Category> getResults(){
      return this.results;
   }

   public CategoryPagedQueryResponse build() {
       return new CategoryPagedQueryResponseImpl(total, offset, count, limit, results);
   }

   public static CategoryPagedQueryResponseBuilder of() {
      return new CategoryPagedQueryResponseBuilder();
   }

   public static CategoryPagedQueryResponseBuilder of(final CategoryPagedQueryResponse template) {
      CategoryPagedQueryResponseBuilder builder = new CategoryPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }

}
