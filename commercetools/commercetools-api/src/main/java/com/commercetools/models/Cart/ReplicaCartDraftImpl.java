package com.commercetools.models.Cart;

import java.lang.Object;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReplicaCartDraftImpl implements ReplicaCartDraft {

   private java.lang.Object reference;

   @JsonCreator
   ReplicaCartDraftImpl(@JsonProperty("reference") final java.lang.Object reference) {
      this.reference = reference;
   }
   public ReplicaCartDraftImpl() {
      
   }
   
   
   public java.lang.Object getReference(){
      return this.reference;
   }

   public void setReference(final java.lang.Object reference){
      this.reference = reference;
   }

}