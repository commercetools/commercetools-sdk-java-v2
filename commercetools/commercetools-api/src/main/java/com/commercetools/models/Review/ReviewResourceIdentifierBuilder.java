package com.commercetools.models.review;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.review.ReviewResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewResourceIdentifierBuilder {
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.lang.String key;
   
   public ReviewResourceIdentifierBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ReviewResourceIdentifierBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public ReviewResourceIdentifier build() {
       return new ReviewResourceIdentifierImpl(id, key);
   }
   
   public static ReviewResourceIdentifierBuilder of() {
      return new ReviewResourceIdentifierBuilder();
   }
   
   public static ReviewResourceIdentifierBuilder of(final ReviewResourceIdentifier template) {
      ReviewResourceIdentifierBuilder builder = new ReviewResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}