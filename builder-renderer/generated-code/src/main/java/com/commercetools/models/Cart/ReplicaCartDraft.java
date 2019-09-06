package com.commercetools.models.Cart;

import java.lang.Object;
import com.commercetools.models.Cart.ReplicaCartDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ReplicaCartDraftImpl.class)
public interface ReplicaCartDraft  {

   
   @NotNull
   @JsonProperty("reference")
   public Object getReference();

   public void setReference(final Object reference);
   
   public static ReplicaCartDraftImpl of(){
      return new ReplicaCartDraftImpl();
   }
   

   public static ReplicaCartDraftImpl of(final ReplicaCartDraft template) {
      ReplicaCartDraftImpl instance = new ReplicaCartDraftImpl();
      instance.setReference(template.getReference());
      return instance;
   }

}