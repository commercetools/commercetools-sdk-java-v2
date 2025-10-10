
package com.commercetools.checkout.models.payment_integration;

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
 *  <p>Information regarding IDs and references that last modified the Payment Integration.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LastModifiedByImpl implements LastModifiedBy, ModelBase {

    private String clientId;

    private String sessionId;

    private String externalUserId;

    private String anonymousId;

    private com.commercetools.checkout.models.common.Reference customer;

    private com.commercetools.checkout.models.common.Reference associate;

    private com.commercetools.checkout.models.common.Reference user;

    private Boolean isPlatformClient;

    /**
     * create instance with all properties
     */
    @JsonCreator
    LastModifiedByImpl(@JsonProperty("clientId") final String clientId,
            @JsonProperty("sessionId") final String sessionId,
            @JsonProperty("externalUserId") final String externalUserId,
            @JsonProperty("anonymousId") final String anonymousId,
            @JsonProperty("customer") final com.commercetools.checkout.models.common.Reference customer,
            @JsonProperty("associate") final com.commercetools.checkout.models.common.Reference associate,
            @JsonProperty("user") final com.commercetools.checkout.models.common.Reference user,
            @JsonProperty("isPlatformClient") final Boolean isPlatformClient) {
        this.clientId = clientId;
        this.sessionId = sessionId;
        this.externalUserId = externalUserId;
        this.anonymousId = anonymousId;
        this.customer = customer;
        this.associate = associate;
        this.user = user;
        this.isPlatformClient = isPlatformClient;
    }

    /**
     * create empty instance
     */
    public LastModifiedByImpl() {
    }

    /**
     *  <p>ID of the API client that last modified the PaymentIntegration.</p>
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     *  <p>Session ID associated with the modification of the PaymentIntegration.</p>
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     *  <p>External user ID that last modified the PaymentIntegration.</p>
     */

    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     *  <p>Anonymous ID if the resource was last modified by an anonymous user.</p>
     */

    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p>Customer reference or customer ID if the resource was last modified by a customer.</p>
     */

    public com.commercetools.checkout.models.common.Reference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Associate (customer) reference if the resource was last modified by an associate.</p>
     */

    public com.commercetools.checkout.models.common.Reference getAssociate() {
        return this.associate;
    }

    /**
     *  <p>User reference if the resource was last modified by a platform user.</p>
     */

    public com.commercetools.checkout.models.common.Reference getUser() {
        return this.user;
    }

    /**
     *  <p>Indicates whether the resource was last modified by a platform client.</p>
     */

    public Boolean getIsPlatformClient() {
        return this.isPlatformClient;
    }

    public void setClientId(final String clientId) {
        this.clientId = clientId;
    }

    public void setSessionId(final String sessionId) {
        this.sessionId = sessionId;
    }

    public void setExternalUserId(final String externalUserId) {
        this.externalUserId = externalUserId;
    }

    public void setAnonymousId(final String anonymousId) {
        this.anonymousId = anonymousId;
    }

    public void setCustomer(final com.commercetools.checkout.models.common.Reference customer) {
        this.customer = customer;
    }

    public void setAssociate(final com.commercetools.checkout.models.common.Reference associate) {
        this.associate = associate;
    }

    public void setUser(final com.commercetools.checkout.models.common.Reference user) {
        this.user = user;
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

        LastModifiedByImpl that = (LastModifiedByImpl) o;

        return new EqualsBuilder().append(clientId, that.clientId)
                .append(sessionId, that.sessionId)
                .append(externalUserId, that.externalUserId)
                .append(anonymousId, that.anonymousId)
                .append(customer, that.customer)
                .append(associate, that.associate)
                .append(user, that.user)
                .append(isPlatformClient, that.isPlatformClient)
                .append(clientId, that.clientId)
                .append(sessionId, that.sessionId)
                .append(externalUserId, that.externalUserId)
                .append(anonymousId, that.anonymousId)
                .append(customer, that.customer)
                .append(associate, that.associate)
                .append(user, that.user)
                .append(isPlatformClient, that.isPlatformClient)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(clientId)
                .append(sessionId)
                .append(externalUserId)
                .append(anonymousId)
                .append(customer)
                .append(associate)
                .append(user)
                .append(isPlatformClient)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("clientId", clientId)
                .append("sessionId", sessionId)
                .append("externalUserId", externalUserId)
                .append("anonymousId", anonymousId)
                .append("customer", customer)
                .append("associate", associate)
                .append("user", user)
                .append("isPlatformClient", isPlatformClient)
                .build();
    }

    @Override
    public LastModifiedBy copyDeep() {
        return LastModifiedBy.deepCopy(this);
    }
}
