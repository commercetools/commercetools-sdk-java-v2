
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerCompanyNameSetMessagePayloadBuilder
        implements Builder<CustomerCompanyNameSetMessagePayload> {

    private String companyName;

    public CustomerCompanyNameSetMessagePayloadBuilder companyName(final String companyName) {
        this.companyName = companyName;
        return this;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public CustomerCompanyNameSetMessagePayload build() {
        Objects.requireNonNull(companyName, CustomerCompanyNameSetMessagePayload.class + ": companyName is missing");
        return new CustomerCompanyNameSetMessagePayloadImpl(companyName);
    }

    /**
     * builds CustomerCompanyNameSetMessagePayload without checking for non null required values
     */
    public CustomerCompanyNameSetMessagePayload buildUnchecked() {
        return new CustomerCompanyNameSetMessagePayloadImpl(companyName);
    }

    public static CustomerCompanyNameSetMessagePayloadBuilder of() {
        return new CustomerCompanyNameSetMessagePayloadBuilder();
    }

    public static CustomerCompanyNameSetMessagePayloadBuilder of(final CustomerCompanyNameSetMessagePayload template) {
        CustomerCompanyNameSetMessagePayloadBuilder builder = new CustomerCompanyNameSetMessagePayloadBuilder();
        builder.companyName = template.getCompanyName();
        return builder;
    }

}
