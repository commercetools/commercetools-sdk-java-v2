package com.commercetools.models.store;

import com.commercetools.models.common.KeyReference;
import com.commercetools.models.common.ReferenceTypeId;
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
public final class StoreKeyReferenceImpl implements StoreKeyReference {

   private com.commercetools.models.common.ReferenceTypeId typeId;
   
   private String key;

   @JsonCreator
   StoreKeyReferenceImpl(@JsonProperty("key") final String key) {
      this.key = key;
      this.typeId = ReferenceTypeId.findEnumViaJsonName("store").get();
   }
   public StoreKeyReferenceImpl() {
      
   }
   
   
   public com.commercetools.models.common.ReferenceTypeId getTypeId(){
      return this.typeId;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setKey(final String key){
      this.key = key;
   }

}