
package com.commercetools.api.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringSetMetaDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetMetaDescriptionAction productTailoringSetMetaDescriptionAction = ProductTailoringSetMetaDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringSetMetaDescriptionActionBuilder
        implements Builder<ProductTailoringSetMetaDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaDescription;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductTailoringSetMetaDescriptionActionBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductTailoringSetMetaDescriptionActionBuilder withMetaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param metaDescription value to be set
     * @return Builder
     */

    public ProductTailoringSetMetaDescriptionActionBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>metaDescription</code> is updated. If <code>false</code>, both the current and staged <code>metaDescription</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringSetMetaDescriptionActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return metaDescription
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>metaDescription</code> is updated. If <code>false</code>, both the current and staged <code>metaDescription</code> are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductTailoringSetMetaDescriptionAction with checking for non-null required values
     * @return ProductTailoringSetMetaDescriptionAction
     */
    public ProductTailoringSetMetaDescriptionAction build() {
        return new ProductTailoringSetMetaDescriptionActionImpl(metaDescription, staged);
    }

    /**
     * builds ProductTailoringSetMetaDescriptionAction without checking for non-null required values
     * @return ProductTailoringSetMetaDescriptionAction
     */
    public ProductTailoringSetMetaDescriptionAction buildUnchecked() {
        return new ProductTailoringSetMetaDescriptionActionImpl(metaDescription, staged);
    }

    /**
     * factory method for an instance of ProductTailoringSetMetaDescriptionActionBuilder
     * @return builder
     */
    public static ProductTailoringSetMetaDescriptionActionBuilder of() {
        return new ProductTailoringSetMetaDescriptionActionBuilder();
    }

    /**
     * create builder for ProductTailoringSetMetaDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetMetaDescriptionActionBuilder of(
            final ProductTailoringSetMetaDescriptionAction template) {
        ProductTailoringSetMetaDescriptionActionBuilder builder = new ProductTailoringSetMetaDescriptionActionBuilder();
        builder.metaDescription = template.getMetaDescription();
        builder.staged = template.getStaged();
        return builder;
    }

}
