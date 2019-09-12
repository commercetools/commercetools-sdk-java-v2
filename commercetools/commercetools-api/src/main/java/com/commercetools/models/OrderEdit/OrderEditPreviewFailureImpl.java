package com.commercetools.models.OrderEdit;

import com.commercetools.models.Error.ErrorObject;
import com.commercetools.models.OrderEdit.OrderEditResult;
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
public final class OrderEditPreviewFailureImpl implements OrderEditPreviewFailure {

   private java.lang.String type;
   
   private java.util.List<com.commercetools.models.Error.ErrorObject> errors;

   @JsonCreator
   OrderEditPreviewFailureImpl(@JsonProperty("errors") final java.util.List<com.commercetools.models.Error.ErrorObject> errors) {
      this.errors = errors;
      this.type = "PreviewFailure";
   }
   public OrderEditPreviewFailureImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.util.List<com.commercetools.models.Error.ErrorObject> getErrors(){
      return this.errors;
   }

   public void setErrors(final java.util.List<com.commercetools.models.Error.ErrorObject> errors){
      this.errors = errors;
   }

}