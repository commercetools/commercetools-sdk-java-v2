
package com.commercetools.history.models.change_history;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Information about the user or the API client who performed the change. This is a variant of
*  <a href="/types#lastmodifiedby">LastModifiedBy</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ModifiedByImpl implements ModifiedBy, ModelBase {

    private String id;

    private String type;

    private com.commercetools.history.models.common.Reference customer;

    private String anonymousId;

    private String clientId;

    private Boolean isPlatformClient;

    @JsonCreator
    ModifiedByImpl(@JsonProperty("id") final String id, @JsonProperty("type") final String type,
            @JsonProperty("customer") final com.commercetools.history.models.common.Reference customer,
            @JsonProperty("anonymousId") final String anonymousId, @JsonProperty("clientId") final String clientId,
            @JsonProperty("isPlatformClient") final Boolean isPlatformClient) {
        this.id = id;
        this.type = type;
        this.customer = customer;
        this.anonymousId = anonymousId;
        this.clientId = clientId;
        this.isPlatformClient = isPlatformClient;
    }

    public ModifiedByImpl() {
    }

    /**
    *  <p><a href="/general-concepts#identifier">ID</a> of the Merchant Center user who made the change.
    *  Present only if the change was made in the Merchant Center.</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>Indicates whether the change was made by a user or the API client with or without an
    *  <a href="/client-logging#external-user-ids">External user ID</a>.</p>
    */
    public String getType() {
        return this.type;
    }

    /**
    *  <p><a href="/types#reference">Reference</a> to the
    *  <a href="/projects/customers#customer">Customer</a> who made the change. Present only if
    *  the change was made using a token from the <a href="/authorization#password-flow">Password
    *  Flow</a>.</p>
    */
    public com.commercetools.history.models.common.Reference getCustomer() {
        return this.customer;
    }

    /**
    *  <p>Present only if the change was made using a token from an <a href="/authorization#tokens-for-anonymous-sessions">Anonymous
    *  Session</a>.</p>
    */
    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
    *  <p><a href="/general-concepts#identifier">ID</a> of the <a href="/projects/api-clients#apiclient">API
    *  Client</a> that made the change. Present only if
    *  the change was made using an API Client.</p>
    */
    public String getClientId() {
        return this.clientId;
    }

    /**
    *  <p><code>true</code> if the change was made via Merchant Center or <a href="https://impex.europe-west1.gcp.commercetools.com/">ImpEx</a>.</p>
    */
    public Boolean getIsPlatformClient() {
        return this.isPlatformClient;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setCustomer(final com.commercetools.history.models.common.Reference customer) {
        this.customer = customer;
    }

    public void setAnonymousId(final String anonymousId) {
        this.anonymousId = anonymousId;
    }

    public void setClientId(final String clientId) {
        this.clientId = clientId;
    }

    public void setIsPlatformClient(final Boolean isPlatformClient) {
        this.isPlatformClient = isPlatformClient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ModifiedByImpl that = (ModifiedByImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(type, that.type)
                .append(customer, that.customer)
                .append(anonymousId, that.anonymousId)
                .append(clientId, that.clientId)
                .append(isPlatformClient, that.isPlatformClient)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(type)
                .append(customer)
                .append(anonymousId)
                .append(clientId)
                .append(isPlatformClient)
                .toHashCode();
    }

}
