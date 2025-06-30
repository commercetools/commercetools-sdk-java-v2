
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeDefinitionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeDefinition attributeDefinition = AttributeDefinition.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .name("{name}")
 *             .label(labelBuilder -> labelBuilder)
 *             .isRequired(true)
 *             .level(AttributeLevelEnum.PRODUCT)
 *             .attributeConstraint(AttributeConstraintEnum.NONE)
 *             .inputHint(TextInputHint.SINGLE_LINE)
 *             .isSearchable(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeDefinitionBuilder implements Builder<AttributeDefinition> {

    private com.commercetools.api.models.product_type.AttributeType type;

    private String name;

    private com.commercetools.api.models.common.LocalizedString label;

    private Boolean isRequired;

    private com.commercetools.api.models.product_type.AttributeLevelEnum level;

    private com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString inputTip;

    private com.commercetools.api.models.product_type.TextInputHint inputHint;

    private Boolean isSearchable;

    /**
     *  <p>Describes the Type of the Attribute.</p>
     * @param type value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder type(final com.commercetools.api.models.product_type.AttributeType type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Describes the Type of the Attribute.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public AttributeDefinitionBuilder type(
            Function<com.commercetools.api.models.product_type.AttributeTypeBuilder, Builder<? extends com.commercetools.api.models.product_type.AttributeType>> builder) {
        this.type = builder.apply(com.commercetools.api.models.product_type.AttributeTypeBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined name of the Attribute that is unique within the Project.</p>
     * @param name value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Human-readable label for the Attribute.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public AttributeDefinitionBuilder label(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Human-readable label for the Attribute.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public AttributeDefinitionBuilder withLabel(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Human-readable label for the Attribute.</p>
     * @param label value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder label(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>If <code>true</code>, the Attribute must have a value on a ProductVariant.</p>
     * @param isRequired value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder isRequired(final Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     *  <p>Specifies whether the Attribute is defined at the Product or Variant level.</p>
     * @param level value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder level(final com.commercetools.api.models.product_type.AttributeLevelEnum level) {
        this.level = level;
        return this;
    }

    /**
     *  <p>Specifies how Attributes are validated across all variants of a Product.</p>
     * @param attributeConstraint value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder attributeConstraint(
            final com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint) {
        this.attributeConstraint = attributeConstraint;
        return this;
    }

    /**
     *  <p>Provides additional Attribute information to aid content managers configure Product details.</p>
     * @param builder function to build the inputTip value
     * @return Builder
     */

    public AttributeDefinitionBuilder inputTip(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.inputTip = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Provides additional Attribute information to aid content managers configure Product details.</p>
     * @param builder function to build the inputTip value
     * @return Builder
     */

    public AttributeDefinitionBuilder withInputTip(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.inputTip = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Provides additional Attribute information to aid content managers configure Product details.</p>
     * @param inputTip value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder inputTip(
            @Nullable final com.commercetools.api.models.common.LocalizedString inputTip) {
        this.inputTip = inputTip;
        return this;
    }

    /**
     *  <p>Provides a visual representation directive for values of this Attribute (only relevant for AttributeTextType and AttributeLocalizableTextType).</p>
     * @param inputHint value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder inputHint(
            final com.commercetools.api.models.product_type.TextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    /**
     *  <p>If <code>true</code>, the Attribute's values are available in the Product Search or the Product Projection Search API for use in full-text search queries, filters, and facets.</p>
     *  <p>Which exact features are available with this flag depends on the specific AttributeType. The maximum size of a searchable field is <strong>restricted</strong> by the Field content size limit. This constraint is enforced at both Product creation and Product update. If the length of the input exceeds the maximum size, an InvalidField error is returned.</p>
     * @param isSearchable value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder isSearchable(final Boolean isSearchable) {
        this.isSearchable = isSearchable;
        return this;
    }

    /**
     *  <p>Describes the Type of the Attribute.</p>
     * @return type
     */

    public com.commercetools.api.models.product_type.AttributeType getType() {
        return this.type;
    }

    /**
     *  <p>User-defined name of the Attribute that is unique within the Project.</p>
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
     *  <p>If <code>true</code>, the Attribute must have a value on a ProductVariant.</p>
     * @return isRequired
     */

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    /**
     *  <p>Specifies whether the Attribute is defined at the Product or Variant level.</p>
     * @return level
     */

    public com.commercetools.api.models.product_type.AttributeLevelEnum getLevel() {
        return this.level;
    }

    /**
     *  <p>Specifies how Attributes are validated across all variants of a Product.</p>
     * @return attributeConstraint
     */

    public com.commercetools.api.models.product_type.AttributeConstraintEnum getAttributeConstraint() {
        return this.attributeConstraint;
    }

    /**
     *  <p>Provides additional Attribute information to aid content managers configure Product details.</p>
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

    public com.commercetools.api.models.product_type.TextInputHint getInputHint() {
        return this.inputHint;
    }

    /**
     *  <p>If <code>true</code>, the Attribute's values are available in the Product Search or the Product Projection Search API for use in full-text search queries, filters, and facets.</p>
     *  <p>Which exact features are available with this flag depends on the specific AttributeType. The maximum size of a searchable field is <strong>restricted</strong> by the Field content size limit. This constraint is enforced at both Product creation and Product update. If the length of the input exceeds the maximum size, an InvalidField error is returned.</p>
     * @return isSearchable
     */

    public Boolean getIsSearchable() {
        return this.isSearchable;
    }

    /**
     * builds AttributeDefinition with checking for non-null required values
     * @return AttributeDefinition
     */
    public AttributeDefinition build() {
        Objects.requireNonNull(type, AttributeDefinition.class + ": type is missing");
        Objects.requireNonNull(name, AttributeDefinition.class + ": name is missing");
        Objects.requireNonNull(label, AttributeDefinition.class + ": label is missing");
        Objects.requireNonNull(isRequired, AttributeDefinition.class + ": isRequired is missing");
        Objects.requireNonNull(level, AttributeDefinition.class + ": level is missing");
        Objects.requireNonNull(attributeConstraint, AttributeDefinition.class + ": attributeConstraint is missing");
        Objects.requireNonNull(inputHint, AttributeDefinition.class + ": inputHint is missing");
        Objects.requireNonNull(isSearchable, AttributeDefinition.class + ": isSearchable is missing");
        return new AttributeDefinitionImpl(type, name, label, isRequired, level, attributeConstraint, inputTip,
            inputHint, isSearchable);
    }

    /**
     * builds AttributeDefinition without checking for non-null required values
     * @return AttributeDefinition
     */
    public AttributeDefinition buildUnchecked() {
        return new AttributeDefinitionImpl(type, name, label, isRequired, level, attributeConstraint, inputTip,
            inputHint, isSearchable);
    }

    /**
     * factory method for an instance of AttributeDefinitionBuilder
     * @return builder
     */
    public static AttributeDefinitionBuilder of() {
        return new AttributeDefinitionBuilder();
    }

    /**
     * create builder for AttributeDefinition instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeDefinitionBuilder of(final AttributeDefinition template) {
        AttributeDefinitionBuilder builder = new AttributeDefinitionBuilder();
        builder.type = template.getType();
        builder.name = template.getName();
        builder.label = template.getLabel();
        builder.isRequired = template.getIsRequired();
        builder.level = template.getLevel();
        builder.attributeConstraint = template.getAttributeConstraint();
        builder.inputTip = template.getInputTip();
        builder.inputHint = template.getInputHint();
        builder.isSearchable = template.getIsSearchable();
        return builder;
    }

}
