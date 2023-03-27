
package com.commercetools.api.models.subscription;

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
 * PayloadNotIncluded
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PayloadNotIncludedImpl implements PayloadNotIncluded, ModelBase {

    private String reason;

    private String payloadType;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PayloadNotIncludedImpl(@JsonProperty("reason") final String reason,
            @JsonProperty("payloadType") final String payloadType) {
        this.reason = reason;
        this.payloadType = payloadType;
    }

    /**
     * create empty instance
     */
    public PayloadNotIncludedImpl() {
    }

    /**
     *  <p>Reason the payload is not included. For example, the payload is too large, or its content is not supported by the Subscription destination.</p>
     */

    public String getReason() {
        return this.reason;
    }

    /**
     *  <p>Value of the <code>type</code> field in the original payload.</p>
     */

    public String getPayloadType() {
        return this.payloadType;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    public void setPayloadType(final String payloadType) {
        this.payloadType = payloadType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PayloadNotIncludedImpl that = (PayloadNotIncludedImpl) o;

        return new EqualsBuilder().append(reason, that.reason).append(payloadType, that.payloadType).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(reason).append(payloadType).toHashCode();
    }

}
