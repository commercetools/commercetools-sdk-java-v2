
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AddressDraftImpl implements AddressDraft, ModelBase {

    private String id;

    private String key;

    private String country;

    private String title;

    private String salutation;

    private String firstName;

    private String lastName;

    private String streetName;

    private String streetNumber;

    private String additionalStreetInfo;

    private String postalCode;

    private String city;

    private String region;

    private String state;

    private String company;

    private String department;

    private String building;

    private String apartment;

    private String pOBox;

    private String phone;

    private String mobile;

    private String email;

    private String fax;

    private String additionalAddressInfo;

    private String externalId;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @JsonCreator
    AddressDraftImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("country") final String country, @JsonProperty("title") final String title,
            @JsonProperty("salutation") final String salutation, @JsonProperty("firstName") final String firstName,
            @JsonProperty("lastName") final String lastName, @JsonProperty("streetName") final String streetName,
            @JsonProperty("streetNumber") final String streetNumber,
            @JsonProperty("additionalStreetInfo") final String additionalStreetInfo,
            @JsonProperty("postalCode") final String postalCode, @JsonProperty("city") final String city,
            @JsonProperty("region") final String region, @JsonProperty("state") final String state,
            @JsonProperty("company") final String company, @JsonProperty("department") final String department,
            @JsonProperty("building") final String building, @JsonProperty("apartment") final String apartment,
            @JsonProperty("pOBox") final String pOBox, @JsonProperty("phone") final String phone,
            @JsonProperty("mobile") final String mobile, @JsonProperty("email") final String email,
            @JsonProperty("fax") final String fax,
            @JsonProperty("additionalAddressInfo") final String additionalAddressInfo,
            @JsonProperty("externalId") final String externalId,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.id = id;
        this.key = key;
        this.country = country;
        this.title = title;
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.additionalStreetInfo = additionalStreetInfo;
        this.postalCode = postalCode;
        this.city = city;
        this.region = region;
        this.state = state;
        this.company = company;
        this.department = department;
        this.building = building;
        this.apartment = apartment;
        this.pOBox = pOBox;
        this.phone = phone;
        this.mobile = mobile;
        this.email = email;
        this.fax = fax;
        this.additionalAddressInfo = additionalAddressInfo;
        this.externalId = externalId;
        this.custom = custom;
    }

    public AddressDraftImpl() {
    }

    /**
    *  <p>Unique identifier for the Address. Not recommended to set it manually since the Platform overwrites this ID when creating an Address for a <a href="ctp:api:type:Customer">Customer</a>. Use <code>key</code> instead and omit this field to let the Platform generate the ID for the Address.</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>User-defined unique identifier for the Address.</p>
    */
    public String getKey() {
        return this.key;
    }

    /**
    *  <p>Two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    public String getCountry() {
        return this.country;
    }

    /**
    *  <p>Title of the contact, for example 'Dr.'</p>
    */
    public String getTitle() {
        return this.title;
    }

    /**
    *  <p>Salutation of the contact, for example 'Mr.' or 'Ms.'</p>
    */
    public String getSalutation() {
        return this.salutation;
    }

    /**
    *  <p>Given name (first name) of the contact.</p>
    */
    public String getFirstName() {
        return this.firstName;
    }

    /**
    *  <p>Family name (last name) of the contact.</p>
    */
    public String getLastName() {
        return this.lastName;
    }

    /**
    *  <p>Name of the street.</p>
    */
    public String getStreetName() {
        return this.streetName;
    }

    /**
    *  <p>Street number.</p>
    */
    public String getStreetNumber() {
        return this.streetNumber;
    }

    /**
    *  <p>Further information on the street address.</p>
    */
    public String getAdditionalStreetInfo() {
        return this.additionalStreetInfo;
    }

    /**
    *  <p>Postal code.</p>
    */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
    *  <p>Name of the city.</p>
    */
    public String getCity() {
        return this.city;
    }

    /**
    *  <p>Name of the region.</p>
    */
    public String getRegion() {
        return this.region;
    }

    /**
    *  <p>Name of the state, for example, Colorado.</p>
    */
    public String getState() {
        return this.state;
    }

    /**
    *  <p>Name of the company.</p>
    */
    public String getCompany() {
        return this.company;
    }

    /**
    *  <p>Name of the department.</p>
    */
    public String getDepartment() {
        return this.department;
    }

    /**
    *  <p>Number or name of the building.</p>
    */
    public String getBuilding() {
        return this.building;
    }

    /**
    *  <p>Number or name of the apartment.</p>
    */
    public String getApartment() {
        return this.apartment;
    }

    /**
    *  <p>Post office box number.</p>
    */
    public String getPOBox() {
        return this.pOBox;
    }

    /**
    *  <p>Phone number of the contact.</p>
    */
    public String getPhone() {
        return this.phone;
    }

    /**
    *  <p>Mobile phone number of the contact.</p>
    */
    public String getMobile() {
        return this.mobile;
    }

    /**
    *  <p>Email address of the contact.</p>
    */
    public String getEmail() {
        return this.email;
    }

    /**
    *  <p>Fax number of the contact.</p>
    */
    public String getFax() {
        return this.fax;
    }

    /**
    *  <p>Further information on the Address.</p>
    */
    public String getAdditionalAddressInfo() {
        return this.additionalAddressInfo;
    }

    /**
    *  <p>ID for the contact used in an external system.</p>
    */
    public String getExternalId() {
        return this.externalId;
    }

    /**
    *  <p>Custom Fields defined for the Address.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setSalutation(final String salutation) {
        this.salutation = salutation;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public void setStreetName(final String streetName) {
        this.streetName = streetName;
    }

    public void setStreetNumber(final String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setAdditionalStreetInfo(final String additionalStreetInfo) {
        this.additionalStreetInfo = additionalStreetInfo;
    }

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public void setRegion(final String region) {
        this.region = region;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public void setCompany(final String company) {
        this.company = company;
    }

    public void setDepartment(final String department) {
        this.department = department;
    }

    public void setBuilding(final String building) {
        this.building = building;
    }

    public void setApartment(final String apartment) {
        this.apartment = apartment;
    }

    public void setPOBox(final String pOBox) {
        this.pOBox = pOBox;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public void setMobile(final String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setFax(final String fax) {
        this.fax = fax;
    }

    public void setAdditionalAddressInfo(final String additionalAddressInfo) {
        this.additionalAddressInfo = additionalAddressInfo;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AddressDraftImpl that = (AddressDraftImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(key, that.key)
                .append(country, that.country)
                .append(title, that.title)
                .append(salutation, that.salutation)
                .append(firstName, that.firstName)
                .append(lastName, that.lastName)
                .append(streetName, that.streetName)
                .append(streetNumber, that.streetNumber)
                .append(additionalStreetInfo, that.additionalStreetInfo)
                .append(postalCode, that.postalCode)
                .append(city, that.city)
                .append(region, that.region)
                .append(state, that.state)
                .append(company, that.company)
                .append(department, that.department)
                .append(building, that.building)
                .append(apartment, that.apartment)
                .append(pOBox, that.pOBox)
                .append(phone, that.phone)
                .append(mobile, that.mobile)
                .append(email, that.email)
                .append(fax, that.fax)
                .append(additionalAddressInfo, that.additionalAddressInfo)
                .append(externalId, that.externalId)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(key)
                .append(country)
                .append(title)
                .append(salutation)
                .append(firstName)
                .append(lastName)
                .append(streetName)
                .append(streetNumber)
                .append(additionalStreetInfo)
                .append(postalCode)
                .append(city)
                .append(region)
                .append(state)
                .append(company)
                .append(department)
                .append(building)
                .append(apartment)
                .append(pOBox)
                .append(phone)
                .append(mobile)
                .append(email)
                .append(fax)
                .append(additionalAddressInfo)
                .append(externalId)
                .append(custom)
                .toHashCode();
    }

}
