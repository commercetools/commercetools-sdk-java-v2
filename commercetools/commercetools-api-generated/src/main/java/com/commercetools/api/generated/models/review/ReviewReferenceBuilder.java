package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.review.Review;
import com.commercetools.api.generated.models.review.ReviewReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewReferenceBuilder {
   
   
   private String id;
   
   @Nullable
   private com.commercetools.api.generated.models.review.Review obj;
   
   public ReviewReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ReviewReferenceBuilder obj(@Nullable final com.commercetools.api.generated.models.review.Review obj) {
      this.obj = obj;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.review.Review getObj(){
      return this.obj;
   }

   public ReviewReference build() {
       return new ReviewReferenceImpl(id, obj);
   }
   
   public static ReviewReferenceBuilder of() {
      return new ReviewReferenceBuilder();
   }
   
   public static ReviewReferenceBuilder of(final ReviewReference template) {
      ReviewReferenceBuilder builder = new ReviewReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}