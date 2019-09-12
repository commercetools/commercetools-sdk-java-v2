package com.commercetools.models.Store;

import com.commercetools.models.Common.KeyReference;
import com.commercetools.models.Common.ReferenceTypeId;
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

   private com.commercetools.models.Common.ReferenceTypeId typeId;
   
   private java.lang.String key;

   @JsonCreator
   StoreKeyReferenceImpl(@JsonProperty("key") final java.lang.String key) {
      this.key = key;
      this.typeId = ReferenceTypeId.findEnumViaJsonName("store").get();
   }
   public StoreKeyReferenceImpl() {
      
   }
   
   
   public com.commercetools.models.Common.ReferenceTypeId getTypeId(){
      return this.typeId;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setKey(final java.lang.String key){
      this.key = key;
   }

}