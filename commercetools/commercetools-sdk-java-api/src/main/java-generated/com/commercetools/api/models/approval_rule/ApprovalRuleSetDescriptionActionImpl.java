
package com.commercetools.api.models.approval_rule;

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
 *  <p>Setting the description for an Approval Rule generates an ApprovalRuleDescriptionSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleSetDescriptionActionImpl implements ApprovalRuleSetDescriptionAction, ModelBase {

    private String action;

    private String description;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalRuleSetDescriptionActionImpl(@JsonProperty("description") final String description) {
        this.description = description;
        this.action = SET_DESCRIPTION;
    }

    /**
     * create empty instance
     */
    public ApprovalRuleSetDescriptionActionImpl() {
        this.action = SET_DESCRIPTION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New description to set for the Approval Rule.</p>
     */

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalRuleSetDescriptionActionImpl that = (ApprovalRuleSetDescriptionActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(description, that.description)
                .append(action, that.action)
                .append(description, that.description)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(description).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("description", description)
                .build();
    }

    @Override
    public ApprovalRuleSetDescriptionAction copyDeep() {
        return ApprovalRuleSetDescriptionAction.deepCopy(this);
    }
}
