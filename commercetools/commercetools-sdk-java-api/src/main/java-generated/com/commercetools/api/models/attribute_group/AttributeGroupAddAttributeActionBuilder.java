
package com.commercetools.api.models.attribute_group;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupAddAttributeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupAddAttributeAction attributeGroupAddAttributeAction = AttributeGroupAddAttributeAction.builder()
 *             .attribute(attributeBuilder -> attributeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeGroupAddAttributeActionBuilder implements Builder<AttributeGroupAddAttributeAction> {

    private com.commercetools.api.models.attribute_group.AttributeReference attribute;

    /**
     *  <p>Value to add.</p>
     * @param builder function to build the attribute value
     * @return Builder
     */

    public AttributeGroupAddAttributeActionBuilder attribute(
            Function<com.commercetools.api.models.attribute_group.AttributeReferenceBuilder, com.commercetools.api.models.attribute_group.AttributeReferenceBuilder> builder) {
        this.attribute = builder.apply(com.commercetools.api.models.attribute_group.AttributeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to add.</p>
     * @param attribute value to be set
     * @return Builder
     */

    public AttributeGroupAddAttributeActionBuilder attribute(
            final com.commercetools.api.models.attribute_group.AttributeReference attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     *  <p>Value to add.</p>
     * @return attribute
     */

    public com.commercetools.api.models.attribute_group.AttributeReference getAttribute() {
        return this.attribute;
    }

    /**
     * builds AttributeGroupAddAttributeAction with checking for non-null required values
     * @return AttributeGroupAddAttributeAction
     */
    public AttributeGroupAddAttributeAction build() {
        Objects.requireNonNull(attribute, AttributeGroupAddAttributeAction.class + ": attribute is missing");
        return new AttributeGroupAddAttributeActionImpl(attribute);
    }

    /**
     * builds AttributeGroupAddAttributeAction without checking for non-null required values
     * @return AttributeGroupAddAttributeAction
     */
    public AttributeGroupAddAttributeAction buildUnchecked() {
        return new AttributeGroupAddAttributeActionImpl(attribute);
    }

    /**
     * factory method for an instance of AttributeGroupAddAttributeActionBuilder
     * @return builder
     */
    public static AttributeGroupAddAttributeActionBuilder of() {
        return new AttributeGroupAddAttributeActionBuilder();
    }

    /**
     * create builder for AttributeGroupAddAttributeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupAddAttributeActionBuilder of(final AttributeGroupAddAttributeAction template) {
        AttributeGroupAddAttributeActionBuilder builder = new AttributeGroupAddAttributeActionBuilder();
        builder.attribute = template.getAttribute();
        return builder;
    }

}
