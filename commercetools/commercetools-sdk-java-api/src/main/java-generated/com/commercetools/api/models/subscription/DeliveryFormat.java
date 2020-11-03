package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.DeliveryCloudEventsFormat;
import com.commercetools.api.models.subscription.DeliveryPlatformFormat;


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

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.DeliveryPlatformFormatImpl.class, name = "Platform"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.DeliveryCloudEventsFormatImpl.class, name = "CloudEvents")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = DeliveryFormatImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface DeliveryFormat  {





    default <T> T withDeliveryFormat(Function<DeliveryFormat, T> helper) {
        return helper.apply(this);
    }
}
