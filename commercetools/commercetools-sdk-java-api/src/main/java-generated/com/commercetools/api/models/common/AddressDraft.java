
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AddressDraftImpl.class)
public interface AddressDraft extends BaseAddress, com.commercetools.api.models.CustomizableDraft<AddressDraft> {

    /**
    *  <p>Custom Fields defined for the Address.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
    *  <p>Unique identifier for the Address. Not recommended to set it manually since the Platform overwrites this ID when creating an Address for a <a href="ctp:api:type:Customer">Customer</a>. Use <code>key</code> instead and omit this field to let the Platform generate the ID for the Address.</p>
    */

    @JsonProperty("id")
    public String getId();

    /**
    *  <p>User-defined unique identifier for the Address.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setCustom(final CustomFieldsDraft custom);

    public void setId(final String id);

    public void setKey(final String key);

    public static AddressDraft of() {
        return new AddressDraftImpl();
    }

    public static AddressDraft of(final AddressDraft template) {
        AddressDraftImpl instance = new AddressDraftImpl();
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
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static AddressDraftBuilder builder() {
        return AddressDraftBuilder.of();
    }

    public static AddressDraftBuilder builder(final AddressDraft template) {
        return AddressDraftBuilder.of(template);
    }

    default <T> T withAddressDraft(Function<AddressDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddressDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddressDraft>() {
            @Override
            public String toString() {
                return "TypeReference<AddressDraft>";
            }
        };
    }
}
