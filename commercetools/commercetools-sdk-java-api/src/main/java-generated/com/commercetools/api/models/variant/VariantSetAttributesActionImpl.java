
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the attributes of the Variant. Existing attributes will be replaced with the new ones.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetAttributesActionImpl implements VariantSetAttributesAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantSetAttributesActionImpl(
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product.Attribute> attributes,
            @JsonProperty("staged") final Boolean staged) {
        this.attributes = attributes;
        this.staged = staged;
        this.action = SET_ATTRIBUTES;
    }

    /**
     * create empty instance
     */
    public VariantSetAttributesActionImpl() {
        this.action = SET_ATTRIBUTES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Attributes to set for the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     */

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>If <code>true</code>, only the staged attributes are updated. If <code>false</code>, both the current and staged attributes are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setAttributes(final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantSetAttributesActionImpl that = (VariantSetAttributesActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(attributes, that.attributes)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(attributes, that.attributes)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributes).append(staged).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("attributes", attributes)
                .append("staged", staged)
                .build();
    }

    @Override
    public VariantSetAttributesAction copyDeep() {
        return VariantSetAttributesAction.deepCopy(this);
    }
}
