package com.commercetools.models.review;

import com.commercetools.models.review.ReviewUpdateAction;
import com.commercetools.models.review.ReviewSetTargetAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewSetTargetActionBuilder {
   
   
   private Object target;
   
   public ReviewSetTargetActionBuilder target( final Object target) {
      this.target = target;
      return this;
   }
   
   
   public Object getTarget(){
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