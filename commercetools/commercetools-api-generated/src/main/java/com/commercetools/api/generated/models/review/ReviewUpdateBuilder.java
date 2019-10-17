package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.review.ReviewUpdateAction;
import com.commercetools.api.generated.models.review.ReviewUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewUpdateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.review.ReviewUpdateAction> actions;
   
   
   private Long version;
   
   public ReviewUpdateBuilder actions( final java.util.List<com.commercetools.api.generated.models.review.ReviewUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public ReviewUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.review.ReviewUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public ReviewUpdate build() {
       return new ReviewUpdateImpl(actions, version);
   }
   
   public static ReviewUpdateBuilder of() {
      return new ReviewUpdateBuilder();
   }
   
   public static ReviewUpdateBuilder of(final ReviewUpdate template) {
      ReviewUpdateBuilder builder = new ReviewUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}