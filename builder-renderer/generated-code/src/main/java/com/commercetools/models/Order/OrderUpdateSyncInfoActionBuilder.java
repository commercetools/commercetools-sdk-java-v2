package com.commercetools.models.Order;

import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Order.OrderUpdateAction;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Order.OrderUpdateSyncInfoAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderUpdateSyncInfoActionBuilder {
   
   
   private com.commercetools.models.Channel.ChannelResourceIdentifier channel;
   
   @Nullable
   private java.lang.String externalId;
   
   @Nullable
   private java.time.ZonedDateTime syncedAt;
   
   public OrderUpdateSyncInfoActionBuilder channel( final com.commercetools.models.Channel.ChannelResourceIdentifier channel) {
      this.channel = channel;
      return this;
   }
   
   public OrderUpdateSyncInfoActionBuilder externalId(@Nullable final java.lang.String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   public OrderUpdateSyncInfoActionBuilder syncedAt(@Nullable final java.time.ZonedDateTime syncedAt) {
      this.syncedAt = syncedAt;
      return this;
   }
   
   
   public com.commercetools.models.Channel.ChannelResourceIdentifier getChannel(){
      return this.channel;
   }
   
   @Nullable
   public java.lang.String getExternalId(){
      return this.externalId;
   }
   
   @Nullable
   public java.time.ZonedDateTime getSyncedAt(){
      return this.syncedAt;
   }

   public OrderUpdateSyncInfoAction build() {
       return new OrderUpdateSyncInfoActionImpl(channel, externalId, syncedAt);
   }
   
   public static OrderUpdateSyncInfoActionBuilder of() {
      return new OrderUpdateSyncInfoActionBuilder();
   }
   
   public static OrderUpdateSyncInfoActionBuilder of(final OrderUpdateSyncInfoAction template) {
      OrderUpdateSyncInfoActionBuilder builder = new OrderUpdateSyncInfoActionBuilder();
      builder.channel = template.getChannel();
      builder.externalId = template.getExternalId();
      builder.syncedAt = template.getSyncedAt();
      return builder;
   }
   
}