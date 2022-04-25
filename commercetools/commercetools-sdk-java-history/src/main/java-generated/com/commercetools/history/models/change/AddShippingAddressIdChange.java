
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
@JsonDeserialize(as = AddShippingAddressIdChangeImpl.class)
public interface AddShippingAddressIdChange extends Change {

    String ADD_SHIPPING_ADDRESS_ID_CHANGE = "AddShippingAddressIdChange";

    /**
    *  <p>Update action for <code>addShippingAddressId</code> action on customers.</p>
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

    public static AddShippingAddressIdChange of() {
        return new AddShippingAddressIdChangeImpl();
    }

    public static AddShippingAddressIdChange of(final AddShippingAddressIdChange template) {
        AddShippingAddressIdChangeImpl instance = new AddShippingAddressIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static AddShippingAddressIdChangeBuilder builder() {
        return AddShippingAddressIdChangeBuilder.of();
    }

    public static AddShippingAddressIdChangeBuilder builder(final AddShippingAddressIdChange template) {
        return AddShippingAddressIdChangeBuilder.of(template);
    }

    default <T> T withAddShippingAddressIdChange(Function<AddShippingAddressIdChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddShippingAddressIdChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddShippingAddressIdChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddShippingAddressIdChange>";
            }
        };
    }
}
