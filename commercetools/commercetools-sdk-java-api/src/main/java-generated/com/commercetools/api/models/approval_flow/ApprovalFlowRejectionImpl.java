
package com.commercetools.api.models.approval_flow;

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
 * ApprovalFlowRejection
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowRejectionImpl implements ApprovalFlowRejection, ModelBase {

    private com.commercetools.api.models.business_unit.Associate rejecter;

    private java.time.ZonedDateTime rejectedAt;

    private String reason;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalFlowRejectionImpl(
            @JsonProperty("rejecter") final com.commercetools.api.models.business_unit.Associate rejecter,
            @JsonProperty("rejectedAt") final java.time.ZonedDateTime rejectedAt,
            @JsonProperty("reason") final String reason) {
        this.rejecter = rejecter;
        this.rejectedAt = rejectedAt;
        this.reason = reason;
    }

    /**
     * create empty instance
     */
    public ApprovalFlowRejectionImpl() {
    }

    /**
     *  <p>Associate who rejected the Approval Flow.</p>
     */

    public com.commercetools.api.models.business_unit.Associate getRejecter() {
        return this.rejecter;
    }

    /**
     *  <p>Date and time (UTC) the Approval Flow was rejected.</p>
     */

    public java.time.ZonedDateTime getRejectedAt() {
        return this.rejectedAt;
    }

    /**
     *  <p>The reason for the rejection of the Approval Flow.</p>
     */

    public String getReason() {
        return this.reason;
    }

    public void setRejecter(final com.commercetools.api.models.business_unit.Associate rejecter) {
        this.rejecter = rejecter;
    }

    public void setRejectedAt(final java.time.ZonedDateTime rejectedAt) {
        this.rejectedAt = rejectedAt;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalFlowRejectionImpl that = (ApprovalFlowRejectionImpl) o;

        return new EqualsBuilder().append(rejecter, that.rejecter)
                .append(rejectedAt, that.rejectedAt)
                .append(reason, that.reason)
                .append(rejecter, that.rejecter)
                .append(rejectedAt, that.rejectedAt)
                .append(reason, that.reason)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(rejecter).append(rejectedAt).append(reason).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("rejecter", rejecter)
                .append("rejectedAt", rejectedAt)
                .append("reason", reason)
                .build();
    }

    @Override
    public ApprovalFlowRejection copyDeep() {
        return ApprovalFlowRejection.deepCopy(this);
    }
}
