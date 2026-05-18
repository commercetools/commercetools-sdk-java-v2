
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
 *  <p>Information regarding IDs and references that created the Payment Integration.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CreatedByImpl implements CreatedBy, ModelBase {

    private String clientId;

    private String externalUserId;

    private com.commercetools.checkout.models.common.Reference customer;

    private String anonymousId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CreatedByImpl(@JsonProperty("clientId") final String clientId,
            @JsonProperty("externalUserId") final String externalUserId,
            @JsonProperty("customer") final com.commercetools.checkout.models.common.Reference customer,
            @JsonProperty("anonymousId") final String anonymousId) {
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
     *  <p>ID of the API client that created the PaymentIntegration.</p>
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     *  <p>External user ID that created the PaymentIntegration.</p>
     */

    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     *  <p>Customer reference if created by a customer.</p>
     */

    public com.commercetools.checkout.models.common.Reference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Anonymous ID if created by an anonymous user.</p>
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

    public void setCustomer(final com.commercetools.checkout.models.common.Reference customer) {
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

        CreatedByImpl that = (CreatedByImpl) o;

        return new EqualsBuilder().append(clientId, that.clientId)
                .append(externalUserId, that.externalUserId)
                .append(customer, that.customer)
                .append(anonymousId, that.anonymousId)
                .append(clientId, that.clientId)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("clientId", clientId)
                .append("externalUserId", externalUserId)
                .append("customer", customer)
                .append("anonymousId", anonymousId)
                .build();
    }

    @Override
    public CreatedBy copyDeep() {
        return CreatedBy.deepCopy(this);
    }
}
