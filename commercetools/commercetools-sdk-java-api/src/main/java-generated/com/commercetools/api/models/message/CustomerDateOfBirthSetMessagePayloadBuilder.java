
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerDateOfBirthSetMessagePayloadBuilder
        implements Builder<CustomerDateOfBirthSetMessagePayload> {

    private java.time.LocalDate dateOfBirth;

    public CustomerDateOfBirthSetMessagePayloadBuilder dateOfBirth(final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public java.time.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public CustomerDateOfBirthSetMessagePayload build() {
        Objects.requireNonNull(dateOfBirth, CustomerDateOfBirthSetMessagePayload.class + ": dateOfBirth is missing");
        return new CustomerDateOfBirthSetMessagePayloadImpl(dateOfBirth);
    }

    /**
     * builds CustomerDateOfBirthSetMessagePayload without checking for non null required values
     */
    public CustomerDateOfBirthSetMessagePayload buildUnchecked() {
        return new CustomerDateOfBirthSetMessagePayloadImpl(dateOfBirth);
    }

    public static CustomerDateOfBirthSetMessagePayloadBuilder of() {
        return new CustomerDateOfBirthSetMessagePayloadBuilder();
    }

    public static CustomerDateOfBirthSetMessagePayloadBuilder of(final CustomerDateOfBirthSetMessagePayload template) {
        CustomerDateOfBirthSetMessagePayloadBuilder builder = new CustomerDateOfBirthSetMessagePayloadBuilder();
        builder.dateOfBirth = template.getDateOfBirth();
        return builder;
    }

}
