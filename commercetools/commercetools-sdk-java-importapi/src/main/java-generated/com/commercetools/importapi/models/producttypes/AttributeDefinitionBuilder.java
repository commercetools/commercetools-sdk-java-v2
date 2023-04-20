
package com.commercetools.importapi.models.producttypes;

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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    /**
     * set the value to the type
     * @param type value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder type(final com.commercetools.importapi.models.producttypes.AttributeType type) {
        this.type = type;
        return this;
    }

    /**
     * set the value to the type using the builder function
     * @param builder function to build the type value
     * @return Builder
     */

    public AttributeDefinitionBuilder type(
            Function<com.commercetools.importapi.models.producttypes.AttributeTypeBuilder, Builder<? extends com.commercetools.importapi.models.producttypes.AttributeType>> builder) {
        this.type = builder.apply(com.commercetools.importapi.models.producttypes.AttributeTypeBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param builder function to build the label value
     * @return Builder
     */

    public AttributeDefinitionBuilder label(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param builder function to build the label value
     * @return Builder
     */

    public AttributeDefinitionBuilder withLabel(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.label = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param label value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder label(final com.commercetools.importapi.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    /**
     * set the value to the isRequired
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
            @Nullable final com.commercetools.importapi.models.producttypes.AttributeConstraintEnum attributeConstraint) {
        this.attributeConstraint = attributeConstraint;
        return this;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param builder function to build the inputTip value
     * @return Builder
     */

    public AttributeDefinitionBuilder inputTip(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.inputTip = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param builder function to build the inputTip value
     * @return Builder
     */

    public AttributeDefinitionBuilder withInputTip(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.inputTip = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param inputTip value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder inputTip(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString inputTip) {
        this.inputTip = inputTip;
        return this;
    }

    /**
     * set the value to the inputHint
     * @param inputHint value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder inputHint(
            @Nullable final com.commercetools.importapi.models.producttypes.TextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    /**
     * set the value to the isSearchable
     * @param isSearchable value to be set
     * @return Builder
     */

    public AttributeDefinitionBuilder isSearchable(@Nullable final Boolean isSearchable) {
        this.isSearchable = isSearchable;
        return this;
    }

    /**
     * value of type}
     * @return type
     */

    public com.commercetools.importapi.models.producttypes.AttributeType getType() {
        return this.type;
    }

    /**
     * value of name}
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @return label
     */

    public com.commercetools.importapi.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     * value of isRequired}
     * @return isRequired
     */

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    /**
     * value of attributeConstraint}
     * @return attributeConstraint
     */

    @Nullable
    public com.commercetools.importapi.models.producttypes.AttributeConstraintEnum getAttributeConstraint() {
        return this.attributeConstraint;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @return inputTip
     */

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getInputTip() {
        return this.inputTip;
    }

    /**
     * value of inputHint}
     * @return inputHint
     */

    @Nullable
    public com.commercetools.importapi.models.producttypes.TextInputHint getInputHint() {
        return this.inputHint;
    }

    /**
     * value of isSearchable}
     * @return isSearchable
     */

    @Nullable
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
