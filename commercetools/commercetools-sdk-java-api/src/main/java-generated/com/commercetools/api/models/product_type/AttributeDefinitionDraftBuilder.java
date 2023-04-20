
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
     *  <p>When the <code>type</code> is different for an AttributeDefinition using the same name in multiple ProductTypes, an AttributeDefinitionTypeConflict error is returned.</p>
     * @param type value to be set
     * @return Builder
     */

    public AttributeDefinitionDraftBuilder type(final com.commercetools.api.models.product_type.AttributeType type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Describes the Type of the Attribute.</p>
     *  <p>When the <code>type</code> is different for an AttributeDefinition using the same name in multiple ProductTypes, an AttributeDefinitionTypeConflict error is returned.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public AttributeDefinitionDraftBuilder type(
            Function<com.commercetools.api.models.product_type.AttributeTypeBuilder, Builder<? extends com.commercetools.api.models.product_type.AttributeType>> builder) {
        this.type = builder.apply(com.commercetools.api.models.product_type.AttributeTypeBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined name of the Attribute that is unique with the Project.</p>
     *  <p>When using the same <code>name</code> for an Attribute in multiple ProductTypes, all fields of the AttributeDefinition of this Attribute must be the same across the ProductTypes, else an AttributeDefinitionAlreadyExists error is returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> Type and sets thereof.</p>
     * @param name value to be set
     * @return Builder
     */

    public AttributeDefinitionDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Human-readable label for the Attribute.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public AttributeDefinitionDraftBuilder label(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Human-readable label for the Attribute.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public AttributeDefinitionDraftBuilder withLabel(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Human-readable label for the Attribute.</p>
     * @param label value to be set
     * @return Builder
     */

    public AttributeDefinitionDraftBuilder label(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>Set to <code>true</code> if the Attribute is required to have a value on a ProductVariant.</p>
     * @param isRequired value to be set
     * @return Builder
     */

    public AttributeDefinitionDraftBuilder isRequired(final Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     *  <p>Specifies how an Attribute or a combination of Attributes should be validated across all variants of a Product.</p>
     * @param attributeConstraint value to be set
     * @return Builder
     */

    public AttributeDefinitionDraftBuilder attributeConstraint(
            @Nullable final com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint) {
        this.attributeConstraint = attributeConstraint;
        return this;
    }

    /**
     *  <p>Provides additional information about the Attribute that aids content managers when setting Product details.</p>
     * @param builder function to build the inputTip value
     * @return Builder
     */

    public AttributeDefinitionDraftBuilder inputTip(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.inputTip = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Provides additional information about the Attribute that aids content managers when setting Product details.</p>
     * @param builder function to build the inputTip value
     * @return Builder
     */

    public AttributeDefinitionDraftBuilder withInputTip(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.inputTip = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Provides additional information about the Attribute that aids content managers when setting Product details.</p>
     * @param inputTip value to be set
     * @return Builder
     */

    public AttributeDefinitionDraftBuilder inputTip(
            @Nullable final com.commercetools.api.models.common.LocalizedString inputTip) {
        this.inputTip = inputTip;
        return this;
    }

    /**
     *  <p>Provides a visual representation directive for values of this Attribute (only relevant for AttributeTextType and AttributeLocalizableTextType).</p>
     * @param inputHint value to be set
     * @return Builder
     */

    public AttributeDefinitionDraftBuilder inputHint(
            @Nullable final com.commercetools.api.models.product_type.TextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    /**
     *  <p>Set to <code>true</code> if the Attribute's values should be available in the Product Projections Search API and can be used in full-text search queries, filters, and facets. Which exact features are available with this flag depends on the specific AttributeType. The maximum size of a searchable field is <strong>restricted</strong> by the Field content size limit. This constraint is enforced at both Product creation and Product update. If the length of the input exceeds the maximum size, an InvalidField error is returned.</p>
     * @param isSearchable value to be set
     * @return Builder
     */

    public AttributeDefinitionDraftBuilder isSearchable(@Nullable final Boolean isSearchable) {
        this.isSearchable = isSearchable;
        return this;
    }

    /**
     *  <p>Describes the Type of the Attribute.</p>
     *  <p>When the <code>type</code> is different for an AttributeDefinition using the same name in multiple ProductTypes, an AttributeDefinitionTypeConflict error is returned.</p>
     * @return type
     */

    public com.commercetools.api.models.product_type.AttributeType getType() {
        return this.type;
    }

    /**
     *  <p>User-defined name of the Attribute that is unique with the Project.</p>
     *  <p>When using the same <code>name</code> for an Attribute in multiple ProductTypes, all fields of the AttributeDefinition of this Attribute must be the same across the ProductTypes, else an AttributeDefinitionAlreadyExists error is returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> Type and sets thereof.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Human-readable label for the Attribute.</p>
     * @return label
     */

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     *  <p>Set to <code>true</code> if the Attribute is required to have a value on a ProductVariant.</p>
     * @return isRequired
     */

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    /**
     *  <p>Specifies how an Attribute or a combination of Attributes should be validated across all variants of a Product.</p>
     * @return attributeConstraint
     */

    @Nullable
    public com.commercetools.api.models.product_type.AttributeConstraintEnum getAttributeConstraint() {
        return this.attributeConstraint;
    }

    /**
     *  <p>Provides additional information about the Attribute that aids content managers when setting Product details.</p>
     * @return inputTip
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getInputTip() {
        return this.inputTip;
    }

    /**
     *  <p>Provides a visual representation directive for values of this Attribute (only relevant for AttributeTextType and AttributeLocalizableTextType).</p>
     * @return inputHint
     */

    @Nullable
    public com.commercetools.api.models.product_type.TextInputHint getInputHint() {
        return this.inputHint;
    }

    /**
     *  <p>Set to <code>true</code> if the Attribute's values should be available in the Product Projections Search API and can be used in full-text search queries, filters, and facets. Which exact features are available with this flag depends on the specific AttributeType. The maximum size of a searchable field is <strong>restricted</strong> by the Field content size limit. This constraint is enforced at both Product creation and Product update. If the length of the input exceeds the maximum size, an InvalidField error is returned.</p>
     * @return isSearchable
     */

    @Nullable
    public Boolean getIsSearchable() {
        return this.isSearchable;
    }

    /**
     * builds AttributeDefinitionDraft with checking for non-null required values
     * @return AttributeDefinitionDraft
     */
    public AttributeDefinitionDraft build() {
        Objects.requireNonNull(type, AttributeDefinitionDraft.class + ": type is missing");
        Objects.requireNonNull(name, AttributeDefinitionDraft.class + ": name is missing");
        Objects.requireNonNull(label, AttributeDefinitionDraft.class + ": label is missing");
        Objects.requireNonNull(isRequired, AttributeDefinitionDraft.class + ": isRequired is missing");
        return new AttributeDefinitionDraftImpl(type, name, label, isRequired, attributeConstraint, inputTip, inputHint,
            isSearchable);
    }

    /**
     * builds AttributeDefinitionDraft without checking for non-null required values
     * @return AttributeDefinitionDraft
     */
    public AttributeDefinitionDraft buildUnchecked() {
        return new AttributeDefinitionDraftImpl(type, name, label, isRequired, attributeConstraint, inputTip, inputHint,
            isSearchable);
    }

    /**
     * factory method for an instance of AttributeDefinitionDraftBuilder
     * @return builder
     */
    public static AttributeDefinitionDraftBuilder of() {
        return new AttributeDefinitionDraftBuilder();
    }

    /**
     * create builder for AttributeDefinitionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
