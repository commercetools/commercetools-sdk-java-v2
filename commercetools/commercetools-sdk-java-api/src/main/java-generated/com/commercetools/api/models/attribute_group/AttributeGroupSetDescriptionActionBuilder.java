
package com.commercetools.api.models.attribute_group;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupSetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupSetDescriptionAction attributeGroupSetDescriptionAction = AttributeGroupSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeGroupSetDescriptionActionBuilder implements Builder<AttributeGroupSetDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public AttributeGroupSetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     * @return Builder
     */

    public AttributeGroupSetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     * builds AttributeGroupSetDescriptionAction with checking for non-null required values
     * @return AttributeGroupSetDescriptionAction
     */
    public AttributeGroupSetDescriptionAction build() {
        return new AttributeGroupSetDescriptionActionImpl(description);
    }

    /**
     * builds AttributeGroupSetDescriptionAction without checking for non-null required values
     * @return AttributeGroupSetDescriptionAction
     */
    public AttributeGroupSetDescriptionAction buildUnchecked() {
        return new AttributeGroupSetDescriptionActionImpl(description);
    }

    /**
     * factory method for an instance of AttributeGroupSetDescriptionActionBuilder
     * @return builder
     */
    public static AttributeGroupSetDescriptionActionBuilder of() {
        return new AttributeGroupSetDescriptionActionBuilder();
    }

    /**
     * create builder for AttributeGroupSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupSetDescriptionActionBuilder of(final AttributeGroupSetDescriptionAction template) {
        AttributeGroupSetDescriptionActionBuilder builder = new AttributeGroupSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
