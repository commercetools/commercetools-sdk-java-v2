package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.ProductPublishScope;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.product.ProductProjection;
import com.fasterxml.jackson.databind.JsonNode;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductPublishedMessageImpl implements ProductPublishedMessage {

    private String id;
    
    private Long version;
    
    private java.time.ZonedDateTime createdAt;
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    private Long sequenceNumber;
    
    private com.commercetools.api.models.common.Reference resource;
    
    private Long resourceVersion;
    
    private String type;
    
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
    
    private java.util.List<com.fasterxml.jackson.databind.JsonNode> removedImageUrls;
    
    private com.commercetools.api.models.product.ProductProjection productProjection;
    
    private com.commercetools.api.models.cart.ProductPublishScope scope;

    @JsonCreator
    ProductPublishedMessageImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("sequenceNumber") final Long sequenceNumber, @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource, @JsonProperty("resourceVersion") final Long resourceVersion, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("removedImageUrls") final java.util.List<com.fasterxml.jackson.databind.JsonNode> removedImageUrls, @JsonProperty("productProjection") final com.commercetools.api.models.product.ProductProjection productProjection, @JsonProperty("scope") final com.commercetools.api.models.cart.ProductPublishScope scope) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.sequenceNumber = sequenceNumber;
        this.resource = resource;
        this.resourceVersion = resourceVersion;
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        this.removedImageUrls = removedImageUrls;
        this.productProjection = productProjection;
        this.scope = scope;
        this.type = "ProductPublished";
    }
    public ProductPublishedMessageImpl() {
       
    }

    
    public String getId(){
        return this.id;
    }
    
    
    public Long getVersion(){
        return this.version;
    }
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    
    public Long getSequenceNumber(){
        return this.sequenceNumber;
    }
    
    
    public com.commercetools.api.models.common.Reference getResource(){
        return this.resource;
    }
    
    
    public Long getResourceVersion(){
        return this.resourceVersion;
    }
    
    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
        return this.resourceUserProvidedIdentifiers;
    }
    
    
    public java.util.List<com.fasterxml.jackson.databind.JsonNode> getRemovedImageUrls(){
        return this.removedImageUrls;
    }
    
    
    public com.commercetools.api.models.product.ProductProjection getProductProjection(){
        return this.productProjection;
    }
    
    
    public com.commercetools.api.models.cart.ProductPublishScope getScope(){
        return this.scope;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    public void setCreatedAt(final java.time.ZonedDateTime createdAt){
        this.createdAt = createdAt;
    }
    
    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
        this.lastModifiedAt = lastModifiedAt;
    }
    
    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
        this.lastModifiedBy = lastModifiedBy;
    }
    
    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
        this.createdBy = createdBy;
    }
    
    public void setSequenceNumber(final Long sequenceNumber){
        this.sequenceNumber = sequenceNumber;
    }
    
    public void setResource(final com.commercetools.api.models.common.Reference resource){
        this.resource = resource;
    }
    
    public void setResourceVersion(final Long resourceVersion){
        this.resourceVersion = resourceVersion;
    }
    
    public void setResourceUserProvidedIdentifiers(final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers){
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
    }
    
    public void setRemovedImageUrls(final com.fasterxml.jackson.databind.JsonNode ...removedImageUrls){
       this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
    }
    
    public void setRemovedImageUrls(final java.util.List<com.fasterxml.jackson.databind.JsonNode> removedImageUrls){
       this.removedImageUrls = removedImageUrls;
    }
    
    public void setProductProjection(final com.commercetools.api.models.product.ProductProjection productProjection){
        this.productProjection = productProjection;
    }
    
    public void setScope(final com.commercetools.api.models.cart.ProductPublishScope scope){
        this.scope = scope;
    }

}
