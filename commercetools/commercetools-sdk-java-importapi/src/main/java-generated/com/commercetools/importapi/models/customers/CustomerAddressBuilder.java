
package com.commercetools.importapi.models.customers;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddressBuilder
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
public class CustomerAddressBuilder implements Builder<CustomerAddress> {

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

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    /**
     *  <p>User-defined identifier for the address. Must follow the pattern <code>[a-zA-Z0-9_\-]{2,256}</code> and must be unique per customer.</p>
     * @param key value to be set
     * @return Builder
     */

    public CustomerAddressBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the country.</p>
     * @param country value to be set
     * @return Builder
     */

    public CustomerAddressBuilder country(final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Title of the contact, for example 'Dr.'</p>
     * @param title value to be set
     * @return Builder
     */

    public CustomerAddressBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    /**
     *  <p>Salutation of the contact, for example 'Mr.' or 'Ms.'</p>
     * @param salutation value to be set
     * @return Builder
     */

    public CustomerAddressBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     *  <p>Given name (first name) of the contact.</p>
     * @param firstName value to be set
     * @return Builder
     */

    public CustomerAddressBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     *  <p>Family name (last name) of the contact.</p>
     * @param lastName value to be set
     * @return Builder
     */

    public CustomerAddressBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     *  <p>Name of the street.</p>
     * @param streetName value to be set
     * @return Builder
     */

    public CustomerAddressBuilder streetName(@Nullable final String streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     *  <p>Street number.</p>
     * @param streetNumber value to be set
     * @return Builder
     */

    public CustomerAddressBuilder streetNumber(@Nullable final String streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    /**
     *  <p>Further information on the street address.</p>
     * @param additionalStreetInfo value to be set
     * @return Builder
     */

    public CustomerAddressBuilder additionalStreetInfo(@Nullable final String additionalStreetInfo) {
        this.additionalStreetInfo = additionalStreetInfo;
        return this;
    }

    /**
     *  <p>Postal code.</p>
     * @param postalCode value to be set
     * @return Builder
     */

    public CustomerAddressBuilder postalCode(@Nullable final String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     *  <p>Name of the city.</p>
     * @param city value to be set
     * @return Builder
     */

    public CustomerAddressBuilder city(@Nullable final String city) {
        this.city = city;
        return this;
    }

    /**
     *  <p>Name of the region.</p>
     * @param region value to be set
     * @return Builder
     */

    public CustomerAddressBuilder region(@Nullable final String region) {
        this.region = region;
        return this;
    }

    /**
     *  <p>Name of the state, for example, Colorado.</p>
     * @param state value to be set
     * @return Builder
     */

    public CustomerAddressBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Name of the company.</p>
     * @param company value to be set
     * @return Builder
     */

    public CustomerAddressBuilder company(@Nullable final String company) {
        this.company = company;
        return this;
    }

    /**
     *  <p>Name of the department.</p>
     * @param department value to be set
     * @return Builder
     */

    public CustomerAddressBuilder department(@Nullable final String department) {
        this.department = department;
        return this;
    }

    /**
     *  <p>Number or name of the building.</p>
     * @param building value to be set
     * @return Builder
     */

    public CustomerAddressBuilder building(@Nullable final String building) {
        this.building = building;
        return this;
    }

    /**
     *  <p>Number or name of the apartment.</p>
     * @param apartment value to be set
     * @return Builder
     */

    public CustomerAddressBuilder apartment(@Nullable final String apartment) {
        this.apartment = apartment;
        return this;
    }

    /**
     *  <p>Post office box number.</p>
     * @param pOBox value to be set
     * @return Builder
     */

    public CustomerAddressBuilder pOBox(@Nullable final String pOBox) {
        this.pOBox = pOBox;
        return this;
    }

    /**
     *  <p>Phone number of the contact.</p>
     * @param phone value to be set
     * @return Builder
     */

    public CustomerAddressBuilder phone(@Nullable final String phone) {
        this.phone = phone;
        return this;
    }

    /**
     *  <p>Mobile phone number of the contact.</p>
     * @param mobile value to be set
     * @return Builder
     */

    public CustomerAddressBuilder mobile(@Nullable final String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     *  <p>Email address of the contact.</p>
     * @param email value to be set
     * @return Builder
     */

    public CustomerAddressBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }

    /**
     *  <p>Fax number of the contact.</p>
     * @param fax value to be set
     * @return Builder
     */

    public CustomerAddressBuilder fax(@Nullable final String fax) {
        this.fax = fax;
        return this;
    }

    /**
     *  <p>Further information on the Address.</p>
     * @param additionalAddressInfo value to be set
     * @return Builder
     */

    public CustomerAddressBuilder additionalAddressInfo(@Nullable final String additionalAddressInfo) {
        this.additionalAddressInfo = additionalAddressInfo;
        return this;
    }

    /**
     *  <p>ID for the contact used in an external system.</p>
     * @param externalId value to be set
     * @return Builder
     */

    public CustomerAddressBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>Custom Fields for the address.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CustomerAddressBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the address.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CustomerAddressBuilder withCustom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.Custom> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the address.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CustomerAddressBuilder custom(
            @Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined identifier for the address. Must follow the pattern <code>[a-zA-Z0-9_\-]{2,256}</code> and must be unique per customer.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the country.</p>
     * @return country
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Title of the contact, for example 'Dr.'</p>
     * @return title
     */

    @Nullable
    public String getTitle() {
        return this.title;
    }

    /**
     *  <p>Salutation of the contact, for example 'Mr.' or 'Ms.'</p>
     * @return salutation
     */

    @Nullable
    public String getSalutation() {
        return this.salutation;
    }

    /**
     *  <p>Given name (first name) of the contact.</p>
     * @return firstName
     */

    @Nullable
    public String getFirstName() {
        return this.firstName;
    }

    /**
     *  <p>Family name (last name) of the contact.</p>
     * @return lastName
     */

    @Nullable
    public String getLastName() {
        return this.lastName;
    }

    /**
     *  <p>Name of the street.</p>
     * @return streetName
     */

    @Nullable
    public String getStreetName() {
        return this.streetName;
    }

    /**
     *  <p>Street number.</p>
     * @return streetNumber
     */

    @Nullable
    public String getStreetNumber() {
        return this.streetNumber;
    }

    /**
     *  <p>Further information on the street address.</p>
     * @return additionalStreetInfo
     */

    @Nullable
    public String getAdditionalStreetInfo() {
        return this.additionalStreetInfo;
    }

    /**
     *  <p>Postal code.</p>
     * @return postalCode
     */

    @Nullable
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     *  <p>Name of the city.</p>
     * @return city
     */

    @Nullable
    public String getCity() {
        return this.city;
    }

    /**
     *  <p>Name of the region.</p>
     * @return region
     */

    @Nullable
    public String getRegion() {
        return this.region;
    }

    /**
     *  <p>Name of the state, for example, Colorado.</p>
     * @return state
     */

    @Nullable
    public String getState() {
        return this.state;
    }

    /**
     *  <p>Name of the company.</p>
     * @return company
     */

    @Nullable
    public String getCompany() {
        return this.company;
    }

    /**
     *  <p>Name of the department.</p>
     * @return department
     */

    @Nullable
    public String getDepartment() {
        return this.department;
    }

    /**
     *  <p>Number or name of the building.</p>
     * @return building
     */

    @Nullable
    public String getBuilding() {
        return this.building;
    }

    /**
     *  <p>Number or name of the apartment.</p>
     * @return apartment
     */

    @Nullable
    public String getApartment() {
        return this.apartment;
    }

    /**
     *  <p>Post office box number.</p>
     * @return pOBox
     */

    @Nullable
    public String getPOBox() {
        return this.pOBox;
    }

    /**
     *  <p>Phone number of the contact.</p>
     * @return phone
     */

    @Nullable
    public String getPhone() {
        return this.phone;
    }

    /**
     *  <p>Mobile phone number of the contact.</p>
     * @return mobile
     */

    @Nullable
    public String getMobile() {
        return this.mobile;
    }

    /**
     *  <p>Email address of the contact.</p>
     * @return email
     */

    @Nullable
    public String getEmail() {
        return this.email;
    }

    /**
     *  <p>Fax number of the contact.</p>
     * @return fax
     */

    @Nullable
    public String getFax() {
        return this.fax;
    }

    /**
     *  <p>Further information on the Address.</p>
     * @return additionalAddressInfo
     */

    @Nullable
    public String getAdditionalAddressInfo() {
        return this.additionalAddressInfo;
    }

    /**
     *  <p>ID for the contact used in an external system.</p>
     * @return externalId
     */

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    /**
     *  <p>Custom Fields for the address.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    /**
     * builds CustomerAddress with checking for non-null required values
     * @return CustomerAddress
     */
    public CustomerAddress build() {
        Objects.requireNonNull(key, CustomerAddress.class + ": key is missing");
        Objects.requireNonNull(country, CustomerAddress.class + ": country is missing");
        return new CustomerAddressImpl(key, country, title, salutation, firstName, lastName, streetName, streetNumber,
            additionalStreetInfo, postalCode, city, region, state, company, department, building, apartment, pOBox,
            phone, mobile, email, fax, additionalAddressInfo, externalId, custom);
    }

    /**
     * builds CustomerAddress without checking for non-null required values
     * @return CustomerAddress
     */
    public CustomerAddress buildUnchecked() {
        return new CustomerAddressImpl(key, country, title, salutation, firstName, lastName, streetName, streetNumber,
            additionalStreetInfo, postalCode, city, region, state, company, department, building, apartment, pOBox,
            phone, mobile, email, fax, additionalAddressInfo, externalId, custom);
    }

    /**
     * factory method for an instance of CustomerAddressBuilder
     * @return builder
     */
    public static CustomerAddressBuilder of() {
        return new CustomerAddressBuilder();
    }

    /**
     * create builder for CustomerAddress instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressBuilder of(final CustomerAddress template) {
        CustomerAddressBuilder builder = new CustomerAddressBuilder();
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
        builder.custom = template.getCustom();
        return builder;
    }

}
