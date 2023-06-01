package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Address;
import com.commercetools.history.models.change.RemoveShippingAddressIdChangeImpl;

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
 * RemoveShippingAddressIdChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveShippingAddressIdChange removeShippingAddressIdChange = RemoveShippingAddressIdChange.builder()
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
@JsonDeserialize(as = RemoveShippingAddressIdChangeImpl.class)
public interface RemoveShippingAddressIdChange extends Change {

    /**
     * discriminator value for RemoveShippingAddressIdChange
     */
    String REMOVE_SHIPPING_ADDRESS_ID_CHANGE = "RemoveShippingAddressIdChange";

    /**
     *  <p>Update action for <code>removeShippingAddressId</code> action on customers.</p>
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
     *  <p>Update action for <code>removeShippingAddressId</code> action on customers.</p>
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
     * @return instance of RemoveShippingAddressIdChange
     */
    public static RemoveShippingAddressIdChange of(){
        return new RemoveShippingAddressIdChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy RemoveShippingAddressIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveShippingAddressIdChange of(final RemoveShippingAddressIdChange template) {
        RemoveShippingAddressIdChangeImpl instance = new RemoveShippingAddressIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveShippingAddressIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveShippingAddressIdChange deepCopy(@Nullable final RemoveShippingAddressIdChange template) {
        if (template == null) {
            return null;
        }
        RemoveShippingAddressIdChangeImpl instance = new RemoveShippingAddressIdChangeImpl();
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
     * builder factory method for RemoveShippingAddressIdChange
     * @return builder
     */
    public static RemoveShippingAddressIdChangeBuilder builder() {
        return RemoveShippingAddressIdChangeBuilder.of();
    }
    
    /**
     * create builder for RemoveShippingAddressIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveShippingAddressIdChangeBuilder builder(final RemoveShippingAddressIdChange template) {
        return RemoveShippingAddressIdChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveShippingAddressIdChange(Function<RemoveShippingAddressIdChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveShippingAddressIdChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveShippingAddressIdChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveShippingAddressIdChange>";
            }
        };
    }
}
