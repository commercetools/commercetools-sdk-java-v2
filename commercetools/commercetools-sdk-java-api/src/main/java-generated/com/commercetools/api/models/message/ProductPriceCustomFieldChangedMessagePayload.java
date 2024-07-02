
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
 *  <p>Generated after changing an existing Custom Field on a Price using the Set Price CustomField update action.</p>
 *
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
@JsonDeserialize(as = ProductPriceCustomFieldChangedMessagePayloadImpl.class)
public interface ProductPriceCustomFieldChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductPriceCustomFieldChangedMessagePayload
     */
    String PRODUCT_PRICE_CUSTOM_FIELD_CHANGED = "ProductPriceCustomFieldChanged";

    /**
     *  <p>Unique identifier of the Price of which the Custom Field was changed.</p>
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
     *  <p>Name of the Custom Field that was changed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set Price CustomField update action.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Unique identifier of the Price of which the Custom Field was changed.</p>
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
     *  <p>Name of the Custom Field that was changed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set Price CustomField update action.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of ProductPriceCustomFieldChangedMessagePayload
     */
    public static ProductPriceCustomFieldChangedMessagePayload of() {
        return new ProductPriceCustomFieldChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductPriceCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceCustomFieldChangedMessagePayload of(
            final ProductPriceCustomFieldChangedMessagePayload template) {
        ProductPriceCustomFieldChangedMessagePayloadImpl instance = new ProductPriceCustomFieldChangedMessagePayloadImpl();
        instance.setPriceId(template.getPriceId());
        instance.setVariantId(template.getVariantId());
        instance.setStaged(template.getStaged());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductPriceCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceCustomFieldChangedMessagePayload deepCopy(
            @Nullable final ProductPriceCustomFieldChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductPriceCustomFieldChangedMessagePayloadImpl instance = new ProductPriceCustomFieldChangedMessagePayloadImpl();
        instance.setPriceId(template.getPriceId());
        instance.setVariantId(template.getVariantId());
        instance.setStaged(template.getStaged());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for ProductPriceCustomFieldChangedMessagePayload
     * @return builder
     */
    public static ProductPriceCustomFieldChangedMessagePayloadBuilder builder() {
        return ProductPriceCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductPriceCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceCustomFieldChangedMessagePayloadBuilder builder(
            final ProductPriceCustomFieldChangedMessagePayload template) {
        return ProductPriceCustomFieldChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceCustomFieldChangedMessagePayload(
            Function<ProductPriceCustomFieldChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceCustomFieldChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceCustomFieldChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceCustomFieldChangedMessagePayload>";
            }
        };
    }
}
