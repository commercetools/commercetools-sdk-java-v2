
package com.commercetools.api.models.attribute_group;

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
 * AttributeGroupRemoveAttributeAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeGroupRemoveAttributeActionImpl implements AttributeGroupRemoveAttributeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.attribute_group.AttributeReference attribute;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AttributeGroupRemoveAttributeActionImpl(
            @JsonProperty("attribute") final com.commercetools.api.models.attribute_group.AttributeReference attribute) {
        this.attribute = attribute;
        this.action = REMOVE_ATTRIBUTE;
    }

    /**
     * create empty instance
     */
    public AttributeGroupRemoveAttributeActionImpl() {
        this.action = REMOVE_ATTRIBUTE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to remove.</p>
     */

    public com.commercetools.api.models.attribute_group.AttributeReference getAttribute() {
        return this.attribute;
    }

    public void setAttribute(final com.commercetools.api.models.attribute_group.AttributeReference attribute) {
        this.attribute = attribute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AttributeGroupRemoveAttributeActionImpl that = (AttributeGroupRemoveAttributeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(attribute, that.attribute)
                .append(action, that.action)
                .append(attribute, that.attribute)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attribute).toHashCode();
    }

}
