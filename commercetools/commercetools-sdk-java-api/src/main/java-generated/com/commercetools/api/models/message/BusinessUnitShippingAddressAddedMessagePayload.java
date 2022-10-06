
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
 *  <p>Generated after a successful Add Shipping Address Identifier update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitShippingAddressAddedMessagePayload businessUnitShippingAddressAddedMessagePayload = BusinessUnitShippingAddressAddedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitShippingAddressAddedMessagePayloadImpl.class)
public interface BusinessUnitShippingAddressAddedMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_SHIPPING_ADDRESS_ADDED = "BusinessUnitShippingAddressAdded";

    /**
     *  <p>The address that was added to the Business Unit as shipping address.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static BusinessUnitShippingAddressAddedMessagePayload of() {
        return new BusinessUnitShippingAddressAddedMessagePayloadImpl();
    }

    public static BusinessUnitShippingAddressAddedMessagePayload of(
            final BusinessUnitShippingAddressAddedMessagePayload template) {
        BusinessUnitShippingAddressAddedMessagePayloadImpl instance = new BusinessUnitShippingAddressAddedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static BusinessUnitShippingAddressAddedMessagePayloadBuilder builder() {
        return BusinessUnitShippingAddressAddedMessagePayloadBuilder.of();
    }

    public static BusinessUnitShippingAddressAddedMessagePayloadBuilder builder(
            final BusinessUnitShippingAddressAddedMessagePayload template) {
        return BusinessUnitShippingAddressAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitShippingAddressAddedMessagePayload(
            Function<BusinessUnitShippingAddressAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitShippingAddressAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitShippingAddressAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitShippingAddressAddedMessagePayload>";
            }
        };
    }
}
