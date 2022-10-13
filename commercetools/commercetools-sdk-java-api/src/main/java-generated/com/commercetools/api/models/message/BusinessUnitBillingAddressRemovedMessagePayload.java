
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
 *  <p>Generated after a successful Remove Billing Address Identifier update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitBillingAddressRemovedMessagePayload businessUnitBillingAddressRemovedMessagePayload = BusinessUnitBillingAddressRemovedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitBillingAddressRemovedMessagePayloadImpl.class)
public interface BusinessUnitBillingAddressRemovedMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_BILLING_ADDRESS_REMOVED = "BusinessUnitBillingAddressRemoved";

    /**
     *  <p>The address that was removed from the billing addresses of the Business Unit.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static BusinessUnitBillingAddressRemovedMessagePayload of() {
        return new BusinessUnitBillingAddressRemovedMessagePayloadImpl();
    }

    public static BusinessUnitBillingAddressRemovedMessagePayload of(
            final BusinessUnitBillingAddressRemovedMessagePayload template) {
        BusinessUnitBillingAddressRemovedMessagePayloadImpl instance = new BusinessUnitBillingAddressRemovedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static BusinessUnitBillingAddressRemovedMessagePayloadBuilder builder() {
        return BusinessUnitBillingAddressRemovedMessagePayloadBuilder.of();
    }

    public static BusinessUnitBillingAddressRemovedMessagePayloadBuilder builder(
            final BusinessUnitBillingAddressRemovedMessagePayload template) {
        return BusinessUnitBillingAddressRemovedMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitBillingAddressRemovedMessagePayload(
            Function<BusinessUnitBillingAddressRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitBillingAddressRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitBillingAddressRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitBillingAddressRemovedMessagePayload>";
            }
        };
    }
}
