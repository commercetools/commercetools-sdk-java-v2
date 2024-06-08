
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Address type returned by read methods. Optionally, the <code>custom</code> field can be present in addition to the fields of a BaseAddress.</p>
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
     *  <p>Custom Fields defined for the Address.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Custom Fields defined for the Address.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * set id
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of Address
     */
    public static Address of() {
        return new AddressImpl();
    }

    /**
     * factory method to create a shallow copy Address
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of Address
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Address deepCopy(@Nullable final Address template) {
        if (template == null) {
            return null;
        }
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
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for Address
     * @return builder
     */
    public static AddressBuilder builder() {
        return AddressBuilder.of();
    }

    /**
     * create builder for Address instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddressBuilder builder(final Address template) {
        return AddressBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddress(Function<Address, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Address> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Address>() {
            @Override
            public String toString() {
                return "TypeReference<Address>";
            }
        };
    }
}
