package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.message.ProductVariantAddedMessagePayloadImpl;

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
@JsonDeserialize(as = ProductVariantAddedMessagePayloadImpl.class)
public interface ProductVariantAddedMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("variant")
    public ProductVariant getVariant();
    
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariant(final ProductVariant variant);
    
    public void setStaged(final Boolean staged);

    public static ProductVariantAddedMessagePayloadImpl of(){
        return new ProductVariantAddedMessagePayloadImpl();
    }
    

    public static ProductVariantAddedMessagePayloadImpl of(final ProductVariantAddedMessagePayload template) {
        ProductVariantAddedMessagePayloadImpl instance = new ProductVariantAddedMessagePayloadImpl();
        instance.setVariant(template.getVariant());
        instance.setStaged(template.getStaged());
        return instance;
    }

    default <T> T withProductVariantAddedMessagePayload(Function<ProductVariantAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
