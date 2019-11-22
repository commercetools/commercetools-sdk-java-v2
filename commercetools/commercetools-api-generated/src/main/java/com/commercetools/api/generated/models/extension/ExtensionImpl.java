package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.extension.ExtensionDestination;
import com.commercetools.api.generated.models.extension.ExtensionTrigger;
import java.time.ZonedDateTime;
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
public final class ExtensionImpl implements Extension {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String id;
   
   private Long version;
   
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   private Integer timeoutInMs;
   
   private com.commercetools.api.generated.models.extension.ExtensionDestination destination;
   
   private java.util.List<com.commercetools.api.generated.models.extension.ExtensionTrigger> triggers;
   
   private String key;

   @JsonCreator
   ExtensionImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.generated.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("timeoutInMs") final Integer timeoutInMs, @JsonProperty("destination") final com.commercetools.api.generated.models.extension.ExtensionDestination destination, @JsonProperty("triggers") final java.util.List<com.commercetools.api.generated.models.extension.ExtensionTrigger> triggers, @JsonProperty("key") final String key) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.timeoutInMs = timeoutInMs;
      this.destination = destination;
      this.triggers = triggers;
      this.key = key;
   }
   public ExtensionImpl() {
      
   }
   
   /**
   	
   */
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   /**
   	
   */
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   /**
   	
   */
   public String getId(){
      return this.id;
   }
   
   /**
   	
   */
   public Long getVersion(){
      return this.version;
   }
   
   /**
   	<p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   /**
   	<p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   /**
   	<p>The maximum time the commercetools platform waits for a response from the extension.
   	If not present, <code>2000</code> (2 seconds) is used.</p>
   */
   public Integer getTimeoutInMs(){
      return this.timeoutInMs;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.extension.ExtensionDestination getDestination(){
      return this.destination;
   }
   
   /**
   	
   */
   public java.util.List<com.commercetools.api.generated.models.extension.ExtensionTrigger> getTriggers(){
      return this.triggers;
   }
   
   /**
   	
   */
   public String getKey(){
      return this.key;
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
   
   public void setCreatedBy(final com.commercetools.api.generated.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setTimeoutInMs(final Integer timeoutInMs){
      this.timeoutInMs = timeoutInMs;
   }
   
   public void setDestination(final com.commercetools.api.generated.models.extension.ExtensionDestination destination){
      this.destination = destination;
   }
   
   public void setTriggers(final java.util.List<com.commercetools.api.generated.models.extension.ExtensionTrigger> triggers){
      this.triggers = triggers;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}