
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>These objects represent information about which API Client created or modified a resource. For more information, see Client Logging.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ClientLoggingImpl implements ClientLogging, ModelBase {

    private String clientId;

    private String externalUserId;

    private com.commercetools.api.models.customer.CustomerReference customer;

    private String anonymousId;

    private com.commercetools.api.models.customer.CustomerReference associate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ClientLoggingImpl(@JsonProperty("clientId") final String clientId,
            @JsonProperty("externalUserId") final String externalUserId,
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer,
            @JsonProperty("anonymousId") final String anonymousId,
            @JsonProperty("associate") final com.commercetools.api.models.customer.CustomerReference associate) {
        this.clientId = clientId;
        this.externalUserId = externalUserId;
        this.customer = customer;
        this.anonymousId = anonymousId;
        this.associate = associate;
    }

    /**
     * create empty instance
     */
    public ClientLoggingImpl() {
    }

    /**
     *  <p><code>id</code> of the API Client which created the resource.</p>
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     *  <p>External user ID provided by <code>X-External-User-ID</code> HTTP Header.</p>
     */

    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     *  <p>Indicates the Customer who modified the resource using a token from the password flow.</p>
     */

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Indicates that the resource was modified during an anonymous session with the logged ID.</p>
     */

    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p>Indicates the Customer who created or modified the resource in the context of a Business Unit. Only available for B2B-enabled Projects when an Associate acts on behalf of a company using the associate endpoints.</p>
     */

    public com.commercetools.api.models.customer.CustomerReference getAssociate() {
        return this.associate;
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

    public void setAssociate(final com.commercetools.api.models.customer.CustomerReference associate) {
        this.associate = associate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ClientLoggingImpl that = (ClientLoggingImpl) o;

        return new EqualsBuilder().append(clientId, that.clientId)
                .append(externalUserId, that.externalUserId)
                .append(customer, that.customer)
                .append(anonymousId, that.anonymousId)
                .append(associate, that.associate)
                .append(clientId, that.clientId)
                .append(externalUserId, that.externalUserId)
                .append(customer, that.customer)
                .append(anonymousId, that.anonymousId)
                .append(associate, that.associate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(clientId)
                .append(externalUserId)
                .append(customer)
                .append(anonymousId)
                .append(associate)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("clientId", clientId)
                .append("externalUserId", externalUserId)
                .append("customer", customer)
                .append("anonymousId", anonymousId)
                .append("associate", associate)
                .build();
    }

    @Override
    public ClientLogging copyDeep() {
        return ClientLogging.deepCopy(this);
    }
}
