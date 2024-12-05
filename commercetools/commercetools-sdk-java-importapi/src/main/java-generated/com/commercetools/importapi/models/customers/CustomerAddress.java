
package com.commercetools.importapi.models.customers;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Different from Address in that <code>key</code> is required and <code>id</code> is not supported.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddress customerAddress = CustomerAddress.builder()
 *             .key("{key}")
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerAddressImpl.class)
public interface CustomerAddress {

    /**
     *  <p>User-defined identifier for the address. Must follow the pattern <code>[a-zA-Z0-9_\-]{2,256}</code> and must be unique per customer.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the country.</p>
     * @return country
     */
    @NotNull
    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Title of the contact, for example 'Dr.'</p>
     * @return title
     */

    @JsonProperty("title")
    public String getTitle();

    /**
     *  <p>Salutation of the contact, for example 'Mr.' or 'Ms.'</p>
     * @return salutation
     */

    @JsonProperty("salutation")
    public String getSalutation();

    /**
     *  <p>Given name (first name) of the contact.</p>
     * @return firstName
     */

    @JsonProperty("firstName")
    public String getFirstName();

    /**
     *  <p>Family name (last name) of the contact.</p>
     * @return lastName
     */

    @JsonProperty("lastName")
    public String getLastName();

    /**
     *  <p>Name of the street.</p>
     * @return streetName
     */

    @JsonProperty("streetName")
    public String getStreetName();

    /**
     *  <p>Street number.</p>
     * @return streetNumber
     */

    @JsonProperty("streetNumber")
    public String getStreetNumber();

    /**
     *  <p>Further information on the street address.</p>
     * @return additionalStreetInfo
     */

    @JsonProperty("additionalStreetInfo")
    public String getAdditionalStreetInfo();

    /**
     *  <p>Postal code.</p>
     * @return postalCode
     */

    @JsonProperty("postalCode")
    public String getPostalCode();

    /**
     *  <p>Name of the city.</p>
     * @return city
     */

    @JsonProperty("city")
    public String getCity();

    /**
     *  <p>Name of the region.</p>
     * @return region
     */

    @JsonProperty("region")
    public String getRegion();

    /**
     *  <p>Name of the state, for example, Colorado.</p>
     * @return state
     */

    @JsonProperty("state")
    public String getState();

    /**
     *  <p>Name of the company.</p>
     * @return company
     */

    @JsonProperty("company")
    public String getCompany();

    /**
     *  <p>Name of the department.</p>
     * @return department
     */

    @JsonProperty("department")
    public String getDepartment();

    /**
     *  <p>Number or name of the building.</p>
     * @return building
     */

    @JsonProperty("building")
    public String getBuilding();

    /**
     *  <p>Number or name of the apartment.</p>
     * @return apartment
     */

    @JsonProperty("apartment")
    public String getApartment();

    /**
     *  <p>Post office box number.</p>
     * @return pOBox
     */

    @JsonProperty("pOBox")
    public String getPOBox();

    /**
     *  <p>Phone number of the contact.</p>
     * @return phone
     */

    @JsonProperty("phone")
    public String getPhone();

    /**
     *  <p>Mobile phone number of the contact.</p>
     * @return mobile
     */

    @JsonProperty("mobile")
    public String getMobile();

    /**
     *  <p>Email address of the contact.</p>
     * @return email
     */

    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Fax number of the contact.</p>
     * @return fax
     */

    @JsonProperty("fax")
    public String getFax();

    /**
     *  <p>Further information on the Address.</p>
     * @return additionalAddressInfo
     */

    @JsonProperty("additionalAddressInfo")
    public String getAdditionalAddressInfo();

    /**
     *  <p>ID for the contact used in an external system.</p>
     * @return externalId
     */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
     *  <p>Custom Fields for the address.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    /**
     *  <p>User-defined identifier for the address. Must follow the pattern <code>[a-zA-Z0-9_\-]{2,256}</code> and must be unique per customer.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the country.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>Title of the contact, for example 'Dr.'</p>
     * @param title value to be set
     */

    public void setTitle(final String title);

