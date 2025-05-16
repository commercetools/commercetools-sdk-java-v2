
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
 *  <p>Generated after a successful Set Name update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleNameSetMessagePayloadImpl implements ApprovalRuleNameSetMessagePayload, ModelBase {

    private String type;

    private String name;

    private String oldName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalRuleNameSetMessagePayloadImpl(@JsonProperty("name") final String name,
            @JsonProperty("oldName") final String oldName) {
        this.name = name;
        this.oldName = oldName;
        this.type = APPROVAL_RULE_NAME_SET;
    }

    /**
     * create empty instance
     */
    public ApprovalRuleNameSetMessagePayloadImpl() {
        this.type = APPROVAL_RULE_NAME_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Name of the ApprovalRule after the Set Name update action.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Name of the ApprovalRule before the Set Name update action.</p>
     */

    public String getOldName() {
        return this.oldName;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setOldName(final String oldName) {
        this.oldName = oldName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalRuleNameSetMessagePayloadImpl that = (ApprovalRuleNameSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(name, that.name)
                .append(oldName, that.oldName)
                .append(type, that.type)
                .append(name, that.name)
                .append(oldName, that.oldName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(name).append(oldName).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("name", name)
                .append("oldName", oldName)
                .build();
    }

    @Override
    public ApprovalRuleNameSetMessagePayload copyDeep() {
        return ApprovalRuleNameSetMessagePayload.deepCopy(this);
    }
}
