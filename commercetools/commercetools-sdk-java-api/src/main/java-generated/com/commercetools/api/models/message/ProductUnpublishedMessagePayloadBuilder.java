package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.ProductUnpublishedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductUnpublishedMessagePayloadBuilder {




    public ProductUnpublishedMessagePayload build() {
        return new ProductUnpublishedMessagePayloadImpl();
    }

    public static ProductUnpublishedMessagePayloadBuilder of() {
        return new ProductUnpublishedMessagePayloadBuilder();
    }

    public static ProductUnpublishedMessagePayloadBuilder of(final ProductUnpublishedMessagePayload template) {
        ProductUnpublishedMessagePayloadBuilder builder = new ProductUnpublishedMessagePayloadBuilder();
        return builder;
    }

}
