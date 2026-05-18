
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetShippingAddressCustomTypeAction" rel="nofollow">Set Shipping Address Custom Type</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingAddressCustomTypeChange setShippingAddressCustomTypeChange = SetShippingAddressCustomTypeChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetShippingAddressCustomTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetShippingAddressCustomTypeChangeImpl.class)
public interface SetShippingAddressCustomTypeChange extends Change {

    /**
     * discriminator value for SetShippingAddressCustomTypeChange
     */
    String SET_SHIPPING_ADDRESS_CUSTOM_TYPE_CHANGE = "SetShippingAddressCustomTypeChange";

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
     * @return instance of SetShippingAddressCustomTypeChange
     */
    public static SetShippingAddressCustomTypeChange of() {
        return new SetShippingAddressCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetShippingAddressCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetShippingAddressCustomTypeChange of(final SetShippingAddressCustomTypeChange template) {
        SetShippingAddressCustomTypeChangeImpl instance = new SetShippingAddressCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetShippingAddressCustomTypeChange copyDeep();

    /**
     * factory method to create a deep copy of SetShippingAddressCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetShippingAddressCustomTypeChange deepCopy(
            @Nullable final SetShippingAddressCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetShippingAddressCustomTypeChangeImpl instance = new SetShippingAddressCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetShippingAddressCustomTypeChange
     * @return builder
     */
    public static SetShippingAddressCustomTypeChangeBuilder builder() {
        return SetShippingAddressCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetShippingAddressCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingAddressCustomTypeChangeBuilder builder(final SetShippingAddressCustomTypeChange template) {
        return SetShippingAddressCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetShippingAddressCustomTypeChange(Function<SetShippingAddressCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingAddressCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingAddressCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingAddressCustomTypeChange>";
            }
        };
    }
}
