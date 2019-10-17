package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.channel.ChannelReference;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.order.SyncInfo;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SyncInfoBuilder {
   
   
   private com.commercetools.api.generated.models.channel.ChannelReference channel;
   
   @Nullable
   private String externalId;
   
   
   private java.time.ZonedDateTime syncedAt;
   
   public SyncInfoBuilder channel( final com.commercetools.api.generated.models.channel.ChannelReference channel) {
      this.channel = channel;
      return this;
   }
   
   public SyncInfoBuilder externalId(@Nullable final String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   public SyncInfoBuilder syncedAt( final java.time.ZonedDateTime syncedAt) {
      this.syncedAt = syncedAt;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.channel.ChannelReference getChannel(){
      return this.channel;
   }
   
   @Nullable
   public String getExternalId(){
      return this.externalId;
   }
   
   
   public java.time.ZonedDateTime getSyncedAt(){
      return this.syncedAt;
   }

   public SyncInfo build() {
       return new SyncInfoImpl(channel, externalId, syncedAt);
   }
   
   public static SyncInfoBuilder of() {
      return new SyncInfoBuilder();
   }
   
   public static SyncInfoBuilder of(final SyncInfo template) {
      SyncInfoBuilder builder = new SyncInfoBuilder();
      builder.channel = template.getChannel();
      builder.externalId = template.getExternalId();
      builder.syncedAt = template.getSyncedAt();
      return builder;
   }
   
}