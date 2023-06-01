package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.CloudEventsFormat;
import com.commercetools.api.models.subscription.PlatformFormat;
import com.commercetools.api.models.subscription.DeliveryFormat;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryFormatBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DeliveryFormatBuilder {

    public com.commercetools.api.models.subscription.CloudEventsFormatBuilder cloudEventsBuilder() {
       return com.commercetools.api.models.subscription.CloudEventsFormatBuilder.of();
    }
    public com.commercetools.api.models.subscription.PlatformFormatBuilder platformBuilder() {
       return com.commercetools.api.models.subscription.PlatformFormatBuilder.of();
    }

    /**
     * factory method for an instance of DeliveryFormatBuilder
     * @return builder 
     */
    public static DeliveryFormatBuilder of() {
        return new DeliveryFormatBuilder();
    }

}
