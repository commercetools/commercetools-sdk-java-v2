package com.commercetools.models.OrderEdit;

import java.lang.Integer;
import com.commercetools.models.OrderEdit.OrderEditApply;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditApplyBuilder {
   
   
   private java.lang.Integer resourceVersion;
   
   
   private java.lang.Integer editVersion;
   
   public OrderEditApplyBuilder resourceVersion( final java.lang.Integer resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public OrderEditApplyBuilder editVersion( final java.lang.Integer editVersion) {
      this.editVersion = editVersion;
      return this;
   }
   
   
   public java.lang.Integer getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public java.lang.Integer getEditVersion(){
      return this.editVersion;
   }

   public OrderEditApply build() {
       return new OrderEditApplyImpl(resourceVersion, editVersion);
   }
   
   public static OrderEditApplyBuilder of() {
      return new OrderEditApplyBuilder();
   }
   
   public static OrderEditApplyBuilder of(final OrderEditApply template) {
      OrderEditApplyBuilder builder = new OrderEditApplyBuilder();
      builder.resourceVersion = template.getResourceVersion();
      builder.editVersion = template.getEditVersion();
      return builder;
   }
   
}