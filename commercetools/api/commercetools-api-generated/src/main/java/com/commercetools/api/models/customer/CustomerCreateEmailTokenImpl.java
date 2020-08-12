package com.commercetools.api.models.customer;


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
public final class CustomerCreateEmailTokenImpl implements CustomerCreateEmailToken {

   private String id;
   
   private Long version;
   
   private Long ttlMinutes;

   @JsonCreator
   CustomerCreateEmailTokenImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("ttlMinutes") final Long ttlMinutes) {
      this.id = id;
      this.version = version;
      this.ttlMinutes = ttlMinutes;
   }
   public CustomerCreateEmailTokenImpl() {
      
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public Long getTtlMinutes(){
      return this.ttlMinutes;
   }

   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setTtlMinutes(final Long ttlMinutes){
      this.ttlMinutes = ttlMinutes;
   }

}
