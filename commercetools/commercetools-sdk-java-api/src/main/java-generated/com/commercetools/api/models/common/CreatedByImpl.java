package com.commercetools.api.models.common;

import com.commercetools.api.models.common.ClientLogging;
import com.commercetools.api.models.customer.CustomerReference;
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
 *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CreatedByImpl implements CreatedBy, ModelBase {

    
    private String clientId;
    
    
    private String externalUserId;
    
    
    private com.commercetools.api.models.customer.CustomerReference customer;
    
    
    private String anonymousId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CreatedByImpl(@JsonProperty("clientId") final String clientId, @JsonProperty("externalUserId") final String externalUserId, @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer, @JsonProperty("anonymousId") final String anonymousId) {
        this.clientId = clientId;
        this.externalUserId = externalUserId;
        this.customer = customer;
        this.anonymousId = anonymousId;
    }
    /**
     * create empty instance
     */
    public CreatedByImpl() {
    }

    /**
     *  <p><code>id</code> of the APIClient which created the resource.</p>
     */
    
    public String getClientId(){
        return this.clientId;
    }
    
    /**
     *  <p>External user ID provided by <code>X-External-User-ID</code> HTTP Header.</p>
     */
    
    public String getExternalUserId(){
        return this.externalUserId;
    }
    
    /**
     *  <p>Indicates the Customer who created the resource using a token from the password flow.</p>
     */
    
    public com.commercetools.api.models.customer.CustomerReference getCustomer(){
        return this.customer;
    }
    
    /**
     *  <p>Indicates the anonymous session during which the resource was created.</p>
     */
    
    public String getAnonymousId(){
        return this.anonymousId;
    }

    
    public void setClientId(final String clientId){
        this.clientId = clientId;
    }
    
    
    public void setExternalUserId(final String externalUserId){
        this.externalUserId = externalUserId;
    }
    
    
    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer){
        this.customer = customer;
    }
    
    
    public void setAnonymousId(final String anonymousId){
        this.anonymousId = anonymousId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CreatedByImpl that = (CreatedByImpl) o;
    
        return new EqualsBuilder()
                .append(clientId, that.clientId)
                .append(externalUserId, that.externalUserId)
                .append(customer, that.customer)
                .append(anonymousId, that.anonymousId)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(clientId)
            .append(externalUserId)
            .append(customer)
            .append(anonymousId)
            .toHashCode();
    }

}
