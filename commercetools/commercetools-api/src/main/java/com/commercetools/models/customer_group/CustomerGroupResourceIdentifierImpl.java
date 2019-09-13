package com.commercetools.models.customer_group;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
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
public final class CustomerGroupResourceIdentifierImpl implements CustomerGroupResourceIdentifier {

   private com.commercetools.models.common.ReferenceTypeId typeId;
   
   private java.lang.String id;
   
   private java.lang.String key;

   @JsonCreator
   CustomerGroupResourceIdentifierImpl(@JsonProperty("id") final java.lang.String id, @JsonProperty("key") final java.lang.String key) {
      this.id = id;
      this.key = key;
      this.typeId = ReferenceTypeId.findEnumViaJsonName("customer-group").get();
   }
   public CustomerGroupResourceIdentifierImpl() {
      
   }
   
   
   public com.commercetools.models.common.ReferenceTypeId getTypeId(){
      return this.typeId;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}