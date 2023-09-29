
package com.commercetools.api.models.approval_flow;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>This update action allows an Associate to approve an Approval Flow. The process takes into account all Associate Roles held by the Associate, aligning with the matched Approval Rules and their respective approver hierarchies.</p>
 *  <p>When every required Associate has given their approval, the Approval Flow achieves a fully approved state, automatically updating its status to <code>Approved</code>. An Associate is eligible to approve only if their roles are within tiers of the Approval Rule hierarchy that are yet to be fully approved or rejected. As such, an Associate may be able to give their approval more than once.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowApproveActionImpl implements ApprovalFlowApproveAction, ModelBase {

    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalFlowApproveActionImpl() {
        this.action = APPROVE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalFlowApproveActionImpl that = (ApprovalFlowApproveActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(action, that.action).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).toHashCode();
    }

}
