
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerCompanyNameSetMessagePayloadImpl.class)
public interface CustomerCompanyNameSetMessagePayload extends MessagePayload {

    String CUSTOMER_COMPANY_NAME_SET = "CustomerCompanyNameSet";

    @JsonProperty("companyName")
    public String getCompanyName();

    public void setCompanyName(final String companyName);

    public static CustomerCompanyNameSetMessagePayload of() {
        return new CustomerCompanyNameSetMessagePayloadImpl();
    }

    public static CustomerCompanyNameSetMessagePayload of(final CustomerCompanyNameSetMessagePayload template) {
        CustomerCompanyNameSetMessagePayloadImpl instance = new CustomerCompanyNameSetMessagePayloadImpl();
        instance.setCompanyName(template.getCompanyName());
        return instance;
    }

    public static CustomerCompanyNameSetMessagePayloadBuilder builder() {
        return CustomerCompanyNameSetMessagePayloadBuilder.of();
    }

    public static CustomerCompanyNameSetMessagePayloadBuilder builder(
            final CustomerCompanyNameSetMessagePayload template) {
        return CustomerCompanyNameSetMessagePayloadBuilder.of(template);
    }

    default <T> T withCustomerCompanyNameSetMessagePayload(Function<CustomerCompanyNameSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerCompanyNameSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerCompanyNameSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerCompanyNameSetMessagePayload>";
            }
        };
    }
}
