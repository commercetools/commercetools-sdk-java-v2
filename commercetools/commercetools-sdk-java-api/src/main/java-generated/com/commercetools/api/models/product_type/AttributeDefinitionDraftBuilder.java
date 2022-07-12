
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
     *  <p>Describes the Type of the Attribute.</p>
     */

    public AttributeDefinitionDraftBuilder type(final com.commercetools.api.models.product_type.AttributeType type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Describes the Type of the Attribute.</p>
     */

    public AttributeDefinitionDraftBuilder type(
            Function<com.commercetools.api.models.product_type.AttributeTypeBuilder, Builder<? extends com.commercetools.api.models.product_type.AttributeType>> builder) {
        this.type = builder.apply(com.commercetools.api.models.product_type.AttributeTypeBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined name of the Attribute that is unique with the Project. When using the same <code>name</code> for an Attribute in multiple ProductTypes, all fields of the AttributeDefinition of this Attribute must be the same across the ProductTypes. Otherwise an AttributeDefinitionAlreadyExistsError will be returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> Type and sets thereof.</p>
     */

    public AttributeDefinitionDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Human-readable label for the Attribute.</p>
     */

    public AttributeDefinitionDraftBuilder label(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Human-readable label for the Attribute.</p>
     */

    public AttributeDefinitionDraftBuilder label(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>Set to <code>true</code> if the Attribute is required to have a value on a ProductVariant.</p>
     */

    public AttributeDefinitionDraftBuilder isRequired(final Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     *  <p>Specifies how an Attribute or a combination of Attributes should be validated across all variants of a Product.</p>
     */

    public AttributeDefinitionDraftBuilder attributeConstraint(
            @Nullable final com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint) {
        this.attributeConstraint = attributeConstraint;
        return this;
    }

    /**
     *  <p>Provides additional information about the Attribute that aids content managers when setting Product details.</p>
     */

    public AttributeDefinitionDraftBuilder inputTip(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.inputTip = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Provides additional information about the Attribute that aids content managers when setting Product details.</p>
     */

    public AttributeDefinitionDraftBuilder inputTip(
            @Nullable final com.commercetools.api.models.common.LocalizedString inputTip) {
        this.inputTip = inputTip;
        return this;
    }

    /**
     *  <p>Provides a visual representation directive for values of this Attribute (only relevant for AttributeTextType and AttributeLocalizableTextType).</p>
     */

    public AttributeDefinitionDraftBuilder inputHint(
            @Nullable final com.commercetools.api.models.product_type.TextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    /**
     *  <p>Set to <code>true</code> if the Attribute's values should be available in the Product Projections Search API and can be used in full-text search queries, filters, and facets. Which exact features are available with this flag depends on the specific AttributeType. The maximum size of a searchable field is <strong>restricted</strong> by the Field content size limit. This constraint is enforced at both Product creation and Product update. If the length of the input exceeds the maximum size, an InvalidField error is returned.</p>
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
