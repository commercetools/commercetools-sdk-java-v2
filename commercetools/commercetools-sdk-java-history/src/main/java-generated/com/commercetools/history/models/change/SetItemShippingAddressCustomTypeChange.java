
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetItemShippingAddressCustomTypeAction" rel="nofollow">Set ItemShipping Address Custom Type</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetItemShippingAddressCustomTypeChange setItemShippingAddressCustomTypeChange = SetItemShippingAddressCustomTypeChange.builder()
 *             .change("{change}")
 *             .addressId("{addressId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetItemShippingAddressCustomTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetItemShippingAddressCustomTypeChangeImpl.class)
public interface SetItemShippingAddressCustomTypeChange extends Change {

    /**
     * discriminator value for SetItemShippingAddressCustomTypeChange
     */
    String SET_ITEM_SHIPPING_ADDRESS_CUSTOM_TYPE_CHANGE = "SetItemShippingAddressCustomTypeChange";

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
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a>.</p>
     * @return addressId
     */
    @NotNull
    @JsonProperty("addressId")
    public String getAddressId();

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
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a>.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

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
     * @return instance of SetItemShippingAddressCustomTypeChange
     */
    public static SetItemShippingAddressCustomTypeChange of() {
        return new SetItemShippingAddressCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetItemShippingAddressCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetItemShippingAddressCustomTypeChange of(final SetItemShippingAddressCustomTypeChange template) {
        SetItemShippingAddressCustomTypeChangeImpl instance = new SetItemShippingAddressCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setAddressId(template.getAddressId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetItemShippingAddressCustomTypeChange copyDeep();

    /**
     * factory method to create a deep copy of SetItemShippingAddressCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetItemShippingAddressCustomTypeChange deepCopy(
            @Nullable final SetItemShippingAddressCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetItemShippingAddressCustomTypeChangeImpl instance = new SetItemShippingAddressCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setAddressId(template.getAddressId());
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetItemShippingAddressCustomTypeChange
     * @return builder
     */
    public static SetItemShippingAddressCustomTypeChangeBuilder builder() {
        return SetItemShippingAddressCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetItemShippingAddressCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetItemShippingAddressCustomTypeChangeBuilder builder(
            final SetItemShippingAddressCustomTypeChange template) {
        return SetItemShippingAddressCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetItemShippingAddressCustomTypeChange(
            Function<SetItemShippingAddressCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetItemShippingAddressCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetItemShippingAddressCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetItemShippingAddressCustomTypeChange>";
            }
        };
    }
}
