
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Address;
import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the Set Address Custom Type update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAddressCustomTypeChange setAddressCustomTypeChange = SetAddressCustomTypeChange.builder()
 *             .change("{change}")
 *             .address(addressBuilder -> addressBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAddressCustomTypeChangeImpl.class)
public interface SetAddressCustomTypeChange extends Change {

    /**
     * discriminator value for SetAddressCustomTypeChange
     */
    String SET_ADDRESS_CUSTOM_TYPE_CHANGE = "SetAddressCustomTypeChange";

    /**
     *
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
     *  <p>Address which was extended.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomFields getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Address which was extended.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CustomFields previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomFields nextValue);

    /**
     * factory method
     * @return instance of SetAddressCustomTypeChange
     */
    public static SetAddressCustomTypeChange of() {
        return new SetAddressCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetAddressCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAddressCustomTypeChange of(final SetAddressCustomTypeChange template) {
        SetAddressCustomTypeChangeImpl instance = new SetAddressCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setAddress(template.getAddress());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetAddressCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAddressCustomTypeChange deepCopy(@Nullable final SetAddressCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetAddressCustomTypeChangeImpl instance = new SetAddressCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setAddress(com.commercetools.history.models.common.Address.deepCopy(template.getAddress()));
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetAddressCustomTypeChange
     * @return builder
     */
    public static SetAddressCustomTypeChangeBuilder builder() {
        return SetAddressCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetAddressCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAddressCustomTypeChangeBuilder builder(final SetAddressCustomTypeChange template) {
        return SetAddressCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAddressCustomTypeChange(Function<SetAddressCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAddressCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAddressCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAddressCustomTypeChange>";
            }
        };
    }
}
