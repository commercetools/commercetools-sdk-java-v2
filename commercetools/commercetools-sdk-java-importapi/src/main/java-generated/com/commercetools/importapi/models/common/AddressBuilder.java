
package com.commercetools.importapi.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddressBuilder
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
public class AddressBuilder implements Builder<Address> {

    @Nullable
    private String id;

    @Nullable
    private String key;

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

    private String country;

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
     * set the value to the id
     * @param id value to be set
     * @return Builder
     */

    public AddressBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */

    public AddressBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     * set the value to the title
     * @param title value to be set
     * @return Builder
     */

    public AddressBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    /**
     * set the value to the salutation
     * @param salutation value to be set
     * @return Builder
     */

    public AddressBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     * set the value to the firstName
     * @param firstName value to be set
     * @return Builder
     */

    public AddressBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * set the value to the lastName
     * @param lastName value to be set
     * @return Builder
     */

    public AddressBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * set the value to the streetName
     * @param streetName value to be set
     * @return Builder
     */

    public AddressBuilder streetName(@Nullable final String streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     * set the value to the streetNumber
     * @param streetNumber value to be set
     * @return Builder
     */

    public AddressBuilder streetNumber(@Nullable final String streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    /**
     * set the value to the additionalStreetInfo
     * @param additionalStreetInfo value to be set
     * @return Builder
     */

    public AddressBuilder additionalStreetInfo(@Nullable final String additionalStreetInfo) {
        this.additionalStreetInfo = additionalStreetInfo;
        return this;
    }

    /**
     * set the value to the postalCode
     * @param postalCode value to be set
     * @return Builder
     */

    public AddressBuilder postalCode(@Nullable final String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * set the value to the city
     * @param city value to be set
     * @return Builder
     */

    public AddressBuilder city(@Nullable final String city) {
        this.city = city;
        return this;
    }

    /**
     * set the value to the region
     * @param region value to be set
     * @return Builder
     */

    public AddressBuilder region(@Nullable final String region) {
        this.region = region;
        return this;
    }

    /**
     * set the value to the state
     * @param state value to be set
     * @return Builder
     */

    public AddressBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param country value to be set
     * @return Builder
     */

    public AddressBuilder country(final String country) {
        this.country = country;
        return this;
    }

    /**
     * set the value to the company
     * @param company value to be set
     * @return Builder
     */

    public AddressBuilder company(@Nullable final String company) {
        this.company = company;
        return this;
    }

    /**
     * set the value to the department
     * @param department value to be set
     * @return Builder
     */

    public AddressBuilder department(@Nullable final String department) {
        this.department = department;
        return this;
    }

    /**
     * set the value to the building
     * @param building value to be set
     * @return Builder
     */

    public AddressBuilder building(@Nullable final String building) {
        this.building = building;
        return this;
    }

    /**
     * set the value to the apartment
     * @param apartment value to be set
     * @return Builder
     */

    public AddressBuilder apartment(@Nullable final String apartment) {
        this.apartment = apartment;
        return this;
    }

    /**
     * set the value to the pOBox
     * @param pOBox value to be set
     * @return Builder
     */

    public AddressBuilder pOBox(@Nullable final String pOBox) {
        this.pOBox = pOBox;
        return this;
    }

    /**
     * set the value to the phone
     * @param phone value to be set
     * @return Builder
     */

    public AddressBuilder phone(@Nullable final String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * set the value to the mobile
     * @param mobile value to be set
     * @return Builder
     */

    public AddressBuilder mobile(@Nullable final String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     * set the value to the email
     * @param email value to be set
     * @return Builder
     */

    public AddressBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }

    /**
     * set the value to the fax
     * @param fax value to be set
     * @return Builder
     */

    public AddressBuilder fax(@Nullable final String fax) {
        this.fax = fax;
        return this;
    }

    /**
     * set the value to the additionalAddressInfo
     * @param additionalAddressInfo value to be set
     * @return Builder
     */

    public AddressBuilder additionalAddressInfo(@Nullable final String additionalAddressInfo) {
        this.additionalAddressInfo = additionalAddressInfo;
        return this;
    }

    /**
     * set the value to the externalId
     * @param externalId value to be set
     * @return Builder
     */

    public AddressBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>Custom Fields defined for the Address. Custom Fields can only be applied to <code>shippingAddress</code>.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public AddressBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields defined for the Address. Custom Fields can only be applied to <code>shippingAddress</code>.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public AddressBuilder withCustom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.Custom> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields defined for the Address. Custom Fields can only be applied to <code>shippingAddress</code>.</p>
     * @param custom value to be set
     * @return Builder
     */

    public AddressBuilder custom(@Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    /**
     * value of id}
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     * value of key}
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * value of title}
     * @return title
     */

    @Nullable
    public String getTitle() {
        return this.title;
    }

    /**
     * value of salutation}
     * @return salutation
     */

    @Nullable
    public String getSalutation() {
        return this.salutation;
    }

    /**
     * value of firstName}
     * @return firstName
     */

    @Nullable
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * value of lastName}
     * @return lastName
     */

    @Nullable
    public String getLastName() {
        return this.lastName;
    }

    /**
     * value of streetName}
     * @return streetName
     */

    @Nullable
    public String getStreetName() {
        return this.streetName;
    }

    /**
     * value of streetNumber}
     * @return streetNumber
     */

    @Nullable
    public String getStreetNumber() {
        return this.streetNumber;
    }

    /**
     * value of additionalStreetInfo}
     * @return additionalStreetInfo
     */

    @Nullable
    public String getAdditionalStreetInfo() {
        return this.additionalStreetInfo;
    }

    /**
     * value of postalCode}
     * @return postalCode
     */

    @Nullable
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * value of city}
     * @return city
     */

    @Nullable
    public String getCity() {
        return this.city;
    }

    /**
     * value of region}
     * @return region
     */

    @Nullable
    public String getRegion() {
        return this.region;
    }

    /**
     * value of state}
     * @return state
     */

    @Nullable
    public String getState() {
        return this.state;
    }

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @return country
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * value of company}
     * @return company
     */

    @Nullable
    public String getCompany() {
        return this.company;
    }

    /**
     * value of department}
     * @return department
     */

    @Nullable
    public String getDepartment() {
        return this.department;
    }

    /**
     * value of building}
     * @return building
     */

    @Nullable
    public String getBuilding() {
        return this.building;
    }

    /**
     * value of apartment}
     * @return apartment
     */

    @Nullable
    public String getApartment() {
        return this.apartment;
    }

    /**
     * value of pOBox}
     * @return pOBox
     */

    @Nullable
    public String getPOBox() {
        return this.pOBox;
    }

    /**
     * value of phone}
     * @return phone
     */

    @Nullable
    public String getPhone() {
        return this.phone;
    }

    /**
     * value of mobile}
     * @return mobile
     */

    @Nullable
    public String getMobile() {
        return this.mobile;
    }

    /**
     * value of email}
     * @return email
     */

    @Nullable
    public String getEmail() {
        return this.email;
    }

    /**
     * value of fax}
     * @return fax
     */

    @Nullable
    public String getFax() {
        return this.fax;
    }

    /**
     * value of additionalAddressInfo}
     * @return additionalAddressInfo
     */

    @Nullable
    public String getAdditionalAddressInfo() {
        return this.additionalAddressInfo;
    }

    /**
     * value of externalId}
     * @return externalId
     */

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    /**
     *  <p>Custom Fields defined for the Address. Custom Fields can only be applied to <code>shippingAddress</code>.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    /**
     * builds Address with checking for non-null required values
     * @return Address
     */
    public Address build() {
        Objects.requireNonNull(country, Address.class + ": country is missing");
        return new AddressImpl(id, key, title, salutation, firstName, lastName, streetName, streetNumber,
            additionalStreetInfo, postalCode, city, region, state, country, company, department, building, apartment,
            pOBox, phone, mobile, email, fax, additionalAddressInfo, externalId, custom);
    }

    /**
     * builds Address without checking for non-null required values
     * @return Address
     */
    public Address buildUnchecked() {
        return new AddressImpl(id, key, title, salutation, firstName, lastName, streetName, streetNumber,
            additionalStreetInfo, postalCode, city, region, state, country, company, department, building, apartment,
            pOBox, phone, mobile, email, fax, additionalAddressInfo, externalId, custom);
    }

    /**
     * factory method for an instance of AddressBuilder
     * @return builder
     */
    public static AddressBuilder of() {
        return new AddressBuilder();
    }

    /**
     * create builder for Address instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddressBuilder of(final Address template) {
        AddressBuilder builder = new AddressBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
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
        builder.country = template.getCountry();
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
