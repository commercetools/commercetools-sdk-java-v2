package com.commercetools.api.models.subscription;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.message.UserProvidedIdentifiers;
import com.commercetools.api.models.subscription.MessageDeliveryPayload;
import com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayload;
import com.commercetools.api.models.subscription.ResourceDeletedDeliveryPayload;
import com.commercetools.api.models.subscription.ResourceUpdatedDeliveryPayload;
import com.commercetools.api.models.subscription.DeliveryPayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryPayloadBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DeliveryPayloadBuilder {

    public com.commercetools.api.models.subscription.MessageDeliveryPayloadBuilder messageBuilder() {
       return com.commercetools.api.models.subscription.MessageDeliveryPayloadBuilder.of();
    }
    public com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayloadBuilder resourceCreatedBuilder() {
       return com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayloadBuilder.of();
    }
    public com.commercetools.api.models.subscription.ResourceDeletedDeliveryPayloadBuilder resourceDeletedBuilder() {
       return com.commercetools.api.models.subscription.ResourceDeletedDeliveryPayloadBuilder.of();
    }
    public com.commercetools.api.models.subscription.ResourceUpdatedDeliveryPayloadBuilder resourceUpdatedBuilder() {
       return com.commercetools.api.models.subscription.ResourceUpdatedDeliveryPayloadBuilder.of();
    }

    /**
     * factory method for an instance of DeliveryPayloadBuilder
     * @return builder 
     */
    public static DeliveryPayloadBuilder of() {
        return new DeliveryPayloadBuilder();
    }

}
