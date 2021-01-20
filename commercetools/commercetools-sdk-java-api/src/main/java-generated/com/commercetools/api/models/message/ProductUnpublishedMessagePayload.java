
package com.commercetools.api.models.message;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.ProductUnpublishedMessagePayloadImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductUnpublishedMessagePayloadImpl.class)
public interface ProductUnpublishedMessagePayload extends MessagePayload {

    public static ProductUnpublishedMessagePayload of() {
        return new ProductUnpublishedMessagePayloadImpl();
    }

    public static ProductUnpublishedMessagePayload of(final ProductUnpublishedMessagePayload template) {
        ProductUnpublishedMessagePayloadImpl instance = new ProductUnpublishedMessagePayloadImpl();
        return instance;
    }

    public static ProductUnpublishedMessagePayloadBuilder builder() {
        return ProductUnpublishedMessagePayloadBuilder.of();
    }

    public static ProductUnpublishedMessagePayloadBuilder builder(final ProductUnpublishedMessagePayload template) {
        return ProductUnpublishedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductUnpublishedMessagePayload(Function<ProductUnpublishedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
