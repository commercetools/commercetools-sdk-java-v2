
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
     */

    public AttributeGroupAddAttributeActionBuilder attribute(
            Function<com.commercetools.api.models.attribute_group.AttributeReferenceBuilder, com.commercetools.api.models.attribute_group.AttributeReferenceBuilder> builder) {
        this.attribute = builder.apply(com.commercetools.api.models.attribute_group.AttributeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to add.</p>
     */

    public AttributeGroupAddAttributeActionBuilder attribute(
            final com.commercetools.api.models.attribute_group.AttributeReference attribute) {
        this.attribute = attribute;
        return this;
    }

    public com.commercetools.api.models.attribute_group.AttributeReference getAttribute() {
        return this.attribute;
    }

    public AttributeGroupAddAttributeAction build() {
        Objects.requireNonNull(attribute, AttributeGroupAddAttributeAction.class + ": attribute is missing");
        return new AttributeGroupAddAttributeActionImpl(attribute);
    }

    /**
     * builds AttributeGroupAddAttributeAction without checking for non null required values
     */
    public AttributeGroupAddAttributeAction buildUnchecked() {
        return new AttributeGroupAddAttributeActionImpl(attribute);
    }

    public static AttributeGroupAddAttributeActionBuilder of() {
        return new AttributeGroupAddAttributeActionBuilder();
    }

    public static AttributeGroupAddAttributeActionBuilder of(final AttributeGroupAddAttributeAction template) {
        AttributeGroupAddAttributeActionBuilder builder = new AttributeGroupAddAttributeActionBuilder();
        builder.attribute = template.getAttribute();
        return builder;
    }

}
