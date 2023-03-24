
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeSetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeSetDescriptionAction typeSetDescriptionAction = TypeSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeSetDescriptionActionBuilder implements Builder<TypeSetDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public TypeSetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     * @return Builder
     */

    public TypeSetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     * builds TypeSetDescriptionAction with checking for non-null required values
     * @return TypeSetDescriptionAction
     */
    public TypeSetDescriptionAction build() {
        return new TypeSetDescriptionActionImpl(description);
    }

    /**
     * builds TypeSetDescriptionAction without checking for non-null required values
     * @return TypeSetDescriptionAction
     */
    public TypeSetDescriptionAction buildUnchecked() {
        return new TypeSetDescriptionActionImpl(description);
    }

    public static TypeSetDescriptionActionBuilder of() {
        return new TypeSetDescriptionActionBuilder();
    }

    public static TypeSetDescriptionActionBuilder of(final TypeSetDescriptionAction template) {
        TypeSetDescriptionActionBuilder builder = new TypeSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
