package com.commercetools.models.message;

import com.commercetools.models.common.Reference;
import com.commercetools.models.message.Message;
import com.commercetools.models.state.StateReference;
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
public final class ReviewStateTransitionMessageImpl implements ReviewStateTransitionMessage {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String id;
   
   private Long version;
   
   private com.commercetools.models.common.CreatedBy createdBy;
   
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   private Long sequenceNumber;
   
   private com.commercetools.models.common.Reference resource;
   
   private com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   private Long resourceVersion;
   
   private String type;
   
   private Boolean newIncludedInStatistics;
   
   private com.commercetools.models.state.StateReference oldState;
   
   private Boolean force;
   
   private Boolean oldIncludedInStatistics;
   
   private com.commercetools.models.state.StateReference newState;
   
   private com.commercetools.models.common.Reference target;

   @JsonCreator
   ReviewStateTransitionMessageImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("sequenceNumber") final Long sequenceNumber, @JsonProperty("resource") final com.commercetools.models.common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("resourceVersion") final Long resourceVersion, @JsonProperty("newIncludedInStatistics") final Boolean newIncludedInStatistics, @JsonProperty("oldState") final com.commercetools.models.state.StateReference oldState, @JsonProperty("force") final Boolean force, @JsonProperty("oldIncludedInStatistics") final Boolean oldIncludedInStatistics, @JsonProperty("newState") final com.commercetools.models.state.StateReference newState, @JsonProperty("target") final com.commercetools.models.common.Reference target) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.sequenceNumber = sequenceNumber;
      this.resource = resource;
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      this.resourceVersion = resourceVersion;
      this.newIncludedInStatistics = newIncludedInStatistics;
      this.oldState = oldState;
      this.force = force;
      this.oldIncludedInStatistics = oldIncludedInStatistics;
      this.newState = newState;
      this.target = target;
      this.type = "ReviewStateTransition";
   }
   public ReviewStateTransitionMessageImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public com.commercetools.models.common.Reference getResource(){
      return this.resource;
   }
   
   
   public com.commercetools.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public Boolean getNewIncludedInStatistics(){
      return this.newIncludedInStatistics;
   }
   
   
   public com.commercetools.models.state.StateReference getOldState(){
      return this.oldState;
   }
   
   
   public Boolean getForce(){
      return this.force;
   }
   
   
   public Boolean getOldIncludedInStatistics(){
      return this.oldIncludedInStatistics;
   }
   
   
   public com.commercetools.models.state.StateReference getNewState(){
      return this.newState;
   }
   
   
   public com.commercetools.models.common.Reference getTarget(){
      return this.target;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setSequenceNumber(final Long sequenceNumber){
      this.sequenceNumber = sequenceNumber;
   }
   
   public void setResource(final com.commercetools.models.common.Reference resource){
      this.resource = resource;
   }
   
   public void setResourceUserProvidedIdentifiers(final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers){
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
   }
   
   public void setResourceVersion(final Long resourceVersion){
      this.resourceVersion = resourceVersion;
   }
   
   public void setNewIncludedInStatistics(final Boolean newIncludedInStatistics){
      this.newIncludedInStatistics = newIncludedInStatistics;
   }
   
   public void setOldState(final com.commercetools.models.state.StateReference oldState){
      this.oldState = oldState;
   }
   
   public void setForce(final Boolean force){
      this.force = force;
   }
   
   public void setOldIncludedInStatistics(final Boolean oldIncludedInStatistics){
      this.oldIncludedInStatistics = oldIncludedInStatistics;
   }
   
   public void setNewState(final com.commercetools.models.state.StateReference newState){
      this.newState = newState;
   }
   
   public void setTarget(final com.commercetools.models.common.Reference target){
      this.target = target;
   }

}