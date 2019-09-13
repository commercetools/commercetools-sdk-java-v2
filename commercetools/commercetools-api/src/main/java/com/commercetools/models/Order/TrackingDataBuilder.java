package com.commercetools.models.order;

import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.order.TrackingData;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TrackingDataBuilder {
   
   @Nullable
   private java.lang.Boolean isReturn;
   
   @Nullable
   private java.lang.String carrier;
   
   @Nullable
   private java.lang.String providerTransaction;
   
   @Nullable
   private java.lang.String provider;
   
   @Nullable
   private java.lang.String trackingId;
   
   public TrackingDataBuilder isReturn(@Nullable final java.lang.Boolean isReturn) {
      this.isReturn = isReturn;
      return this;
   }
   
   public TrackingDataBuilder carrier(@Nullable final java.lang.String carrier) {
      this.carrier = carrier;
      return this;
   }
   
   public TrackingDataBuilder providerTransaction(@Nullable final java.lang.String providerTransaction) {
      this.providerTransaction = providerTransaction;
      return this;
   }
   
   public TrackingDataBuilder provider(@Nullable final java.lang.String provider) {
      this.provider = provider;
      return this;
   }
   
   public TrackingDataBuilder trackingId(@Nullable final java.lang.String trackingId) {
      this.trackingId = trackingId;
      return this;
   }
   
   @Nullable
   public java.lang.Boolean getIsReturn(){
      return this.isReturn;
   }
   
   @Nullable
   public java.lang.String getCarrier(){
      return this.carrier;
   }
   
   @Nullable
   public java.lang.String getProviderTransaction(){
      return this.providerTransaction;
   }
   
   @Nullable
   public java.lang.String getProvider(){
      return this.provider;
   }
   
   @Nullable
   public java.lang.String getTrackingId(){
      return this.trackingId;
   }

   public TrackingData build() {
       return new TrackingDataImpl(isReturn, carrier, providerTransaction, provider, trackingId);
   }
   
   public static TrackingDataBuilder of() {
      return new TrackingDataBuilder();
   }
   
   public static TrackingDataBuilder of(final TrackingData template) {
      TrackingDataBuilder builder = new TrackingDataBuilder();
      builder.isReturn = template.getIsReturn();
      builder.carrier = template.getCarrier();
      builder.providerTransaction = template.getProviderTransaction();
      builder.provider = template.getProvider();
      builder.trackingId = template.getTrackingId();
      return builder;
   }
   
}