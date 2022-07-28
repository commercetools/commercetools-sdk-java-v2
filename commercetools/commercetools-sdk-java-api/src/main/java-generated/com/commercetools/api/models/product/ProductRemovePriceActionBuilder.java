
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
     *  <p>The <code>id</code> of the EmbeddedPrice to remove.</p>
     */

    public ProductRemovePriceActionBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged EmbeddedPrice is removed. If <code>false</code>, both the current and staged EmbeddedPrice are removed.</p>
     */

    public ProductRemovePriceActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public String getPriceId() {
        return this.priceId;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductRemovePriceAction build() {
        Objects.requireNonNull(priceId, ProductRemovePriceAction.class + ": priceId is missing");
        return new ProductRemovePriceActionImpl(priceId, staged);
    }

    /**
     * builds ProductRemovePriceAction without checking for non null required values
     */
    public ProductRemovePriceAction buildUnchecked() {
        return new ProductRemovePriceActionImpl(priceId, staged);
    }

    public static ProductRemovePriceActionBuilder of() {
        return new ProductRemovePriceActionBuilder();
    }

    public static ProductRemovePriceActionBuilder of(final ProductRemovePriceAction template) {
        ProductRemovePriceActionBuilder builder = new ProductRemovePriceActionBuilder();
        builder.priceId = template.getPriceId();
        builder.staged = template.getStaged();
        return builder;
    }

}
