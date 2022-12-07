
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Address
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Address address = Address.builder()
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddressImpl.class)
public interface Address extends BaseAddress, com.commercetools.api.models.Customizable<Address> {

    /**
     *
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Custom Fields defined for the Address.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setCustom(final CustomFields custom);

    public static Address of() {
        return new AddressImpl();
    }

    public static Address of(final Address template) {
        AddressImpl instance = new AddressImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setCountry(template.getCountry());
        instance.setTitle(template.getTitle());
        instance.setSalutation(template.getSalutation());
        instance.setFirstName(template.getFirstName());
        instance.setLastName(template.getLastName());
        instance.setStreetName(template.getStreetName());
        instance.setStreetNumber(template.getStreetNumber());
        instance.setAdditionalStreetInfo(template.getAdditionalStreetInfo());
        instance.setPostalCode(template.getPostalCode());
        instance.setCity(template.getCity());
        instance.setRegion(template.getRegion());
        instance.setState(template.getState());
        instance.setCompany(template.getCompany());
        instance.setDepartment(template.getDepartment());
        instance.setBuilding(template.getBuilding());
        instance.setApartment(template.getApartment());
        instance.setPOBox(template.getPOBox());
        instance.setPhone(template.getPhone());
        instance.setMobile(template.getMobile());
        instance.setEmail(template.getEmail());
        instance.setFax(template.getFax());
        instance.setAdditionalAddressInfo(template.getAdditionalAddressInfo());
        instance.setExternalId(template.getExternalId());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static AddressBuilder builder() {
        return AddressBuilder.of();
    }

    public static AddressBuilder builder(final Address template) {
        return AddressBuilder.of(template);
    }

    default <T> T withAddress(Function<Address, T> helper) {
        return helper.apply(this);
    }

    public default AddressDraftBuilder toDraftBuilder() {
        return AddressDraft.builder()
                .key(this.getKey())
                .country(this.getCountry())
                .title(this.getTitle())
                .salutation(this.getSalutation())
                .firstName(this.getFirstName())
                .lastName(this.getLastName())
                .streetName(this.getStreetName())
                .streetNumber(this.getStreetNumber())
                .additionalStreetInfo(this.getAdditionalStreetInfo())
                .postalCode(this.getPostalCode())
                .city(this.getCity())
                .region(this.getRegion())
                .state(this.getState())
                .company(this.getCompany())
                .department(this.getDepartment())
                .building(this.getBuilding())
                .apartment(this.getApartment())
                .pOBox(this.getPOBox())
                .phone(this.getPhone())
                .mobile(this.getMobile())
                .email(this.getEmail())
                .fax(this.getFax())
                .additionalAddressInfo(this.getAdditionalAddressInfo())
                .externalId(this.getExternalId());
    }

    public default AddressDraft toDraft() {
        return toDraftBuilder().build();
    }

    public default boolean equalsIgnoreId(final Address address) {
        return address != null && Address.builder(address)
                .id(null)
                .buildUnchecked()
                .equals(Address.builder(this).id(null).buildUnchecked());
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Address> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Address>() {
            @Override
            public String toString() {
                return "TypeReference<Address>";
            }
        };
    }
}
