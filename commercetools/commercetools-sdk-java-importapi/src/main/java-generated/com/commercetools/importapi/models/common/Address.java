
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.customfields.Custom;
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
public interface Address {

    /**
     *
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *
     * @return title
     */

    @JsonProperty("title")
    public String getTitle();

    /**
     *
     * @return salutation
     */

    @JsonProperty("salutation")
    public String getSalutation();

    /**
     *
     * @return firstName
     */

    @JsonProperty("firstName")
    public String getFirstName();

    /**
     *
     * @return lastName
     */

    @JsonProperty("lastName")
    public String getLastName();

    /**
     *
     * @return streetName
     */

    @JsonProperty("streetName")
    public String getStreetName();

    /**
     *
     * @return streetNumber
     */

    @JsonProperty("streetNumber")
    public String getStreetNumber();

    /**
     *
     * @return additionalStreetInfo
     */

    @JsonProperty("additionalStreetInfo")
    public String getAdditionalStreetInfo();

    /**
     *
     * @return postalCode
     */

    @JsonProperty("postalCode")
    public String getPostalCode();

    /**
     *
     * @return city
     */

    @JsonProperty("city")
    public String getCity();

    /**
     *
     * @return region
     */

    @JsonProperty("region")
    public String getRegion();

    /**
     *
     * @return state
     */

    @JsonProperty("state")
    public String getState();

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @return country
     */
    @NotNull
    @JsonProperty("country")
    public String getCountry();

    /**
     *
     * @return company
     */

    @JsonProperty("company")
    public String getCompany();

    /**
     *
     * @return department
     */

    @JsonProperty("department")
    public String getDepartment();

    /**
     *
     * @return building
     */

    @JsonProperty("building")
    public String getBuilding();

    /**
     *
     * @return apartment
     */

    @JsonProperty("apartment")
    public String getApartment();

    /**
     *
     * @return pOBox
     */

    @JsonProperty("pOBox")
    public String getPOBox();

    /**
     *
     * @return phone
     */

    @JsonProperty("phone")
    public String getPhone();

    /**
     *
     * @return mobile
     */

    @JsonProperty("mobile")
    public String getMobile();

    /**
     *
     * @return email
     */

    @JsonProperty("email")
    public String getEmail();

    /**
     *
     * @return fax
     */

    @JsonProperty("fax")
    public String getFax();

    /**
     *
     * @return additionalAddressInfo
     */

    @JsonProperty("additionalAddressInfo")
    public String getAdditionalAddressInfo();

    /**
     *
     * @return externalId
     */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
     *  <p>Custom Fields defined for the Address. Custom Fields can only be applied to <code>shippingAddress</code>.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    /**
     * set id
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * set key
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * set title
     * @param title value to be set
     */

    public void setTitle(final String title);

    /**
     * set salutation
     * @param salutation value to be set
     */

    public void setSalutation(final String salutation);

    /**
     * set firstName
     * @param firstName value to be set
     */

    public void setFirstName(final String firstName);

    /**
     * set lastName
     * @param lastName value to be set
     */

    public void setLastName(final String lastName);

    /**
     * set streetName
     * @param streetName value to be set
     */

    public void setStreetName(final String streetName);

    /**
     * set streetNumber
     * @param streetNumber value to be set
     */

    public void setStreetNumber(final String streetNumber);

    /**
     * set additionalStreetInfo
     * @param additionalStreetInfo value to be set
     */

    public void setAdditionalStreetInfo(final String additionalStreetInfo);

    /**
     * set postalCode
     * @param postalCode value to be set
     */

    public void setPostalCode(final String postalCode);

    /**
     * set city
     * @param city value to be set
     */

    public void setCity(final String city);

    /**
     * set region
     * @param region value to be set
     */

    public void setRegion(final String region);

    /**
     * set state
     * @param state value to be set
     */

    public void setState(final String state);

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     * set company
     * @param company value to be set
     */

    public void setCompany(final String company);

    /**
     * set department
     * @param department value to be set
     */

    public void setDepartment(final String department);

    /**
     * set building
     * @param building value to be set
     */

    public void setBuilding(final String building);

    /**
     * set apartment
     * @param apartment value to be set
     */

    public void setApartment(final String apartment);

    /**
     * set pOBox
     * @param pOBox value to be set
     */

    public void setPOBox(final String pOBox);

    /**
     * set phone
     * @param phone value to be set
     */

    public void setPhone(final String phone);

    /**
     * set mobile
     * @param mobile value to be set
     */

    public void setMobile(final String mobile);

    /**
     * set email
     * @param email value to be set
     */

    public void setEmail(final String email);

    /**
     * set fax
     * @param fax value to be set
     */

    public void setFax(final String fax);

    /**
     * set additionalAddressInfo
     * @param additionalAddressInfo value to be set
     */

    public void setAdditionalAddressInfo(final String additionalAddressInfo);

    /**
     * set externalId
     * @param externalId value to be set
     */

    public void setExternalId(final String externalId);

    /**
     *  <p>Custom Fields defined for the Address. Custom Fields can only be applied to <code>shippingAddress</code>.</p>
     * @param custom value to be set
     */

    public void setCustom(final Custom custom);

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
        instance.setCountry(template.getCountry());
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
        instance.setCountry(template.getCountry());
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
        instance.setCustom(com.commercetools.importapi.models.customfields.Custom.deepCopy(template.getCustom()));
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
