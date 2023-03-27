
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

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
 *             .attributeConstraint(AttributeConstraintEnum.NONE)
 *             .inputTip(inputTipBuilder -> inputTipBuilder)
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

    private com.commercetools.history.models.common.AttributeConstraintEnum attributeConstraint;

    private com.commercetools.history.models.common.LocalizedString inputTip;

    private com.commercetools.history.models.common.TextInputHint inputHint;

    private Boolean isSearchable;

    /**
     * set the value to the type using the builder function
     * @param builder function to build the type value
     * @return Builder
     */

    public AttributeDefinitionBuilder type(
            Function<com.commercetools.history.models.common.AttributeTypeBuilder, com.commercetools.history.models.common.AttributeTypeBuilder> builder) {
        this.type = builder.apply(com.commercetools.history.models.common.AttributeTypeBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the type
     * @param type value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder type(final com.commercetools.history.models.common.AttributeType type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>The unique name of the attribute used in the API. The name must be between two and 256 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>). When using the same <code>name</code> for an attribute in two or more product types all fields of the AttributeDefinition of this attribute need to be the same across the product types, otherwise an AttributeDefinitionAlreadyExists error code will be returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> type and sets thereof.</p>
     * @param name value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     * set the value to the label using the builder function
     * @param builder function to build the label value
     * @return Builder
     */

    public AttributeDefinitionBuilder label(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the label
     * @param label value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder label(final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>Whether the attribute is required to have a value.</p>
     * @param isRequired value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder isRequired(final Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * set the value to the attributeConstraint
     * @param attributeConstraint value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder attributeConstraint(
            final com.commercetools.history.models.common.AttributeConstraintEnum attributeConstraint) {
        this.attributeConstraint = attributeConstraint;
        return this;
    }

    /**
     * set the value to the inputTip using the builder function
     * @param builder function to build the inputTip value
     * @return Builder
     */

    public AttributeDefinitionBuilder inputTip(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.inputTip = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the inputTip
     * @param inputTip value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder inputTip(final com.commercetools.history.models.common.LocalizedString inputTip) {
        this.inputTip = inputTip;
        return this;
    }

    /**
     * set the value to the inputHint
     * @param inputHint value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder inputHint(final com.commercetools.history.models.common.TextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    /**
     *  <p>Whether the attribute's values should generally be enabled in product search. This determines whether the value is stored in products for matching terms in the context of full-text search queries and can be used in facets &amp; filters as part of product search queries. The exact features that are enabled/disabled with this flag depend on the concrete attribute type and are described there. The max size of a searchable field is <strong>restricted to 10922 characters</strong>. This constraint is enforced at both product creation and product update. If the length of the input exceeds the maximum size an InvalidField error is returned.</p>
     * @param isSearchable value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder isSearchable(final Boolean isSearchable) {
        this.isSearchable = isSearchable;
        return this;
    }

    /**
     * value of type}
     * @return type
     */

    public com.commercetools.history.models.common.AttributeType getType() {
        return this.type;
    }

    /**
     *  <p>The unique name of the attribute used in the API. The name must be between two and 256 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>). When using the same <code>name</code> for an attribute in two or more product types all fields of the AttributeDefinition of this attribute need to be the same across the product types, otherwise an AttributeDefinitionAlreadyExists error code will be returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> type and sets thereof.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * value of label}
     * @return label
     */

    public com.commercetools.history.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     *  <p>Whether the attribute is required to have a value.</p>
     * @return isRequired
     */

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    /**
     * value of attributeConstraint}
     * @return attributeConstraint
     */

    public com.commercetools.history.models.common.AttributeConstraintEnum getAttributeConstraint() {
        return this.attributeConstraint;
    }

    /**
     * value of inputTip}
     * @return inputTip
     */

    public com.commercetools.history.models.common.LocalizedString getInputTip() {
        return this.inputTip;
    }

    /**
     * value of inputHint}
     * @return inputHint
     */

    public com.commercetools.history.models.common.TextInputHint getInputHint() {
        return this.inputHint;
    }

    /**
     *  <p>Whether the attribute's values should generally be enabled in product search. This determines whether the value is stored in products for matching terms in the context of full-text search queries and can be used in facets &amp; filters as part of product search queries. The exact features that are enabled/disabled with this flag depend on the concrete attribute type and are described there. The max size of a searchable field is <strong>restricted to 10922 characters</strong>. This constraint is enforced at both product creation and product update. If the length of the input exceeds the maximum size an InvalidField error is returned.</p>
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
        Objects.requireNonNull(attributeConstraint, AttributeDefinition.class + ": attributeConstraint is missing");
        Objects.requireNonNull(inputTip, AttributeDefinition.class + ": inputTip is missing");
        Objects.requireNonNull(inputHint, AttributeDefinition.class + ": inputHint is missing");
        Objects.requireNonNull(isSearchable, AttributeDefinition.class + ": isSearchable is missing");
        return new AttributeDefinitionImpl(type, name, label, isRequired, attributeConstraint, inputTip, inputHint,
            isSearchable);
    }

    /**
     * builds AttributeDefinition without checking for non-null required values
     * @return AttributeDefinition
     */
    public AttributeDefinition buildUnchecked() {
        return new AttributeDefinitionImpl(type, name, label, isRequired, attributeConstraint, inputTip, inputHint,
            isSearchable);
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
        builder.attributeConstraint = template.getAttributeConstraint();
        builder.inputTip = template.getInputTip();
        builder.inputHint = template.getInputHint();
        builder.isSearchable = template.getIsSearchable();
        return builder;
    }

}
