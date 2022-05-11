
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AddressDraftBuilder implements Builder<AddressDraft> {

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

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    public AddressDraftBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public AddressDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public AddressDraftBuilder country(final String country) {
        this.country = country;
        return this;
    }

    public AddressDraftBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    public AddressDraftBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    public AddressDraftBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    public AddressDraftBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    public AddressDraftBuilder streetName(@Nullable final String streetName) {
        this.streetName = streetName;
        return this;
    }

    public AddressDraftBuilder streetNumber(@Nullable final String streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    public AddressDraftBuilder additionalStreetInfo(@Nullable final String additionalStreetInfo) {
        this.additionalStreetInfo = additionalStreetInfo;
        return this;
    }

    public AddressDraftBuilder postalCode(@Nullable final String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public AddressDraftBuilder city(@Nullable final String city) {
        this.city = city;
        return this;
    }

    public AddressDraftBuilder region(@Nullable final String region) {
        this.region = region;
        return this;
    }

    public AddressDraftBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }

    public AddressDraftBuilder company(@Nullable final String company) {
        this.company = company;
        return this;
    }

    public AddressDraftBuilder department(@Nullable final String department) {
        this.department = department;
        return this;
    }

    public AddressDraftBuilder building(@Nullable final String building) {
        this.building = building;
        return this;
    }

    public AddressDraftBuilder apartment(@Nullable final String apartment) {
        this.apartment = apartment;
        return this;
    }

    public AddressDraftBuilder pOBox(@Nullable final String pOBox) {
        this.pOBox = pOBox;
        return this;
    }

    public AddressDraftBuilder phone(@Nullable final String phone) {
        this.phone = phone;
        return this;
    }

    public AddressDraftBuilder mobile(@Nullable final String mobile) {
        this.mobile = mobile;
        return this;
    }

    public AddressDraftBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }

    public AddressDraftBuilder fax(@Nullable final String fax) {
        this.fax = fax;
        return this;
    }

    public AddressDraftBuilder additionalAddressInfo(@Nullable final String additionalAddressInfo) {
        this.additionalAddressInfo = additionalAddressInfo;
        return this;
    }

    public AddressDraftBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    public AddressDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public AddressDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
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

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public AddressDraft build() {
        Objects.requireNonNull(country, AddressDraft.class + ": country is missing");
        return new AddressDraftImpl(id, key, country, title, salutation, firstName, lastName, streetName, streetNumber,
            additionalStreetInfo, postalCode, city, region, state, company, department, building, apartment, pOBox,
            phone, mobile, email, fax, additionalAddressInfo, externalId, custom);
    }

    /**
     * builds AddressDraft without checking for non null required values
     */
    public AddressDraft buildUnchecked() {
        return new AddressDraftImpl(id, key, country, title, salutation, firstName, lastName, streetName, streetNumber,
            additionalStreetInfo, postalCode, city, region, state, company, department, building, apartment, pOBox,
            phone, mobile, email, fax, additionalAddressInfo, externalId, custom);
    }

    public static AddressDraftBuilder of() {
        return new AddressDraftBuilder();
    }

    public static AddressDraftBuilder of(final AddressDraft template) {
        AddressDraftBuilder builder = new AddressDraftBuilder();
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
        builder.custom = template.getCustom();
        return builder;
    }

}
