
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomerFirstNameSetMessagePayloadBuilder implements Builder<CustomerFirstNameSetMessagePayload> {

    private String firstName;

    public CustomerFirstNameSetMessagePayloadBuilder firstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public CustomerFirstNameSetMessagePayload build() {
        Objects.requireNonNull(firstName, CustomerFirstNameSetMessagePayload.class + ": firstName is missing");
        return new CustomerFirstNameSetMessagePayloadImpl(firstName);
    }

    /**
     * builds CustomerFirstNameSetMessagePayload without checking for non null required values
     */
    public CustomerFirstNameSetMessagePayload buildUnchecked() {
        return new CustomerFirstNameSetMessagePayloadImpl(firstName);
    }

    public static CustomerFirstNameSetMessagePayloadBuilder of() {
        return new CustomerFirstNameSetMessagePayloadBuilder();
    }

    public static CustomerFirstNameSetMessagePayloadBuilder of(final CustomerFirstNameSetMessagePayload template) {
        CustomerFirstNameSetMessagePayloadBuilder builder = new CustomerFirstNameSetMessagePayloadBuilder();
        builder.firstName = template.getFirstName();
        return builder;
    }

}
