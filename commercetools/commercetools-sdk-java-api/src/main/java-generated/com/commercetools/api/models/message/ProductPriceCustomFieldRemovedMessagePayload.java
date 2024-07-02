
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
 *  <p>Generated after removing a Custom Field from a Price using the Set Price CustomField update action.</p>
 *
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
@JsonDeserialize(as = ProductPriceCustomFieldRemovedMessagePayloadImpl.class)
public interface ProductPriceCustomFieldRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductPriceCustomFieldRemovedMessagePayload
     */
    String PRODUCT_PRICE_CUSTOM_FIELD_REMOVED = "ProductPriceCustomFieldRemoved";

    /**
     *  <p>Unique identifier of the Price from which the Custom Field was removed.</p>
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
     *  <p>Name of the Custom Field that was removed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Unique identifier of the Price from which the Custom Field was removed.</p>
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
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of ProductPriceCustomFieldRemovedMessagePayload
     */
    public static ProductPriceCustomFieldRemovedMessagePayload of() {
        return new ProductPriceCustomFieldRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductPriceCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceCustomFieldRemovedMessagePayload of(
            final ProductPriceCustomFieldRemovedMessagePayload template) {
        ProductPriceCustomFieldRemovedMessagePayloadImpl instance = new ProductPriceCustomFieldRemovedMessagePayloadImpl();
        instance.setPriceId(template.getPriceId());
        instance.setVariantId(template.getVariantId());
        instance.setStaged(template.getStaged());
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductPriceCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceCustomFieldRemovedMessagePayload deepCopy(
            @Nullable final ProductPriceCustomFieldRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductPriceCustomFieldRemovedMessagePayloadImpl instance = new ProductPriceCustomFieldRemovedMessagePayloadImpl();
        instance.setPriceId(template.getPriceId());
        instance.setVariantId(template.getVariantId());
        instance.setStaged(template.getStaged());
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for ProductPriceCustomFieldRemovedMessagePayload
     * @return builder
     */
    public static ProductPriceCustomFieldRemovedMessagePayloadBuilder builder() {
        return ProductPriceCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductPriceCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceCustomFieldRemovedMessagePayloadBuilder builder(
            final ProductPriceCustomFieldRemovedMessagePayload template) {
        return ProductPriceCustomFieldRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceCustomFieldRemovedMessagePayload(
            Function<ProductPriceCustomFieldRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceCustomFieldRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceCustomFieldRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceCustomFieldRemovedMessagePayload>";
            }
        };
    }
}
