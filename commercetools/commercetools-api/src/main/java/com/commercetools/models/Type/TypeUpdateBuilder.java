package com.commercetools.models.type;

import com.commercetools.models.type.TypeUpdateAction;
import java.lang.Long;
import com.commercetools.models.type.TypeUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.type.TypeUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public TypeUpdateBuilder actions( final java.util.List<com.commercetools.models.type.TypeUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public TypeUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.type.TypeUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public TypeUpdate build() {
       return new TypeUpdateImpl(actions, version);
   }
   
   public static TypeUpdateBuilder of() {
      return new TypeUpdateBuilder();
   }
   
   public static TypeUpdateBuilder of(final TypeUpdate template) {
      TypeUpdateBuilder builder = new TypeUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}