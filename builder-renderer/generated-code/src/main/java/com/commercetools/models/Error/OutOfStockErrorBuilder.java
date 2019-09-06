package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import com.commercetools.models.Error.OutOfStockError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OutOfStockErrorBuilder {
   
   
   private java.lang.String message;
   
   
   private java.util.List<java.lang.String> lineItems;
   
   
   private java.util.List<java.lang.String> skus;
   
   public OutOfStockErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public OutOfStockErrorBuilder lineItems( final java.util.List<java.lang.String> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public OutOfStockErrorBuilder skus( final java.util.List<java.lang.String> skus) {
      this.skus = skus;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public java.util.List<java.lang.String> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.util.List<java.lang.String> getSkus(){
      return this.skus;
   }

   public OutOfStockError build() {
       return new OutOfStockErrorImpl(message, lineItems, skus);
   }
   
   public static OutOfStockErrorBuilder of() {
      return new OutOfStockErrorBuilder();
   }
   
   public static OutOfStockErrorBuilder of(final OutOfStockError template) {
      OutOfStockErrorBuilder builder = new OutOfStockErrorBuilder();
      builder.message = template.getMessage();
      builder.lineItems = template.getLineItems();
      builder.skus = template.getSkus();
      return builder;
   }
   
}