
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
 * AttributeGroupSetAttributesAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeGroupSetAttributesActionImpl implements AttributeGroupSetAttributesAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> attributes;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AttributeGroupSetAttributesActionImpl(
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> attributes) {
        this.attributes = attributes;
        this.action = SET_ATTRIBUTES;
    }

    /**
     * create empty instance
     */
    public AttributeGroupSetAttributesActionImpl() {
        this.action = SET_ATTRIBUTES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New unique values to set.</p>
     */

    public java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> getAttributes() {
        return this.attributes;
    }

    public void setAttributes(final com.commercetools.api.models.attribute_group.AttributeReference... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(
            final java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AttributeGroupSetAttributesActionImpl that = (AttributeGroupSetAttributesActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(attributes, that.attributes)
                .append(action, that.action)
                .append(attributes, that.attributes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributes).toHashCode();
    }

}
