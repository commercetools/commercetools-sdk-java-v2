package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.review.ReviewUpdateAction;
import com.commercetools.api.generated.models.review.ReviewSetTargetAction;
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
public final class ReviewSetTargetActionBuilder {
   
   
   private JsonNode target;
   
   public ReviewSetTargetActionBuilder target( final JsonNode target) {
      this.target = target;
      return this;
   }
   
   
   public JsonNode getTarget(){
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