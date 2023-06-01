package com.commercetools.importapi.models.customers;

import com.commercetools.importapi.models.customfields.Custom;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Different from Address in that <code>key</code> is required and <code>id</code> is not supported.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerAddressImpl implements CustomerAddress, ModelBase {

    
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
    
    
    private com.commercetools.importapi.models.customfields.Custom custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerAddressImpl(@JsonProperty("key") final String key, @JsonProperty("title") final String title, @JsonProperty("salutation") final String salutation, @JsonProperty("firstName") final String firstName, @JsonProperty("lastName") final String lastName, @JsonProperty("streetName") final String streetName, @JsonProperty("streetNumber") final String streetNumber, @JsonProperty("additionalStreetInfo") final String additionalStreetInfo, @JsonProperty("postalCode") final String postalCode, @JsonProperty("city") final String city, @JsonProperty("region") final String region, @JsonProperty("state") final String state, @JsonProperty("country") final String country, @JsonProperty("company") final String company, @JsonProperty("department") final String department, @JsonProperty("building") final String building, @JsonProperty("apartment") final String apartment, @JsonProperty("pOBox") final String pOBox, @JsonProperty("phone") final String phone, @JsonProperty("mobile") final String mobile, @JsonProperty("email") final String email, @JsonProperty("fax") final String fax, @JsonProperty("additionalAddressInfo") final String additionalAddressInfo, @JsonProperty("externalId") final String externalId, @JsonProperty("custom") final com.commercetools.importapi.models.customfields.Custom custom) {
        this.key = key;
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
        this.country = country;
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
    /**
     * create empty instance
     */
    public CustomerAddressImpl() {
    }

    /**
     *  <p>User-defined identifier for the address. Must follow the pattern <code>[a-zA-Z0-9_\-]{2,256}</code> and must be unique per customer.</p>
     */
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *
     */
    
    public String getTitle(){
        return this.title;
    }
    
    /**
     *
     */
    
    public String getSalutation(){
        return this.salutation;
    }
    
    /**
     *
     */
    
    public String getFirstName(){
        return this.firstName;
    }
    
    /**
     *
     */
    
    public String getLastName(){
        return this.lastName;
    }
    
    /**
     *
     */
    
    public String getStreetName(){
        return this.streetName;
    }
    
    /**
     *
     */
    
    public String getStreetNumber(){
        return this.streetNumber;
    }
    
    /**
     *
     */
    
    public String getAdditionalStreetInfo(){
        return this.additionalStreetInfo;
    }
    
    /**
     *
     */
    
    public String getPostalCode(){
        return this.postalCode;
    }
    
    /**
     *
     */
    
    public String getCity(){
        return this.city;
    }
    
    /**
     *
     */
    
    public String getRegion(){
        return this.region;
    }
    
    /**
     *
     */
    
    public String getState(){
        return this.state;
    }
    
    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2.</p>
     */
    
    public String getCountry(){
        return this.country;
    }
    
    /**
     *
     */
    
    public String getCompany(){
        return this.company;
    }
    
    /**
     *
     */
    
    public String getDepartment(){
        return this.department;
    }
    
    /**
     *
     */
    
    public String getBuilding(){
        return this.building;
    }
    
    /**
     *
     */
    
    public String getApartment(){
        return this.apartment;
    }
    
    /**
     *
     */
    
    public String getPOBox(){
        return this.pOBox;
    }
    
    /**
     *
     */
    
    public String getPhone(){
        return this.phone;
    }
    
    /**
     *
     */
    
    public String getMobile(){
        return this.mobile;
    }
    
    /**
     *
     */
    
    public String getEmail(){
        return this.email;
    }
    
    /**
     *
     */
    
    public String getFax(){
        return this.fax;
    }
    
    /**
     *
     */
    
    public String getAdditionalAddressInfo(){
        return this.additionalAddressInfo;
    }
    
    /**
     *
     */
    
    public String getExternalId(){
        return this.externalId;
    }
    
    /**
     *  <p>Custom Fields for the address.</p>
     */
    
    public com.commercetools.importapi.models.customfields.Custom getCustom(){
        return this.custom;
    }

    
    public void setKey(final String key){
        this.key = key;
    }
    
    
    public void setTitle(final String title){
        this.title = title;
    }
    
    
    public void setSalutation(final String salutation){
        this.salutation = salutation;
    }
    
    
    public void setFirstName(final String firstName){
        this.firstName = firstName;
    }
    
    
    public void setLastName(final String lastName){
        this.lastName = lastName;
    }
    
    
    public void setStreetName(final String streetName){
        this.streetName = streetName;
    }
    
    
    public void setStreetNumber(final String streetNumber){
        this.streetNumber = streetNumber;
    }
    
    
    public void setAdditionalStreetInfo(final String additionalStreetInfo){
        this.additionalStreetInfo = additionalStreetInfo;
    }
    
    
    public void setPostalCode(final String postalCode){
        this.postalCode = postalCode;
    }
    
    
    public void setCity(final String city){
        this.city = city;
    }
    
    
    public void setRegion(final String region){
        this.region = region;
    }
    
    
    public void setState(final String state){
        this.state = state;
    }
    
    
    public void setCountry(final String country){
        this.country = country;
    }
    
    
    public void setCompany(final String company){
        this.company = company;
    }
    
    
    public void setDepartment(final String department){
        this.department = department;
    }
    
    
    public void setBuilding(final String building){
        this.building = building;
    }
    
    
    public void setApartment(final String apartment){
        this.apartment = apartment;
    }
    
    
    public void setPOBox(final String pOBox){
        this.pOBox = pOBox;
    }
    
    
    public void setPhone(final String phone){
        this.phone = phone;
    }
    
    
    public void setMobile(final String mobile){
        this.mobile = mobile;
    }
    
    
    public void setEmail(final String email){
        this.email = email;
    }
    
    
    public void setFax(final String fax){
        this.fax = fax;
    }
    
    
    public void setAdditionalAddressInfo(final String additionalAddressInfo){
        this.additionalAddressInfo = additionalAddressInfo;
    }
    
    
    public void setExternalId(final String externalId){
        this.externalId = externalId;
    }
    
    
    public void setCustom(final com.commercetools.importapi.models.customfields.Custom custom){
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerAddressImpl that = (CustomerAddressImpl) o;
    
        return new EqualsBuilder()
                .append(key, that.key)
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
                .append(country, that.country)
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
        return new HashCodeBuilder(17, 37)
            .append(key)
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
            .append(country)
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
