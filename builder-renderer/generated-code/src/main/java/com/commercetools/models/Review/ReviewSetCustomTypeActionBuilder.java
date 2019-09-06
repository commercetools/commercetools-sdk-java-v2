package com.commercetools.models.Review;

import com.commercetools.models.Review.ReviewUpdateAction;
import com.commercetools.models.Type.FieldContainer;
import com.commercetools.models.Type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Review.ReviewSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewSetCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.models.Type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.Type.TypeResourceIdentifier type;
   
   public ReviewSetCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.Type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public ReviewSetCustomTypeActionBuilder type(@Nullable final com.commercetools.models.Type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.Type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public ReviewSetCustomTypeAction build() {
       return new ReviewSetCustomTypeActionImpl(fields, type);
   }
   
   public static ReviewSetCustomTypeActionBuilder of() {
      return new ReviewSetCustomTypeActionBuilder();
   }
   
   public static ReviewSetCustomTypeActionBuilder of(final ReviewSetCustomTypeAction template) {
      ReviewSetCustomTypeActionBuilder builder = new ReviewSetCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}