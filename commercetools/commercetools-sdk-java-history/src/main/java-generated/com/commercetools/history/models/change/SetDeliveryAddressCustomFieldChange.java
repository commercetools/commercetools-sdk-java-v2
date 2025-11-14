
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetDeliveryAddressCustomFieldAction" rel="nofollow">Set Delivery Address CustomField</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDeliveryAddressCustomFieldChange setDeliveryAddressCustomFieldChange = SetDeliveryAddressCustomFieldChange.builder()
 *             .change("{change}")
 *             .deliveryId("{deliveryId}")
 *             .addressId("{addressId}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetDeliveryAddressCustomFieldChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDeliveryAddressCustomFieldChangeImpl.class)
public interface SetDeliveryAddressCustomFieldChange extends Change {

    /**
     * discriminator value for SetDeliveryAddressCustomFieldChange
     */
    String SET_DELIVERY_ADDRESS_CUSTOM_FIELD_CHANGE = "SetDeliveryAddressCustomFieldChange";

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
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return customTypeId
     */
    @NotNull
    @JsonProperty("customTypeId")
    public String getCustomTypeId();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

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
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     */

    public void setCustomTypeId(final String customTypeId);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Object nextValue);

    /**
     * factory method
     * @return instance of SetDeliveryAddressCustomFieldChange
     */
    public static SetDeliveryAddressCustomFieldChange of() {
        return new SetDeliveryAddressCustomFieldChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetDeliveryAddressCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDeliveryAddressCustomFieldChange of(final SetDeliveryAddressCustomFieldChange template) {
        SetDeliveryAddressCustomFieldChangeImpl instance = new SetDeliveryAddressCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setAddressId(template.getAddressId());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetDeliveryAddressCustomFieldChange copyDeep();

    /**
     * factory method to create a deep copy of SetDeliveryAddressCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDeliveryAddressCustomFieldChange deepCopy(
            @Nullable final SetDeliveryAddressCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        SetDeliveryAddressCustomFieldChangeImpl instance = new SetDeliveryAddressCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setAddressId(template.getAddressId());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetDeliveryAddressCustomFieldChange
     * @return builder
     */
    public static SetDeliveryAddressCustomFieldChangeBuilder builder() {
        return SetDeliveryAddressCustomFieldChangeBuilder.of();
    }

    /**
     * create builder for SetDeliveryAddressCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDeliveryAddressCustomFieldChangeBuilder builder(
            final SetDeliveryAddressCustomFieldChange template) {
        return SetDeliveryAddressCustomFieldChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDeliveryAddressCustomFieldChange(Function<SetDeliveryAddressCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDeliveryAddressCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDeliveryAddressCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDeliveryAddressCustomFieldChange>";
            }
        };
    }
}
