
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
 *  <p>Generated after a successful Change Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressChangedMessagePayload businessUnitAddressChangedMessagePayload = BusinessUnitAddressChangedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddressChangedMessagePayloadImpl.class)
public interface BusinessUnitAddressChangedMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_ADDRESS_CHANGED = "BusinessUnitAddressChanged";

    /**
     *  <p>Updated address of the Business Unit.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static BusinessUnitAddressChangedMessagePayload of() {
        return new BusinessUnitAddressChangedMessagePayloadImpl();
    }

    public static BusinessUnitAddressChangedMessagePayload of(final BusinessUnitAddressChangedMessagePayload template) {
        BusinessUnitAddressChangedMessagePayloadImpl instance = new BusinessUnitAddressChangedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static BusinessUnitAddressChangedMessagePayloadBuilder builder() {
        return BusinessUnitAddressChangedMessagePayloadBuilder.of();
    }

    public static BusinessUnitAddressChangedMessagePayloadBuilder builder(
            final BusinessUnitAddressChangedMessagePayload template) {
        return BusinessUnitAddressChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitAddressChangedMessagePayload(
            Function<BusinessUnitAddressChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddressChangedMessagePayload>";
            }
        };
    }
}
