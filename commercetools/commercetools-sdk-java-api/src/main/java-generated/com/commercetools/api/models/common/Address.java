
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

    public void setCustom(final CustomFields custom);

    public void setId(final String id);

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

    public static com.fasterxml.jackson.core.type.TypeReference<Address> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Address>() {
            @Override
            public String toString() {
                return "TypeReference<Address>";
            }
        };
    }
}
