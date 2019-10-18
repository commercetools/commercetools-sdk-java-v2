package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.review.ReviewUpdateAction;
import com.commercetools.api.generated.models.review.ReviewSetTitleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewSetTitleActionBuilder {
   
   @Nullable
   private String title;
   
   public ReviewSetTitleActionBuilder title(@Nullable final String title) {
      this.title = title;
      return this;
   }
   
   @Nullable
   public String getTitle(){
      return this.title;
   }

   public ReviewSetTitleAction build() {
       return new ReviewSetTitleActionImpl(title);
   }
   
   public static ReviewSetTitleActionBuilder of() {
      return new ReviewSetTitleActionBuilder();
   }
   
   public static ReviewSetTitleActionBuilder of(final ReviewSetTitleAction template) {
      ReviewSetTitleActionBuilder builder = new ReviewSetTitleActionBuilder();
      builder.title = template.getTitle();
      return builder;
   }
   
}