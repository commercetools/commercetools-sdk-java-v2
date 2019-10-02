package com.commercetools.models.custom_object;


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
public final class CustomObjectDraftImpl implements CustomObjectDraft {

   private String container;
   
   private Long version;
   
   private Object value;
   
   private String key;

   @JsonCreator
   CustomObjectDraftImpl(@JsonProperty("container") final String container, @JsonProperty("version") final Long version, @JsonProperty("value") final Object value, @JsonProperty("key") final String key) {
      this.container = container;
      this.version = version;
      this.value = value;
      this.key = key;
   }
   public CustomObjectDraftImpl() {
      
   }
   
   
   public String getContainer(){
      return this.container;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public Object getValue(){
      return this.value;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setContainer(final String container){
      this.container = container;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setValue(final Object value){
      this.value = value;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}