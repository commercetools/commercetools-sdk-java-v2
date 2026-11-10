
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceCustomFieldRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceCustomFieldRemovedMessagePayload productPriceCustomFieldRemovedMessagePayload = ProductPriceCustomFieldRemovedMessagePayload.builder()
 *             .priceId("{priceId}")
 *             .variantId(0.3)
 *             .staged(true)
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceCustomFieldRemovedMessagePayloadBuilder
        implements Builder<ProductPriceCustomFieldRemovedMessagePayload> {

    private String priceId;

    private Long variantId;

    private Boolean staged;

    private String name;

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a> from which the Custom Field was removed.</p>
     * @param priceId value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldRemovedMessagePayloadBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to which the Price belongs.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldRemovedMessagePayloadBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a>.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldRemovedMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldRemovedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a> from which the Custom Field was removed.</p>
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
     *  <p>Name of the Custom Field that was removed.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds ProductPriceCustomFieldRemovedMessagePayload with checking for non-null required values
     * @return ProductPriceCustomFieldRemovedMessagePayload
     */
    public ProductPriceCustomFieldRemovedMessagePayload build() {
        Objects.requireNonNull(priceId, ProductPriceCustomFieldRemovedMessagePayload.class + ": priceId is missing");
        Objects.requireNonNull(variantId,
            ProductPriceCustomFieldRemovedMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(staged, ProductPriceCustomFieldRemovedMessagePayload.class + ": staged is missing");
        Objects.requireNonNull(name, ProductPriceCustomFieldRemovedMessagePayload.class + ": name is missing");
        return new ProductPriceCustomFieldRemovedMessagePayloadImpl(priceId, variantId, staged, name);
    }

    /**
     * builds ProductPriceCustomFieldRemovedMessagePayload without checking for non-null required values
     * @return ProductPriceCustomFieldRemovedMessagePayload
     */
    public ProductPriceCustomFieldRemovedMessagePayload buildUnchecked() {
        return new ProductPriceCustomFieldRemovedMessagePayloadImpl(priceId, variantId, staged, name);
    }

    /**
     * factory method for an instance of ProductPriceCustomFieldRemovedMessagePayloadBuilder
     * @return builder
     */
    public static ProductPriceCustomFieldRemovedMessagePayloadBuilder of() {
        return new ProductPriceCustomFieldRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductPriceCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceCustomFieldRemovedMessagePayloadBuilder of(
            final ProductPriceCustomFieldRemovedMessagePayload template) {
        ProductPriceCustomFieldRemovedMessagePayloadBuilder builder = new ProductPriceCustomFieldRemovedMessagePayloadBuilder();
        builder.priceId = template.getPriceId();
        builder.variantId = template.getVariantId();
        builder.staged = template.getStaged();
        builder.name = template.getName();
        return builder;
    }

}
