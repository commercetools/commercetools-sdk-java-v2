
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerSetAddressCustomTypeActionImpl.class)
public interface CustomerSetAddressCustomTypeAction extends CustomerUpdateAction {

    String SET_ADDRESS_CUSTOM_TYPE = "setAddressCustomType";

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    @NotNull
    @JsonProperty("addressId")
    public String getAddressId();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public void setAddressId(final String addressId);

    public static CustomerSetAddressCustomTypeAction of() {
        return new CustomerSetAddressCustomTypeActionImpl();
    }

    public static CustomerSetAddressCustomTypeAction of(final CustomerSetAddressCustomTypeAction template) {
        CustomerSetAddressCustomTypeActionImpl instance = new CustomerSetAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    public static CustomerSetAddressCustomTypeActionBuilder builder() {
        return CustomerSetAddressCustomTypeActionBuilder.of();
    }

    public static CustomerSetAddressCustomTypeActionBuilder builder(final CustomerSetAddressCustomTypeAction template) {
        return CustomerSetAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withCustomerSetAddressCustomTypeAction(Function<CustomerSetAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
