
package com.commercetools.importapi.models.producttypes;

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

    private com.commercetools.importapi.models.producttypes.AttributeType type;

    private String name;

    private com.commercetools.importapi.models.common.LocalizedString label;

    private Boolean isRequired;

    private com.commercetools.importapi.models.producttypes.AttributeConstraintEnum attributeConstraint;

    private com.commercetools.importapi.models.common.LocalizedString inputTip;

    private com.commercetools.importapi.models.producttypes.TextInputHint inputHint;

    private Boolean isSearchable;

    private com.commercetools.importapi.models.producttypes.AttributeLevel level;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AttributeDefinitionImpl(
            @JsonProperty("type") final com.commercetools.importapi.models.producttypes.AttributeType type,
            @JsonProperty("name") final String name,
            @JsonProperty("label") final com.commercetools.importapi.models.common.LocalizedString label,
            @JsonProperty("isRequired") final Boolean isRequired,
            @JsonProperty("attributeConstraint") final com.commercetools.importapi.models.producttypes.AttributeConstraintEnum attributeConstraint,
            @JsonProperty("inputTip") final com.commercetools.importapi.models.common.LocalizedString inputTip,
            @JsonProperty("inputHint") final com.commercetools.importapi.models.producttypes.TextInputHint inputHint,
            @JsonProperty("isSearchable") final Boolean isSearchable,
            @JsonProperty("level") final com.commercetools.importapi.models.producttypes.AttributeLevel level) {
        this.type = type;
        this.name = name;
        this.label = label;
        this.isRequired = isRequired;
        this.attributeConstraint = attributeConstraint;
        this.inputTip = inputTip;
        this.inputHint = inputHint;
        this.isSearchable = isSearchable;
        this.level = level;
    }

    /**
     * create empty instance
     */
    public AttributeDefinitionImpl() {
    }

    /**
     *
     */

    public com.commercetools.importapi.models.producttypes.AttributeType getType() {
        return this.type;
    }

    /**
     *
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     */

    public com.commercetools.importapi.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     *
     */

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    /**
     *
     */

    public com.commercetools.importapi.models.producttypes.AttributeConstraintEnum getAttributeConstraint() {
        return this.attributeConstraint;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     */

    public com.commercetools.importapi.models.common.LocalizedString getInputTip() {
        return this.inputTip;
    }

    /**
     *
     */

    public com.commercetools.importapi.models.producttypes.TextInputHint getInputHint() {
        return this.inputHint;
    }

    /**
     *
     */

    public Boolean getIsSearchable() {
        return this.isSearchable;
    }

    /**
     *
     */

    public com.commercetools.importapi.models.producttypes.AttributeLevel getLevel() {
        return this.level;
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

    public void setLevel(final com.commercetools.importapi.models.producttypes.AttributeLevel level) {
        this.level = level;
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
                .append(level, that.level)
                .append(type, that.type)
                .append(name, that.name)
                .append(label, that.label)
                .append(isRequired, that.isRequired)
                .append(attributeConstraint, that.attributeConstraint)
                .append(inputTip, that.inputTip)
                .append(inputHint, that.inputHint)
                .append(isSearchable, that.isSearchable)
                .append(level, that.level)
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
                .append(level)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("name", name)
                .append("label", label)
                .append("isRequired", isRequired)
                .append("attributeConstraint", attributeConstraint)
                .append("inputTip", inputTip)
                .append("inputHint", inputHint)
                .append("isSearchable", isSearchable)
                .append("level", level)
                .build();
    }

    @Override
    public AttributeDefinition copyDeep() {
        return AttributeDefinition.deepCopy(this);
    }
}
