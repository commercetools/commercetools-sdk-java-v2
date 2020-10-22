package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.message.ProductCreatedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductCreatedMessagePayloadImpl.class)
public interface ProductCreatedMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("productProjection")
    public ProductProjection getProductProjection();

    public void setProductProjection(final ProductProjection productProjection);

    public static ProductCreatedMessagePayloadImpl of(){
        return new ProductCreatedMessagePayloadImpl();
    }
    

    public static ProductCreatedMessagePayloadImpl of(final ProductCreatedMessagePayload template) {
        ProductCreatedMessagePayloadImpl instance = new ProductCreatedMessagePayloadImpl();
        instance.setProductProjection(template.getProductProjection());
        return instance;
    }

    default <T extends Accessor<ProductCreatedMessagePayload>> T withProductCreatedMessagePayload(Function<ProductCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
