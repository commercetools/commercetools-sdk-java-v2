
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AddBillingAddressIdChangeImpl.class)
public interface AddBillingAddressIdChange extends Change {

    String ADD_BILLING_ADDRESS_ID_CHANGE = "AddBillingAddressIdChange";

    /**
    *  <p>Update action for <code>addBillingAddressId</code> action on customers.</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("nextValue")
    public List<String> getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public List<String> getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setChange(final String change);

    @JsonIgnore
    public void setNextValue(final String... nextValue);

    public void setNextValue(final List<String> nextValue);

    @JsonIgnore
    public void setPreviousValue(final String... previousValue);

    public void setPreviousValue(final List<String> previousValue);

    public void setAddress(final Address address);

    public static AddBillingAddressIdChange of() {
        return new AddBillingAddressIdChangeImpl();
    }

    public static AddBillingAddressIdChange of(final AddBillingAddressIdChange template) {
        AddBillingAddressIdChangeImpl instance = new AddBillingAddressIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static AddBillingAddressIdChangeBuilder builder() {
        return AddBillingAddressIdChangeBuilder.of();
    }

    public static AddBillingAddressIdChangeBuilder builder(final AddBillingAddressIdChange template) {
        return AddBillingAddressIdChangeBuilder.of(template);
    }

    default <T> T withAddBillingAddressIdChange(Function<AddBillingAddressIdChange, T> helper) {
        return helper.apply(this);
    }
}
