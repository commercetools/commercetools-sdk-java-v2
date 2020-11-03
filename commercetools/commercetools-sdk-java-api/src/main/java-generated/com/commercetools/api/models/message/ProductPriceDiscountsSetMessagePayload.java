package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice;
import com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductPriceDiscountsSetMessagePayloadImpl.class)
public interface ProductPriceDiscountsSetMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("updatedPrices")
    public List<ProductPriceDiscountsSetUpdatedPrice> getUpdatedPrices();

    @JsonIgnore
    public void setUpdatedPrices(final ProductPriceDiscountsSetUpdatedPrice ...updatedPrices);
    public void setUpdatedPrices(final List<ProductPriceDiscountsSetUpdatedPrice> updatedPrices);

    public static ProductPriceDiscountsSetMessagePayloadImpl of(){
        return new ProductPriceDiscountsSetMessagePayloadImpl();
    }
    

    public static ProductPriceDiscountsSetMessagePayloadImpl of(final ProductPriceDiscountsSetMessagePayload template) {
        ProductPriceDiscountsSetMessagePayloadImpl instance = new ProductPriceDiscountsSetMessagePayloadImpl();
        instance.setUpdatedPrices(template.getUpdatedPrices());
        return instance;
    }

    default <T> T withProductPriceDiscountsSetMessagePayload(Function<ProductPriceDiscountsSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
