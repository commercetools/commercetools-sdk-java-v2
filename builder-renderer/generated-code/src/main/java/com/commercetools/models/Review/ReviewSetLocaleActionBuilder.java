package com.commercetools.models.Review;

import com.commercetools.models.Review.ReviewUpdateAction;
import java.lang.String;
import com.commercetools.models.Review.ReviewSetLocaleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewSetLocaleActionBuilder {
   
   @Nullable
   private java.lang.String locale;
   
   public ReviewSetLocaleActionBuilder locale(@Nullable final java.lang.String locale) {
      this.locale = locale;
      return this;
   }
   
   @Nullable
   public java.lang.String getLocale(){
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