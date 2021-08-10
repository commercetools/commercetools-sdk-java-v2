
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerEmailVerifiedMessagePayloadBuilder implements Builder<CustomerEmailVerifiedMessagePayload> {

    public CustomerEmailVerifiedMessagePayload build() {
        return new CustomerEmailVerifiedMessagePayloadImpl();
    }

    /**
     * builds CustomerEmailVerifiedMessagePayload without checking for non null required values
     */
    public CustomerEmailVerifiedMessagePayload buildUnchecked() {
        return new CustomerEmailVerifiedMessagePayloadImpl();
    }

    public static CustomerEmailVerifiedMessagePayloadBuilder of() {
        return new CustomerEmailVerifiedMessagePayloadBuilder();
    }

    public static CustomerEmailVerifiedMessagePayloadBuilder of(final CustomerEmailVerifiedMessagePayload template) {
        CustomerEmailVerifiedMessagePayloadBuilder builder = new CustomerEmailVerifiedMessagePayloadBuilder();
        return builder;
    }

}
