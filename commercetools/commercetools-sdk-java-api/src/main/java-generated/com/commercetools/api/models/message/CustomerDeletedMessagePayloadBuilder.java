
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomerDeletedMessagePayloadBuilder implements Builder<CustomerDeletedMessagePayload> {

    public CustomerDeletedMessagePayload build() {
        return new CustomerDeletedMessagePayloadImpl();
    }

    /**
     * builds CustomerDeletedMessagePayload without checking for non null required values
     */
    public CustomerDeletedMessagePayload buildUnchecked() {
        return new CustomerDeletedMessagePayloadImpl();
    }

    public static CustomerDeletedMessagePayloadBuilder of() {
        return new CustomerDeletedMessagePayloadBuilder();
    }

    public static CustomerDeletedMessagePayloadBuilder of(final CustomerDeletedMessagePayload template) {
        CustomerDeletedMessagePayloadBuilder builder = new CustomerDeletedMessagePayloadBuilder();
        return builder;
    }

}
