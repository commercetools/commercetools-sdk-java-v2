
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetDeliveryAddressCustomTypeAction" rel="nofollow">Set Delivery Address Custom Type</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDeliveryAddressCustomTypeChange setDeliveryAddressCustomTypeChange = SetDeliveryAddressCustomTypeChange.builder()
 *             .change("{change}")
 *             .deliveryId("{deliveryId}")
 *             .addressId("{addressId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetDeliveryAddressCustomTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDeliveryAddressCustomTypeChangeImpl.class)
public interface SetDeliveryAddressCustomTypeChange extends Change {

    /**
     * discriminator value for SetDeliveryAddressCustomTypeChange
     */
    String SET_DELIVERY_ADDRESS_CUSTOM_TYPE_CHANGE = "SetDeliveryAddressCustomTypeChange";

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
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

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
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

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
     * @return instance of SetDeliveryAddressCustomTypeChange
     */
    public static SetDeliveryAddressCustomTypeChange of() {
        return new SetDeliveryAddressCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetDeliveryAddressCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDeliveryAddressCustomTypeChange of(final SetDeliveryAddressCustomTypeChange template) {
        SetDeliveryAddressCustomTypeChangeImpl instance = new SetDeliveryAddressCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setAddressId(template.getAddressId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetDeliveryAddressCustomTypeChange copyDeep();

    /**
     * factory method to create a deep copy of SetDeliveryAddressCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDeliveryAddressCustomTypeChange deepCopy(
            @Nullable final SetDeliveryAddressCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetDeliveryAddressCustomTypeChangeImpl instance = new SetDeliveryAddressCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setAddressId(template.getAddressId());
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetDeliveryAddressCustomTypeChange
     * @return builder
     */
    public static SetDeliveryAddressCustomTypeChangeBuilder builder() {
        return SetDeliveryAddressCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetDeliveryAddressCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDeliveryAddressCustomTypeChangeBuilder builder(final SetDeliveryAddressCustomTypeChange template) {
        return SetDeliveryAddressCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDeliveryAddressCustomTypeChange(Function<SetDeliveryAddressCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDeliveryAddressCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDeliveryAddressCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDeliveryAddressCustomTypeChange>";
            }
        };
    }
}
