package com.commercetools.api.generated.models.cart;


import com.commercetools.api.generated.models.cart.ReplicaCartDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReplicaCartDraftBuilder {
   
   
   private Object reference;
   
   public ReplicaCartDraftBuilder reference( final Object reference) {
      this.reference = reference;
      return this;
   }
   
   
   public Object getReference(){
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