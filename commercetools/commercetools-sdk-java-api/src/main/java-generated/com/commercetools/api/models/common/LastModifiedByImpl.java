package com.commercetools.api.models.common;

import com.commercetools.api.models.common.ClientLogging;
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LastModifiedByImpl implements LastModifiedBy {

    private String clientId;
    
    private String externalUserId;
    
    private com.commercetools.api.models.customer.CustomerReference customer;
    
    private String anonymousId;

    @JsonCreator
    LastModifiedByImpl(@JsonProperty("clientId") final String clientId, @JsonProperty("externalUserId") final String externalUserId, @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer, @JsonProperty("anonymousId") final String anonymousId) {
        this.clientId = clientId;
        this.externalUserId = externalUserId;
        this.customer = customer;
        this.anonymousId = anonymousId;
    }
    public LastModifiedByImpl() {
    }

    
    public String getClientId(){
        return this.clientId;
    }
    
    
    public String getExternalUserId(){
        return this.externalUserId;
    }
    
    
    public com.commercetools.api.models.customer.CustomerReference getCustomer(){
        return this.customer;
    }
    
    
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
    
        LastModifiedByImpl that = (LastModifiedByImpl) o;
    
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
