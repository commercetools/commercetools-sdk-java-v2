
package com.commercetools.api.models.attribute_group;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupSetAttributesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupSetAttributesAction attributeGroupSetAttributesAction = AttributeGroupSetAttributesAction.builder()
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeGroupSetAttributesActionBuilder implements Builder<AttributeGroupSetAttributesAction> {

    private java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> attributes;

    /**
     *  <p>New unique values to set.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public AttributeGroupSetAttributesActionBuilder attributes(
            final com.commercetools.api.models.attribute_group.AttributeReference... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>New unique values to set.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public AttributeGroupSetAttributesActionBuilder attributes(
            final java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>New unique values to set.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public AttributeGroupSetAttributesActionBuilder plusAttributes(
            final com.commercetools.api.models.attribute_group.AttributeReference... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>New unique values to set.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public AttributeGroupSetAttributesActionBuilder plusAttributes(
            Function<com.commercetools.api.models.attribute_group.AttributeReferenceBuilder, com.commercetools.api.models.attribute_group.AttributeReferenceBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(
            builder.apply(com.commercetools.api.models.attribute_group.AttributeReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>New unique values to set.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public AttributeGroupSetAttributesActionBuilder withAttributes(
            Function<com.commercetools.api.models.attribute_group.AttributeReferenceBuilder, com.commercetools.api.models.attribute_group.AttributeReferenceBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(
            builder.apply(com.commercetools.api.models.attribute_group.AttributeReferenceBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> getAttributes() {
        return this.attributes;
    }

    /**
     * builds AttributeGroupSetAttributesAction with checking for non-null required values
     * @return AttributeGroupSetAttributesAction
     */
    public AttributeGroupSetAttributesAction build() {
        Objects.requireNonNull(attributes, AttributeGroupSetAttributesAction.class + ": attributes is missing");
        return new AttributeGroupSetAttributesActionImpl(attributes);
    }

    /**
     * builds AttributeGroupSetAttributesAction without checking for non-null required values
     * @return AttributeGroupSetAttributesAction
     */
    public AttributeGroupSetAttributesAction buildUnchecked() {
        return new AttributeGroupSetAttributesActionImpl(attributes);
    }

    public static AttributeGroupSetAttributesActionBuilder of() {
        return new AttributeGroupSetAttributesActionBuilder();
    }

    public static AttributeGroupSetAttributesActionBuilder of(final AttributeGroupSetAttributesAction template) {
        AttributeGroupSetAttributesActionBuilder builder = new AttributeGroupSetAttributesActionBuilder();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
