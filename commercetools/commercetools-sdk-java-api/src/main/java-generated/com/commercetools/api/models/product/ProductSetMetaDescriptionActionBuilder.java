
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetMetaDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetMetaDescriptionAction productSetMetaDescriptionAction = ProductSetMetaDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetMetaDescriptionActionBuilder implements Builder<ProductSetMetaDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaDescription;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ProductSetMetaDescriptionActionBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ProductSetMetaDescriptionActionBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>metaDescription</code> is updated. If <code>false</code>, both the current and staged <code>metaDescription</code> are updated.</p>
     */

    public ProductSetMetaDescriptionActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductSetMetaDescriptionAction build() {
        return new ProductSetMetaDescriptionActionImpl(metaDescription, staged);
    }

    /**
     * builds ProductSetMetaDescriptionAction without checking for non null required values
     */
    public ProductSetMetaDescriptionAction buildUnchecked() {
        return new ProductSetMetaDescriptionActionImpl(metaDescription, staged);
    }

    public static ProductSetMetaDescriptionActionBuilder of() {
        return new ProductSetMetaDescriptionActionBuilder();
    }

    public static ProductSetMetaDescriptionActionBuilder of(final ProductSetMetaDescriptionAction template) {
        ProductSetMetaDescriptionActionBuilder builder = new ProductSetMetaDescriptionActionBuilder();
        builder.metaDescription = template.getMetaDescription();
        builder.staged = template.getStaged();
        return builder;
    }

}
