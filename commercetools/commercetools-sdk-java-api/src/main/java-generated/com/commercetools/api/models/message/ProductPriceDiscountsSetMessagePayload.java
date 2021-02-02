
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductPriceDiscountsSetMessagePayloadImpl.class)
public interface ProductPriceDiscountsSetMessagePayload extends MessagePayload {

    String PRODUCT_PRICE_DISCOUNTS_SET = "ProductPriceDiscountsSet";

    @NotNull
    @Valid
    @JsonProperty("updatedPrices")
    public List<ProductPriceDiscountsSetUpdatedPrice> getUpdatedPrices();

    @JsonIgnore
    public void setUpdatedPrices(final ProductPriceDiscountsSetUpdatedPrice... updatedPrices);

    public void setUpdatedPrices(final List<ProductPriceDiscountsSetUpdatedPrice> updatedPrices);

    public static ProductPriceDiscountsSetMessagePayload of() {
        return new ProductPriceDiscountsSetMessagePayloadImpl();
    }

    public static ProductPriceDiscountsSetMessagePayload of(final ProductPriceDiscountsSetMessagePayload template) {
        ProductPriceDiscountsSetMessagePayloadImpl instance = new ProductPriceDiscountsSetMessagePayloadImpl();
        instance.setUpdatedPrices(template.getUpdatedPrices());
        return instance;
    }

    public static ProductPriceDiscountsSetMessagePayloadBuilder builder() {
        return ProductPriceDiscountsSetMessagePayloadBuilder.of();
    }

    public static ProductPriceDiscountsSetMessagePayloadBuilder builder(
            final ProductPriceDiscountsSetMessagePayload template) {
        return ProductPriceDiscountsSetMessagePayloadBuilder.of(template);
    }

    default <T> T withProductPriceDiscountsSetMessagePayload(
            Function<ProductPriceDiscountsSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
