package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.review.Review;
import com.commercetools.api.generated.models.review.ReviewPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewPagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.api.generated.models.review.Review> results;
   
   public ReviewPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public ReviewPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ReviewPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public ReviewPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public ReviewPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.generated.models.review.Review> results) {
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
   
   
   public java.util.List<com.commercetools.api.generated.models.review.Review> getResults(){
      return this.results;
   }

   public ReviewPagedQueryResponse build() {
       return new ReviewPagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static ReviewPagedQueryResponseBuilder of() {
      return new ReviewPagedQueryResponseBuilder();
   }
   
   public static ReviewPagedQueryResponseBuilder of(final ReviewPagedQueryResponse template) {
      ReviewPagedQueryResponseBuilder builder = new ReviewPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}