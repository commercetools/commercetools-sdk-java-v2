
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
 *  <p>Generated after an Approval Flow is rejected.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowRejectedMessagePayloadImpl implements ApprovalFlowRejectedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.customer.CustomerReference associate;

    private String rejectionReason;

    private com.commercetools.api.models.order.OrderReference order;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalFlowRejectedMessagePayloadImpl(
            @JsonProperty("associate") final com.commercetools.api.models.customer.CustomerReference associate,
            @JsonProperty("rejectionReason") final String rejectionReason,
            @JsonProperty("order") final com.commercetools.api.models.order.OrderReference order) {
        this.associate = associate;
        this.rejectionReason = rejectionReason;
        this.order = order;
        this.type = APPROVAL_FLOW_REJECTED;
    }

    /**
     * create empty instance
     */
    public ApprovalFlowRejectedMessagePayloadImpl() {
        this.type = APPROVAL_FLOW_REJECTED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Reference to the Customer who rejected the Approval Flow.</p>
     */

    public com.commercetools.api.models.customer.CustomerReference getAssociate() {
        return this.associate;
    }

    /**
     *  <p>Description of the reason why the Approval Flow was rejected.</p>
     */

    public String getRejectionReason() {
        return this.rejectionReason;
    }

    /**
     *  <p>Reference to the Order that received the rejection.</p>
     */

    public com.commercetools.api.models.order.OrderReference getOrder() {
        return this.order;
    }

    public void setAssociate(final com.commercetools.api.models.customer.CustomerReference associate) {
        this.associate = associate;
    }

    public void setRejectionReason(final String rejectionReason) {
        this.rejectionReason = rejectionReason;
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

        ApprovalFlowRejectedMessagePayloadImpl that = (ApprovalFlowRejectedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(associate, that.associate)
                .append(rejectionReason, that.rejectionReason)
                .append(order, that.order)
                .append(type, that.type)
                .append(associate, that.associate)
                .append(rejectionReason, that.rejectionReason)
                .append(order, that.order)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(associate)
                .append(rejectionReason)
                .append(order)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("associate", associate)
                .append("rejectionReason", rejectionReason)
                .append("order", order)
                .build();
    }

    @Override
    public ApprovalFlowRejectedMessagePayload copyDeep() {
        return ApprovalFlowRejectedMessagePayload.deepCopy(this);
    }
}
