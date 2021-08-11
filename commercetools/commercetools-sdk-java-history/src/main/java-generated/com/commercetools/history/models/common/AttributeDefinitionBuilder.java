
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeDefinitionBuilder implements Builder<AttributeDefinition> {

    private java.lang.Object type;

    private String name;

    private com.commercetools.history.models.common.LocalizedString label;

    private Boolean isRequired;

    private com.commercetools.history.models.common.AttributeConstraintEnum attributeConstraint;

    private com.commercetools.history.models.common.LocalizedString inputTip;

    private com.commercetools.history.models.common.TextInputHint inputHint;

    private Boolean isSearchable;

    public AttributeDefinitionBuilder type(final java.lang.Object type) {
        this.type = type;
        return this;
    }

    public AttributeDefinitionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public AttributeDefinitionBuilder label(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public AttributeDefinitionBuilder label(final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public AttributeDefinitionBuilder isRequired(final Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    public AttributeDefinitionBuilder attributeConstraint(
            final com.commercetools.history.models.common.AttributeConstraintEnum attributeConstraint) {
        this.attributeConstraint = attributeConstraint;
        return this;
    }

    public AttributeDefinitionBuilder inputTip(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.inputTip = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public AttributeDefinitionBuilder inputTip(final com.commercetools.history.models.common.LocalizedString inputTip) {
        this.inputTip = inputTip;
        return this;
    }

    public AttributeDefinitionBuilder inputHint(final com.commercetools.history.models.common.TextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    public AttributeDefinitionBuilder isSearchable(final Boolean isSearchable) {
        this.isSearchable = isSearchable;
        return this;
    }

    public java.lang.Object getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public com.commercetools.history.models.common.LocalizedString getLabel() {
        return this.label;
    }

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

    public Boolean getIsSearchable() {
        return this.isSearchable;
    }

    public AttributeDefinition build() {
        Objects.requireNonNull(type, AttributeDefinition.class + ": type is missing");
        Objects.requireNonNull(name, AttributeDefinition.class + ": name is missing");
        Objects.requireNonNull(label, AttributeDefinition.class + ": label is missing");
        Objects.requireNonNull(isRequired, AttributeDefinition.class + ": isRequired is missing");
        Objects.requireNonNull(attributeConstraint, AttributeDefinition.class + ": attributeConstraint is missing");
        Objects.requireNonNull(inputTip, AttributeDefinition.class + ": inputTip is missing");
        Objects.requireNonNull(inputHint, AttributeDefinition.class + ": inputHint is missing");
        Objects.requireNonNull(isSearchable, AttributeDefinition.class + ": isSearchable is missing");
        return new AttributeDefinitionImpl(type, name, label, isRequired, attributeConstraint, inputTip, inputHint,
            isSearchable);
    }

    /**
     * builds AttributeDefinition without checking for non null required values
     */
    public AttributeDefinition buildUnchecked() {
        return new AttributeDefinitionImpl(type, name, label, isRequired, attributeConstraint, inputTip, inputHint,
            isSearchable);
    }

    public static AttributeDefinitionBuilder of() {
        return new AttributeDefinitionBuilder();
    }

    public static AttributeDefinitionBuilder of(final AttributeDefinition template) {
        AttributeDefinitionBuilder builder = new AttributeDefinitionBuilder();
        builder.type = template.getType();
        builder.name = template.getName();
        builder.label = template.getLabel();
        builder.isRequired = template.getIsRequired();
        builder.attributeConstraint = template.getAttributeConstraint();
        builder.inputTip = template.getInputTip();
        builder.inputHint = template.getInputHint();
        builder.isSearchable = template.getIsSearchable();
        return builder;
    }

}
