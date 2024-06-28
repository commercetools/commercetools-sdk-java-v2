
package com.commercetools.api.models.business_unit;

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
 *  <p>Updates Approval Rules inheritance behavior between Business Units.</p>
 *  <p>Only Business Units of type <code>Division</code> can be changed to <code>ExplicitAndFromParent</code>.</p>
 *  <p>This update action generates a BusinessUnitApprovalRuleModeChanged Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitChangeApprovalRuleModeActionImpl
        implements BusinessUnitChangeApprovalRuleModeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitChangeApprovalRuleModeActionImpl(
            @JsonProperty("approvalRuleMode") final com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode) {
        this.approvalRuleMode = approvalRuleMode;
        this.action = CHANGE_APPROVAL_RULE_MODE;
    }

    /**
     * create empty instance
     */
    public BusinessUnitChangeApprovalRuleModeActionImpl() {
        this.action = CHANGE_APPROVAL_RULE_MODE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The new value for <code>approvalRuleMode</code>.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode getApprovalRuleMode() {
        return this.approvalRuleMode;
    }

    public void setApprovalRuleMode(
            final com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode) {
        this.approvalRuleMode = approvalRuleMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitChangeApprovalRuleModeActionImpl that = (BusinessUnitChangeApprovalRuleModeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(approvalRuleMode, that.approvalRuleMode)
                .append(action, that.action)
                .append(approvalRuleMode, that.approvalRuleMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(approvalRuleMode).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("approvalRuleMode", approvalRuleMode)
                .build();
    }

}
