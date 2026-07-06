
package com.commercetools.history.models.common;

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

    private com.commercetools.history.models.common.AttributeType type;

    private String name;

    private com.commercetools.history.models.common.LocalizedString label;

    private Boolean isRequired;

    private com.commercetools.history.models.common.AttributeLevelEnum level;

    private com.commercetools.history.models.common.AttributeConstraintEnum attributeConstraint;

    @Nullable
    private com.commercetools.history.models.common.LocalizedString inputTip;

    private com.commercetools.history.models.common.TextInputHint inputHint;

    private Boolean isSearchable;

    /**
     *  <p>Describes the Type of the Attribute.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public AttributeDefinitionBuilder type(
            Function<com.commercetools.history.models.common.AttributeTypeBuilder, com.commercetools.history.models.common.AttributeTypeBuilder> builder) {
        this.type = builder.apply(com.commercetools.history.models.common.AttributeTypeBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Describes the Type of the Attribute.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public AttributeDefinitionBuilder withType(
            Function<com.commercetools.history.models.common.AttributeTypeBuilder, com.commercetools.history.models.common.AttributeType> builder) {
        this.type = builder.apply(com.commercetools.history.models.common.AttributeTypeBuilder.of());
        return this;
    }

    /**
     *  <p>Describes the Type of the Attribute.</p>
     * @param type value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder type(final com.commercetools.history.models.common.AttributeType type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>User-defined name of the Attribute that is unique within the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
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
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Human-readable label for the Attribute.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public AttributeDefinitionBuilder withLabel(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Human-readable label for the Attribute.</p>
     * @param label value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder label(final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>If <code>true</code>, the Attribute must have a value on a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
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

    public AttributeDefinitionBuilder level(final com.commercetools.history.models.common.AttributeLevelEnum level) {
        this.level = level;
        return this;
    }

    /**
     *  <p>Specifies how Attributes are validated across all variants of a Product.</p>
     * @param attributeConstraint value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder attributeConstraint(
            final com.commercetools.history.models.common.AttributeConstraintEnum attributeConstraint) {
        this.attributeConstraint = attributeConstraint;
        return this;
    }

    /**
     *  <p>Provides additional Attribute information to aid content managers configure Product details.</p>
     * @param builder function to build the inputTip value
     * @return Builder
     */

    public AttributeDefinitionBuilder inputTip(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.inputTip = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Provides additional Attribute information to aid content managers configure Product details.</p>
     * @param builder function to build the inputTip value
     * @return Builder
     */

    public AttributeDefinitionBuilder withInputTip(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.inputTip = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Provides additional Attribute information to aid content managers configure Product details.</p>
     * @param inputTip value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder inputTip(
            @Nullable final com.commercetools.history.models.common.LocalizedString inputTip) {
        this.inputTip = inputTip;
        return this;
    }

    /**
     *  <p>Provides a visual representation directive for values of this Attribute (only relevant for <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeTextType" rel="nofollow">AttributeTextType</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizableTextType" rel="nofollow">AttributeLocalizableTextType</a>).</p>
     * @param inputHint value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder inputHint(final com.commercetools.history.models.common.TextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    /**
     *  <p>If <code>true</code>, the Attribute's values are available in the <span>Product Search</span> or the <span>Product Projection Search</span> API for use in full-text search queries, filters, and facets. However, if an Attribute's <code>level</code> is set as <code>Product</code>, then Product Projection Search does <strong>not support</strong> the Attribute.</p>
     *  <p>The exact features that are available with this flag depend on the specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a>. The maximum size of a searchable field is <strong>restricted</strong> by the <span>Field content size limit</span>. This constraint is enforced at both <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/products:POST" rel="nofollow">Product creation</a> and <span>Product update</span>. If the length of the input exceeds the maximum size, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
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

    public com.commercetools.history.models.common.AttributeType getType() {
        return this.type;
    }

    /**
     *  <p>User-defined name of the Attribute that is unique within the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Human-readable label for the Attribute.</p>
     * @return label
     */

    public com.commercetools.history.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     *  <p>If <code>true</code>, the Attribute must have a value on a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @return isRequired
     */

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    /**
     *  <p>Specifies whether the Attribute is defined at the Product or Variant level.</p>
     * @return level
     */

    public com.commercetools.history.models.common.AttributeLevelEnum getLevel() {
        return this.level;
    }

    /**
     *  <p>Specifies how Attributes are validated across all variants of a Product.</p>
     * @return attributeConstraint
     */

    public com.commercetools.history.models.common.AttributeConstraintEnum getAttributeConstraint() {
        return this.attributeConstraint;
    }

    /**
     *  <p>Provides additional Attribute information to aid content managers configure Product details.</p>
     * @return inputTip
     */

    @Nullable
    public com.commercetools.history.models.common.LocalizedString getInputTip() {
        return this.inputTip;
    }

    /**
     *  <p>Provides a visual representation directive for values of this Attribute (only relevant for <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeTextType" rel="nofollow">AttributeTextType</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizableTextType" rel="nofollow">AttributeLocalizableTextType</a>).</p>
     * @return inputHint
     */

    public com.commercetools.history.models.common.TextInputHint getInputHint() {
        return this.inputHint;
    }

    /**
     *  <p>If <code>true</code>, the Attribute's values are available in the <span>Product Search</span> or the <span>Product Projection Search</span> API for use in full-text search queries, filters, and facets. However, if an Attribute's <code>level</code> is set as <code>Product</code>, then Product Projection Search does <strong>not support</strong> the Attribute.</p>
     *  <p>The exact features that are available with this flag depend on the specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a>. The maximum size of a searchable field is <strong>restricted</strong> by the <span>Field content size limit</span>. This constraint is enforced at both <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/products:POST" rel="nofollow">Product creation</a> and <span>Product update</span>. If the length of the input exceeds the maximum size, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
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
