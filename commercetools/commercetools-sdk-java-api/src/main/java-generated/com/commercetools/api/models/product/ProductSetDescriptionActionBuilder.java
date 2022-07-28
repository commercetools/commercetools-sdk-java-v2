
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetDescriptionAction productSetDescriptionAction = ProductSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetDescriptionActionBuilder implements Builder<ProductSetDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ProductSetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ProductSetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>description</code> is updated. If <code>false</code>, both the current and staged <code>description</code> are updated.</p>
     */

    public ProductSetDescriptionActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductSetDescriptionAction build() {
        return new ProductSetDescriptionActionImpl(description, staged);
    }

    /**
     * builds ProductSetDescriptionAction without checking for non null required values
     */
    public ProductSetDescriptionAction buildUnchecked() {
        return new ProductSetDescriptionActionImpl(description, staged);
    }

    public static ProductSetDescriptionActionBuilder of() {
        return new ProductSetDescriptionActionBuilder();
    }

    public static ProductSetDescriptionActionBuilder of(final ProductSetDescriptionAction template) {
        ProductSetDescriptionActionBuilder builder = new ProductSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        builder.staged = template.getStaged();
        return builder;
    }

}
