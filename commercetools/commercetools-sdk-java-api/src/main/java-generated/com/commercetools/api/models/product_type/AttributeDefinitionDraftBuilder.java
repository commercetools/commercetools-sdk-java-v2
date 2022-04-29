
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AttributeDefinitionDraftBuilder implements Builder<AttributeDefinitionDraft> {

    private com.commercetools.api.models.product_type.AttributeType type;

    private String name;

    private com.commercetools.api.models.common.LocalizedString label;

    private Boolean isRequired;

    @Nullable
    private com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString inputTip;

    @Nullable
    private com.commercetools.api.models.product_type.TextInputHint inputHint;

    @Nullable
    private Boolean isSearchable;

    public AttributeDefinitionDraftBuilder type(final com.commercetools.api.models.product_type.AttributeType type) {
        this.type = type;
        return this;
    }

    public AttributeDefinitionDraftBuilder type(
            Function<com.commercetools.api.models.product_type.AttributeTypeBuilder, Builder<? extends com.commercetools.api.models.product_type.AttributeType>> builder) {
        this.type = builder.apply(com.commercetools.api.models.product_type.AttributeTypeBuilder.of()).build();
        return this;
    }

    public AttributeDefinitionDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public AttributeDefinitionDraftBuilder label(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public AttributeDefinitionDraftBuilder label(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public AttributeDefinitionDraftBuilder isRequired(final Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    public AttributeDefinitionDraftBuilder attributeConstraint(
            @Nullable final com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint) {
        this.attributeConstraint = attributeConstraint;
        return this;
    }

    public AttributeDefinitionDraftBuilder inputTip(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.inputTip = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public AttributeDefinitionDraftBuilder inputTip(
            @Nullable final com.commercetools.api.models.common.LocalizedString inputTip) {
        this.inputTip = inputTip;
        return this;
    }

    public AttributeDefinitionDraftBuilder inputHint(
            @Nullable final com.commercetools.api.models.product_type.TextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    public AttributeDefinitionDraftBuilder isSearchable(@Nullable final Boolean isSearchable) {
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

    @Nullable
    public com.commercetools.api.models.product_type.AttributeConstraintEnum getAttributeConstraint() {
        return this.attributeConstraint;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getInputTip() {
        return this.inputTip;
    }

    @Nullable
    public com.commercetools.api.models.product_type.TextInputHint getInputHint() {
        return this.inputHint;
    }

    @Nullable
    public Boolean getIsSearchable() {
        return this.isSearchable;
    }

    public AttributeDefinitionDraft build() {
        Objects.requireNonNull(type, AttributeDefinitionDraft.class + ": type is missing");
        Objects.requireNonNull(name, AttributeDefinitionDraft.class + ": name is missing");
        Objects.requireNonNull(label, AttributeDefinitionDraft.class + ": label is missing");
        Objects.requireNonNull(isRequired, AttributeDefinitionDraft.class + ": isRequired is missing");
        return new AttributeDefinitionDraftImpl(type, name, label, isRequired, attributeConstraint, inputTip, inputHint,
            isSearchable);
    }

    /**
     * builds AttributeDefinitionDraft without checking for non null required values
     */
    public AttributeDefinitionDraft buildUnchecked() {
        return new AttributeDefinitionDraftImpl(type, name, label, isRequired, attributeConstraint, inputTip, inputHint,
            isSearchable);
    }

    public static AttributeDefinitionDraftBuilder of() {
        return new AttributeDefinitionDraftBuilder();
    }

    public static AttributeDefinitionDraftBuilder of(final AttributeDefinitionDraft template) {
        AttributeDefinitionDraftBuilder builder = new AttributeDefinitionDraftBuilder();
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
