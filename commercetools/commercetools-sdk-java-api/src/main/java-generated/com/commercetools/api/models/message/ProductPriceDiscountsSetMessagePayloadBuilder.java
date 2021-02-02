
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductPriceDiscountsSetMessagePayloadBuilder {

    private java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices;

    public ProductPriceDiscountsSetMessagePayloadBuilder updatedPrices(
            final com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice... updatedPrices) {
        this.updatedPrices = new ArrayList<>(Arrays.asList(updatedPrices));
        return this;
    }

    public ProductPriceDiscountsSetMessagePayloadBuilder updatedPrices(
            final java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices) {
        this.updatedPrices = updatedPrices;
        return this;
    }

    public java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> getUpdatedPrices() {
        return this.updatedPrices;
    }

    public ProductPriceDiscountsSetMessagePayload build() {
        return new ProductPriceDiscountsSetMessagePayloadImpl(updatedPrices);
    }

    public static ProductPriceDiscountsSetMessagePayloadBuilder of() {
        return new ProductPriceDiscountsSetMessagePayloadBuilder();
    }

    public static ProductPriceDiscountsSetMessagePayloadBuilder of(
            final ProductPriceDiscountsSetMessagePayload template) {
        ProductPriceDiscountsSetMessagePayloadBuilder builder = new ProductPriceDiscountsSetMessagePayloadBuilder();
        builder.updatedPrices = template.getUpdatedPrices();
        return builder;
    }

}
