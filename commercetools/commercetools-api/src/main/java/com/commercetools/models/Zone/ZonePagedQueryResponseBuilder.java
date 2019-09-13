package com.commercetools.models.zone;

import com.commercetools.models.zone.Zone;
import java.lang.Long;
import com.commercetools.models.zone.ZonePagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ZonePagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.zone.Zone> results;
   
   public ZonePagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public ZonePagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ZonePagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public ZonePagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.zone.Zone> results) {
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
   
   
   public java.util.List<com.commercetools.models.zone.Zone> getResults(){
      return this.results;
   }

   public ZonePagedQueryResponse build() {
       return new ZonePagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static ZonePagedQueryResponseBuilder of() {
      return new ZonePagedQueryResponseBuilder();
   }
   
   public static ZonePagedQueryResponseBuilder of(final ZonePagedQueryResponse template) {
      ZonePagedQueryResponseBuilder builder = new ZonePagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}