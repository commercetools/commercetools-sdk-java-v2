
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceCustomFieldAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceCustomFieldAddedMessagePayload productPriceCustomFieldAddedMessagePayload = ProductPriceCustomFieldAddedMessagePayload.builder()
 *             .priceId("{priceId}")
 *             .variantId(0.3)
 *             .staged(true)
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceCustomFieldAddedMessagePayloadBuilder
        implements Builder<ProductPriceCustomFieldAddedMessagePayload> {

    private String priceId;

    private Long variantId;

    private Boolean staged;

    private String name;

    private java.lang.Object value;

    /**
     *  <p>Unique identifier of the Price to which the Custom Field was added.</p>
     * @param priceId value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldAddedMessagePayloadBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p>Unique identifier of the ProductVariant to which the Price belongs.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldAddedMessagePayloadBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldAddedMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldAddedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @param value value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldAddedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Unique identifier of the Price to which the Custom Field was added.</p>
     * @return priceId
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     *  <p>Unique identifier of the ProductVariant to which the Price belongs.</p>
     * @return variantId
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds ProductPriceCustomFieldAddedMessagePayload with checking for non-null required values
     * @return ProductPriceCustomFieldAddedMessagePayload
     */
    public ProductPriceCustomFieldAddedMessagePayload build() {
        Objects.requireNonNull(priceId, ProductPriceCustomFieldAddedMessagePayload.class + ": priceId is missing");
        Objects.requireNonNull(variantId, ProductPriceCustomFieldAddedMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(staged, ProductPriceCustomFieldAddedMessagePayload.class + ": staged is missing");
        Objects.requireNonNull(name, ProductPriceCustomFieldAddedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, ProductPriceCustomFieldAddedMessagePayload.class + ": value is missing");
        return new ProductPriceCustomFieldAddedMessagePayloadImpl(priceId, variantId, staged, name, value);
    }

    /**
     * builds ProductPriceCustomFieldAddedMessagePayload without checking for non-null required values
     * @return ProductPriceCustomFieldAddedMessagePayload
     */
    public ProductPriceCustomFieldAddedMessagePayload buildUnchecked() {
        return new ProductPriceCustomFieldAddedMessagePayloadImpl(priceId, variantId, staged, name, value);
    }

    /**
     * factory method for an instance of ProductPriceCustomFieldAddedMessagePayloadBuilder
     * @return builder
     */
    public static ProductPriceCustomFieldAddedMessagePayloadBuilder of() {
        return new ProductPriceCustomFieldAddedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductPriceCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceCustomFieldAddedMessagePayloadBuilder of(
            final ProductPriceCustomFieldAddedMessagePayload template) {
        ProductPriceCustomFieldAddedMessagePayloadBuilder builder = new ProductPriceCustomFieldAddedMessagePayloadBuilder();
        builder.priceId = template.getPriceId();
        builder.variantId = template.getVariantId();
        builder.staged = template.getStaged();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
