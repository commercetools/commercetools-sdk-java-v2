package com.commercetools.models.OrderEdit;

import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.OrderEdit.StagedOrderUpdateSyncInfoAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderUpdateSyncInfoActionBuilder {
   
   
   private com.commercetools.models.Channel.ChannelResourceIdentifier channel;
   
   @Nullable
   private java.lang.String externalId;
   
   @Nullable
   private java.time.ZonedDateTime syncedAt;
   
   public StagedOrderUpdateSyncInfoActionBuilder channel( final com.commercetools.models.Channel.ChannelResourceIdentifier channel) {
      this.channel = channel;
      return this;
   }
   
   public StagedOrderUpdateSyncInfoActionBuilder externalId(@Nullable final java.lang.String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   public StagedOrderUpdateSyncInfoActionBuilder syncedAt(@Nullable final java.time.ZonedDateTime syncedAt) {
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

   public StagedOrderUpdateSyncInfoAction build() {
       return new StagedOrderUpdateSyncInfoActionImpl(channel, externalId, syncedAt);
   }
   
   public static StagedOrderUpdateSyncInfoActionBuilder of() {
      return new StagedOrderUpdateSyncInfoActionBuilder();
   }
   
   public static StagedOrderUpdateSyncInfoActionBuilder of(final StagedOrderUpdateSyncInfoAction template) {
      StagedOrderUpdateSyncInfoActionBuilder builder = new StagedOrderUpdateSyncInfoActionBuilder();
      builder.channel = template.getChannel();
      builder.externalId = template.getExternalId();
      builder.syncedAt = template.getSyncedAt();
      return builder;
   }
   
}