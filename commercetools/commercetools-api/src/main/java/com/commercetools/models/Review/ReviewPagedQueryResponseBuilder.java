package com.commercetools.models.review;

import com.commercetools.models.review.Review;
import java.lang.Long;
import com.commercetools.models.review.ReviewPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.review.Review> results;
   
   public ReviewPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public ReviewPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ReviewPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public ReviewPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.review.Review> results) {
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
   
   
   public java.util.List<com.commercetools.models.review.Review> getResults(){
      return this.results;
   }

   public ReviewPagedQueryResponse build() {
       return new ReviewPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static ReviewPagedQueryResponseBuilder of() {
      return new ReviewPagedQueryResponseBuilder();
   }
   
   public static ReviewPagedQueryResponseBuilder of(final ReviewPagedQueryResponse template) {
      ReviewPagedQueryResponseBuilder builder = new ReviewPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}