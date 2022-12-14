
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceKeySetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceKeySetMessagePayload productPriceKeySetMessagePayload = ProductPriceKeySetMessagePayload.builder()
 *             .variantId(0.3)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceKeySetMessagePayloadBuilder implements Builder<ProductPriceKeySetMessagePayload> {

    private Long variantId;

    @Nullable
    private String priceId;

    @Nullable
    private String oldKey;

    @Nullable
    private String key;

    private Boolean staged;

    /**
     *
     */

    public ProductPriceKeySetMessagePayloadBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Unique identifier of the Embedded Price.</p>
     */

    public ProductPriceKeySetMessagePayloadBuilder priceId(@Nullable final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p><code>key</code> value of the Embedded Price before the Set Price Key update action.</p>
     */

    public ProductPriceKeySetMessagePayloadBuilder oldKey(@Nullable final String oldKey) {
        this.oldKey = oldKey;
        return this;
    }

    /**
     *  <p><code>key</code> value of the Embedded Price after the Set Price Key update action.</p>
     */

    public ProductPriceKeySetMessagePayloadBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     */

    public ProductPriceKeySetMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    @Nullable
    public String getPriceId() {
        return this.priceId;
    }

    @Nullable
    public String getOldKey() {
        return this.oldKey;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public ProductPriceKeySetMessagePayload build() {
        Objects.requireNonNull(variantId, ProductPriceKeySetMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(staged, ProductPriceKeySetMessagePayload.class + ": staged is missing");
        return new ProductPriceKeySetMessagePayloadImpl(variantId, priceId, oldKey, key, staged);
    }

    /**
     * builds ProductPriceKeySetMessagePayload without checking for non null required values
     */
    public ProductPriceKeySetMessagePayload buildUnchecked() {
        return new ProductPriceKeySetMessagePayloadImpl(variantId, priceId, oldKey, key, staged);
    }

    public static ProductPriceKeySetMessagePayloadBuilder of() {
        return new ProductPriceKeySetMessagePayloadBuilder();
    }

    public static ProductPriceKeySetMessagePayloadBuilder of(final ProductPriceKeySetMessagePayload template) {
        ProductPriceKeySetMessagePayloadBuilder builder = new ProductPriceKeySetMessagePayloadBuilder();
        builder.variantId = template.getVariantId();
        builder.priceId = template.getPriceId();
        builder.oldKey = template.getOldKey();
        builder.key = template.getKey();
        builder.staged = template.getStaged();
        return builder;
    }

}
