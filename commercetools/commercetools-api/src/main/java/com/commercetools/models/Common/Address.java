package com.commercetools.models.common;

import java.lang.String;
import com.commercetools.models.common.AddressImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AddressImpl.class)
public interface Address  {

   
   
   @JsonProperty("id")
   public String getId();
   
   
   @JsonProperty("key")
   public String getKey();
   
   
   @JsonProperty("title")
   public String getTitle();
   
   
   @JsonProperty("salutation")
   public String getSalutation();
   
   
   @JsonProperty("firstName")
   public String getFirstName();
   
   
   @JsonProperty("lastName")
   public String getLastName();
   
   
   @JsonProperty("streetName")
   public String getStreetName();
   
   
   @JsonProperty("streetNumber")
   public String getStreetNumber();
   
   
   @JsonProperty("additionalStreetInfo")
   public String getAdditionalStreetInfo();
   
   
   @JsonProperty("postalCode")
   public String getPostalCode();
   
   
   @JsonProperty("city")
   public String getCity();
   
   
   @JsonProperty("region")
   public String getRegion();
   
   
   @JsonProperty("state")
   public String getState();
   /**
   	<p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   @NotNull
   @JsonProperty("country")
   public String getCountry();
   
   
   @JsonProperty("company")
   public String getCompany();
   
   
   @JsonProperty("department")
   public String getDepartment();
   
   
   @JsonProperty("building")
   public String getBuilding();
   
   
   @JsonProperty("apartment")
   public String getApartment();
   
   
   @JsonProperty("pOBox")
   public String getPOBox();
   
   
   @JsonProperty("phone")
   public String getPhone();
   
   
   @JsonProperty("mobile")
   public String getMobile();
   
   
   @JsonProperty("email")
   public String getEmail();
   
   
   @JsonProperty("fax")
   public String getFax();
   
   
   @JsonProperty("additionalAddressInfo")
   public String getAdditionalAddressInfo();
   
   
   @JsonProperty("externalId")
   public String getExternalId();

   public void setId(final String id);
   
   public void setKey(final String key);
   
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
   
   public void setCountry(final String country);
   
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
   
   public static AddressImpl of(){
      return new AddressImpl();
   }
   

   public static AddressImpl of(final Address template) {
      AddressImpl instance = new AddressImpl();
      instance.setCountry(template.getCountry());
      instance.setLastName(template.getLastName());
      instance.setPOBox(template.getPOBox());
      instance.setCity(template.getCity());
      instance.setStreetNumber(template.getStreetNumber());
      instance.setPostalCode(template.getPostalCode());
      instance.setMobile(template.getMobile());
      instance.setExternalId(template.getExternalId());
      instance.setAdditionalAddressInfo(template.getAdditionalAddressInfo());
      instance.setTitle(template.getTitle());
      instance.setBuilding(template.getBuilding());
      instance.setFirstName(template.getFirstName());
      instance.setStreetName(template.getStreetName());
      instance.setPhone(template.getPhone());
      instance.setAdditionalStreetInfo(template.getAdditionalStreetInfo());
      instance.setCompany(template.getCompany());
      instance.setState(template.getState());
      instance.setSalutation(template.getSalutation());
      instance.setId(template.getId());
      instance.setFax(template.getFax());
      instance.setDepartment(template.getDepartment());
      instance.setRegion(template.getRegion());
      instance.setEmail(template.getEmail());
      instance.setApartment(template.getApartment());
      instance.setKey(template.getKey());
      return instance;
   }

}