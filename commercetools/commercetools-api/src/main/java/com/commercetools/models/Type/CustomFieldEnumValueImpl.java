package com.commercetools.models.type;


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
public final class CustomFieldEnumValueImpl implements CustomFieldEnumValue {

   private String label;
   
   private String key;

   @JsonCreator
   CustomFieldEnumValueImpl(@JsonProperty("label") final String label, @JsonProperty("key") final String key) {
      this.label = label;
      this.key = key;
   }
   public CustomFieldEnumValueImpl() {
      
   }
   
   
   public String getLabel(){
      return this.label;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setLabel(final String label){
      this.label = label;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}