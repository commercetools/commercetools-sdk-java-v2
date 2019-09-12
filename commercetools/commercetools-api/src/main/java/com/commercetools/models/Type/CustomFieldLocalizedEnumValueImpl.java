package com.commercetools.models.Type;

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
public final class CustomFieldLocalizedEnumValueImpl implements CustomFieldLocalizedEnumValue {

   private com.commercetools.models.Common.LocalizedString label;
   
   private java.lang.String key;

   @JsonCreator
   CustomFieldLocalizedEnumValueImpl(@JsonProperty("label") final com.commercetools.models.Common.LocalizedString label, @JsonProperty("key") final java.lang.String key) {
      this.label = label;
      this.key = key;
   }
   public CustomFieldLocalizedEnumValueImpl() {
      
   }
   
   
   public com.commercetools.models.Common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setLabel(final com.commercetools.models.Common.LocalizedString label){
      this.label = label;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}