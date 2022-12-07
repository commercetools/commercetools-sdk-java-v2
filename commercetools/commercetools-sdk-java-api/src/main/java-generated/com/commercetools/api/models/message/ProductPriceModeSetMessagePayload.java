
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductPriceModeEnum;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set PriceMode update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceModeSetMessagePayload productPriceModeSetMessagePayload = ProductPriceModeSetMessagePayload.builder()
 *             .to(ProductPriceModeEnum.EMBEDDED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceModeSetMessagePayloadImpl.class)
public interface ProductPriceModeSetMessagePayload extends MessagePayload {

    String PRODUCT_PRICE_MODE_SET = "ProductPriceModeSet";

    /**
     *  <p>The PriceMode that was set.</p>
     */
    @NotNull
    @JsonProperty("to")
    public ProductPriceModeEnum getTo();

    public void setTo(final ProductPriceModeEnum to);

    public static ProductPriceModeSetMessagePayload of() {
        return new ProductPriceModeSetMessagePayloadImpl();
    }

    public static ProductPriceModeSetMessagePayload of(final ProductPriceModeSetMessagePayload template) {
        ProductPriceModeSetMessagePayloadImpl instance = new ProductPriceModeSetMessagePayloadImpl();
        instance.setTo(template.getTo());
        return instance;
    }

    public static ProductPriceModeSetMessagePayloadBuilder builder() {
        return ProductPriceModeSetMessagePayloadBuilder.of();
    }

    public static ProductPriceModeSetMessagePayloadBuilder builder(final ProductPriceModeSetMessagePayload template) {
        return ProductPriceModeSetMessagePayloadBuilder.of(template);
    }

    default <T> T withProductPriceModeSetMessagePayload(Function<ProductPriceModeSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceModeSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceModeSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceModeSetMessagePayload>";
            }
        };
    }
}
