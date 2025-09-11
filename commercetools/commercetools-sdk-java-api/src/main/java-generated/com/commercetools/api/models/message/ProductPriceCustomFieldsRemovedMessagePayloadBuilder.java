
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceCustomFieldsRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceCustomFieldsRemovedMessagePayload productPriceCustomFieldsRemovedMessagePayload = ProductPriceCustomFieldsRemovedMessagePayload.builder()
 *             .priceId("{priceId}")
 *             .variantId(0.3)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceCustomFieldsRemovedMessagePayloadBuilder
        implements Builder<ProductPriceCustomFieldsRemovedMessagePayload> {

    private String priceId;

    private Long variantId;

    private Boolean staged;

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a> from which the Custom Type was removed.</p>
     * @param priceId value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldsRemovedMessagePayloadBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to which the Price belongs.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldsRemovedMessagePayloadBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a>.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldsRemovedMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a> from which the Custom Type was removed.</p>
     * @return priceId
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to which the Price belongs.</p>
     * @return variantId
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a>.</p>
     * @return staged
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductPriceCustomFieldsRemovedMessagePayload with checking for non-null required values
     * @return ProductPriceCustomFieldsRemovedMessagePayload
     */
    public ProductPriceCustomFieldsRemovedMessagePayload build() {
        Objects.requireNonNull(priceId, ProductPriceCustomFieldsRemovedMessagePayload.class + ": priceId is missing");
        Objects.requireNonNull(variantId,
            ProductPriceCustomFieldsRemovedMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(staged, ProductPriceCustomFieldsRemovedMessagePayload.class + ": staged is missing");
        return new ProductPriceCustomFieldsRemovedMessagePayloadImpl(priceId, variantId, staged);
    }

    /**
     * builds ProductPriceCustomFieldsRemovedMessagePayload without checking for non-null required values
     * @return ProductPriceCustomFieldsRemovedMessagePayload
     */
    public ProductPriceCustomFieldsRemovedMessagePayload buildUnchecked() {
        return new ProductPriceCustomFieldsRemovedMessagePayloadImpl(priceId, variantId, staged);
    }

    /**
     * factory method for an instance of ProductPriceCustomFieldsRemovedMessagePayloadBuilder
     * @return builder
     */
    public static ProductPriceCustomFieldsRemovedMessagePayloadBuilder of() {
        return new ProductPriceCustomFieldsRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductPriceCustomFieldsRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceCustomFieldsRemovedMessagePayloadBuilder of(
            final ProductPriceCustomFieldsRemovedMessagePayload template) {
        ProductPriceCustomFieldsRemovedMessagePayloadBuilder builder = new ProductPriceCustomFieldsRemovedMessagePayloadBuilder();
        builder.priceId = template.getPriceId();
        builder.variantId = template.getVariantId();
        builder.staged = template.getStaged();
        return builder;
    }

}
