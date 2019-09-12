package com.commercetools.models.Store;

import com.commercetools.models.Common.LocalizedString;
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
public final class StoreDraftImpl implements StoreDraft {

   private com.commercetools.models.Common.LocalizedString name;
   
   private java.lang.String key;

   @JsonCreator
   StoreDraftImpl(@JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("key") final java.lang.String key) {
      this.name = name;
      this.key = key;
   }
   public StoreDraftImpl() {
      
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setName(final com.commercetools.models.Common.LocalizedString name){
      this.name = name;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}