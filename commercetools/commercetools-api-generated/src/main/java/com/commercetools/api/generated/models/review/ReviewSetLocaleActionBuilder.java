package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.review.ReviewUpdateAction;
import com.commercetools.api.generated.models.review.ReviewSetLocaleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewSetLocaleActionBuilder {
   
   @Nullable
   private String locale;
   
   public ReviewSetLocaleActionBuilder locale(@Nullable final String locale) {
      this.locale = locale;
      return this;
   }
   
   @Nullable
   public String getLocale(){
      return this.locale;
   }

   public ReviewSetLocaleAction build() {
       return new ReviewSetLocaleActionImpl(locale);
   }
   
   public static ReviewSetLocaleActionBuilder of() {
      return new ReviewSetLocaleActionBuilder();
   }
   
   public static ReviewSetLocaleActionBuilder of(final ReviewSetLocaleAction template) {
      ReviewSetLocaleActionBuilder builder = new ReviewSetLocaleActionBuilder();
      builder.locale = template.getLocale();
      return builder;
   }
   
}