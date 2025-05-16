
package com.commercetools.api.models.message;

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
 *  <p>Generated after an Approval Flow is completed and reaches a final status.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowCompletedMessagePayloadImpl implements ApprovalFlowCompletedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.approval_flow.ApprovalFlowStatus status;

    private com.commercetools.api.models.order.OrderReference order;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalFlowCompletedMessagePayloadImpl(
            @JsonProperty("status") final com.commercetools.api.models.approval_flow.ApprovalFlowStatus status,
            @JsonProperty("order") final com.commercetools.api.models.order.OrderReference order) {
        this.status = status;
        this.order = order;
        this.type = APPROVAL_FLOW_COMPLETED;
    }

    /**
     * create empty instance
     */
    public ApprovalFlowCompletedMessagePayloadImpl() {
        this.type = APPROVAL_FLOW_COMPLETED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Final status of the Approval Flow.</p>
     */

    public com.commercetools.api.models.approval_flow.ApprovalFlowStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Reference to the Order related to the completed Approval Flow.</p>
     */

    public com.commercetools.api.models.order.OrderReference getOrder() {
        return this.order;
    }

    public void setStatus(final com.commercetools.api.models.approval_flow.ApprovalFlowStatus status) {
        this.status = status;
    }

    public void setOrder(final com.commercetools.api.models.order.OrderReference order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalFlowCompletedMessagePayloadImpl that = (ApprovalFlowCompletedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(status, that.status)
                .append(order, that.order)
                .append(type, that.type)
                .append(status, that.status)
                .append(order, that.order)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(status).append(order).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("status", status)
                .append("order", order)
                .build();
    }

    @Override
    public ApprovalFlowCompletedMessagePayload copyDeep() {
        return ApprovalFlowCompletedMessagePayload.deepCopy(this);
    }
}
