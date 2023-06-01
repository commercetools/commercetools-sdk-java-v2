package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Address;
import com.commercetools.history.models.change.AddBillingAddressIdChangeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * AddBillingAddressIdChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddBillingAddressIdChange addBillingAddressIdChange = AddBillingAddressIdChange.builder()
 *             .change("{change}")
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = AddBillingAddressIdChangeImpl.class)
public interface AddBillingAddressIdChange extends Change {

    /**
     * discriminator value for AddBillingAddressIdChange
     */
    String ADD_BILLING_ADDRESS_ID_CHANGE = "AddBillingAddressIdChange";

    /**
     *  <p>Update action for <code>addBillingAddressId</code> action on customers.</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public List<String> getNextValue();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public List<String> getPreviousValue();
    /**
     *
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>Update action for <code>addBillingAddressId</code> action on customers.</p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set nextValue
     * @param nextValue values to be set
     */
    
    @JsonIgnore
    public void setNextValue(final String ...nextValue);
    /**
     * set nextValue
     * @param nextValue values to be set
     */
    
    public void setNextValue(final List<String> nextValue);
    
    /**
     * set previousValue
     * @param previousValue values to be set
     */
    
    @JsonIgnore
    public void setPreviousValue(final String ...previousValue);
    /**
     * set previousValue
     * @param previousValue values to be set
     */
    
    public void setPreviousValue(final List<String> previousValue);
    
    /**
     * set address
     * @param address value to be set
     */
    
    public void setAddress(final Address address);
    

    /**
     * factory method
     * @return instance of AddBillingAddressIdChange
     */
    public static AddBillingAddressIdChange of(){
        return new AddBillingAddressIdChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy AddBillingAddressIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddBillingAddressIdChange of(final AddBillingAddressIdChange template) {
        AddBillingAddressIdChangeImpl instance = new AddBillingAddressIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddBillingAddressIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddBillingAddressIdChange deepCopy(@Nullable final AddBillingAddressIdChange template) {
        if (template == null) {
            return null;
        }
        AddBillingAddressIdChangeImpl instance = new AddBillingAddressIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(ArrayList::new)
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(ArrayList::new)
                .orElse(null));
        instance.setAddress(com.commercetools.history.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for AddBillingAddressIdChange
     * @return builder
     */
    public static AddBillingAddressIdChangeBuilder builder() {
        return AddBillingAddressIdChangeBuilder.of();
    }
    
    /**
     * create builder for AddBillingAddressIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddBillingAddressIdChangeBuilder builder(final AddBillingAddressIdChange template) {
        return AddBillingAddressIdChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddBillingAddressIdChange(Function<AddBillingAddressIdChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddBillingAddressIdChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddBillingAddressIdChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddBillingAddressIdChange>";
            }
        };
    }
}
