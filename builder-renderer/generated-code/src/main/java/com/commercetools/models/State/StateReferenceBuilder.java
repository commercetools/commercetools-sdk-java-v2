package com.commercetools.models.State;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.State.State;
import com.commercetools.models.State.StateReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.State.State obj;
   
   public StateReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public StateReferenceBuilder obj(@Nullable final com.commercetools.models.State.State obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.State.State getObj(){
      return this.obj;
   }

   public StateReference build() {
       return new StateReferenceImpl(id, obj);
   }
   
   public static StateReferenceBuilder of() {
      return new StateReferenceBuilder();
   }
   
   public static StateReferenceBuilder of(final StateReference template) {
      StateReferenceBuilder builder = new StateReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}