package com.commercetools.models.cart;

import java.lang.Object;
import com.commercetools.models.cart.ReplicaCartDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReplicaCartDraftBuilder {
   
   
   private java.lang.Object reference;
   
   public ReplicaCartDraftBuilder reference( final java.lang.Object reference) {
      this.reference = reference;
      return this;
   }
   
   
   public java.lang.Object getReference(){
      return this.reference;
   }

   public ReplicaCartDraft build() {
       return new ReplicaCartDraftImpl(reference);
   }
   
   public static ReplicaCartDraftBuilder of() {
      return new ReplicaCartDraftBuilder();
   }
   
   public static ReplicaCartDraftBuilder of(final ReplicaCartDraft template) {
      ReplicaCartDraftBuilder builder = new ReplicaCartDraftBuilder();
      builder.reference = template.getReference();
      return builder;
   }
   
}