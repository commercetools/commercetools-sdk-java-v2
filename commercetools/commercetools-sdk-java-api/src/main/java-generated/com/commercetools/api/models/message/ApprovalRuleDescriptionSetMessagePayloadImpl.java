
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
 *  <p>Generated after a successful Set Description update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleDescriptionSetMessagePayloadImpl
        implements ApprovalRuleDescriptionSetMessagePayload, ModelBase {

    private String type;

    private String description;

    private String oldDescription;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalRuleDescriptionSetMessagePayloadImpl(@JsonProperty("description") final String description,
            @JsonProperty("oldDescription") final String oldDescription) {
        this.description = description;
        this.oldDescription = oldDescription;
        this.type = APPROVAL_RULE_DESCRIPTION_SET;
    }

    /**
     * create empty instance
     */
    public ApprovalRuleDescriptionSetMessagePayloadImpl() {
        this.type = APPROVAL_RULE_DESCRIPTION_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Description of the ApprovalRule after the Set Description update action.</p>
     */

    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Description of the ApprovalRule before the Set Description update action.</p>
     */

    public String getOldDescription() {
        return this.oldDescription;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setOldDescription(final String oldDescription) {
        this.oldDescription = oldDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalRuleDescriptionSetMessagePayloadImpl that = (ApprovalRuleDescriptionSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(description, that.description)
                .append(oldDescription, that.oldDescription)
                .append(type, that.type)
                .append(description, that.description)
                .append(oldDescription, that.oldDescription)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(description).append(oldDescription).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("description", description)
                .append("oldDescription", oldDescription)
                .build();
    }

    @Override
    public ApprovalRuleDescriptionSetMessagePayload copyDeep() {
        return ApprovalRuleDescriptionSetMessagePayload.deepCopy(this);
    }
}
