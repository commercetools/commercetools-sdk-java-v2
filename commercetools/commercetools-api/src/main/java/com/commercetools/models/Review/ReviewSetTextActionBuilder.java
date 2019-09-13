package com.commercetools.models.review;

import com.commercetools.models.review.ReviewUpdateAction;
import java.lang.String;
import com.commercetools.models.review.ReviewSetTextAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewSetTextActionBuilder {
   
   @Nullable
   private java.lang.String text;
   
   public ReviewSetTextActionBuilder text(@Nullable final java.lang.String text) {
      this.text = text;
      return this;
   }
   
   @Nullable
   public java.lang.String getText(){
      return this.text;
   }

   public ReviewSetTextAction build() {
       return new ReviewSetTextActionImpl(text);
   }
   
   public static ReviewSetTextActionBuilder of() {
      return new ReviewSetTextActionBuilder();
   }
   
   public static ReviewSetTextActionBuilder of(final ReviewSetTextAction template) {
      ReviewSetTextActionBuilder builder = new ReviewSetTextActionBuilder();
      builder.text = template.getText();
      return builder;
   }
   
}