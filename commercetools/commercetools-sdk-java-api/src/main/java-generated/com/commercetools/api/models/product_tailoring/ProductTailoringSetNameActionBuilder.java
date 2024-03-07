
package com.commercetools.api.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringSetNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetNameAction productTailoringSetNameAction = ProductTailoringSetNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringSetNameActionBuilder implements Builder<ProductTailoringSetNameAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductTailoringSetNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductTailoringSetNameActionBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductTailoringSetNameActionBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>name</code> is updated. If <code>false</code>, both the current and staged <code>name</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringSetNameActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>name</code> is updated. If <code>false</code>, both the current and staged <code>name</code> are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductTailoringSetNameAction with checking for non-null required values
     * @return ProductTailoringSetNameAction
     */
    public ProductTailoringSetNameAction build() {
        return new ProductTailoringSetNameActionImpl(name, staged);
    }

    /**
     * builds ProductTailoringSetNameAction without checking for non-null required values
     * @return ProductTailoringSetNameAction
     */
    public ProductTailoringSetNameAction buildUnchecked() {
        return new ProductTailoringSetNameActionImpl(name, staged);
    }

    /**
     * factory method for an instance of ProductTailoringSetNameActionBuilder
     * @return builder
     */
    public static ProductTailoringSetNameActionBuilder of() {
        return new ProductTailoringSetNameActionBuilder();
    }

    /**
     * create builder for ProductTailoringSetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetNameActionBuilder of(final ProductTailoringSetNameAction template) {
        ProductTailoringSetNameActionBuilder builder = new ProductTailoringSetNameActionBuilder();
        builder.name = template.getName();
        builder.staged = template.getStaged();
        return builder;
    }

}
