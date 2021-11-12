
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomerLastNameSetMessagePayloadBuilder implements Builder<CustomerLastNameSetMessagePayload> {

    private String lastName;

    public CustomerLastNameSetMessagePayloadBuilder lastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getLastName() {
        return this.lastName;
    }

    public CustomerLastNameSetMessagePayload build() {
        Objects.requireNonNull(lastName, CustomerLastNameSetMessagePayload.class + ": lastName is missing");
        return new CustomerLastNameSetMessagePayloadImpl(lastName);
    }

    /**
     * builds CustomerLastNameSetMessagePayload without checking for non null required values
     */
    public CustomerLastNameSetMessagePayload buildUnchecked() {
        return new CustomerLastNameSetMessagePayloadImpl(lastName);
    }

    public static CustomerLastNameSetMessagePayloadBuilder of() {
        return new CustomerLastNameSetMessagePayloadBuilder();
    }

    public static CustomerLastNameSetMessagePayloadBuilder of(final CustomerLastNameSetMessagePayload template) {
        CustomerLastNameSetMessagePayloadBuilder builder = new CustomerLastNameSetMessagePayloadBuilder();
        builder.lastName = template.getLastName();
        return builder;
    }

}
