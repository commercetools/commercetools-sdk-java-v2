package com.commercetools.models.Store;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Store.Store;
import com.commercetools.models.Store.StoreReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StoreReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.Store.Store obj;
   
   public StoreReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public StoreReferenceBuilder obj(@Nullable final com.commercetools.models.Store.Store obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.Store.Store getObj(){
      return this.obj;
   }

   public StoreReference build() {
       return new StoreReferenceImpl(id, obj);
   }
   
   public static StoreReferenceBuilder of() {
      return new StoreReferenceBuilder();
   }
   
   public static StoreReferenceBuilder of(final StoreReference template) {
      StoreReferenceBuilder builder = new StoreReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}