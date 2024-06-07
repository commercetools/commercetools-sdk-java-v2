
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetShippingCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingCustomFieldAction stagedOrderSetShippingCustomFieldAction = StagedOrderSetShippingCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetShippingCustomFieldActionImpl.class)
public interface StagedOrderSetShippingCustomFieldAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetShippingCustomFieldAction
     */
    String SET_SHIPPING_CUSTOM_FIELD = "setShippingCustomField";

    /**
     *  <p>The <code>shippingKey</code> of the Shipping to customize. Used to specify which Shipping Method to customize on a Order with <code>Multiple</code> ShippingMode. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Order.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>The <code>shippingKey</code> of the Shipping to customize. Used to specify which Shipping Method to customize on a Order with <code>Multiple</code> ShippingMode. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Order.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of StagedOrderSetShippingCustomFieldAction
     */
    public static StagedOrderSetShippingCustomFieldAction of() {
        return new StagedOrderSetShippingCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetShippingCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetShippingCustomFieldAction of(final StagedOrderSetShippingCustomFieldAction template) {
        StagedOrderSetShippingCustomFieldActionImpl instance = new StagedOrderSetShippingCustomFieldActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetShippingCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetShippingCustomFieldAction deepCopy(
            @Nullable final StagedOrderSetShippingCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetShippingCustomFieldActionImpl instance = new StagedOrderSetShippingCustomFieldActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetShippingCustomFieldAction
     * @return builder
     */
    public static StagedOrderSetShippingCustomFieldActionBuilder builder() {
        return StagedOrderSetShippingCustomFieldActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetShippingCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingCustomFieldActionBuilder builder(
            final StagedOrderSetShippingCustomFieldAction template) {
        return StagedOrderSetShippingCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetShippingCustomFieldAction(
            Function<StagedOrderSetShippingCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetShippingCustomFieldAction>";
            }
        };
    }
}
