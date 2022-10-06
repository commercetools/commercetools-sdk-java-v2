
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
 *  <p>Generated after a successful Add Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressAddedMessagePayload businessUnitAddressAddedMessagePayload = BusinessUnitAddressAddedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddressAddedMessagePayloadImpl.class)
public interface BusinessUnitAddressAddedMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_ADDRESS_ADDED = "BusinessUnitAddressAdded";

    /**
     *  <p>The address that was added to the Business Unit.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static BusinessUnitAddressAddedMessagePayload of() {
        return new BusinessUnitAddressAddedMessagePayloadImpl();
    }

    public static BusinessUnitAddressAddedMessagePayload of(final BusinessUnitAddressAddedMessagePayload template) {
        BusinessUnitAddressAddedMessagePayloadImpl instance = new BusinessUnitAddressAddedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static BusinessUnitAddressAddedMessagePayloadBuilder builder() {
        return BusinessUnitAddressAddedMessagePayloadBuilder.of();
    }

    public static BusinessUnitAddressAddedMessagePayloadBuilder builder(
            final BusinessUnitAddressAddedMessagePayload template) {
        return BusinessUnitAddressAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitAddressAddedMessagePayload(
            Function<BusinessUnitAddressAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddressAddedMessagePayload>";
            }
        };
    }
}
