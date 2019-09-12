package com.commercetools.models.CustomObject;

import java.lang.Long;
import java.lang.Object;
import java.lang.String;
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

   private java.lang.String container;
   
   private java.lang.Long version;
   
   private java.lang.Object value;
   
   private java.lang.String key;

   @JsonCreator
   CustomObjectDraftImpl(@JsonProperty("container") final java.lang.String container, @JsonProperty("version") final java.lang.Long version, @JsonProperty("value") final java.lang.Object value, @JsonProperty("key") final java.lang.String key) {
      this.container = container;
      this.version = version;
      this.value = value;
      this.key = key;
   }
   public CustomObjectDraftImpl() {
      
   }
   
   
   public java.lang.String getContainer(){
      return this.container;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public java.lang.Object getValue(){
      return this.value;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setContainer(final java.lang.String container){
      this.container = container;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setValue(final java.lang.Object value){
      this.value = value;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}