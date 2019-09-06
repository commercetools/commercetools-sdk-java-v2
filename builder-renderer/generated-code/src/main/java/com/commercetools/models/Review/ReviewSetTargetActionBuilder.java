package com.commercetools.models.Review;

import com.commercetools.models.Review.ReviewUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Review.ReviewSetTargetAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewSetTargetActionBuilder {
   
   
   private java.lang.Object target;
   
   public ReviewSetTargetActionBuilder target( final java.lang.Object target) {
      this.target = target;
      return this;
   }
   
   
   public java.lang.Object getTarget(){
      return this.target;
   }

   public ReviewSetTargetAction build() {
       return new ReviewSetTargetActionImpl(target);
   }
   
   public static ReviewSetTargetActionBuilder of() {
      return new ReviewSetTargetActionBuilder();
   }
   
   public static ReviewSetTargetActionBuilder of(final ReviewSetTargetAction template) {
      ReviewSetTargetActionBuilder builder = new ReviewSetTargetActionBuilder();
      builder.target = template.getTarget();
      return builder;
   }
   
}