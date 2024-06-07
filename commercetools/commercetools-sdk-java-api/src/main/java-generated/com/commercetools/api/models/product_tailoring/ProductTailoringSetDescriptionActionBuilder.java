
package com.commercetools.api.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringSetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetDescriptionAction productTailoringSetDescriptionAction = ProductTailoringSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringSetDescriptionActionBuilder implements Builder<ProductTailoringSetDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductTailoringSetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductTailoringSetDescriptionActionBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     * @return Builder
     */

    public ProductTailoringSetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>description</code> is updated. If <code>false</code>, both the current and staged <code>description</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringSetDescriptionActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
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
     *  <p>If <code>true</code>, only the staged <code>description</code> is updated. If <code>false</code>, both the current and staged <code>description</code> are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductTailoringSetDescriptionAction with checking for non-null required values
     * @return ProductTailoringSetDescriptionAction
     */
    public ProductTailoringSetDescriptionAction build() {
        return new ProductTailoringSetDescriptionActionImpl(description, staged);
    }

    /**
     * builds ProductTailoringSetDescriptionAction without checking for non-null required values
     * @return ProductTailoringSetDescriptionAction
     */
    public ProductTailoringSetDescriptionAction buildUnchecked() {
        return new ProductTailoringSetDescriptionActionImpl(description, staged);
    }

    /**
     * factory method for an instance of ProductTailoringSetDescriptionActionBuilder
     * @return builder
     */
    public static ProductTailoringSetDescriptionActionBuilder of() {
        return new ProductTailoringSetDescriptionActionBuilder();
    }

    /**
     * create builder for ProductTailoringSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetDescriptionActionBuilder of(final ProductTailoringSetDescriptionAction template) {
        ProductTailoringSetDescriptionActionBuilder builder = new ProductTailoringSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        builder.staged = template.getStaged();
        return builder;
    }

}
