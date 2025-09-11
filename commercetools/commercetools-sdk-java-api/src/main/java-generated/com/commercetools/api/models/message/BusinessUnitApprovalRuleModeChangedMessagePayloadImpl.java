
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeApprovalRuleModeAction" rel="nofollow">Change Approval Rule Mode</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitApprovalRuleModeChangedMessagePayloadImpl
        implements BusinessUnitApprovalRuleModeChangedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode;

    private com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode oldApprovalRuleMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitApprovalRuleModeChangedMessagePayloadImpl(
            @JsonProperty("approvalRuleMode") final com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode,
            @JsonProperty("oldApprovalRuleMode") final com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode oldApprovalRuleMode) {
        this.approvalRuleMode = approvalRuleMode;
        this.oldApprovalRuleMode = oldApprovalRuleMode;
        this.type = BUSINESS_UNIT_APPROVAL_RULE_MODE_CHANGED;
    }

    /**
     * create empty instance
     */
    public BusinessUnitApprovalRuleModeChangedMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_APPROVAL_RULE_MODE_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitApprovalRuleMode" rel="nofollow">BusinessUnitApprovalRuleMode</a> of the Business Unit after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeApprovalRuleModeAction" rel="nofollow">Change Approval Rule Mode</a> update action.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode getApprovalRuleMode() {
        return this.approvalRuleMode;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitApprovalRuleMode" rel="nofollow">BusinessUnitApprovalRuleMode</a> of the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeApprovalRuleModeAction" rel="nofollow">Change Approval Rule Mode</a> update action.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode getOldApprovalRuleMode() {
        return this.oldApprovalRuleMode;
    }

    public void setApprovalRuleMode(
            final com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode) {
        this.approvalRuleMode = approvalRuleMode;
    }

    public void setOldApprovalRuleMode(
            final com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode oldApprovalRuleMode) {
        this.oldApprovalRuleMode = oldApprovalRuleMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitApprovalRuleModeChangedMessagePayloadImpl that = (BusinessUnitApprovalRuleModeChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(approvalRuleMode, that.approvalRuleMode)
                .append(oldApprovalRuleMode, that.oldApprovalRuleMode)
                .append(type, that.type)
                .append(approvalRuleMode, that.approvalRuleMode)
                .append(oldApprovalRuleMode, that.oldApprovalRuleMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(approvalRuleMode)
                .append(oldApprovalRuleMode)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("approvalRuleMode", approvalRuleMode)
                .append("oldApprovalRuleMode", oldApprovalRuleMode)
                .build();
    }

    @Override
    public BusinessUnitApprovalRuleModeChangedMessagePayload copyDeep() {
        return BusinessUnitApprovalRuleModeChangedMessagePayload.deepCopy(this);
    }
}
