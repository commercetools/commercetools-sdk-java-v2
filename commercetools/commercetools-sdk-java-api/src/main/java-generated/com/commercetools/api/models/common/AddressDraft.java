
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Address type to be used on write methods. Optionally, use the <code>custom</code> field in addition to the fields of a BaseAddress.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddressDraft addressDraft = AddressDraft.builder()
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddressDraftImpl.class)
public interface AddressDraft extends BaseAddress, com.commercetools.api.models.CustomizableDraft<AddressDraft>,
        io.vrap.rmf.base.client.Draft<AddressDraft> {

    /**
     *  <p>Custom Fields defined for the Address.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Custom Fields defined for the Address.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of AddressDraft
     */
    public static AddressDraft of() {
        return new AddressDraftImpl();
    }

    /**
     * factory method to create a shallow copy AddressDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddressDraft of(final AddressDraft template) {
        AddressDraftImpl instance = new AddressDraftImpl();
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
     * factory method to create a deep copy of AddressDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddressDraft deepCopy(@Nullable final AddressDraft template) {
        if (template == null) {
            return null;
        }
        AddressDraftImpl instance = new AddressDraftImpl();
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
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for AddressDraft
     * @return builder
     */
    public static AddressDraftBuilder builder() {
        return AddressDraftBuilder.of();
    }

    /**
     * create builder for AddressDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddressDraftBuilder builder(final AddressDraft template) {
        return AddressDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddressDraft(Function<AddressDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddressDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddressDraft>() {
            @Override
            public String toString() {
                return "TypeReference<AddressDraft>";
            }
        };
    }
}
