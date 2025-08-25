
package com.commercetools.api.models.product_type;

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
 * AttributeDefinition
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeDefinitionImpl implements AttributeDefinition, ModelBase {

    private com.commercetools.api.models.product_type.AttributeType type;

    private String name;

    private com.commercetools.api.models.common.LocalizedString label;

    private Boolean isRequired;

    private com.commercetools.api.models.product_type.AttributeLevelEnum level;

    private com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint;

    private com.commercetools.api.models.common.LocalizedString inputTip;

    private com.commercetools.api.models.product_type.TextInputHint inputHint;

    private Boolean isSearchable;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AttributeDefinitionImpl(@JsonProperty("type") final com.commercetools.api.models.product_type.AttributeType type,
            @JsonProperty("name") final String name,
            @JsonProperty("label") final com.commercetools.api.models.common.LocalizedString label,
            @JsonProperty("isRequired") final Boolean isRequired,
            @JsonProperty("level") final com.commercetools.api.models.product_type.AttributeLevelEnum level,
            @JsonProperty("attributeConstraint") final com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint,
            @JsonProperty("inputTip") final com.commercetools.api.models.common.LocalizedString inputTip,
            @JsonProperty("inputHint") final com.commercetools.api.models.product_type.TextInputHint inputHint,
            @JsonProperty("isSearchable") final Boolean isSearchable) {
        this.type = type;
        this.name = name;
        this.label = label;
        this.isRequired = isRequired;
        this.level = level;
        this.attributeConstraint = attributeConstraint;
        this.inputTip = inputTip;
        this.inputHint = inputHint;
        this.isSearchable = isSearchable;
    }

    /**
     * create empty instance
     */
    public AttributeDefinitionImpl() {
    }

    /**
     *  <p>Describes the Type of the Attribute.</p>
     */

    public com.commercetools.api.models.product_type.AttributeType getType() {
        return this.type;
    }

    /**
     *  <p>User-defined name of the Attribute that is unique within the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Human-readable label for the Attribute.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     *  <p>If <code>true</code>, the Attribute must have a value on a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     */

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    /**
     *  <p>Specifies whether the Attribute is defined at the Product or Variant level.</p>
     */

    public com.commercetools.api.models.product_type.AttributeLevelEnum getLevel() {
        return this.level;
    }

    /**
     *  <p>Specifies how Attributes are validated across all variants of a Product.</p>
     */

    public com.commercetools.api.models.product_type.AttributeConstraintEnum getAttributeConstraint() {
        return this.attributeConstraint;
    }

    /**
     *  <p>Provides additional Attribute information to aid content managers configure Product details.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getInputTip() {
        return this.inputTip;
    }

    /**
     *  <p>Provides a visual representation directive for values of this Attribute (only relevant for <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeTextType" rel="nofollow">AttributeTextType</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizableTextType" rel="nofollow">AttributeLocalizableTextType</a>).</p>
     */

    public com.commercetools.api.models.product_type.TextInputHint getInputHint() {
        return this.inputHint;
    }

    /**
     *  <p>If <code>true</code>, the Attribute's values are available in the <span>Product Search</span> or the <span>Product Projection Search</span> API for use in full-text search queries, filters, and facets. However, if an Attribute's <code>level</code> is set as <code>Product</code>, then Product Projection Search does <strong>not support</strong> the Attribute.</p>
     *  <p>The exact features that are available with this flag depend on the specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a>. The maximum size of a searchable field is <strong>restricted</strong> by the <span>Field content size limit</span>. This constraint is enforced at both <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/products:POST" rel="nofollow">Product creation</a> and <span>Product update</span>. If the length of the input exceeds the maximum size, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
     */

    public Boolean getIsSearchable() {
        return this.isSearchable;
    }

    public void setType(final com.commercetools.api.models.product_type.AttributeType type) {
        this.type = type;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setLabel(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
    }

    public void setIsRequired(final Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public void setLevel(final com.commercetools.api.models.product_type.AttributeLevelEnum level) {
        this.level = level;
    }

    public void setAttributeConstraint(
            final com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint) {
        this.attributeConstraint = attributeConstraint;
    }

    public void setInputTip(final com.commercetools.api.models.common.LocalizedString inputTip) {
        this.inputTip = inputTip;
    }

    public void setInputHint(final com.commercetools.api.models.product_type.TextInputHint inputHint) {
        this.inputHint = inputHint;
    }

    public void setIsSearchable(final Boolean isSearchable) {
        this.isSearchable = isSearchable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AttributeDefinitionImpl that = (AttributeDefinitionImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(name, that.name)
                .append(label, that.label)
                .append(isRequired, that.isRequired)
                .append(level, that.level)
                .append(attributeConstraint, that.attributeConstraint)
                .append(inputTip, that.inputTip)
                .append(inputHint, that.inputHint)
                .append(isSearchable, that.isSearchable)
                .append(type, that.type)
                .append(name, that.name)
                .append(label, that.label)
                .append(isRequired, that.isRequired)
                .append(level, that.level)
                .append(attributeConstraint, that.attributeConstraint)
                .append(inputTip, that.inputTip)
                .append(inputHint, that.inputHint)
                .append(isSearchable, that.isSearchable)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(name)
                .append(label)
                .append(isRequired)
                .append(level)
                .append(attributeConstraint)
                .append(inputTip)
                .append(inputHint)
                .append(isSearchable)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("name", name)
                .append("label", label)
                .append("isRequired", isRequired)
                .append("level", level)
                .append("attributeConstraint", attributeConstraint)
                .append("inputTip", inputTip)
                .append("inputHint", inputHint)
                .append("isSearchable", isSearchable)
                .build();
    }

    @Override
    public AttributeDefinition copyDeep() {
        return AttributeDefinition.deepCopy(this);
    }
}
