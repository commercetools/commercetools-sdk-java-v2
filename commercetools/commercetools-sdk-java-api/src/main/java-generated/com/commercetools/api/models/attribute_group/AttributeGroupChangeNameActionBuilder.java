
package com.commercetools.api.models.attribute_group;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupChangeNameAction attributeGroupChangeNameAction = AttributeGroupChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeGroupChangeNameActionBuilder implements Builder<AttributeGroupChangeNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public AttributeGroupChangeNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     * @return Builder
     */

    public AttributeGroupChangeNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds AttributeGroupChangeNameAction with checking for non-null required values
     * @return AttributeGroupChangeNameAction
     */
    public AttributeGroupChangeNameAction build() {
        Objects.requireNonNull(name, AttributeGroupChangeNameAction.class + ": name is missing");
        return new AttributeGroupChangeNameActionImpl(name);
    }

    /**
     * builds AttributeGroupChangeNameAction without checking for non-null required values
     * @return AttributeGroupChangeNameAction
     */
    public AttributeGroupChangeNameAction buildUnchecked() {
        return new AttributeGroupChangeNameActionImpl(name);
    }

    /**
     * factory method for an instance of AttributeGroupChangeNameActionBuilder
     * @return builder
     */
    public static AttributeGroupChangeNameActionBuilder of() {
        return new AttributeGroupChangeNameActionBuilder();
    }

    /**
     * create builder for AttributeGroupChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupChangeNameActionBuilder of(final AttributeGroupChangeNameAction template) {
        AttributeGroupChangeNameActionBuilder builder = new AttributeGroupChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
