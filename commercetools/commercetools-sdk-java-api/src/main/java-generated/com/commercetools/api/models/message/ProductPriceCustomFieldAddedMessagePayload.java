
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after adding a Custom Field to a Price using the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetProductPriceCustomFieldAction" rel="nofollow">Set Price CustomField</a> update action.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("ProductPriceCustomFieldAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceCustomFieldAddedMessagePayloadImpl.class)
public interface ProductPriceCustomFieldAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductPriceCustomFieldAddedMessagePayload
     */
    String PRODUCT_PRICE_CUSTOM_FIELD_ADDED = "ProductPriceCustomFieldAdded";

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a> to which the Custom Field was added.</p>
     * @return priceId
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to which the Price belongs.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a>.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>The added <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a>.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a> to which the Custom Field was added.</p>
     * @param priceId value to be set
     */

    public void setPriceId(final String priceId);

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to which the Price belongs.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a>.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>The added <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of ProductPriceCustomFieldAddedMessagePayload
     */
    public static ProductPriceCustomFieldAddedMessagePayload of() {
        return new ProductPriceCustomFieldAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductPriceCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceCustomFieldAddedMessagePayload of(
            final ProductPriceCustomFieldAddedMessagePayload template) {
        ProductPriceCustomFieldAddedMessagePayloadImpl instance = new ProductPriceCustomFieldAddedMessagePayloadImpl();
        instance.setPriceId(template.getPriceId());
        instance.setVariantId(template.getVariantId());
        instance.setStaged(template.getStaged());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public ProductPriceCustomFieldAddedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ProductPriceCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceCustomFieldAddedMessagePayload deepCopy(
            @Nullable final ProductPriceCustomFieldAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductPriceCustomFieldAddedMessagePayloadImpl instance = new ProductPriceCustomFieldAddedMessagePayloadImpl();
        instance.setPriceId(template.getPriceId());
        instance.setVariantId(template.getVariantId());
        instance.setStaged(template.getStaged());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for ProductPriceCustomFieldAddedMessagePayload
     * @return builder
     */
    public static ProductPriceCustomFieldAddedMessagePayloadBuilder builder() {
        return ProductPriceCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductPriceCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceCustomFieldAddedMessagePayloadBuilder builder(
            final ProductPriceCustomFieldAddedMessagePayload template) {
        return ProductPriceCustomFieldAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceCustomFieldAddedMessagePayload(
            Function<ProductPriceCustomFieldAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceCustomFieldAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceCustomFieldAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceCustomFieldAddedMessagePayload>";
            }
        };
    }
}
