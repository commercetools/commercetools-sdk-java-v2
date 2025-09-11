
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceCustomFieldChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceCustomFieldChangedMessagePayload productPriceCustomFieldChangedMessagePayload = ProductPriceCustomFieldChangedMessagePayload.builder()
 *             .priceId("{priceId}")
 *             .variantId(0.3)
 *             .staged(true)
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceCustomFieldChangedMessagePayloadBuilder
        implements Builder<ProductPriceCustomFieldChangedMessagePayload> {

    private String priceId;

    private Long variantId;

    private Boolean staged;

    private String name;

    private java.lang.Object value;

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a> of which the Custom Field was changed.</p>
     * @param priceId value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldChangedMessagePayloadBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to which the Price belongs.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldChangedMessagePayloadBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a>.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldChangedMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that was changed.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldChangedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetProductPriceCustomFieldAction" rel="nofollow">Set Price CustomField</a> update action.</p>
     * @param value value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldChangedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a> of which the Custom Field was changed.</p>
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
     *  <p>Name of the Custom Field that was changed.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetProductPriceCustomFieldAction" rel="nofollow">Set Price CustomField</a> update action.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds ProductPriceCustomFieldChangedMessagePayload with checking for non-null required values
     * @return ProductPriceCustomFieldChangedMessagePayload
     */
    public ProductPriceCustomFieldChangedMessagePayload build() {
        Objects.requireNonNull(priceId, ProductPriceCustomFieldChangedMessagePayload.class + ": priceId is missing");
        Objects.requireNonNull(variantId,
            ProductPriceCustomFieldChangedMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(staged, ProductPriceCustomFieldChangedMessagePayload.class + ": staged is missing");
        Objects.requireNonNull(name, ProductPriceCustomFieldChangedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, ProductPriceCustomFieldChangedMessagePayload.class + ": value is missing");
        return new ProductPriceCustomFieldChangedMessagePayloadImpl(priceId, variantId, staged, name, value);
    }

    /**
     * builds ProductPriceCustomFieldChangedMessagePayload without checking for non-null required values
     * @return ProductPriceCustomFieldChangedMessagePayload
     */
    public ProductPriceCustomFieldChangedMessagePayload buildUnchecked() {
        return new ProductPriceCustomFieldChangedMessagePayloadImpl(priceId, variantId, staged, name, value);
    }

    /**
     * factory method for an instance of ProductPriceCustomFieldChangedMessagePayloadBuilder
     * @return builder
     */
    public static ProductPriceCustomFieldChangedMessagePayloadBuilder of() {
        return new ProductPriceCustomFieldChangedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductPriceCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceCustomFieldChangedMessagePayloadBuilder of(
            final ProductPriceCustomFieldChangedMessagePayload template) {
        ProductPriceCustomFieldChangedMessagePayloadBuilder builder = new ProductPriceCustomFieldChangedMessagePayloadBuilder();
        builder.priceId = template.getPriceId();
        builder.variantId = template.getVariantId();
        builder.staged = template.getStaged();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
