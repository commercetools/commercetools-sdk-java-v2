
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddressRemovedMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressRemovedMessagePayload customerAddressRemovedMessagePayload = CustomerAddressRemovedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerAddressRemovedMessagePayloadImpl.class)
public interface CustomerAddressRemovedMessagePayload extends MessagePayload {

    String CUSTOMER_ADDRESS_REMOVED = "CustomerAddressRemoved";

    /**
     <>
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static CustomerAddressRemovedMessagePayload of() {
        return new CustomerAddressRemovedMessagePayloadImpl();
    }

    public static CustomerAddressRemovedMessagePayload of(final CustomerAddressRemovedMessagePayload template) {
        CustomerAddressRemovedMessagePayloadImpl instance = new CustomerAddressRemovedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static CustomerAddressRemovedMessagePayloadBuilder builder() {
        return CustomerAddressRemovedMessagePayloadBuilder.of();
    }

    public static CustomerAddressRemovedMessagePayloadBuilder builder(
            final CustomerAddressRemovedMessagePayload template) {
        return CustomerAddressRemovedMessagePayloadBuilder.of(template);
    }

    default <T> T withCustomerAddressRemovedMessagePayload(Function<CustomerAddressRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddressRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddressRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddressRemovedMessagePayload>";
            }
        };
    }
}
