
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeDefinitionDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeDefinitionDraft attributeDefinitionDraft = AttributeDefinitionDraft.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .name("{name}")
 *             .label(labelBuilder -> labelBuilder)
 *             .isRequired(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    /**
     *  <p>Describes the type of the attribute.</p>
     */

    public AttributeDefinitionDraftBuilder type(final com.commercetools.api.models.product_type.AttributeType type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Describes the type of the attribute.</p>
     */

    public AttributeDefinitionDraftBuilder type(
            Function<com.commercetools.api.models.product_type.AttributeTypeBuilder, Builder<? extends com.commercetools.api.models.product_type.AttributeType>> builder) {
        this.type = builder.apply(com.commercetools.api.models.product_type.AttributeTypeBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The unique name of the attribute used in the API. The name must be between two and 256 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>). When using the same <code>name</code> for an attribute in two or more product types all fields of the AttributeDefinition of this attribute need to be the same across the product types.</p>
     */

    public AttributeDefinitionDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>A human-readable label for the attribute.</p>
     */

    public AttributeDefinitionDraftBuilder label(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>A human-readable label for the attribute.</p>
     */

    public AttributeDefinitionDraftBuilder label(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>Whether the attribute is required to have a value.</p>
     */

    public AttributeDefinitionDraftBuilder isRequired(final Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     *  <p>Describes how an attribute or a set of attributes should be validated across all variants of a product.</p>
     */

    public AttributeDefinitionDraftBuilder attributeConstraint(
            @Nullable final com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint) {
        this.attributeConstraint = attributeConstraint;
        return this;
    }

    /**
     *  <p>Additional information about the attribute that aids content managers when setting product details.</p>
     */

    public AttributeDefinitionDraftBuilder inputTip(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.inputTip = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Additional information about the attribute that aids content managers when setting product details.</p>
     */

    public AttributeDefinitionDraftBuilder inputTip(
            @Nullable final com.commercetools.api.models.common.LocalizedString inputTip) {
        this.inputTip = inputTip;
        return this;
    }

    /**
     *  <p>Provides a visual representation type for this attribute. only relevant for text-based attribute types like TextType and LocalizableTextType.</p>
     */

    public AttributeDefinitionDraftBuilder inputHint(
            @Nullable final com.commercetools.api.models.product_type.TextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    /**
     *  <p>Whether the attribute's values should generally be enabled in product search. This determines whether the value is stored in products for matching terms in the context of full-text search queries and can be used in facets &amp; filters as part of product search queries. The exact features that are enabled/disabled with this flag depend on the concrete attribute type and are described there.</p>
     */

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
