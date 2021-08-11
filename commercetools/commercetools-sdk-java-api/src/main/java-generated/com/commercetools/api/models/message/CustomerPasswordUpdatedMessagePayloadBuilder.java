
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerPasswordUpdatedMessagePayloadBuilder
        implements Builder<CustomerPasswordUpdatedMessagePayload> {

    private Boolean reset;

    public CustomerPasswordUpdatedMessagePayloadBuilder reset(final Boolean reset) {
        this.reset = reset;
        return this;
    }

    public Boolean getReset() {
        return this.reset;
    }

    public CustomerPasswordUpdatedMessagePayload build() {
        Objects.requireNonNull(reset, CustomerPasswordUpdatedMessagePayload.class + ": reset is missing");
        return new CustomerPasswordUpdatedMessagePayloadImpl(reset);
    }

    /**
     * builds CustomerPasswordUpdatedMessagePayload without checking for non null required values
     */
    public CustomerPasswordUpdatedMessagePayload buildUnchecked() {
        return new CustomerPasswordUpdatedMessagePayloadImpl(reset);
    }

    public static CustomerPasswordUpdatedMessagePayloadBuilder of() {
        return new CustomerPasswordUpdatedMessagePayloadBuilder();
    }

    public static CustomerPasswordUpdatedMessagePayloadBuilder of(
            final CustomerPasswordUpdatedMessagePayload template) {
        CustomerPasswordUpdatedMessagePayloadBuilder builder = new CustomerPasswordUpdatedMessagePayloadBuilder();
        builder.reset = template.getReset();
        return builder;
    }

}
