
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
 *  <p>Specify the Attribute to be created with the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTypeDraft" rel="nofollow">ProductTypeDraft</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeDefinitionDraftImpl implements AttributeDefinitionDraft, ModelBase {

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
    AttributeDefinitionDraftImpl(
            @JsonProperty("type") final com.commercetools.api.models.product_type.AttributeType type,
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
    public AttributeDefinitionDraftImpl() {
    }

    /**
     *  <p>Describes the Type of the Attribute.</p>
     *  <p>When the <code>type</code> is different for an AttributeDefinition using the same name in multiple ProductTypes, an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinitionTypeConflictError" rel="nofollow">AttributeDefinitionTypeConflict</a> error is returned.</p>
     */

    public com.commercetools.api.models.product_type.AttributeType getType() {
        return this.type;
    }

    /**
     *  <p>User-defined name of the Attribute that is unique to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     *  <p>When using the same <code>name</code> for an Attribute in multiple ProductTypes, all fields of the AttributeDefinition of this Attribute must be the same across the ProductTypes, else an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinitionAlreadyExistsError" rel="nofollow">AttributeDefinitionAlreadyExists</a> error is returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> Type and sets thereof.</p>
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
     *  <p>Set to <code>true</code> if the Attribute is required to have a value on a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
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
     *  <p>Specifies how an Attribute or a combination of Attributes should be validated across all variants of a Product. If the Attribute is defined at Product level, then <code>attributeConstraint</code> must be <code>None</code>. Otherwise, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
     */

    public com.commercetools.api.models.product_type.AttributeConstraintEnum getAttributeConstraint() {
        return this.attributeConstraint;
    }

    /**
     *  <p>Provides additional information about the Attribute that aids content managers when setting Product details.</p>
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
     *  <p>Set as <code>true</code> if you want the Attribute's values to be available in the <span>Product Search</span> or the <span>Product Projection Search</span> API and can be used in full-text search queries, filters, and facets. If an Attribute's <code>level</code> is set as <code>Product</code>, then Product Projection Search does <strong>not support</strong> the Attribute.</p>
     *  <p>Which exact features are available with this flag depends on the specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a>. The maximum size of a searchable field is <strong>restricted</strong> by the <span>Field content size limit</span>. This constraint is enforced at both Product creation and Product update. If the length of the input exceeds the maximum size, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
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

        AttributeDefinitionDraftImpl that = (AttributeDefinitionDraftImpl) o;

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
    public AttributeDefinitionDraft copyDeep() {
        return AttributeDefinitionDraft.deepCopy(this);
    }
}
