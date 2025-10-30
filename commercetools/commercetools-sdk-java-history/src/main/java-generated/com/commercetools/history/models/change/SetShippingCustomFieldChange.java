
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetShippingCustomFieldAction" rel="nofollow">Set Shipping CustomField</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingCustomFieldChange setShippingCustomFieldChange = SetShippingCustomFieldChange.builder()
 *             .change("{change}")
 *             .shippingKey("{shippingKey}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetShippingCustomFieldChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetShippingCustomFieldChangeImpl.class)
public interface SetShippingCustomFieldChange extends Change {

    /**
     * discriminator value for SetShippingCustomFieldChange
     */
    String SET_SHIPPING_CUSTOM_FIELD_CHANGE = "SetShippingCustomFieldChange";

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
     *  <p><code>shippingKey</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a>.</p>
     * @return shippingKey
     */
    @NotNull
    @JsonProperty("shippingKey")
    public String getShippingKey();

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
     *  <p><code>shippingKey</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a>.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

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
     * @return instance of SetShippingCustomFieldChange
     */
    public static SetShippingCustomFieldChange of() {
        return new SetShippingCustomFieldChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetShippingCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetShippingCustomFieldChange of(final SetShippingCustomFieldChange template) {
        SetShippingCustomFieldChangeImpl instance = new SetShippingCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setShippingKey(template.getShippingKey());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetShippingCustomFieldChange copyDeep();

    /**
     * factory method to create a deep copy of SetShippingCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetShippingCustomFieldChange deepCopy(@Nullable final SetShippingCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        SetShippingCustomFieldChangeImpl instance = new SetShippingCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setShippingKey(template.getShippingKey());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetShippingCustomFieldChange
     * @return builder
     */
    public static SetShippingCustomFieldChangeBuilder builder() {
        return SetShippingCustomFieldChangeBuilder.of();
    }

    /**
     * create builder for SetShippingCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingCustomFieldChangeBuilder builder(final SetShippingCustomFieldChange template) {
        return SetShippingCustomFieldChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetShippingCustomFieldChange(Function<SetShippingCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingCustomFieldChange>";
            }
        };
    }
}
