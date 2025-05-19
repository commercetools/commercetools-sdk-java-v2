
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Controls whether the Prices of a Product Variant are embedded into the Product or standalone.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetPriceModeAction productSetPriceModeAction = ProductSetPriceModeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setPriceMode")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetPriceModeActionImpl.class)
public interface ProductSetPriceModeAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetPriceModeAction
     */
    String SET_PRICE_MODE = "setPriceMode";

    /**
     *  <p>Specifies which type of Prices should be used when looking up a price for the Product.</p>
     * @return priceMode
     */

    @JsonProperty("priceMode")
    public ProductPriceModeEnum getPriceMode();

    /**
     *  <p>Specifies which type of Prices should be used when looking up a price for the Product.</p>
     * @param priceMode value to be set
     */

    public void setPriceMode(final ProductPriceModeEnum priceMode);

    /**
     * factory method
     * @return instance of ProductSetPriceModeAction
     */
    public static ProductSetPriceModeAction of() {
        return new ProductSetPriceModeActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSetPriceModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetPriceModeAction of(final ProductSetPriceModeAction template) {
        ProductSetPriceModeActionImpl instance = new ProductSetPriceModeActionImpl();
        instance.setPriceMode(template.getPriceMode());
        return instance;
    }

    public ProductSetPriceModeAction copyDeep();

    /**
     * factory method to create a deep copy of ProductSetPriceModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSetPriceModeAction deepCopy(@Nullable final ProductSetPriceModeAction template) {
        if (template == null) {
            return null;
        }
        ProductSetPriceModeActionImpl instance = new ProductSetPriceModeActionImpl();
        instance.setPriceMode(template.getPriceMode());
        return instance;
    }

    /**
     * builder factory method for ProductSetPriceModeAction
     * @return builder
     */
    public static ProductSetPriceModeActionBuilder builder() {
        return ProductSetPriceModeActionBuilder.of();
    }

    /**
     * create builder for ProductSetPriceModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetPriceModeActionBuilder builder(final ProductSetPriceModeAction template) {
        return ProductSetPriceModeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetPriceModeAction(Function<ProductSetPriceModeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetPriceModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetPriceModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetPriceModeAction>";
            }
        };
    }
}
