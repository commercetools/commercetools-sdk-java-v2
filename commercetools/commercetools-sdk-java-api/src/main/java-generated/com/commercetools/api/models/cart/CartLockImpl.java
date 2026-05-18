
package com.commercetools.api.models.cart;

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
 *  <p>Indicates that the Cart is <span>locked</span> to prevent changes. Provides metadata about when the lock was created and which <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClient" rel="nofollow">API Client</a> initiated it.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartLockImpl implements CartLock, ModelBase {

    private java.time.ZonedDateTime createdAt;

    private String clientId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartLockImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("clientId") final String clientId) {
        this.createdAt = createdAt;
        this.clientId = clientId;
    }

    /**
     * create empty instance
     */
    public CartLockImpl() {
    }

    /**
     *  <p>Date and time (UTC) the Cart was locked.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClient" rel="nofollow">API Client</a> that locked the Cart.</p>
     */

    public String getClientId() {
        return this.clientId;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setClientId(final String clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartLockImpl that = (CartLockImpl) o;

        return new EqualsBuilder().append(createdAt, that.createdAt)
                .append(clientId, that.clientId)
                .append(createdAt, that.createdAt)
                .append(clientId, that.clientId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(createdAt).append(clientId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("createdAt", createdAt)
                .append("clientId", clientId)
                .build();
    }

    @Override
    public CartLock copyDeep() {
        return CartLock.deepCopy(this);
    }
}
