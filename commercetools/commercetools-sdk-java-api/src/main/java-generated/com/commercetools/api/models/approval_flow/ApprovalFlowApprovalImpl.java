
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
 * ApprovalFlowApproval
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowApprovalImpl implements ApprovalFlowApproval, ModelBase {

    private com.commercetools.api.models.business_unit.Associate approver;

    private java.time.ZonedDateTime approvedAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalFlowApprovalImpl(
            @JsonProperty("approver") final com.commercetools.api.models.business_unit.Associate approver,
            @JsonProperty("approvedAt") final java.time.ZonedDateTime approvedAt) {
        this.approver = approver;
        this.approvedAt = approvedAt;
    }

    /**
     * create empty instance
     */
    public ApprovalFlowApprovalImpl() {
    }

    /**
     *  <p>Associate who approved the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a>.</p>
     */

    public com.commercetools.api.models.business_unit.Associate getApprover() {
        return this.approver;
    }

    /**
     *  <p>Date and time (UTC) the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a> was approved.</p>
     */

    public java.time.ZonedDateTime getApprovedAt() {
        return this.approvedAt;
    }

    public void setApprover(final com.commercetools.api.models.business_unit.Associate approver) {
        this.approver = approver;
    }

    public void setApprovedAt(final java.time.ZonedDateTime approvedAt) {
        this.approvedAt = approvedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalFlowApprovalImpl that = (ApprovalFlowApprovalImpl) o;

        return new EqualsBuilder().append(approver, that.approver)
                .append(approvedAt, that.approvedAt)
                .append(approver, that.approver)
                .append(approvedAt, that.approvedAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(approver).append(approvedAt).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("approver", approver)
                .append("approvedAt", approvedAt)
                .build();
    }

    @Override
    public ApprovalFlowApproval copyDeep() {
        return ApprovalFlowApproval.deepCopy(this);
    }
}
