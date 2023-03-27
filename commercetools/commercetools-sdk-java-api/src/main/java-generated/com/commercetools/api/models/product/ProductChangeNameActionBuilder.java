
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductChangeNameAction productChangeNameAction = ProductChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductChangeNameActionBuilder implements Builder<ProductChangeNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Value to set. Must not be empty.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductChangeNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. Must not be empty.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductChangeNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>name</code> is updated. If <code>false</code>, both the current and staged <code>name</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductChangeNameActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Value to set. Must not be empty.</p>
     * @return name
     */

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
     * builds ProductChangeNameAction with checking for non-null required values
     * @return ProductChangeNameAction
     */
    public ProductChangeNameAction build() {
        Objects.requireNonNull(name, ProductChangeNameAction.class + ": name is missing");
        return new ProductChangeNameActionImpl(name, staged);
    }

    /**
     * builds ProductChangeNameAction without checking for non-null required values
     * @return ProductChangeNameAction
     */
    public ProductChangeNameAction buildUnchecked() {
        return new ProductChangeNameActionImpl(name, staged);
    }

    /**
     * factory method for an instance of ProductChangeNameActionBuilder
     * @return builder
     */
    public static ProductChangeNameActionBuilder of() {
        return new ProductChangeNameActionBuilder();
    }

    /**
     * create builder for ProductChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductChangeNameActionBuilder of(final ProductChangeNameAction template) {
        ProductChangeNameActionBuilder builder = new ProductChangeNameActionBuilder();
        builder.name = template.getName();
        builder.staged = template.getStaged();
        return builder;
    }

}
