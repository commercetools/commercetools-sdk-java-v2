
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceCustomFieldsSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceCustomFieldsSetMessagePayload productPriceCustomFieldsSetMessagePayload = ProductPriceCustomFieldsSetMessagePayload.builder()
 *             .priceId("{priceId}")
 *             .variantId(0.3)
 *             .staged(true)
 *             .customField(customFieldBuilder -> customFieldBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceCustomFieldsSetMessagePayloadBuilder
        implements Builder<ProductPriceCustomFieldsSetMessagePayload> {

    private String priceId;

    private Long variantId;

    private Boolean staged;

    private com.commercetools.api.models.type.CustomFields customField;

    @Nullable
    private String oldTypeId;

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a> on which the Custom Type was set.</p>
     * @param priceId value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldsSetMessagePayloadBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to which the Price belongs.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldsSetMessagePayloadBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a>.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldsSetMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Custom Fields that were set.</p>
     * @param builder function to build the customField value
     * @return Builder
     */

    public ProductPriceCustomFieldsSetMessagePayloadBuilder customField(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.customField = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields that were set.</p>
     * @param builder function to build the customField value
     * @return Builder
     */

    public ProductPriceCustomFieldsSetMessagePayloadBuilder withCustomField(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.customField = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields that were set.</p>
     * @param customField value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldsSetMessagePayloadBuilder customField(
            final com.commercetools.api.models.type.CustomFields customField) {
        this.customField = customField;
        return this;
    }

    /**
     *  <p><code>id</code> of the previous <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a>. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     * @return Builder
     */

    public ProductPriceCustomFieldsSetMessagePayloadBuilder oldTypeId(@Nullable final String oldTypeId) {
        this.oldTypeId = oldTypeId;
        return this;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a> on which the Custom Type was set.</p>
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
     *  <p>Custom Fields that were set.</p>
     * @return customField
     */

    public com.commercetools.api.models.type.CustomFields getCustomField() {
        return this.customField;
    }

    /**
     *  <p><code>id</code> of the previous <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a>. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @Nullable
    public String getOldTypeId() {
        return this.oldTypeId;
    }

    /**
     * builds ProductPriceCustomFieldsSetMessagePayload with checking for non-null required values
     * @return ProductPriceCustomFieldsSetMessagePayload
     */
    public ProductPriceCustomFieldsSetMessagePayload build() {
        Objects.requireNonNull(priceId, ProductPriceCustomFieldsSetMessagePayload.class + ": priceId is missing");
        Objects.requireNonNull(variantId, ProductPriceCustomFieldsSetMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(staged, ProductPriceCustomFieldsSetMessagePayload.class + ": staged is missing");
        Objects.requireNonNull(customField,
            ProductPriceCustomFieldsSetMessagePayload.class + ": customField is missing");
        return new ProductPriceCustomFieldsSetMessagePayloadImpl(priceId, variantId, staged, customField, oldTypeId);
    }

    /**
     * builds ProductPriceCustomFieldsSetMessagePayload without checking for non-null required values
     * @return ProductPriceCustomFieldsSetMessagePayload
     */
    public ProductPriceCustomFieldsSetMessagePayload buildUnchecked() {
        return new ProductPriceCustomFieldsSetMessagePayloadImpl(priceId, variantId, staged, customField, oldTypeId);
    }

    /**
     * factory method for an instance of ProductPriceCustomFieldsSetMessagePayloadBuilder
     * @return builder
     */
    public static ProductPriceCustomFieldsSetMessagePayloadBuilder of() {
        return new ProductPriceCustomFieldsSetMessagePayloadBuilder();
    }

    /**
     * create builder for ProductPriceCustomFieldsSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceCustomFieldsSetMessagePayloadBuilder of(
            final ProductPriceCustomFieldsSetMessagePayload template) {
        ProductPriceCustomFieldsSetMessagePayloadBuilder builder = new ProductPriceCustomFieldsSetMessagePayloadBuilder();
        builder.priceId = template.getPriceId();
        builder.variantId = template.getVariantId();
        builder.staged = template.getStaged();
        builder.customField = template.getCustomField();
        builder.oldTypeId = template.getOldTypeId();
        return builder;
    }

}
