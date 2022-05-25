
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductVariant;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantAddedMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantAddedMessagePayload productVariantAddedMessagePayload = ProductVariantAddedMessagePayload.builder()
 *             .variant(variantBuilder -> variantBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantAddedMessagePayloadImpl.class)
public interface ProductVariantAddedMessagePayload extends MessagePayload {

    String PRODUCT_VARIANT_ADDED = "ProductVariantAdded";

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("variant")
    public ProductVariant getVariant();

    /**
     *
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariant(final ProductVariant variant);

    public void setStaged(final Boolean staged);

    public static ProductVariantAddedMessagePayload of() {
        return new ProductVariantAddedMessagePayloadImpl();
    }

    public static ProductVariantAddedMessagePayload of(final ProductVariantAddedMessagePayload template) {
        ProductVariantAddedMessagePayloadImpl instance = new ProductVariantAddedMessagePayloadImpl();
        instance.setVariant(template.getVariant());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductVariantAddedMessagePayloadBuilder builder() {
        return ProductVariantAddedMessagePayloadBuilder.of();
    }

    public static ProductVariantAddedMessagePayloadBuilder builder(final ProductVariantAddedMessagePayload template) {
        return ProductVariantAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductVariantAddedMessagePayload(Function<ProductVariantAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantAddedMessagePayload>";
            }
        };
    }
}
