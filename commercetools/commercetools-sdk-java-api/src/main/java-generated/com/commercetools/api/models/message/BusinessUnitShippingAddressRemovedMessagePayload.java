
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
 *  <p>Generated after a successful Remove Shipping Address Identifier update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitShippingAddressRemovedMessagePayload businessUnitShippingAddressRemovedMessagePayload = BusinessUnitShippingAddressRemovedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitShippingAddressRemovedMessagePayloadImpl.class)
public interface BusinessUnitShippingAddressRemovedMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_SHIPPING_ADDRESS_REMOVED = "BusinessUnitShippingAddressRemoved";

    /**
     *  <p>The address that was removed from shipping addresses of the Business Unit.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static BusinessUnitShippingAddressRemovedMessagePayload of() {
        return new BusinessUnitShippingAddressRemovedMessagePayloadImpl();
    }

    public static BusinessUnitShippingAddressRemovedMessagePayload of(
            final BusinessUnitShippingAddressRemovedMessagePayload template) {
        BusinessUnitShippingAddressRemovedMessagePayloadImpl instance = new BusinessUnitShippingAddressRemovedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static BusinessUnitShippingAddressRemovedMessagePayloadBuilder builder() {
        return BusinessUnitShippingAddressRemovedMessagePayloadBuilder.of();
    }

    public static BusinessUnitShippingAddressRemovedMessagePayloadBuilder builder(
            final BusinessUnitShippingAddressRemovedMessagePayload template) {
        return BusinessUnitShippingAddressRemovedMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitShippingAddressRemovedMessagePayload(
            Function<BusinessUnitShippingAddressRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitShippingAddressRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitShippingAddressRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitShippingAddressRemovedMessagePayload>";
            }
        };
    }
}
