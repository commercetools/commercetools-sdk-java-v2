package com.commercetools.importer.models.importsummaries;

import com.commercetools.importer.models.importsummaries.OperationStates;
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
*  <p>An import summary describes the states of import resources of a given import sink.</p>
*  <p>It is used to track the overall progress of of import resources.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportSummaryImpl implements ImportSummary {

   private Integer total;
   
   private com.commercetools.importer.models.importsummaries.OperationStates states;

   @JsonCreator
   ImportSummaryImpl(@JsonProperty("total") final Integer total, @JsonProperty("states") final com.commercetools.importer.models.importsummaries.OperationStates states) {
      this.total = total;
      this.states = states;
   }
   public ImportSummaryImpl() {
      
   }
   
   /**
   *  <p>The total number of import operations received for this import group.</p>
   */
   public Integer getTotal(){
      return this.total;
   }
   
   /**
   *  <p>The states summary for this import summary.</p>
   */
   public com.commercetools.importer.models.importsummaries.OperationStates getStates(){
      return this.states;
   }

   public void setTotal(final Integer total){
      this.total = total;
   }
   
   public void setStates(final com.commercetools.importer.models.importsummaries.OperationStates states){
      this.states = states;
   }

}