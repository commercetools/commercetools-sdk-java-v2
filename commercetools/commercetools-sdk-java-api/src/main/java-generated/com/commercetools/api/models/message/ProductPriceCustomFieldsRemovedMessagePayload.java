
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
 *  <p>Generated after removing a Custom Type from a Price using the Set Price Custom Type update action.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("ProductPriceCustomFieldsRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceCustomFieldsRemovedMessagePayloadImpl.class)
public interface ProductPriceCustomFieldsRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductPriceCustomFieldsRemovedMessagePayload
     */
    String PRODUCT_PRICE_CUSTOM_FIELDS_REMOVED = "ProductPriceCustomFieldsRemoved";

    /**
     *  <p>Unique identifier of the Price from which the Custom Type was removed.</p>
     * @return priceId
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *  <p>Unique identifier of the ProductVariant to which the Price belongs.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Unique identifier of the Price from which the Custom Type was removed.</p>
     * @param priceId value to be set
     */

    public void setPriceId(final String priceId);

    /**
     *  <p>Unique identifier of the ProductVariant to which the Price belongs.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductPriceCustomFieldsRemovedMessagePayload
     */
    public static ProductPriceCustomFieldsRemovedMessagePayload of() {
        return new ProductPriceCustomFieldsRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductPriceCustomFieldsRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceCustomFieldsRemovedMessagePayload of(
            final ProductPriceCustomFieldsRemovedMessagePayload template) {
        ProductPriceCustomFieldsRemovedMessagePayloadImpl instance = new ProductPriceCustomFieldsRemovedMessagePayloadImpl();
        instance.setPriceId(template.getPriceId());
        instance.setVariantId(template.getVariantId());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductPriceCustomFieldsRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ProductPriceCustomFieldsRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceCustomFieldsRemovedMessagePayload deepCopy(
            @Nullable final ProductPriceCustomFieldsRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductPriceCustomFieldsRemovedMessagePayloadImpl instance = new ProductPriceCustomFieldsRemovedMessagePayloadImpl();
        instance.setPriceId(template.getPriceId());
        instance.setVariantId(template.getVariantId());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductPriceCustomFieldsRemovedMessagePayload
     * @return builder
     */
    public static ProductPriceCustomFieldsRemovedMessagePayloadBuilder builder() {
        return ProductPriceCustomFieldsRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductPriceCustomFieldsRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceCustomFieldsRemovedMessagePayloadBuilder builder(
            final ProductPriceCustomFieldsRemovedMessagePayload template) {
        return ProductPriceCustomFieldsRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceCustomFieldsRemovedMessagePayload(
            Function<ProductPriceCustomFieldsRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceCustomFieldsRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceCustomFieldsRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceCustomFieldsRemovedMessagePayload>";
            }
        };
    }
}
