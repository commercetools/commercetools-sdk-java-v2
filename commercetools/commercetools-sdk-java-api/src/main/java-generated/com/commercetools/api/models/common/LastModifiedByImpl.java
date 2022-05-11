
package com.commercetools.api.models.common;

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
*  <p>Present on resources modified after 1 February 2019 except for <a href="/../api/client-logging#events-tracked">events not tracked</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class LastModifiedByImpl implements LastModifiedBy, ModelBase {

    private String clientId;

    private String externalUserId;

    private com.commercetools.api.models.customer.CustomerReference customer;

    private String anonymousId;

    @JsonCreator
    LastModifiedByImpl(@JsonProperty("clientId") final String clientId,
            @JsonProperty("externalUserId") final String externalUserId,
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer,
            @JsonProperty("anonymousId") final String anonymousId) {
        this.clientId = clientId;
        this.externalUserId = externalUserId;
        this.customer = customer;
        this.anonymousId = anonymousId;
    }

    public LastModifiedByImpl() {
    }

    /**
    *  <p><code>id</code> of the <a href="ctp:api:type:ApiClient">APIClient</a> which modified the resource.</p>
    */
    public String getClientId() {
        return this.clientId;
    }

    /**
    *  <p><a href="/../api/client-logging#external-user-ids">External user ID</a> provided by <code>X-External-User-ID</code> HTTP Header.</p>
    */
    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
    *  <p>Indicates the <a href="ctp:api:type:Customer">Customer</a> who modified the resource using a token from the <a href="/authorization#password-flow">password flow</a>.</p>
    */
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
    *  <p>Indicates the <a href="/../api/authorization#tokens-for-anonymous-sessions">anonymous session</a> during which the resource was modified.</p>
    */
    public String getAnonymousId() {
        return this.anonymousId;
    }

    public void setClientId(final String clientId) {
        this.clientId = clientId;
    }

    public void setExternalUserId(final String externalUserId) {
        this.externalUserId = externalUserId;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
    }

    public void setAnonymousId(final String anonymousId) {
        this.anonymousId = anonymousId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        LastModifiedByImpl that = (LastModifiedByImpl) o;

        return new EqualsBuilder().append(clientId, that.clientId)
                .append(externalUserId, that.externalUserId)
                .append(customer, that.customer)
                .append(anonymousId, that.anonymousId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(clientId)
                .append(externalUserId)
                .append(customer)
                .append(anonymousId)
                .toHashCode();
    }

}
