
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DeliveryCloudEventsFormatImpl.class)
public interface DeliveryCloudEventsFormat extends DeliveryFormat {

    String CLOUD_EVENTS = "CloudEvents";

    @NotNull
    @JsonProperty("cloudEventsVersion")
    public String getCloudEventsVersion();

    public void setCloudEventsVersion(final String cloudEventsVersion);

    public static DeliveryCloudEventsFormat of() {
        return new DeliveryCloudEventsFormatImpl();
    }

    public static DeliveryCloudEventsFormat of(final DeliveryCloudEventsFormat template) {
        DeliveryCloudEventsFormatImpl instance = new DeliveryCloudEventsFormatImpl();
        instance.setCloudEventsVersion(template.getCloudEventsVersion());
        return instance;
    }

    public static DeliveryCloudEventsFormatBuilder builder() {
        return DeliveryCloudEventsFormatBuilder.of();
    }

    public static DeliveryCloudEventsFormatBuilder builder(final DeliveryCloudEventsFormat template) {
        return DeliveryCloudEventsFormatBuilder.of(template);
    }

    default <T> T withDeliveryCloudEventsFormat(Function<DeliveryCloudEventsFormat, T> helper) {
        return helper.apply(this);
    }
}
