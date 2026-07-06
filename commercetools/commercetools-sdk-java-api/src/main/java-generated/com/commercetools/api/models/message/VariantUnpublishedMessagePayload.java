
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <span>Unpublish</span> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantUnpublishedMessagePayload variantUnpublishedMessagePayload = VariantUnpublishedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("VariantUnpublished")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantUnpublishedMessagePayloadImpl.class)
public interface VariantUnpublishedMessagePayload extends MessagePayload {

    /**
     * discriminator value for VariantUnpublishedMessagePayload
     */
    String VARIANT_UNPUBLISHED = "VariantUnpublished";

    /**
     *  <p>Reference to the Product containing the Variant that was unpublished.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Reference to the Product containing the Variant that was unpublished.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     * factory method
     * @return instance of VariantUnpublishedMessagePayload
     */
    public static VariantUnpublishedMessagePayload of() {
        return new VariantUnpublishedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy VariantUnpublishedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantUnpublishedMessagePayload of(final VariantUnpublishedMessagePayload template) {
        VariantUnpublishedMessagePayloadImpl instance = new VariantUnpublishedMessagePayloadImpl();
        instance.setProduct(template.getProduct());
        return instance;
    }

    public VariantUnpublishedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of VariantUnpublishedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantUnpublishedMessagePayload deepCopy(@Nullable final VariantUnpublishedMessagePayload template) {
        if (template == null) {
            return null;
        }
        VariantUnpublishedMessagePayloadImpl instance = new VariantUnpublishedMessagePayloadImpl();
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        return instance;
    }

    /**
     * builder factory method for VariantUnpublishedMessagePayload
     * @return builder
     */
    public static VariantUnpublishedMessagePayloadBuilder builder() {
        return VariantUnpublishedMessagePayloadBuilder.of();
    }

    /**
     * create builder for VariantUnpublishedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantUnpublishedMessagePayloadBuilder builder(final VariantUnpublishedMessagePayload template) {
        return VariantUnpublishedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantUnpublishedMessagePayload(Function<VariantUnpublishedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantUnpublishedMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantUnpublishedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<VariantUnpublishedMessagePayload>";
            }
        };
    }
}
