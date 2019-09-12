package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Error.PriceChangedError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PriceChangedErrorBuilder {
   
   
   private java.lang.String message;
   
   
   private java.util.List<java.lang.String> lineItems;
   
   
   private java.lang.Boolean shipping;
   
   public PriceChangedErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public PriceChangedErrorBuilder lineItems( final java.util.List<java.lang.String> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public PriceChangedErrorBuilder shipping( final java.lang.Boolean shipping) {
      this.shipping = shipping;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public java.util.List<java.lang.String> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.lang.Boolean getShipping(){
      return this.shipping;
   }

   public PriceChangedError build() {
       return new PriceChangedErrorImpl(message, lineItems, shipping);
   }
   
   public static PriceChangedErrorBuilder of() {
      return new PriceChangedErrorBuilder();
   }
   
   public static PriceChangedErrorBuilder of(final PriceChangedError template) {
      PriceChangedErrorBuilder builder = new PriceChangedErrorBuilder();
      builder.message = template.getMessage();
      builder.lineItems = template.getLineItems();
      builder.shipping = template.getShipping();
      return builder;
   }
   
}