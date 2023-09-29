
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

/**
 *  <p>Setting the name for an Approval Rule generates an ApprovalRuleNameSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleSetNameActionImpl implements ApprovalRuleSetNameAction, ModelBase {

    private String action;

    private String name;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalRuleSetNameActionImpl(@JsonProperty("name") final String name) {
        this.name = name;
        this.action = SET_NAME;
    }

    /**
     * create empty instance
     */
    public ApprovalRuleSetNameActionImpl() {
        this.action = SET_NAME;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New name to set for the Approval Rule.</p>
     */

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalRuleSetNameActionImpl that = (ApprovalRuleSetNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(name, that.name)
                .append(action, that.action)
                .append(name, that.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(name).toHashCode();
    }

}
