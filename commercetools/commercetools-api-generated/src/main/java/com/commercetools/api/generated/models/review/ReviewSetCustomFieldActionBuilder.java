package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.review.ReviewUpdateAction;
import com.commercetools.api.generated.models.review.ReviewSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewSetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private Object value;
   
   public ReviewSetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public ReviewSetCustomFieldActionBuilder value(@Nullable final Object value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public Object getValue(){
      return this.value;
   }

   public ReviewSetCustomFieldAction build() {
       return new ReviewSetCustomFieldActionImpl(name, value);
   }
   
   public static ReviewSetCustomFieldActionBuilder of() {
      return new ReviewSetCustomFieldActionBuilder();
   }
   
   public static ReviewSetCustomFieldActionBuilder of(final ReviewSetCustomFieldAction template) {
      ReviewSetCustomFieldActionBuilder builder = new ReviewSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}