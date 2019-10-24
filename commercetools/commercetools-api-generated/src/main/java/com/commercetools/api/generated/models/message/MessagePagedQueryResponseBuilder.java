package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.message.MessagePagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MessagePagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.api.generated.models.message.Message> results;
   
   public MessagePagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public MessagePagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public MessagePagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public MessagePagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public MessagePagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.generated.models.message.Message> results) {
      this.results = results;
      return this;
   }
   
   @Nullable
   public Long getTotal(){
      return this.total;
   }
   
   
   public Long getOffset(){
      return this.offset;
   }
   
   
   public Long getCount(){
      return this.count;
   }
   
   
   public Long getLimit(){
      return this.limit;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.message.Message> getResults(){
      return this.results;
   }

   public MessagePagedQueryResponse build() {
       return new MessagePagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static MessagePagedQueryResponseBuilder of() {
      return new MessagePagedQueryResponseBuilder();
   }
   
   public static MessagePagedQueryResponseBuilder of(final MessagePagedQueryResponse template) {
      MessagePagedQueryResponseBuilder builder = new MessagePagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}