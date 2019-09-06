package com.commercetools.models.Type;

import com.commercetools.models.Type.FieldContainer;
import com.commercetools.models.Type.TypeResourceIdentifier;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomFieldsDraftImpl implements CustomFieldsDraft {

   private com.commercetools.models.Type.FieldContainer fields;
   
   private com.commercetools.models.Type.TypeResourceIdentifier type;

   @JsonCreator
   CustomFieldsDraftImpl(@JsonProperty("fields") final com.commercetools.models.Type.FieldContainer fields, @JsonProperty("type") final com.commercetools.models.Type.TypeResourceIdentifier type) {
      this.fields = fields;
      this.type = type;
   }
   public CustomFieldsDraftImpl() {
      
   }
   
   
   public com.commercetools.models.Type.FieldContainer getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.models.Type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public void setFields(final com.commercetools.models.Type.FieldContainer fields){
      this.fields = fields;
   }
   
   public void setType(final com.commercetools.models.Type.TypeResourceIdentifier type){
      this.type = type;
   }

}