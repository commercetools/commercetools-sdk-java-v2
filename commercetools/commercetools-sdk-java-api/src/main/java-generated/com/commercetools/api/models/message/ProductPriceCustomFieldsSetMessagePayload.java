
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Price Custom Type update action.</p>
 *
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
@JsonDeserialize(as = ProductPriceCustomFieldsSetMessagePayloadImpl.class)
public interface ProductPriceCustomFieldsSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductPriceCustomFieldsSetMessagePayload
     */
    String PRODUCT_PRICE_CUSTOM_FIELDS_SET = "ProductPriceCustomFieldsSet";

    /**
     *  <p>Unique identifier of the Price on which the Custom Type was set.</p>
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
     *  <p>Custom Fields that were set.</p>
     * @return customField
     */
    @NotNull
    @Valid
    @JsonProperty("customField")
    public CustomFields getCustomField();

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @JsonProperty("oldTypeId")
    public String getOldTypeId();

    /**
     *  <p>Unique identifier of the Price on which the Custom Type was set.</p>
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
     *  <p>Custom Fields that were set.</p>
     * @param customField value to be set
     */

    public void setCustomField(final CustomFields customField);

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     */

    public void setOldTypeId(final String oldTypeId);

    /**
     * factory method
     * @return instance of ProductPriceCustomFieldsSetMessagePayload
     */
    public static ProductPriceCustomFieldsSetMessagePayload of() {
        return new ProductPriceCustomFieldsSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductPriceCustomFieldsSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceCustomFieldsSetMessagePayload of(
            final ProductPriceCustomFieldsSetMessagePayload template) {
        ProductPriceCustomFieldsSetMessagePayloadImpl instance = new ProductPriceCustomFieldsSetMessagePayloadImpl();
        instance.setPriceId(template.getPriceId());
        instance.setVariantId(template.getVariantId());
        instance.setStaged(template.getStaged());
        instance.setCustomField(template.getCustomField());
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductPriceCustomFieldsSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceCustomFieldsSetMessagePayload deepCopy(
            @Nullable final ProductPriceCustomFieldsSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductPriceCustomFieldsSetMessagePayloadImpl instance = new ProductPriceCustomFieldsSetMessagePayloadImpl();
        instance.setPriceId(template.getPriceId());
        instance.setVariantId(template.getVariantId());
        instance.setStaged(template.getStaged());
        instance.setCustomField(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustomField()));
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    /**
     * builder factory method for ProductPriceCustomFieldsSetMessagePayload
     * @return builder
     */
    public static ProductPriceCustomFieldsSetMessagePayloadBuilder builder() {
        return ProductPriceCustomFieldsSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductPriceCustomFieldsSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceCustomFieldsSetMessagePayloadBuilder builder(
            final ProductPriceCustomFieldsSetMessagePayload template) {
        return ProductPriceCustomFieldsSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceCustomFieldsSetMessagePayload(
            Function<ProductPriceCustomFieldsSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceCustomFieldsSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceCustomFieldsSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceCustomFieldsSetMessagePayload>";
            }
        };
    }
}
