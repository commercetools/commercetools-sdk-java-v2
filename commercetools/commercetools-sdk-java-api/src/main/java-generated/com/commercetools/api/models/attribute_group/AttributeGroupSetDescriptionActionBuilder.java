
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
     * @return Builder
     */

    public AttributeGroupSetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description
     * @return Builder
     */

    public AttributeGroupSetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public AttributeGroupSetDescriptionAction build() {
        return new AttributeGroupSetDescriptionActionImpl(description);
    }

    /**
     * builds AttributeGroupSetDescriptionAction without checking for non null required values
     */
    public AttributeGroupSetDescriptionAction buildUnchecked() {
        return new AttributeGroupSetDescriptionActionImpl(description);
    }

    public static AttributeGroupSetDescriptionActionBuilder of() {
        return new AttributeGroupSetDescriptionActionBuilder();
    }

    public static AttributeGroupSetDescriptionActionBuilder of(final AttributeGroupSetDescriptionAction template) {
        AttributeGroupSetDescriptionActionBuilder builder = new AttributeGroupSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
