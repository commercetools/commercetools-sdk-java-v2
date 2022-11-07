
package com.commercetools.api.models.attribute_group;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupRemoveAttributeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupRemoveAttributeAction attributeGroupRemoveAttributeAction = AttributeGroupRemoveAttributeAction.builder()
 *             .attribute(attributeBuilder -> attributeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeGroupRemoveAttributeActionBuilder implements Builder<AttributeGroupRemoveAttributeAction> {

    private com.commercetools.api.models.attribute_group.AttributeReference attribute;

    /**
     *  <p>Value to remove.</p>
     */

    public AttributeGroupRemoveAttributeActionBuilder attribute(
            Function<com.commercetools.api.models.attribute_group.AttributeReferenceBuilder, com.commercetools.api.models.attribute_group.AttributeReferenceBuilder> builder) {
        this.attribute = builder.apply(com.commercetools.api.models.attribute_group.AttributeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to remove.</p>
     */

    public AttributeGroupRemoveAttributeActionBuilder attribute(
            final com.commercetools.api.models.attribute_group.AttributeReference attribute) {
        this.attribute = attribute;
        return this;
    }

    public com.commercetools.api.models.attribute_group.AttributeReference getAttribute() {
        return this.attribute;
    }

    public AttributeGroupRemoveAttributeAction build() {
        Objects.requireNonNull(attribute, AttributeGroupRemoveAttributeAction.class + ": attribute is missing");
        return new AttributeGroupRemoveAttributeActionImpl(attribute);
    }

    /**
     * builds AttributeGroupRemoveAttributeAction without checking for non null required values
     */
    public AttributeGroupRemoveAttributeAction buildUnchecked() {
        return new AttributeGroupRemoveAttributeActionImpl(attribute);
    }

    public static AttributeGroupRemoveAttributeActionBuilder of() {
        return new AttributeGroupRemoveAttributeActionBuilder();
    }

    public static AttributeGroupRemoveAttributeActionBuilder of(final AttributeGroupRemoveAttributeAction template) {
        AttributeGroupRemoveAttributeActionBuilder builder = new AttributeGroupRemoveAttributeActionBuilder();
        builder.attribute = template.getAttribute();
        return builder;
    }

}
