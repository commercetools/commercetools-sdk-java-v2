
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AttributeDefinitionImpl implements AttributeDefinition, ModelBase {

    private com.commercetools.history.models.common.AttributeType type;

    private String name;

    private com.commercetools.history.models.common.LocalizedString label;

    private Boolean isRequired;

    private com.commercetools.history.models.common.AttributeConstraintEnum attributeConstraint;

    private com.commercetools.history.models.common.LocalizedString inputTip;

    private com.commercetools.history.models.common.TextInputHint inputHint;

    private Boolean isSearchable;

    @JsonCreator
    AttributeDefinitionImpl(@JsonProperty("type") final com.commercetools.history.models.common.AttributeType type,
            @JsonProperty("name") final String name,
            @JsonProperty("label") final com.commercetools.history.models.common.LocalizedString label,
            @JsonProperty("isRequired") final Boolean isRequired,
            @JsonProperty("attributeConstraint") final com.commercetools.history.models.common.AttributeConstraintEnum attributeConstraint,
            @JsonProperty("inputTip") final com.commercetools.history.models.common.LocalizedString inputTip,
            @JsonProperty("inputHint") final com.commercetools.history.models.common.TextInputHint inputHint,
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

    public AttributeDefinitionImpl() {
    }

    public com.commercetools.history.models.common.AttributeType getType() {
        return this.type;
    }

    /**
    *  <p>The unique name of the attribute used in the API. The name must be between two and 256 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>). When using the same <code>name</code> for an attribute in two or more product types all fields of the AttributeDefinition of this attribute need to be the same across the product types, otherwise an AttributeDefinitionAlreadyExists error code will be returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> type and sets thereof.</p>
    */
    public String getName() {
        return this.name;
    }

    public com.commercetools.history.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
    *  <p>Whether the attribute is required to have a value.</p>
    */
    public Boolean getIsRequired() {
        return this.isRequired;
    }

    public com.commercetools.history.models.common.AttributeConstraintEnum getAttributeConstraint() {
        return this.attributeConstraint;
    }

    public com.commercetools.history.models.common.LocalizedString getInputTip() {
        return this.inputTip;
    }

    public com.commercetools.history.models.common.TextInputHint getInputHint() {
        return this.inputHint;
    }

    /**
    *  <p>Whether the attribute's values should generally be enabled in product search. This determines whether the value is stored in products for matching terms in the context of full-text search queries  and can be used in facets &amp; filters as part of product search queries. The exact features that are enabled/disabled with this flag depend on the concrete attribute type and are described there. The max size of a searchable field is <strong>restricted to 10922 characters</strong>. This constraint is enforced at both product creation and product update. If the length of the input exceeds the maximum size an InvalidField error is returned.</p>
    */
    public Boolean getIsSearchable() {
        return this.isSearchable;
    }

    public void setType(final com.commercetools.history.models.common.AttributeType type) {
        this.type = type;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setLabel(final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
    }

    public void setIsRequired(final Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public void setAttributeConstraint(
            final com.commercetools.history.models.common.AttributeConstraintEnum attributeConstraint) {
        this.attributeConstraint = attributeConstraint;
    }

    public void setInputTip(final com.commercetools.history.models.common.LocalizedString inputTip) {
        this.inputTip = inputTip;
    }

    public void setInputHint(final com.commercetools.history.models.common.TextInputHint inputHint) {
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
