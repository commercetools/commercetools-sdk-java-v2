
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductChangePriceActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductChangePriceAction productChangePriceAction = ProductChangePriceAction.builder()
 *             .priceId("{priceId}")
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductChangePriceActionBuilder implements Builder<ProductChangePriceAction> {

    private String priceId;

    private com.commercetools.api.models.product.EmbeddedPriceDraft price;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The <code>id</code> of the EmbeddedPrice to update.</p>
     */

    public ProductChangePriceActionBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     */

    public ProductChangePriceActionBuilder price(
            Function<com.commercetools.api.models.product.EmbeddedPriceDraftBuilder, com.commercetools.api.models.product.EmbeddedPriceDraftBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.product.EmbeddedPriceDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set.</p>
     */

    public ProductChangePriceActionBuilder price(final com.commercetools.api.models.product.EmbeddedPriceDraft price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged EmbeddedPrice is updated. If <code>false</code>, both the current and staged EmbeddedPrice are updated.</p>
     */

    public ProductChangePriceActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public String getPriceId() {
        return this.priceId;
    }

    public com.commercetools.api.models.product.EmbeddedPriceDraft getPrice() {
        return this.price;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductChangePriceAction build() {
        Objects.requireNonNull(priceId, ProductChangePriceAction.class + ": priceId is missing");
        Objects.requireNonNull(price, ProductChangePriceAction.class + ": price is missing");
        return new ProductChangePriceActionImpl(priceId, price, staged);
    }

    /**
     * builds ProductChangePriceAction without checking for non null required values
     */
    public ProductChangePriceAction buildUnchecked() {
        return new ProductChangePriceActionImpl(priceId, price, staged);
    }

    public static ProductChangePriceActionBuilder of() {
        return new ProductChangePriceActionBuilder();
    }

    public static ProductChangePriceActionBuilder of(final ProductChangePriceAction template) {
        ProductChangePriceActionBuilder builder = new ProductChangePriceActionBuilder();
        builder.priceId = template.getPriceId();
        builder.price = template.getPrice();
        builder.staged = template.getStaged();
        return builder;
    }

}
