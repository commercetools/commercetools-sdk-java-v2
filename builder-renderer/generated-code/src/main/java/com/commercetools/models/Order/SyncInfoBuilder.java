package com.commercetools.models.Order;

import com.commercetools.models.Channel.ChannelReference;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Order.SyncInfo;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SyncInfoBuilder {
   
   
   private com.commercetools.models.Channel.ChannelReference channel;
   
   @Nullable
   private java.lang.String externalId;
   
   
   private java.time.ZonedDateTime syncedAt;
   
   public SyncInfoBuilder channel( final com.commercetools.models.Channel.ChannelReference channel) {
      this.channel = channel;
      return this;
   }
   
   public SyncInfoBuilder externalId(@Nullable final java.lang.String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   public SyncInfoBuilder syncedAt( final java.time.ZonedDateTime syncedAt) {
      this.syncedAt = syncedAt;
      return this;
   }
   
   
   public com.commercetools.models.Channel.ChannelReference getChannel(){
      return this.channel;
   }
   
   @Nullable
   public java.lang.String getExternalId(){
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