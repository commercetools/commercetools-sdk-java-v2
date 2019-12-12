package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.DeliveryCloudEventsFormat;
import com.commercetools.api.generated.models.subscription.DeliveryPlatformFormat;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.subscription.DeliveryPlatformFormatImpl.class, name = "Platform"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.subscription.DeliveryCloudEventsFormatImpl.class, name = "CloudEvents")
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


   


}