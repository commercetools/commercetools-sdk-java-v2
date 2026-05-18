
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethodSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetCustomFieldChange shippingMethodSetCustomFieldChange = ShippingMethodSetCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShippingMethodSetCustomFieldChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetCustomFieldChangeImpl.class)
public interface ShippingMethodSetCustomFieldChange extends Change {

    /**
     * discriminator value for ShippingMethodSetCustomFieldChange
     */
    String SHIPPING_METHOD_SET_CUSTOM_FIELD_CHANGE = "ShippingMethodSetCustomFieldChange";

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
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Field</a>.</p>
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
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Field</a>.</p>
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
     * @return instance of ShippingMethodSetCustomFieldChange
     */
    public static ShippingMethodSetCustomFieldChange of() {
        return new ShippingMethodSetCustomFieldChangeImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodSetCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodSetCustomFieldChange of(final ShippingMethodSetCustomFieldChange template) {
        ShippingMethodSetCustomFieldChangeImpl instance = new ShippingMethodSetCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ShippingMethodSetCustomFieldChange copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodSetCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodSetCustomFieldChange deepCopy(
            @Nullable final ShippingMethodSetCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        ShippingMethodSetCustomFieldChangeImpl instance = new ShippingMethodSetCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodSetCustomFieldChange
     * @return builder
     */
    public static ShippingMethodSetCustomFieldChangeBuilder builder() {
        return ShippingMethodSetCustomFieldChangeBuilder.of();
    }

    /**
     * create builder for ShippingMethodSetCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetCustomFieldChangeBuilder builder(final ShippingMethodSetCustomFieldChange template) {
        return ShippingMethodSetCustomFieldChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodSetCustomFieldChange(Function<ShippingMethodSetCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetCustomFieldChange>";
            }
        };
    }
}
