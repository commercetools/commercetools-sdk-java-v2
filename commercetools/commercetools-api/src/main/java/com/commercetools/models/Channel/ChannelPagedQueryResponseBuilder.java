package com.commercetools.models.channel;

import com.commercetools.models.channel.Channel;
import java.lang.Long;
import com.commercetools.models.channel.ChannelPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChannelPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.channel.Channel> results;
   
   public ChannelPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public ChannelPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ChannelPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public ChannelPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.channel.Channel> results) {
      this.results = results;
      return this;
   }
   
   @Nullable
   public java.lang.Long getTotal(){
      return this.total;
   }
   
   
   public java.lang.Long getOffset(){
      return this.offset;
   }
   
   
   public java.lang.Long getCount(){
      return this.count;
   }
   
   
   public java.util.List<com.commercetools.models.channel.Channel> getResults(){
      return this.results;
   }

   public ChannelPagedQueryResponse build() {
       return new ChannelPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static ChannelPagedQueryResponseBuilder of() {
      return new ChannelPagedQueryResponseBuilder();
   }
   
   public static ChannelPagedQueryResponseBuilder of(final ChannelPagedQueryResponse template) {
      ChannelPagedQueryResponseBuilder builder = new ChannelPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}