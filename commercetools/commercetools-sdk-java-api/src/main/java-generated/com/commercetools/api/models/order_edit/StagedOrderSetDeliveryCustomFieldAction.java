
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
 * StagedOrderSetDeliveryCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDeliveryCustomFieldAction stagedOrderSetDeliveryCustomFieldAction = StagedOrderSetDeliveryCustomFieldAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetDeliveryCustomFieldActionImpl.class)
public interface StagedOrderSetDeliveryCustomFieldAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetDeliveryCustomFieldAction
     */
    String SET_DELIVERY_CUSTOM_FIELD = "setDeliveryCustomField";

    /**
     *
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     * set deliveryId
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of StagedOrderSetDeliveryCustomFieldAction
     */
    public static StagedOrderSetDeliveryCustomFieldAction of() {
        return new StagedOrderSetDeliveryCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetDeliveryCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetDeliveryCustomFieldAction of(final StagedOrderSetDeliveryCustomFieldAction template) {
        StagedOrderSetDeliveryCustomFieldActionImpl instance = new StagedOrderSetDeliveryCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetDeliveryCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetDeliveryCustomFieldAction deepCopy(
            @Nullable final StagedOrderSetDeliveryCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetDeliveryCustomFieldActionImpl instance = new StagedOrderSetDeliveryCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetDeliveryCustomFieldAction
     * @return builder
     */
    public static StagedOrderSetDeliveryCustomFieldActionBuilder builder() {
        return StagedOrderSetDeliveryCustomFieldActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetDeliveryCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetDeliveryCustomFieldActionBuilder builder(
            final StagedOrderSetDeliveryCustomFieldAction template) {
        return StagedOrderSetDeliveryCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetDeliveryCustomFieldAction(
            Function<StagedOrderSetDeliveryCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static StagedOrderSetDeliveryCustomFieldAction ofUnset(final String name, final String deliveryId) {
        return StagedOrderSetDeliveryCustomFieldActionBuilder.of().name(name).deliveryId(deliveryId).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetDeliveryCustomFieldAction>";
            }
        };
    }
}
