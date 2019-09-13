package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import java.lang.Long;
import com.commercetools.models.message.MessagePagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MessagePagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.message.Message> results;
   
   public MessagePagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public MessagePagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public MessagePagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public MessagePagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.message.Message> results) {
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
   
   
   public java.util.List<com.commercetools.models.message.Message> getResults(){
      return this.results;
   }

   public MessagePagedQueryResponse build() {
       return new MessagePagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static MessagePagedQueryResponseBuilder of() {
      return new MessagePagedQueryResponseBuilder();
   }
   
   public static MessagePagedQueryResponseBuilder of(final MessagePagedQueryResponse template) {
      MessagePagedQueryResponseBuilder builder = new MessagePagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}