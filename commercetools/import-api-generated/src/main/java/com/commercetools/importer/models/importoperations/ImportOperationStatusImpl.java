package com.commercetools.importer.models.importoperations;

import com.commercetools.importer.models.errors.ErrorObject;
import com.commercetools.importer.models.importoperations.ImportOperationState;
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


/**
*  <p>The validation status of a created operation.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportOperationStatusImpl implements ImportOperationStatus {

   private String operationId;
   
   private com.commercetools.importer.models.importoperations.ImportOperationState state;
   
   private java.util.List<com.commercetools.importer.models.errors.ErrorObject> errors;

   @JsonCreator
   ImportOperationStatusImpl(@JsonProperty("operationId") final String operationId, @JsonProperty("state") final com.commercetools.importer.models.importoperations.ImportOperationState state, @JsonProperty("errors") final java.util.List<com.commercetools.importer.models.errors.ErrorObject> errors) {
      this.operationId = operationId;
      this.state = state;
      this.errors = errors;
   }
   public ImportOperationStatusImpl() {
      
   }
   
   /**
   *  <p>Id of the import operation.</p>
   */
   public String getOperationId(){
      return this.operationId;
   }
   
   /**
   *  <p>Validation state of the import operation.</p>
   */
   public com.commercetools.importer.models.importoperations.ImportOperationState getState(){
      return this.state;
   }
   
   /**
   *  <p>Validation errors for the import operation.</p>
   */
   public java.util.List<com.commercetools.importer.models.errors.ErrorObject> getErrors(){
      return this.errors;
   }

   public void setOperationId(final String operationId){
      this.operationId = operationId;
   }
   
   public void setState(final com.commercetools.importer.models.importoperations.ImportOperationState state){
      this.state = state;
   }
   
   public void setErrors(final java.util.List<com.commercetools.importer.models.errors.ErrorObject> errors){
      this.errors = errors;
   }

}