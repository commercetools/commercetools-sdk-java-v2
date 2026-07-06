
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantSetAttributesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetAttributesAction variantSetAttributesAction = VariantSetAttributesAction.builder()
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetAttributesActionBuilder implements Builder<VariantSetAttributesAction> {

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Attributes to set for the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantSetAttributesActionBuilder attributes(
            final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes to set for the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantSetAttributesActionBuilder attributes(
            final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes to set for the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantSetAttributesActionBuilder plusAttributes(
            final com.commercetools.api.models.product.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes to set for the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantSetAttributesActionBuilder plusAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes to set for the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantSetAttributesActionBuilder withAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes to set for the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantSetAttributesActionBuilder addAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return plusAttributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>Attributes to set for the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantSetAttributesActionBuilder setAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return attributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>If <code>true</code>, only the staged attributes are updated. If <code>false</code>, both the current and staged attributes are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantSetAttributesActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Attributes to set for the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @return attributes
     */

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>If <code>true</code>, only the staged attributes are updated. If <code>false</code>, both the current and staged attributes are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds VariantSetAttributesAction with checking for non-null required values
     * @return VariantSetAttributesAction
     */
    public VariantSetAttributesAction build() {
        Objects.requireNonNull(attributes, VariantSetAttributesAction.class + ": attributes is missing");
        return new VariantSetAttributesActionImpl(attributes, staged);
    }

    /**
     * builds VariantSetAttributesAction without checking for non-null required values
     * @return VariantSetAttributesAction
     */
    public VariantSetAttributesAction buildUnchecked() {
        return new VariantSetAttributesActionImpl(attributes, staged);
    }

    /**
     * factory method for an instance of VariantSetAttributesActionBuilder
     * @return builder
     */
    public static VariantSetAttributesActionBuilder of() {
        return new VariantSetAttributesActionBuilder();
    }

    /**
     * create builder for VariantSetAttributesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetAttributesActionBuilder of(final VariantSetAttributesAction template) {
        VariantSetAttributesActionBuilder builder = new VariantSetAttributesActionBuilder();
        builder.attributes = template.getAttributes();
        builder.staged = template.getStaged();
        return builder;
    }

}
