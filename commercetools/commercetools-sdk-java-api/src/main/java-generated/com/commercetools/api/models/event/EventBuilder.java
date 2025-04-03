
package com.commercetools.api.models.event;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * EventBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EventBuilder {

    public com.commercetools.api.models.event.ImportContainerCreatedEventBuilder importContainerCreatedBuilder() {
        return com.commercetools.api.models.event.ImportContainerCreatedEventBuilder.of();
    }

    public com.commercetools.api.models.event.ImportContainerDeletedEventBuilder importContainerDeletedBuilder() {
        return com.commercetools.api.models.event.ImportContainerDeletedEventBuilder.of();
    }

    public com.commercetools.api.models.event.ImportOperationRejectedEventBuilder importOperationRejectedBuilder() {
        return com.commercetools.api.models.event.ImportOperationRejectedEventBuilder.of();
    }

    public com.commercetools.api.models.event.ImportUnresolvedEventBuilder importUnresolvedBuilder() {
        return com.commercetools.api.models.event.ImportUnresolvedEventBuilder.of();
    }

    public com.commercetools.api.models.event.ImportValidationFailedEventBuilder importValidationFailedBuilder() {
        return com.commercetools.api.models.event.ImportValidationFailedEventBuilder.of();
    }

    public com.commercetools.api.models.event.ImportWaitForMasterVariantEventBuilder importWaitForMasterVariantBuilder() {
        return com.commercetools.api.models.event.ImportWaitForMasterVariantEventBuilder.of();
    }

    /**
     * factory method for an instance of EventBuilder
     * @return builder
     */
    public static EventBuilder of() {
        return new EventBuilder();
    }

}
