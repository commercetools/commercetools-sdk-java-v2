package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.ProductUnpublishedMessagePayloadImpl;

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
@JsonDeserialize(as = ProductUnpublishedMessagePayloadImpl.class)
public interface ProductUnpublishedMessagePayload extends MessagePayload {



    public static ProductUnpublishedMessagePayloadImpl of(){
        return new ProductUnpublishedMessagePayloadImpl();
    }
    

    public static ProductUnpublishedMessagePayloadImpl of(final ProductUnpublishedMessagePayload template) {
        ProductUnpublishedMessagePayloadImpl instance = new ProductUnpublishedMessagePayloadImpl();
        return instance;
    }

    default <T> T withProductUnpublishedMessagePayload(Function<ProductUnpublishedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
