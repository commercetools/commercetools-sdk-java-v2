package com.commercetools.api.generated.models.common;


import io.vrap.rmf.base.client.utils.Generated;
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
public final class LocalizedStringImpl implements LocalizedString {

   private Map<String, String> values;

   @JsonCreator
   LocalizedStringImpl(@JsonProperty("values") final Map<String, String> values) {
      this.values = values;
   }
   public LocalizedStringImpl() {
      
   }
   
   
   public Map<String,String> values() {
       return values;
   }

   public void setValue(String key, String value) {
       if (values == null) {
           values = new HashMap<>();
       }
       values.put(key, value);
   }

}