package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.review.ReviewUpdateAction;
import com.commercetools.api.generated.models.review.ReviewSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewSetKeyActionBuilder {
   
   @Nullable
   private String key;
   
   public ReviewSetKeyActionBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public ReviewSetKeyAction build() {
       return new ReviewSetKeyActionImpl(key);
   }
   
   public static ReviewSetKeyActionBuilder of() {
      return new ReviewSetKeyActionBuilder();
   }
   
   public static ReviewSetKeyActionBuilder of(final ReviewSetKeyAction template) {
      ReviewSetKeyActionBuilder builder = new ReviewSetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}