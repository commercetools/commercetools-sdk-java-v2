
package com.commercetools.importapi.models.producttypes;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AttributeDefinitionBuilder implements Builder<AttributeDefinition> {

    private com.commercetools.importapi.models.producttypes.AttributeType type;

    private String name;

    private com.commercetools.importapi.models.common.LocalizedString label;

    private Boolean isRequired;

    @Nullable
    private com.commercetools.importapi.models.producttypes.AttributeConstraintEnum attributeConstraint;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString inputTip;

    @Nullable
    private com.commercetools.importapi.models.producttypes.TextInputHint inputHint;

    @Nullable
    private Boolean isSearchable;

    public AttributeDefinitionBuilder type(final com.commercetools.importapi.models.producttypes.AttributeType type) {
        this.type = type;
        return this;
    }

    public AttributeDefinitionBuilder type(
            Function<com.commercetools.importapi.models.producttypes.AttributeTypeBuilder, Builder<? extends com.commercetools.importapi.models.producttypes.AttributeType>> builder) {
        this.type = builder.apply(com.commercetools.importapi.models.producttypes.AttributeTypeBuilder.of()).build();
        return this;
    }

    public AttributeDefinitionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public AttributeDefinitionBuilder label(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public AttributeDefinitionBuilder label(final com.commercetools.importapi.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public AttributeDefinitionBuilder isRequired(final Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    public AttributeDefinitionBuilder attributeConstraint(
            @Nullable final com.commercetools.importapi.models.producttypes.AttributeConstraintEnum attributeConstraint) {
        this.attributeConstraint = attributeConstraint;
        return this;
    }

    public AttributeDefinitionBuilder inputTip(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.inputTip = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public AttributeDefinitionBuilder inputTip(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString inputTip) {
        this.inputTip = inputTip;
        return this;
    }

    public AttributeDefinitionBuilder inputHint(
            @Nullable final com.commercetools.importapi.models.producttypes.TextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    public AttributeDefinitionBuilder isSearchable(@Nullable final Boolean isSearchable) {
        this.isSearchable = isSearchable;
        return this;
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

    @Nullable
    public com.commercetools.importapi.models.producttypes.AttributeConstraintEnum getAttributeConstraint() {
        return this.attributeConstraint;
    }

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getInputTip() {
        return this.inputTip;
    }

    @Nullable
    public com.commercetools.importapi.models.producttypes.TextInputHint getInputHint() {
        return this.inputHint;
    }

    @Nullable
    public Boolean getIsSearchable() {
        return this.isSearchable;
    }

    public AttributeDefinition build() {
        Objects.requireNonNull(type, AttributeDefinition.class + ": type is missing");
        Objects.requireNonNull(name, AttributeDefinition.class + ": name is missing");
        Objects.requireNonNull(label, AttributeDefinition.class + ": label is missing");
        Objects.requireNonNull(isRequired, AttributeDefinition.class + ": isRequired is missing");
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
