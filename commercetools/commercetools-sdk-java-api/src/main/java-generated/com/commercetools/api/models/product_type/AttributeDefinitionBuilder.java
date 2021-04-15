
package com.commercetools.api.models.product_type;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeDefinitionBuilder {

    private com.commercetools.api.models.product_type.AttributeType type;

    private String name;

    private com.commercetools.api.models.common.LocalizedString label;

    private Boolean isRequired;

    private com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString inputTip;

    private com.commercetools.api.models.product_type.TextInputHint inputHint;

    private Boolean isSearchable;

    public AttributeDefinitionBuilder type(final com.commercetools.api.models.product_type.AttributeType type) {
        this.type = type;
        return this;
    }

    public AttributeDefinitionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public AttributeDefinitionBuilder label(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public AttributeDefinitionBuilder isRequired(final Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    public AttributeDefinitionBuilder attributeConstraint(
            final com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint) {
        this.attributeConstraint = attributeConstraint;
        return this;
    }

    public AttributeDefinitionBuilder inputTip(
            @Nullable final com.commercetools.api.models.common.LocalizedString inputTip) {
        this.inputTip = inputTip;
        return this;
    }

    public AttributeDefinitionBuilder inputHint(
            final com.commercetools.api.models.product_type.TextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    public AttributeDefinitionBuilder isSearchable(final Boolean isSearchable) {
        this.isSearchable = isSearchable;
        return this;
    }

    public com.commercetools.api.models.product_type.AttributeType getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    public com.commercetools.api.models.product_type.AttributeConstraintEnum getAttributeConstraint() {
        return this.attributeConstraint;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getInputTip() {
        return this.inputTip;
    }

    public com.commercetools.api.models.product_type.TextInputHint getInputHint() {
        return this.inputHint;
    }

    public Boolean getIsSearchable() {
        return this.isSearchable;
    }

    public AttributeDefinition build() {
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
