package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.review.ReviewSetTargetAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewSetTargetActionBuilder {


   private com.fasterxml.jackson.databind.JsonNode target;

   public ReviewSetTargetActionBuilder target( final com.fasterxml.jackson.databind.JsonNode target) {
      this.target = target;
      return this;
   }


   public com.fasterxml.jackson.databind.JsonNode getTarget(){
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
