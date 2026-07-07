
package com.commercetools.api.models.variant_attributes;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantAttributesAttributeMetadataBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantAttributesAttributeMetadata variantAttributesAttributeMetadata = VariantAttributesAttributeMetadata.builder()
 *             .name("{name}")
 *             .label(labelBuilder -> labelBuilder)
 *             .type("{type}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantAttributesAttributeMetadataBuilder implements Builder<VariantAttributesAttributeMetadata> {

    private String name;

    private com.commercetools.api.models.common.LocalizedString label;

    private String type;

    /**
     *  <p>Name of the Attribute as defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>.</p>
     * @param name value to be set
     * @return Builder
     */

    public VariantAttributesAttributeMetadataBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Localized label of the Attribute as defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Subject to <span>locale projection</span> if <code>localeProjection</code> is specified.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public VariantAttributesAttributeMetadataBuilder label(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Localized label of the Attribute as defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Subject to <span>locale projection</span> if <code>localeProjection</code> is specified.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public VariantAttributesAttributeMetadataBuilder withLabel(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Localized label of the Attribute as defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Subject to <span>locale projection</span> if <code>localeProjection</code> is specified.</p>
     * @param label value to be set
     * @return Builder
     */

    public VariantAttributesAttributeMetadataBuilder label(
            final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a>, for example <code>boolean</code>, <code>text</code>, <code>ltext</code>, <code>enum</code>, <code>lenum</code>, <code>number</code>, <code>money</code>, <code>date</code>, <code>time</code>, <code>datetime</code>, <code>reference</code>, <code>set</code>, or <code>nested</code>.</p>
     * @param type value to be set
     * @return Builder
     */

    public VariantAttributesAttributeMetadataBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Name of the Attribute as defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Localized label of the Attribute as defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Subject to <span>locale projection</span> if <code>localeProjection</code> is specified.</p>
     * @return label
     */

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a>, for example <code>boolean</code>, <code>text</code>, <code>ltext</code>, <code>enum</code>, <code>lenum</code>, <code>number</code>, <code>money</code>, <code>date</code>, <code>time</code>, <code>datetime</code>, <code>reference</code>, <code>set</code>, or <code>nested</code>.</p>
     * @return type
     */

    public String getType() {
        return this.type;
    }

    /**
     * builds VariantAttributesAttributeMetadata with checking for non-null required values
     * @return VariantAttributesAttributeMetadata
     */
    public VariantAttributesAttributeMetadata build() {
        Objects.requireNonNull(name, VariantAttributesAttributeMetadata.class + ": name is missing");
        Objects.requireNonNull(label, VariantAttributesAttributeMetadata.class + ": label is missing");
        Objects.requireNonNull(type, VariantAttributesAttributeMetadata.class + ": type is missing");
        return new VariantAttributesAttributeMetadataImpl(name, label, type);
    }

    /**
     * builds VariantAttributesAttributeMetadata without checking for non-null required values
     * @return VariantAttributesAttributeMetadata
     */
    public VariantAttributesAttributeMetadata buildUnchecked() {
        return new VariantAttributesAttributeMetadataImpl(name, label, type);
    }

    /**
     * factory method for an instance of VariantAttributesAttributeMetadataBuilder
     * @return builder
     */
    public static VariantAttributesAttributeMetadataBuilder of() {
        return new VariantAttributesAttributeMetadataBuilder();
    }

    /**
     * create builder for VariantAttributesAttributeMetadata instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantAttributesAttributeMetadataBuilder of(final VariantAttributesAttributeMetadata template) {
        VariantAttributesAttributeMetadataBuilder builder = new VariantAttributesAttributeMetadataBuilder();
        builder.name = template.getName();
        builder.label = template.getLabel();
        builder.type = template.getType();
        return builder;
    }

}
