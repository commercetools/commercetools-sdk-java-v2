
package com.commercetools.api.models.common;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BaseAddressBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BaseAddress baseAddress = BaseAddress.builder()
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BaseAddressBuilder implements Builder<BaseAddress> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    private String country;

    @Nullable
    private String title;

    @Nullable
    private String salutation;

    @Nullable
    private String firstName;

    @Nullable
    private String lastName;

    @Nullable
    private String streetName;

    @Nullable
    private String streetNumber;

    @Nullable
    private String additionalStreetInfo;

    @Nullable
    private String postalCode;

    @Nullable
    private String city;

    @Nullable
    private String region;

    @Nullable
    private String state;

    @Nullable
    private String company;

    @Nullable
    private String department;

    @Nullable
    private String building;

    @Nullable
    private String apartment;

    @Nullable
    private String pOBox;

    @Nullable
    private String phone;

    @Nullable
    private String mobile;

    @Nullable
    private String email;

    @Nullable
    private String fax;

    @Nullable
    private String additionalAddressInfo;

    @Nullable
    private String externalId;

    /**
     <*  <p>Platform-generated unique identifier of the Address.</p>>
     */

    public BaseAddressBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     <*  <p>User-defined unique identifier of the Address.</p>>
     */

    public BaseAddressBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     <*  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>>
     */

    public BaseAddressBuilder country(final String country) {
        this.country = country;
        return this;
    }

    /**
     <*  <p>Title of the contact, for example 'Dr.'</p>>
     */

    public BaseAddressBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    /**
     <*  <p>Salutation of the contact, for example 'Mr.' or 'Ms.'</p>>
     */

    public BaseAddressBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     <*  <p>Given name (first name) of the contact.</p>>
     */

    public BaseAddressBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     <*  <p>Family name (last name) of the contact.</p>>
     */

    public BaseAddressBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     <*  <p>Name of the street.</p>>
     */

    public BaseAddressBuilder streetName(@Nullable final String streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     <*  <p>Street number.</p>>
     */

    public BaseAddressBuilder streetNumber(@Nullable final String streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    /**
     <*  <p>Further information on the street address.</p>>
     */

    public BaseAddressBuilder additionalStreetInfo(@Nullable final String additionalStreetInfo) {
        this.additionalStreetInfo = additionalStreetInfo;
        return this;
    }

    /**
     <*  <p>Postal code.</p>>
     */

    public BaseAddressBuilder postalCode(@Nullable final String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     <*  <p>Name of the city.</p>>
     */

    public BaseAddressBuilder city(@Nullable final String city) {
        this.city = city;
        return this;
    }

    /**
     <*  <p>Name of the region.</p>>
     */

    public BaseAddressBuilder region(@Nullable final String region) {
        this.region = region;
        return this;
    }

    /**
     <*  <p>Name of the state, for example, Colorado.</p>>
     */

    public BaseAddressBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }

    /**
     <*  <p>Name of the company.</p>>
     */

    public BaseAddressBuilder company(@Nullable final String company) {
        this.company = company;
        return this;
    }

    /**
     <*  <p>Name of the department.</p>>
     */

    public BaseAddressBuilder department(@Nullable final String department) {
        this.department = department;
        return this;
    }

    /**
     <*  <p>Number or name of the building.</p>>
     */

    public BaseAddressBuilder building(@Nullable final String building) {
        this.building = building;
        return this;
    }

    /**
     <*  <p>Number or name of the apartment.</p>>
     */

    public BaseAddressBuilder apartment(@Nullable final String apartment) {
        this.apartment = apartment;
        return this;
    }

    /**
     <*  <p>Post office box number.</p>>
     */

    public BaseAddressBuilder pOBox(@Nullable final String pOBox) {
        this.pOBox = pOBox;
        return this;
    }

    /**
     <*  <p>Phone number of the contact.</p>>
     */

    public BaseAddressBuilder phone(@Nullable final String phone) {
        this.phone = phone;
        return this;
    }

    /**
     <*  <p>Mobile phone number of the contact.</p>>
     */

    public BaseAddressBuilder mobile(@Nullable final String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     <*  <p>Email address of the contact.</p>>
     */

    public BaseAddressBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }

    /**
     <*  <p>Fax number of the contact.</p>>
     */

    public BaseAddressBuilder fax(@Nullable final String fax) {
        this.fax = fax;
        return this;
    }

    /**
     <*  <p>Further information on the Address.</p>>
     */

    public BaseAddressBuilder additionalAddressInfo(@Nullable final String additionalAddressInfo) {
        this.additionalAddressInfo = additionalAddressInfo;
        return this;
    }

    /**
     <*  <p>ID for the contact used in an external system.</p>>
     */

    public BaseAddressBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public String getCountry() {
        return this.country;
    }

    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Nullable
    public String getSalutation() {
        return this.salutation;
    }

    @Nullable
    public String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public String getLastName() {
        return this.lastName;
    }

    @Nullable
    public String getStreetName() {
        return this.streetName;
    }

    @Nullable
    public String getStreetNumber() {
        return this.streetNumber;
    }

    @Nullable
    public String getAdditionalStreetInfo() {
        return this.additionalStreetInfo;
    }

    @Nullable
    public String getPostalCode() {
        return this.postalCode;
    }

    @Nullable
    public String getCity() {
        return this.city;
    }

    @Nullable
    public String getRegion() {
        return this.region;
    }

    @Nullable
    public String getState() {
        return this.state;
    }

    @Nullable
    public String getCompany() {
        return this.company;
    }

    @Nullable
    public String getDepartment() {
        return this.department;
    }

    @Nullable
    public String getBuilding() {
        return this.building;
    }

    @Nullable
    public String getApartment() {
        return this.apartment;
    }

    @Nullable
    public String getPOBox() {
        return this.pOBox;
    }

    @Nullable
    public String getPhone() {
        return this.phone;
    }

    @Nullable
    public String getMobile() {
        return this.mobile;
    }

    @Nullable
    public String getEmail() {
        return this.email;
    }

    @Nullable
    public String getFax() {
        return this.fax;
    }

    @Nullable
    public String getAdditionalAddressInfo() {
        return this.additionalAddressInfo;
    }

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    public BaseAddress build() {
        Objects.requireNonNull(country, BaseAddress.class + ": country is missing");
        return new BaseAddressImpl(id, key, country, title, salutation, firstName, lastName, streetName, streetNumber,
            additionalStreetInfo, postalCode, city, region, state, company, department, building, apartment, pOBox,
            phone, mobile, email, fax, additionalAddressInfo, externalId);
    }

    /**
     * builds BaseAddress without checking for non null required values
     */
    public BaseAddress buildUnchecked() {
        return new BaseAddressImpl(id, key, country, title, salutation, firstName, lastName, streetName, streetNumber,
            additionalStreetInfo, postalCode, city, region, state, company, department, building, apartment, pOBox,
            phone, mobile, email, fax, additionalAddressInfo, externalId);
    }

    public static BaseAddressBuilder of() {
        return new BaseAddressBuilder();
    }

    public static BaseAddressBuilder of(final BaseAddress template) {
        BaseAddressBuilder builder = new BaseAddressBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        builder.country = template.getCountry();
        builder.title = template.getTitle();
        builder.salutation = template.getSalutation();
        builder.firstName = template.getFirstName();
        builder.lastName = template.getLastName();
        builder.streetName = template.getStreetName();
        builder.streetNumber = template.getStreetNumber();
        builder.additionalStreetInfo = template.getAdditionalStreetInfo();
        builder.postalCode = template.getPostalCode();
        builder.city = template.getCity();
        builder.region = template.getRegion();
        builder.state = template.getState();
        builder.company = template.getCompany();
        builder.department = template.getDepartment();
        builder.building = template.getBuilding();
        builder.apartment = template.getApartment();
        builder.pOBox = template.getPOBox();
        builder.phone = template.getPhone();
        builder.mobile = template.getMobile();
        builder.email = template.getEmail();
        builder.fax = template.getFax();
        builder.additionalAddressInfo = template.getAdditionalAddressInfo();
        builder.externalId = template.getExternalId();
        return builder;
    }

}
