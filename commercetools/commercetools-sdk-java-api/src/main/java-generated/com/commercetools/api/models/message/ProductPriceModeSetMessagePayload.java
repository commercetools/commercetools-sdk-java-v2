package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product.ProductPriceModeEnum;
import com.commercetools.api.models.message.ProductPriceModeSetMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductPriceModeSetMessagePayloadImpl.class)
public interface ProductPriceModeSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductPriceModeSetMessagePayload
     */
    String PRODUCT_PRICE_MODE_SET = "ProductPriceModeSet";

    /**
     *  <p>The PriceMode that was set.</p>
     * @return to
     */
    @NotNull
    @JsonProperty("to")
    public ProductPriceModeEnum getTo();

    /**
     *  <p>The PriceMode that was set.</p>
     * @param to value to be set
     */
    
    public void setTo(final ProductPriceModeEnum to);
    

    /**
     * factory method
     * @return instance of ProductPriceModeSetMessagePayload
     */
    public static ProductPriceModeSetMessagePayload of(){
        return new ProductPriceModeSetMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductPriceModeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceModeSetMessagePayload of(final ProductPriceModeSetMessagePayload template) {
        ProductPriceModeSetMessagePayloadImpl instance = new ProductPriceModeSetMessagePayloadImpl();
        instance.setTo(template.getTo());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductPriceModeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceModeSetMessagePayload deepCopy(@Nullable final ProductPriceModeSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductPriceModeSetMessagePayloadImpl instance = new ProductPriceModeSetMessagePayloadImpl();
        instance.setTo(template.getTo());
        return instance;
    }

    /**
     * builder factory method for ProductPriceModeSetMessagePayload
     * @return builder
     */
    public static ProductPriceModeSetMessagePayloadBuilder builder() {
        return ProductPriceModeSetMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for ProductPriceModeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceModeSetMessagePayloadBuilder builder(final ProductPriceModeSetMessagePayload template) {
        return ProductPriceModeSetMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceModeSetMessagePayload(Function<ProductPriceModeSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceModeSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceModeSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceModeSetMessagePayload>";
            }
        };
    }
}
