package com.commercetools.models.Common;

import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.CustomObject.CustomObject;
import com.commercetools.models.Message.Message;
import com.commercetools.models.Product.ProductProjection;
import com.commercetools.models.ShippingMethod.ShippingMethod;
import com.commercetools.models.Store.Store;
import com.commercetools.models.Zone.Zone;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Common.BaseResource;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class BaseResourceBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   public BaseResourceBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public BaseResourceBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public BaseResourceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public BaseResourceBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public BaseResource build() {
       return new BaseResourceImpl(createdAt, lastModifiedAt, id, version);
   }
   
   public static BaseResourceBuilder of() {
      return new BaseResourceBuilder();
   }
   
   public static BaseResourceBuilder of(final BaseResource template) {
      BaseResourceBuilder builder = new BaseResourceBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      return builder;
   }
   
}