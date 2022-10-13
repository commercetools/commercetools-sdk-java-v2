
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Default Shipping Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitDefaultShippingAddressSetMessagePayload businessUnitDefaultShippingAddressSetMessagePayload = BusinessUnitDefaultShippingAddressSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitDefaultShippingAddressSetMessagePayloadImpl.class)
public interface BusinessUnitDefaultShippingAddressSetMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_DEFAULT_SHIPPING_ADDRESS_SET = "BusinessUnitDefaultShippingAddressSet";

    /**
     *  <p>The address that was set as the default shipping address.</p>
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static BusinessUnitDefaultShippingAddressSetMessagePayload of() {
        return new BusinessUnitDefaultShippingAddressSetMessagePayloadImpl();
    }

    public static BusinessUnitDefaultShippingAddressSetMessagePayload of(
            final BusinessUnitDefaultShippingAddressSetMessagePayload template) {
        BusinessUnitDefaultShippingAddressSetMessagePayloadImpl instance = new BusinessUnitDefaultShippingAddressSetMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder builder() {
        return BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder.of();
    }

    public static BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder builder(
            final BusinessUnitDefaultShippingAddressSetMessagePayload template) {
        return BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitDefaultShippingAddressSetMessagePayload(
            Function<BusinessUnitDefaultShippingAddressSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDefaultShippingAddressSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDefaultShippingAddressSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitDefaultShippingAddressSetMessagePayload>";
            }
        };
    }
}
