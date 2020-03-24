package com.commercetools.importer.models.importsummaries;


import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OperationStatesImpl implements OperationStates {

   private Integer accepted;
   
   private Integer validationFailed;
   
   private Integer unresolved;
   
   private Integer resolved;
   
   private Integer waitForMasterVariant;
   
   private Integer imported;
   
   private Integer deleted;
   
   private Integer rejected;
   
   private Integer skipped;
   
   private Integer expired;

   @JsonCreator
   OperationStatesImpl(@JsonProperty("Accepted") final Integer accepted, @JsonProperty("ValidationFailed") final Integer validationFailed, @JsonProperty("Unresolved") final Integer unresolved, @JsonProperty("Resolved") final Integer resolved, @JsonProperty("WaitForMasterVariant") final Integer waitForMasterVariant, @JsonProperty("Imported") final Integer imported, @JsonProperty("Deleted") final Integer deleted, @JsonProperty("Rejected") final Integer rejected, @JsonProperty("Skipped") final Integer skipped, @JsonProperty("Expired") final Integer expired) {
      this.accepted = accepted;
      this.validationFailed = validationFailed;
      this.unresolved = unresolved;
      this.resolved = resolved;
      this.waitForMasterVariant = waitForMasterVariant;
      this.imported = imported;
      this.deleted = deleted;
      this.rejected = rejected;
      this.skipped = skipped;
      this.expired = expired;
   }
   public OperationStatesImpl() {
      
   }
   
   /**
   *  <p>The number of import operations that are in the state <code>Accepted</code>.</p>
   */
   public Integer getAccepted(){
      return this.accepted;
   }
   
   /**
   *  <p>The number of import operations that are in the state <code>ValidationFailed</code>.</p>
   */
   public Integer getValidationFailed(){
      return this.validationFailed;
   }
   
   /**
   *  <p>The number of import operations that are in the state <code>Unresolved</code>.</p>
   */
   public Integer getUnresolved(){
      return this.unresolved;
   }
   
   /**
   *  <p>The number of import operations that are in the state <code>Resolved</code>.</p>
   */
   public Integer getResolved(){
      return this.resolved;
   }
   
   /**
   *  <p>The number of import operations that are in the state <code>WaitForMasterVariant</code>.</p>
   */
   public Integer getWaitForMasterVariant(){
      return this.waitForMasterVariant;
   }
   
   /**
   *  <p>The number of import operations that are in the state <code>Imported</code>.</p>
   */
   public Integer getImported(){
      return this.imported;
   }
   
   /**
   *  <p>The number of import operations that are in the state <code>Deleted</code>.</p>
   */
   public Integer getDeleted(){
      return this.deleted;
   }
   
   /**
   *  <p>The number of import operations that are in the state <code>Rejected</code>.</p>
   */
   public Integer getRejected(){
      return this.rejected;
   }
   
   /**
   *  <p>The number of import operations that are in the state <code>Skipped</code>.</p>
   */
   public Integer getSkipped(){
      return this.skipped;
   }
   
   /**
   *  <p>The number of import operations that are in the state <code>Expired</code>.</p>
   */
   public Integer getExpired(){
      return this.expired;
   }

   public void setAccepted(final Integer accepted){
      this.accepted = accepted;
   }
   
   public void setValidationFailed(final Integer validationFailed){
      this.validationFailed = validationFailed;
   }
   
   public void setUnresolved(final Integer unresolved){
      this.unresolved = unresolved;
   }
   
   public void setResolved(final Integer resolved){
      this.resolved = resolved;
   }
   
   public void setWaitForMasterVariant(final Integer waitForMasterVariant){
      this.waitForMasterVariant = waitForMasterVariant;
   }
   
   public void setImported(final Integer imported){
      this.imported = imported;
   }
   
   public void setDeleted(final Integer deleted){
      this.deleted = deleted;
   }
   
   public void setRejected(final Integer rejected){
      this.rejected = rejected;
   }
   
   public void setSkipped(final Integer skipped){
      this.skipped = skipped;
   }
   
   public void setExpired(final Integer expired){
      this.expired = expired;
   }

}