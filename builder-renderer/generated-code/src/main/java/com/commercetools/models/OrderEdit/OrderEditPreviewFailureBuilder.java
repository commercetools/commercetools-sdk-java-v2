package com.commercetools.models.OrderEdit;

import com.commercetools.models.Error.ErrorObject;
import com.commercetools.models.OrderEdit.OrderEditResult;
import java.lang.String;
import com.commercetools.models.OrderEdit.OrderEditPreviewFailure;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditPreviewFailureBuilder {
   
   
   private java.util.List<com.commercetools.models.Error.ErrorObject> errors;
   
   public OrderEditPreviewFailureBuilder errors( final java.util.List<com.commercetools.models.Error.ErrorObject> errors) {
      this.errors = errors;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Error.ErrorObject> getErrors(){
      return this.errors;
   }

   public OrderEditPreviewFailure build() {
       return new OrderEditPreviewFailureImpl(errors);
   }
   
   public static OrderEditPreviewFailureBuilder of() {
      return new OrderEditPreviewFailureBuilder();
   }
   
   public static OrderEditPreviewFailureBuilder of(final OrderEditPreviewFailure template) {
      OrderEditPreviewFailureBuilder builder = new OrderEditPreviewFailureBuilder();
      builder.errors = template.getErrors();
      return builder;
   }
   
}