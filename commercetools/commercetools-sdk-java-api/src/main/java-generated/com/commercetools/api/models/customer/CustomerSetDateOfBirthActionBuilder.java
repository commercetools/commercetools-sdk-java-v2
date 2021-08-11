
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSetDateOfBirthActionBuilder implements Builder<CustomerSetDateOfBirthAction> {

    @Nullable
    private java.time.LocalDate dateOfBirth;

    public CustomerSetDateOfBirthActionBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    @Nullable
    public java.time.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public CustomerSetDateOfBirthAction build() {
        return new CustomerSetDateOfBirthActionImpl(dateOfBirth);
    }

    /**
     * builds CustomerSetDateOfBirthAction without checking for non null required values
     */
    public CustomerSetDateOfBirthAction buildUnchecked() {
        return new CustomerSetDateOfBirthActionImpl(dateOfBirth);
    }

    public static CustomerSetDateOfBirthActionBuilder of() {
        return new CustomerSetDateOfBirthActionBuilder();
    }

    public static CustomerSetDateOfBirthActionBuilder of(final CustomerSetDateOfBirthAction template) {
        CustomerSetDateOfBirthActionBuilder builder = new CustomerSetDateOfBirthActionBuilder();
        builder.dateOfBirth = template.getDateOfBirth();
        return builder;
    }

}
