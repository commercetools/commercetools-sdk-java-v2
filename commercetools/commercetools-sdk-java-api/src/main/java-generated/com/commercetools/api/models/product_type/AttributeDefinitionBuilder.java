
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   AttributeDefinition attributeDefinition = AttributeDefinition.builder()
           .type(typeBuilder -> typeBuilder)
           .name("{name}")
           .label(labelBuilder -> labelBuilder)
           .isRequired(true)
           .attributeConstraint(AttributeConstraintEnum.NONE)
           .inputHint(TextInputHint.SINGLE_LINE)
           .isSearchable(true)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeDefinitionBuilder implements Builder<AttributeDefinition> {

    private com.commercetools.api.models.product_type.AttributeType type;

    private String name;

    private com.commercetools.api.models.common.LocalizedString label;

    private Boolean isRequired;

    private com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString inputTip;

    private com.commercetools.api.models.product_type.TextInputHint inputHint;

    private Boolean isSearchable;

    /**
     *  <p>Describes the type of the attribute.</p>
     */

    public AttributeDefinitionBuilder type(final com.commercetools.api.models.product_type.AttributeType type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Describes the type of the attribute.</p>
     */

    public AttributeDefinitionBuilder type(
            Function<com.commercetools.api.models.product_type.AttributeTypeBuilder, Builder<? extends com.commercetools.api.models.product_type.AttributeType>> builder) {
        this.type = builder.apply(com.commercetools.api.models.product_type.AttributeTypeBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The unique name of the attribute used in the API. The name must be between two and 256 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>). When using the same <code>name</code> for an attribute in two or more product types all fields of the AttributeDefinition of this attribute need to be the same across the product types, otherwise an AttributeDefinitionAlreadyExists error code will be returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> type and sets thereof.</p>
     */

    public AttributeDefinitionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>A human-readable label for the attribute.</p>
     */

    public AttributeDefinitionBuilder label(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>A human-readable label for the attribute.</p>
     */

    public AttributeDefinitionBuilder label(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>Whether the attribute is required to have a value.</p>
     */

    public AttributeDefinitionBuilder isRequired(final Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     *  <p>Describes how an attribute or a set of attributes should be validated across all variants of a product.</p>
     */

    public AttributeDefinitionBuilder attributeConstraint(
            final com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint) {
        this.attributeConstraint = attributeConstraint;
        return this;
    }

    /**
     *  <p>Additional information about the attribute that aids content managers when setting product details.</p>
     */

    public AttributeDefinitionBuilder inputTip(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.inputTip = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Additional information about the attribute that aids content managers when setting product details.</p>
     */

    public AttributeDefinitionBuilder inputTip(
            @Nullable final com.commercetools.api.models.common.LocalizedString inputTip) {
        this.inputTip = inputTip;
        return this;
    }

    /**
     *  <p>Provides a visual representation type for this attribute. only relevant for text-based attribute types like TextType and LocalizableTextType.</p>
     */

    public AttributeDefinitionBuilder inputHint(
            final com.commercetools.api.models.product_type.TextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    /**
     *  <p>Whether the attribute's values should generally be enabled in product search. This determines whether the value is stored in products for matching terms in the context of full-text search queries and can be used in facets &amp; filters as part of product search queries. The exact features that are enabled/disabled with this flag depend on the concrete attribute type and are described there. The max size of a searchable field is <strong>restricted to 10922 characters</strong>. This constraint is enforced at both product creation and product update. If the length of the input exceeds the maximum size an InvalidField error is returned.</p>
     */

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
        Objects.requireNonNull(type, AttributeDefinition.class + ": type is missing");
        Objects.requireNonNull(name, AttributeDefinition.class + ": name is missing");
        Objects.requireNonNull(label, AttributeDefinition.class + ": label is missing");
        Objects.requireNonNull(isRequired, AttributeDefinition.class + ": isRequired is missing");
        Objects.requireNonNull(attributeConstraint, AttributeDefinition.class + ": attributeConstraint is missing");
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
