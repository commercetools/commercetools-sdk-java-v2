
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
 *  <p>Generated after a successful Remove Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressRemovedMessagePayload businessUnitAddressRemovedMessagePayload = BusinessUnitAddressRemovedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddressRemovedMessagePayloadImpl.class)
public interface BusinessUnitAddressRemovedMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_ADDRESS_REMOVED = "BusinessUnitAddressRemoved";

    /**
     *  <p>The address that was removed from the Business Unit.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static BusinessUnitAddressRemovedMessagePayload of() {
        return new BusinessUnitAddressRemovedMessagePayloadImpl();
    }

    public static BusinessUnitAddressRemovedMessagePayload of(final BusinessUnitAddressRemovedMessagePayload template) {
        BusinessUnitAddressRemovedMessagePayloadImpl instance = new BusinessUnitAddressRemovedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static BusinessUnitAddressRemovedMessagePayloadBuilder builder() {
        return BusinessUnitAddressRemovedMessagePayloadBuilder.of();
    }

    public static BusinessUnitAddressRemovedMessagePayloadBuilder builder(
            final BusinessUnitAddressRemovedMessagePayload template) {
        return BusinessUnitAddressRemovedMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitAddressRemovedMessagePayload(
            Function<BusinessUnitAddressRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddressRemovedMessagePayload>";
            }
        };
    }
}
