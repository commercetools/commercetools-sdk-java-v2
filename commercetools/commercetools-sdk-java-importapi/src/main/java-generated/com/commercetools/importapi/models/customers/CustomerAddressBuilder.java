
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
     *  <p>User-defined identifier for the address. Must follow the pattern <code>[a-zA-Z0-9_\-]{2,256}</code> and must be unique per customer.</p>
     * @param key
     * @return Builder
     */

    public CustomerAddressBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *
     * @param title
     * @return Builder
     */

    public CustomerAddressBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    /**
     *
     * @param salutation
     * @return Builder
     */

    public CustomerAddressBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     *
     * @param firstName
     * @return Builder
     */

    public CustomerAddressBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     *
     * @param lastName
     * @return Builder
     */

    public CustomerAddressBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     *
     * @param streetName
     * @return Builder
     */

    public CustomerAddressBuilder streetName(@Nullable final String streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     *
     * @param streetNumber
     * @return Builder
     */

    public CustomerAddressBuilder streetNumber(@Nullable final String streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    /**
     *
     * @param additionalStreetInfo
     * @return Builder
     */

    public CustomerAddressBuilder additionalStreetInfo(@Nullable final String additionalStreetInfo) {
        this.additionalStreetInfo = additionalStreetInfo;
        return this;
    }

    /**
     *
     * @param postalCode
     * @return Builder
     */

    public CustomerAddressBuilder postalCode(@Nullable final String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     *
     * @param city
     * @return Builder
     */

    public CustomerAddressBuilder city(@Nullable final String city) {
        this.city = city;
        return this;
    }

    /**
     *
     * @param region
     * @return Builder
     */

    public CustomerAddressBuilder region(@Nullable final String region) {
        this.region = region;
        return this;
    }

    /**
     *
     * @param state
     * @return Builder
     */

    public CustomerAddressBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param country
     * @return Builder
     */

    public CustomerAddressBuilder country(final String country) {
        this.country = country;
        return this;
    }

    /**
     *
     * @param company
     * @return Builder
     */

    public CustomerAddressBuilder company(@Nullable final String company) {
        this.company = company;
        return this;
    }

    /**
     *
     * @param department
     * @return Builder
     */

    public CustomerAddressBuilder department(@Nullable final String department) {
        this.department = department;
        return this;
    }

    /**
     *
     * @param building
     * @return Builder
     */

    public CustomerAddressBuilder building(@Nullable final String building) {
        this.building = building;
        return this;
    }

    /**
     *
     * @param apartment
     * @return Builder
     */

    public CustomerAddressBuilder apartment(@Nullable final String apartment) {
        this.apartment = apartment;
        return this;
    }

    /**
     *
     * @param pOBox
     * @return Builder
     */

    public CustomerAddressBuilder pOBox(@Nullable final String pOBox) {
        this.pOBox = pOBox;
        return this;
    }

    /**
     *
     * @param phone
     * @return Builder
     */

    public CustomerAddressBuilder phone(@Nullable final String phone) {
        this.phone = phone;
        return this;
    }

    /**
     *
     * @param mobile
     * @return Builder
     */

    public CustomerAddressBuilder mobile(@Nullable final String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     *
     * @param email
     * @return Builder
     */

    public CustomerAddressBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }

    /**
     *
     * @param fax
     * @return Builder
     */

    public CustomerAddressBuilder fax(@Nullable final String fax) {
        this.fax = fax;
        return this;
    }

    /**
     *
     * @param additionalAddressInfo
     * @return Builder
     */

    public CustomerAddressBuilder additionalAddressInfo(@Nullable final String additionalAddressInfo) {
        this.additionalAddressInfo = additionalAddressInfo;
        return this;
    }

    /**
     *
     * @param externalId
     * @return Builder
     */

    public CustomerAddressBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>Custom Fields for the address.</p>
     * @return Builder
     */

    public CustomerAddressBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the address.</p>
     * @param custom
     * @return Builder
     */

    public CustomerAddressBuilder custom(
            @Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    public String getKey() {
        return this.key;
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

    public String getCountry() {
        return this.country;
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

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    public CustomerAddress build() {
        Objects.requireNonNull(key, CustomerAddress.class + ": key is missing");
        Objects.requireNonNull(country, CustomerAddress.class + ": country is missing");
        return new CustomerAddressImpl(key, title, salutation, firstName, lastName, streetName, streetNumber,
            additionalStreetInfo, postalCode, city, region, state, country, company, department, building, apartment,
            pOBox, phone, mobile, email, fax, additionalAddressInfo, externalId, custom);
    }

    /**
     * builds CustomerAddress without checking for non null required values
     */
    public CustomerAddress buildUnchecked() {
        return new CustomerAddressImpl(key, title, salutation, firstName, lastName, streetName, streetNumber,
            additionalStreetInfo, postalCode, city, region, state, country, company, department, building, apartment,
            pOBox, phone, mobile, email, fax, additionalAddressInfo, externalId, custom);
    }

    public static CustomerAddressBuilder of() {
        return new CustomerAddressBuilder();
    }

    public static CustomerAddressBuilder of(final CustomerAddress template) {
        CustomerAddressBuilder builder = new CustomerAddressBuilder();
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
