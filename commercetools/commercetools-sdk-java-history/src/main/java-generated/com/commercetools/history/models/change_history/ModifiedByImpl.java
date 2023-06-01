package com.commercetools.history.models.change_history;

import com.commercetools.history.models.common.Reference;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Information about the user or the API client who performed the change. This is a variant of LastModifiedBy.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ModifiedByImpl implements ModifiedBy, ModelBase {

    
    private String id;
    
    
    private String type;
    
    
    private com.commercetools.history.models.common.Reference customer;
    
    
    private String anonymousId;
    
    
    private String clientId;
    
    
    private Boolean isPlatformClient;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ModifiedByImpl(@JsonProperty("id") final String id, @JsonProperty("type") final String type, @JsonProperty("customer") final com.commercetools.history.models.common.Reference customer, @JsonProperty("anonymousId") final String anonymousId, @JsonProperty("clientId") final String clientId, @JsonProperty("isPlatformClient") final Boolean isPlatformClient) {
        this.id = id;
        this.type = type;
        this.customer = customer;
        this.anonymousId = anonymousId;
        this.clientId = clientId;
        this.isPlatformClient = isPlatformClient;
    }
    /**
     * create empty instance
     */
    public ModifiedByImpl() {
    }

    /**
     *  <p>ID of the Merchant Center user who made the change. Present only if the change was made in the Merchant Center.</p>
     */
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Indicates whether the change was made by a user or the API client with or without an External user ID.</p>
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Reference to the Customer who made the change. Present only if the change was made using a token from the Password Flow.</p>
     */
    
    public com.commercetools.history.models.common.Reference getCustomer(){
        return this.customer;
    }
    
    /**
     *  <p>Present only if the change was made using a token from an Anonymous Session.</p>
     */
    
    public String getAnonymousId(){
        return this.anonymousId;
    }
    
    /**
     *  <p>ID of the API Client that made the change. Present only if the change was made using an API Client.</p>
     */
    
    public String getClientId(){
        return this.clientId;
    }
    
    /**
     *  <p><code>true</code> if the change was made via Merchant Center or ImpEx.</p>
     */
    
    public Boolean getIsPlatformClient(){
        return this.isPlatformClient;
    }

    
    public void setId(final String id){
        this.id = id;
    }
    
    
    public void setType(final String type){
        this.type = type;
    }
    
    
    public void setCustomer(final com.commercetools.history.models.common.Reference customer){
        this.customer = customer;
    }
    
    
    public void setAnonymousId(final String anonymousId){
        this.anonymousId = anonymousId;
    }
    
    
    public void setClientId(final String clientId){
        this.clientId = clientId;
    }
    
    
    public void setIsPlatformClient(final Boolean isPlatformClient){
        this.isPlatformClient = isPlatformClient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ModifiedByImpl that = (ModifiedByImpl) o;
    
        return new EqualsBuilder()
                .append(id, that.id)
                .append(type, that.type)
                .append(customer, that.customer)
                .append(anonymousId, that.anonymousId)
                .append(clientId, that.clientId)
                .append(isPlatformClient, that.isPlatformClient)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(id)
            .append(type)
            .append(customer)
            .append(anonymousId)
            .append(clientId)
            .append(isPlatformClient)
            .toHashCode();
    }

}