    /**
     *  <p>Salutation of the contact, for example 'Mr.' or 'Ms.'</p>
     * @param salutation value to be set
     */

    public void setSalutation(final String salutation);

    /**
     *  <p>Given name (first name) of the contact.</p>
     * @param firstName value to be set
     */

    public void setFirstName(final String firstName);

    /**
     *  <p>Family name (last name) of the contact.</p>
     * @param lastName value to be set
     */

    public void setLastName(final String lastName);

    /**
     *  <p>Name of the street.</p>
     * @param streetName value to be set
     */

    public void setStreetName(final String streetName);

    /**
     *  <p>Street number.</p>
     * @param streetNumber value to be set
     */

    public void setStreetNumber(final String streetNumber);

    /**
     *  <p>Further information on the street address.</p>
     * @param additionalStreetInfo value to be set
     */

    public void setAdditionalStreetInfo(final String additionalStreetInfo);

    /**
     *  <p>Postal code.</p>
     * @param postalCode value to be set
     */

    public void setPostalCode(final String postalCode);

    /**
     *  <p>Name of the city.</p>
     * @param city value to be set
     */

    public void setCity(final String city);

    /**
     *  <p>Name of the region.</p>
     * @param region value to be set
     */

    public void setRegion(final String region);

    /**
     *  <p>Name of the state, for example, Colorado.</p>
     * @param state value to be set
     */

    public void setState(final String state);

    /**
     *  <p>Name of the company.</p>
     * @param company value to be set
     */

    public void setCompany(final String company);

    /**
     *  <p>Name of the department.</p>
     * @param department value to be set
     */

    public void setDepartment(final String department);

    /**
     *  <p>Number or name of the building.</p>
     * @param building value to be set
     */

    public void setBuilding(final String building);

    /**
     *  <p>Number or name of the apartment.</p>
     * @param apartment value to be set
     */

    public void setApartment(final String apartment);

    /**
     *  <p>Post office box number.</p>
     * @param pOBox value to be set
     */

    public void setPOBox(final String pOBox);

    /**
     *  <p>Phone number of the contact.</p>
     * @param phone value to be set
     */

    public void setPhone(final String phone);

    /**
     *  <p>Mobile phone number of the contact.</p>
     * @param mobile value to be set
     */

    public void setMobile(final String mobile);

    /**
     *  <p>Email address of the contact.</p>
     * @param email value to be set
     */

    public void setEmail(final String email);

    /**
     *  <p>Fax number of the contact.</p>
     * @param fax value to be set
     */

    public void setFax(final String fax);

    /**
     *  <p>Further information on the Address.</p>
     * @param additionalAddressInfo value to be set
     */

    public void setAdditionalAddressInfo(final String additionalAddressInfo);

    /**
     *  <p>ID for the contact used in an external system.</p>
     * @param externalId value to be set
     */

    public void setExternalId(final String externalId);

    /**
     *  <p>Custom Fields for the address.</p>
     * @param custom value to be set
     */

    public void setCustom(final Custom custom);

    /**
     * factory method
     * @return instance of CustomerAddress
     */
    public static CustomerAddress of() {
        return new CustomerAddressImpl();
    }

    /**
     * factory method to create a shallow copy CustomerAddress
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddress of(final CustomerAddress template) {
        CustomerAddressImpl instance = new CustomerAddressImpl();
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
     * factory method to create a deep copy of CustomerAddress
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerAddress deepCopy(@Nullable final CustomerAddress template) {
        if (template == null) {
            return null;
        }
        CustomerAddressImpl instance = new CustomerAddressImpl();
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
        instance.setCustom(com.commercetools.importapi.models.customfields.Custom.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for CustomerAddress
     * @return builder
     */
    public static CustomerAddressBuilder builder() {
        return CustomerAddressBuilder.of();
    }

    /**
     * create builder for CustomerAddress instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressBuilder builder(final CustomerAddress template) {
        return CustomerAddressBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddress(Function<CustomerAddress, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddress> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddress>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddress>";
            }
        };
    }
}
