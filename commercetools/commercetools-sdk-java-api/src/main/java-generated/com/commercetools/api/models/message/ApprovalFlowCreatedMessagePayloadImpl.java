
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
 *  <p>Generated after an Approval Flow is created.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowCreatedMessagePayloadImpl implements ApprovalFlowCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.approval_flow.ApprovalFlow approvalFlow;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalFlowCreatedMessagePayloadImpl(
            @JsonProperty("approvalFlow") final com.commercetools.api.models.approval_flow.ApprovalFlow approvalFlow) {
        this.approvalFlow = approvalFlow;
        this.type = APPROVAL_FLOW_CREATED;
    }

    /**
     * create empty instance
     */
    public ApprovalFlowCreatedMessagePayloadImpl() {
        this.type = APPROVAL_FLOW_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The Approval Flow that was created.</p>
     */

    public com.commercetools.api.models.approval_flow.ApprovalFlow getApprovalFlow() {
        return this.approvalFlow;
    }

    public void setApprovalFlow(final com.commercetools.api.models.approval_flow.ApprovalFlow approvalFlow) {
        this.approvalFlow = approvalFlow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalFlowCreatedMessagePayloadImpl that = (ApprovalFlowCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(approvalFlow, that.approvalFlow)
                .append(type, that.type)
                .append(approvalFlow, that.approvalFlow)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(approvalFlow).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("approvalFlow", approvalFlow)
                .build();
    }

    @Override
    public ApprovalFlowCreatedMessagePayload copyDeep() {
        return ApprovalFlowCreatedMessagePayload.deepCopy(this);
    }
}
