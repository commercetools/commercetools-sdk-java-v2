
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeDefinitionDraftImpl implements AttributeDefinitionDraft {

    private com.commercetools.api.models.product_type.AttributeType type;

    private String name;

    private com.commercetools.api.models.common.LocalizedString label;

    private Boolean isRequired;

    private com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint;

    private com.commercetools.api.models.common.LocalizedString inputTip;

    private com.commercetools.api.models.product_type.TextInputHint inputHint;

    private Boolean isSearchable;

    @JsonCreator
    AttributeDefinitionDraftImpl(
            @JsonProperty("type") final com.commercetools.api.models.product_type.AttributeType type,
            @JsonProperty("name") final String name,
            @JsonProperty("label") final com.commercetools.api.models.common.LocalizedString label,
            @JsonProperty("isRequired") final Boolean isRequired,
            @JsonProperty("attributeConstraint") final com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint,
            @JsonProperty("inputTip") final com.commercetools.api.models.common.LocalizedString inputTip,
            @JsonProperty("inputHint") final com.commercetools.api.models.product_type.TextInputHint inputHint,
            @JsonProperty("isSearchable") final Boolean isSearchable) {
        this.type = type;
        this.name = name;
        this.label = label;
        this.isRequired = isRequired;
        this.attributeConstraint = attributeConstraint;
        this.inputTip = inputTip;
        this.inputHint = inputHint;
        this.isSearchable = isSearchable;
    }

    public AttributeDefinitionDraftImpl() {
    }

    /**
    *  <p>Describes the type of the attribute.</p>
    */
    public com.commercetools.api.models.product_type.AttributeType getType() {
        return this.type;
    }

    /**
    *  <p>The unique name of the attribute used in the API.
    *  The name must be between two and 256 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>).
    *  When using the same <code>name</code> for an attribute in two or more product types all fields of the AttributeDefinition of this attribute need to be the same across the product types.</p>
    */
    public String getName() {
        return this.name;
    }

    /**
    *  <p>A human-readable label for the attribute.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
    *  <p>Whether the attribute is required to have a value.</p>
    */
    public Boolean getIsRequired() {
        return this.isRequired;
    }

    /**
    *  <p>Describes how an attribute or a set of attributes should be validated across all variants of a product.</p>
    */
    public com.commercetools.api.models.product_type.AttributeConstraintEnum getAttributeConstraint() {
        return this.attributeConstraint;
    }

    /**
    *  <p>Additional information about the attribute that aids content managers when setting product details.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getInputTip() {
        return this.inputTip;
    }

    /**
    *  <p>Provides a visual representation type for this attribute.
    *  only relevant for text-based attribute types like TextType and LocalizableTextType.</p>
    */
    public com.commercetools.api.models.product_type.TextInputHint getInputHint() {
        return this.inputHint;
    }

    /**
    *  <p>Whether the attribute's values should generally be enabled in product search.
    *  This determines whether the value is stored in products for matching terms in the context of full-text search queries and can be used in facets &amp; filters as part of product search queries.
    *  The exact features that are enabled/disabled with this flag depend on the concrete attribute type and are described there.</p>
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
                .append(attributeConstraint)
                .append(inputTip)
                .append(inputHint)
                .append(isSearchable)
                .toHashCode();
    }

}
