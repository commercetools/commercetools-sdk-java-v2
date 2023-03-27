
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductRemovePriceActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemovePriceAction productRemovePriceAction = ProductRemovePriceAction.builder()
 *             .priceId("{priceId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductRemovePriceActionBuilder implements Builder<ProductRemovePriceAction> {

    private String priceId;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The <code>id</code> of the Embedded Price to remove.</p>
     * @param priceId value to be set
     * @return Builder
     */

    public ProductRemovePriceActionBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is removed. If <code>false</code>, both the current and staged Embedded Price are removed.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductRemovePriceActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Embedded Price to remove.</p>
     * @return priceId
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is removed. If <code>false</code>, both the current and staged Embedded Price are removed.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductRemovePriceAction with checking for non-null required values
     * @return ProductRemovePriceAction
     */
    public ProductRemovePriceAction build() {
        Objects.requireNonNull(priceId, ProductRemovePriceAction.class + ": priceId is missing");
        return new ProductRemovePriceActionImpl(priceId, staged);
    }

    /**
     * builds ProductRemovePriceAction without checking for non-null required values
     * @return ProductRemovePriceAction
     */
    public ProductRemovePriceAction buildUnchecked() {
        return new ProductRemovePriceActionImpl(priceId, staged);
    }

    /**
     * factory method for an instance of ProductRemovePriceActionBuilder
     * @return builder
     */
    public static ProductRemovePriceActionBuilder of() {
        return new ProductRemovePriceActionBuilder();
    }

    /**
     * create builder for ProductRemovePriceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductRemovePriceActionBuilder of(final ProductRemovePriceAction template) {
        ProductRemovePriceActionBuilder builder = new ProductRemovePriceActionBuilder();
        builder.priceId = template.getPriceId();
        builder.staged = template.getStaged();
        return builder;
    }

}
