
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
 *  <p>This update action allows an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> to reject an Approval Flow, setting its status to <code>Rejected</code>. The process takes into account all <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">Associate Roles</a> held by the Associate, aligning with the matched <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">Approval Rules</a> and their respective approver hierarchies. Even a single rejection in the process will result in the rejection of the entire Approval Flow.</p>
 *  <p>An Associate is eligible to reject only if their roles are within tiers of the Approval Rule hierarchy that are yet to be rejected. An Associate may alter a prior approval into a rejection.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowRejectActionImpl implements ApprovalFlowRejectAction, ModelBase {

    private String action;

    private String reason;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalFlowRejectActionImpl(@JsonProperty("reason") final String reason) {
        this.reason = reason;
        this.action = REJECT;
    }

    /**
     * create empty instance
     */
    public ApprovalFlowRejectActionImpl() {
        this.action = REJECT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The reason for the rejection of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a>.</p>
     */

    public String getReason() {
        return this.reason;
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

        ApprovalFlowRejectActionImpl that = (ApprovalFlowRejectActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(reason, that.reason)
                .append(action, that.action)
                .append(reason, that.reason)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(reason).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("reason", reason)
                .build();
    }

    @Override
    public ApprovalFlowRejectAction copyDeep() {
        return ApprovalFlowRejectAction.deepCopy(this);
    }
}
