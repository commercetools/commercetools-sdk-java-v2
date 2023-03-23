
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
 *     BusinessUnitDefaultBillingAddressSetMessage businessUnitDefaultBillingAddressSetMessage = BusinessUnitDefaultBillingAddressSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitDefaultBillingAddressSetMessageImpl.class)
public interface BusinessUnitDefaultBillingAddressSetMessage extends Message {

    String BUSINESS_UNIT_DEFAULT_BILLING_ADDRESS_SET = "BusinessUnitDefaultBillingAddressSet";

    /**
     *  <p>The address that was set as the default billing address.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static BusinessUnitDefaultBillingAddressSetMessage of() {
        return new BusinessUnitDefaultBillingAddressSetMessageImpl();
    }

    public static BusinessUnitDefaultBillingAddressSetMessage of(
            final BusinessUnitDefaultBillingAddressSetMessage template) {
        BusinessUnitDefaultBillingAddressSetMessageImpl instance = new BusinessUnitDefaultBillingAddressSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static BusinessUnitDefaultBillingAddressSetMessageBuilder builder() {
        return BusinessUnitDefaultBillingAddressSetMessageBuilder.of();
    }

    public static BusinessUnitDefaultBillingAddressSetMessageBuilder builder(
            final BusinessUnitDefaultBillingAddressSetMessage template) {
        return BusinessUnitDefaultBillingAddressSetMessageBuilder.of(template);
    }

    default <T> T withBusinessUnitDefaultBillingAddressSetMessage(
            Function<BusinessUnitDefaultBillingAddressSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDefaultBillingAddressSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDefaultBillingAddressSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitDefaultBillingAddressSetMessage>";
            }
        };
    }
}
