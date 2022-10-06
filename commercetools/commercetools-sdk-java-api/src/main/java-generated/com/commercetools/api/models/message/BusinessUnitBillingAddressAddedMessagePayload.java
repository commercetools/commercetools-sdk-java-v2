
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
 *  <p>Generated after a successful Add Billing Address Identifier update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitBillingAddressAddedMessagePayload businessUnitBillingAddressAddedMessagePayload = BusinessUnitBillingAddressAddedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitBillingAddressAddedMessagePayloadImpl.class)
public interface BusinessUnitBillingAddressAddedMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_BILLING_ADDRESS_ADDED = "BusinessUnitBillingAddressAdded";

    /**
     *  <p>The address that was added to the Business Unit as billing address.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static BusinessUnitBillingAddressAddedMessagePayload of() {
        return new BusinessUnitBillingAddressAddedMessagePayloadImpl();
    }

    public static BusinessUnitBillingAddressAddedMessagePayload of(
            final BusinessUnitBillingAddressAddedMessagePayload template) {
        BusinessUnitBillingAddressAddedMessagePayloadImpl instance = new BusinessUnitBillingAddressAddedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static BusinessUnitBillingAddressAddedMessagePayloadBuilder builder() {
        return BusinessUnitBillingAddressAddedMessagePayloadBuilder.of();
    }

    public static BusinessUnitBillingAddressAddedMessagePayloadBuilder builder(
            final BusinessUnitBillingAddressAddedMessagePayload template) {
        return BusinessUnitBillingAddressAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitBillingAddressAddedMessagePayload(
            Function<BusinessUnitBillingAddressAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitBillingAddressAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitBillingAddressAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitBillingAddressAddedMessagePayload>";
            }
        };
    }
}
