
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
 *  <p>Generated after a successful Set Default Billing Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitDefaultBillingAddressSetMessagePayload businessUnitDefaultBillingAddressSetMessagePayload = BusinessUnitDefaultBillingAddressSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitDefaultBillingAddressSetMessagePayloadImpl.class)
public interface BusinessUnitDefaultBillingAddressSetMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_DEFAULT_BILLING_ADDRESS_SET = "BusinessUnitDefaultBillingAddressSet";

    /**
     *  <p>The address that was set as the default billing address.</p>
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static BusinessUnitDefaultBillingAddressSetMessagePayload of() {
        return new BusinessUnitDefaultBillingAddressSetMessagePayloadImpl();
    }

    public static BusinessUnitDefaultBillingAddressSetMessagePayload of(
            final BusinessUnitDefaultBillingAddressSetMessagePayload template) {
        BusinessUnitDefaultBillingAddressSetMessagePayloadImpl instance = new BusinessUnitDefaultBillingAddressSetMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder builder() {
        return BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder.of();
    }

    public static BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder builder(
            final BusinessUnitDefaultBillingAddressSetMessagePayload template) {
        return BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitDefaultBillingAddressSetMessagePayload(
            Function<BusinessUnitDefaultBillingAddressSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDefaultBillingAddressSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDefaultBillingAddressSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitDefaultBillingAddressSetMessagePayload>";
            }
        };
    }
}
