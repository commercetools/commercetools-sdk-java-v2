
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddressBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Address address = Address.builder()
 *             .id("{id}")
 *             .key("{key}")
 *             .title("{title}")
 *             .salutation("{salutation}")
 *             .firstName("{firstName}")
 *             .lastName("{lastName}")
 *             .streetName("{streetName}")
 *             .streetNumber("{streetNumber}")
 *             .additionalStreetInfo("{additionalStreetInfo}")
 *             .postalCode("{postalCode}")
 *             .city("{city}")
 *             .region("{region}")
 *             .state("{state}")
 *             .country("{country}")
 *             .company("{company}")
 *             .department("{department}")
 *             .building("{building}")
 *             .apartment("{apartment}")
 *             .pOBox("{pOBox}")
 *             .phone("{phone}")
 *             .mobile("{mobile}")
 *             .email("{email}")
 *             .fax("{fax}")
 *             .additionalAddressInfo("{additionalAddressInfo}")
 *             .externalId("{externalId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddressBuilder implements Builder<Address> {

    private String id;

    private String key;

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

    private String country;

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

    /**
     *  <p>Unique ID of the Address.</p>
     * @param id value to be set
     * @return Builder
     */

    public AddressBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @param key value to be set
     * @return Builder
     */

    public AddressBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *
     * @param title value to be set
     * @return Builder
     */

    public AddressBuilder title(final String title) {
        this.title = title;
        return this;
    }

    /**
     *
     * @param salutation value to be set
     * @return Builder
     */

    public AddressBuilder salutation(final String salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     *
     * @param firstName value to be set
     * @return Builder
     */

    public AddressBuilder firstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     *
     * @param lastName value to be set
     * @return Builder
     */

    public AddressBuilder lastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     *
     * @param streetName value to be set
     * @return Builder
     */

    public AddressBuilder streetName(final String streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     *
     * @param streetNumber value to be set
     * @return Builder
     */

    public AddressBuilder streetNumber(final String streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    /**
     *
     * @param additionalStreetInfo value to be set
     * @return Builder
     */

    public AddressBuilder additionalStreetInfo(final String additionalStreetInfo) {
        this.additionalStreetInfo = additionalStreetInfo;
        return this;
    }

    /**
     *
     * @param postalCode value to be set
     * @return Builder
     */

    public AddressBuilder postalCode(final String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     *
     * @param city value to be set
     * @return Builder
     */

    public AddressBuilder city(final String city) {
        this.city = city;
        return this;
    }

    /**
     *
     * @param region value to be set
     * @return Builder
     */

    public AddressBuilder region(final String region) {
        this.region = region;
        return this;
    }

    /**
     *
     * @param state value to be set
     * @return Builder
     */

    public AddressBuilder state(final String state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param country value to be set
     * @return Builder
     */

    public AddressBuilder country(final String country) {
        this.country = country;
        return this;
    }

    /**
     *
     * @param company value to be set
     * @return Builder
     */

    public AddressBuilder company(final String company) {
        this.company = company;
        return this;
    }

    /**
     *
     * @param department value to be set
     * @return Builder
     */

    public AddressBuilder department(final String department) {
        this.department = department;
        return this;
    }

    /**
     *
     * @param building value to be set
     * @return Builder
     */

    public AddressBuilder building(final String building) {
        this.building = building;
        return this;
    }

    /**
     *
     * @param apartment value to be set
     * @return Builder
     */

    public AddressBuilder apartment(final String apartment) {
        this.apartment = apartment;
        return this;
    }

    /**
     *
     * @param pOBox value to be set
     * @return Builder
     */

    public AddressBuilder pOBox(final String pOBox) {
        this.pOBox = pOBox;
        return this;
    }

    /**
     *
     * @param phone value to be set
     * @return Builder
     */

    public AddressBuilder phone(final String phone) {
        this.phone = phone;
        return this;
    }

    /**
     *
     * @param mobile value to be set
     * @return Builder
     */

    public AddressBuilder mobile(final String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     *
     * @param email value to be set
     * @return Builder
     */

    public AddressBuilder email(final String email) {
        this.email = email;
        return this;
    }

    /**
     *
     * @param fax value to be set
     * @return Builder
     */

    public AddressBuilder fax(final String fax) {
        this.fax = fax;
        return this;
    }

    /**
     *
     * @param additionalAddressInfo value to be set
     * @return Builder
     */

    public AddressBuilder additionalAddressInfo(final String additionalAddressInfo) {
        this.additionalAddressInfo = additionalAddressInfo;
        return this;
    }

    /**
     *
     * @param externalId value to be set
     * @return Builder
     */

    public AddressBuilder externalId(final String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public String getTitle() {
        return this.title;
    }

    public String getSalutation() {
        return this.salutation;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public String getStreetNumber() {
        return this.streetNumber;
    }

    public String getAdditionalStreetInfo() {
        return this.additionalStreetInfo;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getCity() {
        return this.city;
    }

    public String getRegion() {
        return this.region;
    }

    public String getState() {
        return this.state;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCompany() {
        return this.company;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getBuilding() {
        return this.building;
    }

    public String getApartment() {
        return this.apartment;
    }

    public String getPOBox() {
        return this.pOBox;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFax() {
        return this.fax;
    }

    public String getAdditionalAddressInfo() {
        return this.additionalAddressInfo;
    }

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * builds Address with checking for non-null required values
     * @return Address
     */
    public Address build() {
        Objects.requireNonNull(id, Address.class + ": id is missing");
        Objects.requireNonNull(key, Address.class + ": key is missing");
        Objects.requireNonNull(title, Address.class + ": title is missing");
        Objects.requireNonNull(salutation, Address.class + ": salutation is missing");
        Objects.requireNonNull(firstName, Address.class + ": firstName is missing");
        Objects.requireNonNull(lastName, Address.class + ": lastName is missing");
        Objects.requireNonNull(streetName, Address.class + ": streetName is missing");
        Objects.requireNonNull(streetNumber, Address.class + ": streetNumber is missing");
        Objects.requireNonNull(additionalStreetInfo, Address.class + ": additionalStreetInfo is missing");
        Objects.requireNonNull(postalCode, Address.class + ": postalCode is missing");
        Objects.requireNonNull(city, Address.class + ": city is missing");
        Objects.requireNonNull(region, Address.class + ": region is missing");
        Objects.requireNonNull(state, Address.class + ": state is missing");
        Objects.requireNonNull(country, Address.class + ": country is missing");
        Objects.requireNonNull(company, Address.class + ": company is missing");
        Objects.requireNonNull(department, Address.class + ": department is missing");
        Objects.requireNonNull(building, Address.class + ": building is missing");
        Objects.requireNonNull(apartment, Address.class + ": apartment is missing");
        Objects.requireNonNull(pOBox, Address.class + ": pOBox is missing");
        Objects.requireNonNull(phone, Address.class + ": phone is missing");
        Objects.requireNonNull(mobile, Address.class + ": mobile is missing");
        Objects.requireNonNull(email, Address.class + ": email is missing");
        Objects.requireNonNull(fax, Address.class + ": fax is missing");
        Objects.requireNonNull(additionalAddressInfo, Address.class + ": additionalAddressInfo is missing");
        Objects.requireNonNull(externalId, Address.class + ": externalId is missing");
        return new AddressImpl(id, key, title, salutation, firstName, lastName, streetName, streetNumber,
            additionalStreetInfo, postalCode, city, region, state, country, company, department, building, apartment,
            pOBox, phone, mobile, email, fax, additionalAddressInfo, externalId);
    }

    /**
     * builds Address without checking for non-null required values
     * @return Address
     */
    public Address buildUnchecked() {
        return new AddressImpl(id, key, title, salutation, firstName, lastName, streetName, streetNumber,
            additionalStreetInfo, postalCode, city, region, state, country, company, department, building, apartment,
            pOBox, phone, mobile, email, fax, additionalAddressInfo, externalId);
    }

    public static AddressBuilder of() {
        return new AddressBuilder();
    }

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
        return builder;
    }

}
