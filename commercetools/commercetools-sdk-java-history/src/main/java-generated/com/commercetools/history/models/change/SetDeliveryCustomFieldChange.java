
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetDeliveryCustomFieldAction" rel="nofollow">Set Delivery CustomField</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDeliveryCustomFieldChange setDeliveryCustomFieldChange = SetDeliveryCustomFieldChange.builder()
 *             .change("{change}")
 *             .deliveryId("{deliveryId}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetDeliveryCustomFieldChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDeliveryCustomFieldChangeImpl.class)
public interface SetDeliveryCustomFieldChange extends Change {

    /**
     * discriminator value for SetDeliveryCustomFieldChange
     */
    String SET_DELIVERY_CUSTOM_FIELD_CHANGE = "SetDeliveryCustomFieldChange";

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
     * @return instance of SetDeliveryCustomFieldChange
     */
    public static SetDeliveryCustomFieldChange of() {
        return new SetDeliveryCustomFieldChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetDeliveryCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDeliveryCustomFieldChange of(final SetDeliveryCustomFieldChange template) {
        SetDeliveryCustomFieldChangeImpl instance = new SetDeliveryCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetDeliveryCustomFieldChange copyDeep();

    /**
     * factory method to create a deep copy of SetDeliveryCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDeliveryCustomFieldChange deepCopy(@Nullable final SetDeliveryCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        SetDeliveryCustomFieldChangeImpl instance = new SetDeliveryCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetDeliveryCustomFieldChange
     * @return builder
     */
    public static SetDeliveryCustomFieldChangeBuilder builder() {
        return SetDeliveryCustomFieldChangeBuilder.of();
    }

    /**
     * create builder for SetDeliveryCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDeliveryCustomFieldChangeBuilder builder(final SetDeliveryCustomFieldChange template) {
        return SetDeliveryCustomFieldChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDeliveryCustomFieldChange(Function<SetDeliveryCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDeliveryCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDeliveryCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDeliveryCustomFieldChange>";
            }
        };
    }
}
