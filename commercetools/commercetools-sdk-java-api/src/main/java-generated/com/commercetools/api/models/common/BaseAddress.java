
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = BaseAddressImpl.class)
public interface BaseAddress {

    /**
    *  <p>Platform-generated unique identifier of the Address.</p>
    */

    @JsonProperty("id")
    public String getId();

    /**
    *  <p>User-defined unique identifier of the Address.</p>
    */

    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>Two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    @NotNull
    @JsonProperty("country")
    public String getCountry();

    /**
    *  <p>Title of the contact, for example 'Dr.'</p>
    */

    @JsonProperty("title")
    public String getTitle();

    /**
    *  <p>Salutation of the contact, for example 'Mr.' or 'Ms.'</p>
    */

    @JsonProperty("salutation")
    public String getSalutation();

    /**
    *  <p>Given name (first name) of the contact.</p>
    */

    @JsonProperty("firstName")
    public String getFirstName();

    /**
    *  <p>Family name (last name) of the contact.</p>
    */

    @JsonProperty("lastName")
    public String getLastName();

    /**
    *  <p>Name of the street.</p>
    */

    @JsonProperty("streetName")
    public String getStreetName();

    /**
    *  <p>Street number.</p>
    */

    @JsonProperty("streetNumber")
    public String getStreetNumber();

    /**
    *  <p>Further information on the street address.</p>
    */

    @JsonProperty("additionalStreetInfo")
    public String getAdditionalStreetInfo();

    /**
    *  <p>Postal code.</p>
    */

    @JsonProperty("postalCode")
    public String getPostalCode();

    /**
    *  <p>Name of the city.</p>
    */

    @JsonProperty("city")
    public String getCity();

    /**
    *  <p>Name of the region.</p>
    */

    @JsonProperty("region")
    public String getRegion();

    /**
    *  <p>Name of the state, for example, Colorado.</p>
    */

    @JsonProperty("state")
    public String getState();

    /**
    *  <p>Name of the company.</p>
    */

    @JsonProperty("company")
    public String getCompany();

    /**
    *  <p>Name of the department.</p>
    */

    @JsonProperty("department")
    public String getDepartment();

    /**
    *  <p>Number or name of the building.</p>
    */

    @JsonProperty("building")
    public String getBuilding();

    /**
    *  <p>Number or name of the apartment.</p>
    */

    @JsonProperty("apartment")
    public String getApartment();

    /**
    *  <p>Post office box number.</p>
    */

    @JsonProperty("pOBox")
    public String getPOBox();

    /**
    *  <p>Phone number of the contact.</p>
    */

    @JsonProperty("phone")
    public String getPhone();

    /**
    *  <p>Mobile phone number of the contact.</p>
    */

    @JsonProperty("mobile")
    public String getMobile();

    /**
    *  <p>Email address of the contact.</p>
    */

    @JsonProperty("email")
    public String getEmail();

    /**
    *  <p>Fax number of the contact.</p>
    */

    @JsonProperty("fax")
    public String getFax();

    /**
    *  <p>Further information on the Address.</p>
    */

    @JsonProperty("additionalAddressInfo")
    public String getAdditionalAddressInfo();

    /**
    *  <p>ID for the contact used in an external system.</p>
    */

    @JsonProperty("externalId")
    public String getExternalId();

    public void setId(final String id);

    public void setKey(final String key);

    public void setCountry(final String country);

    public void setTitle(final String title);

    public void setSalutation(final String salutation);

    public void setFirstName(final String firstName);

    public void setLastName(final String lastName);

    public void setStreetName(final String streetName);

    public void setStreetNumber(final String streetNumber);

    public void setAdditionalStreetInfo(final String additionalStreetInfo);

    public void setPostalCode(final String postalCode);

    public void setCity(final String city);

    public void setRegion(final String region);

    public void setState(final String state);

    public void setCompany(final String company);

    public void setDepartment(final String department);

    public void setBuilding(final String building);

    public void setApartment(final String apartment);

    public void setPOBox(final String pOBox);

    public void setPhone(final String phone);

    public void setMobile(final String mobile);

    public void setEmail(final String email);

    public void setFax(final String fax);

    public void setAdditionalAddressInfo(final String additionalAddressInfo);

    public void setExternalId(final String externalId);

    public static BaseAddress of() {
        return new BaseAddressImpl();
    }

    public static BaseAddress of(final BaseAddress template) {
        BaseAddressImpl instance = new BaseAddressImpl();
        instance.setId(template.getId());
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
        return instance;
    }

    public static BaseAddressBuilder builder() {
        return BaseAddressBuilder.of();
    }

    public static BaseAddressBuilder builder(final BaseAddress template) {
        return BaseAddressBuilder.of(template);
    }

    default <T> T withBaseAddress(Function<BaseAddress, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BaseAddress> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BaseAddress>() {
            @Override
            public String toString() {
                return "TypeReference<BaseAddress>";
            }
        };
    }
}
