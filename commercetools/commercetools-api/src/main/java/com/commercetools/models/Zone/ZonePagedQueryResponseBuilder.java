package com.commercetools.models.zone;

import com.commercetools.models.zone.Zone;
import com.commercetools.models.zone.ZonePagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ZonePagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.models.zone.Zone> results;
   
   public ZonePagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public ZonePagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ZonePagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public ZonePagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public ZonePagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.zone.Zone> results) {
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
   
   
   public java.util.List<com.commercetools.models.zone.Zone> getResults(){
      return this.results;
   }

   public ZonePagedQueryResponse build() {
       return new ZonePagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static ZonePagedQueryResponseBuilder of() {
      return new ZonePagedQueryResponseBuilder();
   }
   
   public static ZonePagedQueryResponseBuilder of(final ZonePagedQueryResponse template) {
      ZonePagedQueryResponseBuilder builder = new ZonePagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}