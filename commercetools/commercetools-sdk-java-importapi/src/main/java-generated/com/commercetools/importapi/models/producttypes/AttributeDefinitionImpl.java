
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeDefinitionImpl implements AttributeDefinition {

    private com.commercetools.importapi.models.producttypes.AttributeType type;

    private String name;

    private com.commercetools.importapi.models.common.LocalizedString label;

    private Boolean isRequired;

    private com.commercetools.importapi.models.producttypes.AttributeConstraintEnum attributeConstraint;

    private com.commercetools.importapi.models.common.LocalizedString inputTip;

    private com.commercetools.importapi.models.producttypes.TextInputHint inputHint;

    private Boolean isSearchable;

    @JsonCreator
    AttributeDefinitionImpl(
            @JsonProperty("type") final com.commercetools.importapi.models.producttypes.AttributeType type,
            @JsonProperty("name") final String name,
            @JsonProperty("label") final com.commercetools.importapi.models.common.LocalizedString label,
            @JsonProperty("isRequired") final Boolean isRequired,
            @JsonProperty("attributeConstraint") final com.commercetools.importapi.models.producttypes.AttributeConstraintEnum attributeConstraint,
            @JsonProperty("inputTip") final com.commercetools.importapi.models.common.LocalizedString inputTip,
            @JsonProperty("inputHint") final com.commercetools.importapi.models.producttypes.TextInputHint inputHint,
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

    public com.commercetools.importapi.models.producttypes.AttributeType getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public com.commercetools.importapi.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    public com.commercetools.importapi.models.producttypes.AttributeConstraintEnum getAttributeConstraint() {
        return this.attributeConstraint;
    }

    public com.commercetools.importapi.models.common.LocalizedString getInputTip() {
        return this.inputTip;
    }

    public com.commercetools.importapi.models.producttypes.TextInputHint getInputHint() {
        return this.inputHint;
    }

    public Boolean getIsSearchable() {
        return this.isSearchable;
    }

    public void setType(final com.commercetools.importapi.models.producttypes.AttributeType type) {
        this.type = type;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setLabel(final com.commercetools.importapi.models.common.LocalizedString label) {
        this.label = label;
    }

    public void setIsRequired(final Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public void setAttributeConstraint(
            final com.commercetools.importapi.models.producttypes.AttributeConstraintEnum attributeConstraint) {
        this.attributeConstraint = attributeConstraint;
    }

    public void setInputTip(final com.commercetools.importapi.models.common.LocalizedString inputTip) {
        this.inputTip = inputTip;
    }

    public void setInputHint(final com.commercetools.importapi.models.producttypes.TextInputHint inputHint) {
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

        return new EqualsBuilder().append(type, that.type).append(name, that.name).append(label, that.label).append(
            isRequired, that.isRequired).append(attributeConstraint, that.attributeConstraint).append(inputTip,
                that.inputTip).append(inputHint, that.inputHint).append(isSearchable, that.isSearchable).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(name).append(label).append(isRequired).append(
            attributeConstraint).append(inputTip).append(inputHint).append(isSearchable).toHashCode();
    }

}
