
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetItemShippingAddressCustomFieldAction" rel="nofollow">Set ItemShipping Address CustomField</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetItemShippingAddressCustomFieldChange setItemShippingAddressCustomFieldChange = SetItemShippingAddressCustomFieldChange.builder()
 *             .change("{change}")
 *             .addressId("{addressId}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetItemShippingAddressCustomFieldChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetItemShippingAddressCustomFieldChangeImpl.class)
public interface SetItemShippingAddressCustomFieldChange extends Change {

    /**
     * discriminator value for SetItemShippingAddressCustomFieldChange
     */
    String SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD_CHANGE = "SetItemShippingAddressCustomFieldChange";

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
     * @return instance of SetItemShippingAddressCustomFieldChange
     */
    public static SetItemShippingAddressCustomFieldChange of() {
        return new SetItemShippingAddressCustomFieldChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetItemShippingAddressCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetItemShippingAddressCustomFieldChange of(final SetItemShippingAddressCustomFieldChange template) {
        SetItemShippingAddressCustomFieldChangeImpl instance = new SetItemShippingAddressCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setAddressId(template.getAddressId());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetItemShippingAddressCustomFieldChange copyDeep();

    /**
     * factory method to create a deep copy of SetItemShippingAddressCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetItemShippingAddressCustomFieldChange deepCopy(
            @Nullable final SetItemShippingAddressCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        SetItemShippingAddressCustomFieldChangeImpl instance = new SetItemShippingAddressCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setAddressId(template.getAddressId());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetItemShippingAddressCustomFieldChange
     * @return builder
     */
    public static SetItemShippingAddressCustomFieldChangeBuilder builder() {
        return SetItemShippingAddressCustomFieldChangeBuilder.of();
    }

    /**
     * create builder for SetItemShippingAddressCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetItemShippingAddressCustomFieldChangeBuilder builder(
            final SetItemShippingAddressCustomFieldChange template) {
        return SetItemShippingAddressCustomFieldChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetItemShippingAddressCustomFieldChange(
            Function<SetItemShippingAddressCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetItemShippingAddressCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetItemShippingAddressCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetItemShippingAddressCustomFieldChange>";
            }
        };
    }
}
