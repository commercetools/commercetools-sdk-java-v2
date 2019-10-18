package com.commercetools.api.generated.models.order;


import com.commercetools.api.generated.models.order.TrackingData;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TrackingDataBuilder {
   
   @Nullable
   private Boolean isReturn;
   
   @Nullable
   private String carrier;
   
   @Nullable
   private String providerTransaction;
   
   @Nullable
   private String provider;
   
   @Nullable
   private String trackingId;
   
   public TrackingDataBuilder isReturn(@Nullable final Boolean isReturn) {
      this.isReturn = isReturn;
      return this;
   }
   
   public TrackingDataBuilder carrier(@Nullable final String carrier) {
      this.carrier = carrier;
      return this;
   }
   
   public TrackingDataBuilder providerTransaction(@Nullable final String providerTransaction) {
      this.providerTransaction = providerTransaction;
      return this;
   }
   
   public TrackingDataBuilder provider(@Nullable final String provider) {
      this.provider = provider;
      return this;
   }
   
   public TrackingDataBuilder trackingId(@Nullable final String trackingId) {
      this.trackingId = trackingId;
      return this;
   }
   
   @Nullable
   public Boolean getIsReturn(){
      return this.isReturn;
   }
   
   @Nullable
   public String getCarrier(){
      return this.carrier;
   }
   
   @Nullable
   public String getProviderTransaction(){
      return this.providerTransaction;
   }
   
   @Nullable
   public String getProvider(){
      return this.provider;
   }
   
   @Nullable
   public String getTrackingId(){
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