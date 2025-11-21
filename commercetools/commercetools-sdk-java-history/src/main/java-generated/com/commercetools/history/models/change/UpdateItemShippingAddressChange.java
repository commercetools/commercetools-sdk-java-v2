
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderUpdateItemShippingAddressAction" rel="nofollow">Update ItemShippingAddress</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UpdateItemShippingAddressChange updateItemShippingAddressChange = UpdateItemShippingAddressChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("UpdateItemShippingAddressChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = UpdateItemShippingAddressChangeImpl.class)
public interface UpdateItemShippingAddressChange extends Change {

    /**
     * discriminator value for UpdateItemShippingAddressChange
     */
    String UPDATE_ITEM_SHIPPING_ADDRESS_CHANGE = "UpdateItemShippingAddressChange";

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
    public Address getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Address getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Address previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Address nextValue);

    /**
     * factory method
     * @return instance of UpdateItemShippingAddressChange
     */
    public static UpdateItemShippingAddressChange of() {
        return new UpdateItemShippingAddressChangeImpl();
    }

    /**
     * factory method to create a shallow copy UpdateItemShippingAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static UpdateItemShippingAddressChange of(final UpdateItemShippingAddressChange template) {
        UpdateItemShippingAddressChangeImpl instance = new UpdateItemShippingAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public UpdateItemShippingAddressChange copyDeep();

    /**
     * factory method to create a deep copy of UpdateItemShippingAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static UpdateItemShippingAddressChange deepCopy(@Nullable final UpdateItemShippingAddressChange template) {
        if (template == null) {
            return null;
        }
        UpdateItemShippingAddressChangeImpl instance = new UpdateItemShippingAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Address.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Address.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for UpdateItemShippingAddressChange
     * @return builder
     */
    public static UpdateItemShippingAddressChangeBuilder builder() {
        return UpdateItemShippingAddressChangeBuilder.of();
    }

    /**
     * create builder for UpdateItemShippingAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UpdateItemShippingAddressChangeBuilder builder(final UpdateItemShippingAddressChange template) {
        return UpdateItemShippingAddressChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withUpdateItemShippingAddressChange(Function<UpdateItemShippingAddressChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<UpdateItemShippingAddressChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<UpdateItemShippingAddressChange>() {
            @Override
            public String toString() {
                return "TypeReference<UpdateItemShippingAddressChange>";
            }
        };
    }
}
