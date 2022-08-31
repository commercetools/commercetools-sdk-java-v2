
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetPriceModeActionImpl.class)
public interface ProductSetPriceModeAction extends ProductUpdateAction {

    String SET_PRICE_MODE = "setPriceMode";

    /**
     *  <p>Specifies which type of Prices should be used when looking up a price for the Product.</p>
     */

    @JsonProperty("priceMode")
    public ProductPriceModeEnum getPriceMode();

    public void setPriceMode(final ProductPriceModeEnum priceMode);

    public static ProductSetPriceModeAction of() {
        return new ProductSetPriceModeActionImpl();
    }

    public static ProductSetPriceModeAction of(final ProductSetPriceModeAction template) {
        ProductSetPriceModeActionImpl instance = new ProductSetPriceModeActionImpl();
        instance.setPriceMode(template.getPriceMode());
        return instance;
    }

    public static ProductSetPriceModeActionBuilder builder() {
        return ProductSetPriceModeActionBuilder.of();
    }

    public static ProductSetPriceModeActionBuilder builder(final ProductSetPriceModeAction template) {
        return ProductSetPriceModeActionBuilder.of(template);
    }

    default <T> T withProductSetPriceModeAction(Function<ProductSetPriceModeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetPriceModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetPriceModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetPriceModeAction>";
            }
        };
    }
}
