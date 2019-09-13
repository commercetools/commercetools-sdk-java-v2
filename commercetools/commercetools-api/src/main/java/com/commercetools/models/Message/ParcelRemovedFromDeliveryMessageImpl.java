package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.order.Parcel;
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
public final class ParcelRemovedFromDeliveryMessageImpl implements ParcelRemovedFromDeliveryMessage {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private java.lang.Long sequenceNumber;
   
   private com.commercetools.models.common.Reference resource;
   
   private com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   private java.lang.Long resourceVersion;
   
   private java.lang.String type;
   
   private com.commercetools.models.order.Parcel parcel;
   
   private java.lang.String deliveryId;

   @JsonCreator
   ParcelRemovedFromDeliveryMessageImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("sequenceNumber") final java.lang.Long sequenceNumber, @JsonProperty("resource") final com.commercetools.models.common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("resourceVersion") final java.lang.Long resourceVersion, @JsonProperty("type") final java.lang.String type, @JsonProperty("parcel") final com.commercetools.models.order.Parcel parcel, @JsonProperty("deliveryId") final java.lang.String deliveryId) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.sequenceNumber = sequenceNumber;
      this.resource = resource;
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      this.resourceVersion = resourceVersion;
      this.type = type;
      this.parcel = parcel;
      this.deliveryId = deliveryId;
   }
   public ParcelRemovedFromDeliveryMessageImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public java.lang.Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public com.commercetools.models.common.Reference getResource(){
      return this.resource;
   }
   
   
   public com.commercetools.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public java.lang.Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.order.Parcel getParcel(){
      return this.parcel;
   }
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setSequenceNumber(final java.lang.Long sequenceNumber){
      this.sequenceNumber = sequenceNumber;
   }
   
   public void setResource(final com.commercetools.models.common.Reference resource){
      this.resource = resource;
   }
   
   public void setResourceUserProvidedIdentifiers(final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers){
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
   }
   
   public void setResourceVersion(final java.lang.Long resourceVersion){
      this.resourceVersion = resourceVersion;
   }
   
   public void setType(final java.lang.String type){
      this.type = type;
   }
   
   public void setParcel(final com.commercetools.models.order.Parcel parcel){
      this.parcel = parcel;
   }
   
   public void setDeliveryId(final java.lang.String deliveryId){
      this.deliveryId = deliveryId;
   }

}