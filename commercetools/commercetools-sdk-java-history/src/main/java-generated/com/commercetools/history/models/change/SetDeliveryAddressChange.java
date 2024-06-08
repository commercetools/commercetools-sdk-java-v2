
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
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Set DeliveryAddress on Orders.</li>
 *   <li>Set DeliveryAddress on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDeliveryAddressChange setDeliveryAddressChange = SetDeliveryAddressChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDeliveryAddressChangeImpl.class)
public interface SetDeliveryAddressChange extends Change {

    /**
     * discriminator value for SetDeliveryAddressChange
     */
    String SET_DELIVERY_ADDRESS_CHANGE = "SetDeliveryAddressChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

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
     *  <p><code>id</code> of the updated Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

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
     *  <p><code>id</code> of the updated Delivery.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     * factory method
     * @return instance of SetDeliveryAddressChange
     */
    public static SetDeliveryAddressChange of() {
        return new SetDeliveryAddressChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetDeliveryAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDeliveryAddressChange of(final SetDeliveryAddressChange template) {
        SetDeliveryAddressChangeImpl instance = new SetDeliveryAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetDeliveryAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDeliveryAddressChange deepCopy(@Nullable final SetDeliveryAddressChange template) {
        if (template == null) {
            return null;
        }
        SetDeliveryAddressChangeImpl instance = new SetDeliveryAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Address.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Address.deepCopy(template.getNextValue()));
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    /**
     * builder factory method for SetDeliveryAddressChange
     * @return builder
     */
    public static SetDeliveryAddressChangeBuilder builder() {
        return SetDeliveryAddressChangeBuilder.of();
    }

    /**
     * create builder for SetDeliveryAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDeliveryAddressChangeBuilder builder(final SetDeliveryAddressChange template) {
        return SetDeliveryAddressChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDeliveryAddressChange(Function<SetDeliveryAddressChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDeliveryAddressChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDeliveryAddressChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDeliveryAddressChange>";
            }
        };
    }
}
