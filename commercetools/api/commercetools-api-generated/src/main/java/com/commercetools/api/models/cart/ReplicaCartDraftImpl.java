package com.commercetools.api.models.cart;

import com.fasterxml.jackson.databind.JsonNode;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReplicaCartDraftImpl implements ReplicaCartDraft {

   private com.fasterxml.jackson.databind.JsonNode reference;

   @JsonCreator
   ReplicaCartDraftImpl(@JsonProperty("reference") final com.fasterxml.jackson.databind.JsonNode reference) {
      this.reference = reference;
   }
   public ReplicaCartDraftImpl() {
      
   }
   
   
   public com.fasterxml.jackson.databind.JsonNode getReference(){
      return this.reference;
   }

   public void setReference(final com.fasterxml.jackson.databind.JsonNode reference){
      this.reference = reference;
   }

}
