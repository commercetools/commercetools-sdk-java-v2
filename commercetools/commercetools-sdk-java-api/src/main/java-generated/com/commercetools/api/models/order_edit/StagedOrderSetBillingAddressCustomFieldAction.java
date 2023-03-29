
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
 * StagedOrderSetBillingAddressCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetBillingAddressCustomFieldAction stagedOrderSetBillingAddressCustomFieldAction = StagedOrderSetBillingAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetBillingAddressCustomFieldActionImpl.class)
public interface StagedOrderSetBillingAddressCustomFieldAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetBillingAddressCustomFieldAction
     */
    String SET_BILLING_ADDRESS_CUSTOM_FIELD = "setBillingAddressCustomField";

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
     * @return instance of StagedOrderSetBillingAddressCustomFieldAction
     */
    public static StagedOrderSetBillingAddressCustomFieldAction of() {
        return new StagedOrderSetBillingAddressCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetBillingAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetBillingAddressCustomFieldAction of(
            final StagedOrderSetBillingAddressCustomFieldAction template) {
        StagedOrderSetBillingAddressCustomFieldActionImpl instance = new StagedOrderSetBillingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetBillingAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetBillingAddressCustomFieldAction deepCopy(
            @Nullable final StagedOrderSetBillingAddressCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetBillingAddressCustomFieldActionImpl instance = new StagedOrderSetBillingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetBillingAddressCustomFieldAction
     * @return builder
     */
    public static StagedOrderSetBillingAddressCustomFieldActionBuilder builder() {
        return StagedOrderSetBillingAddressCustomFieldActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetBillingAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetBillingAddressCustomFieldActionBuilder builder(
            final StagedOrderSetBillingAddressCustomFieldAction template) {
        return StagedOrderSetBillingAddressCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetBillingAddressCustomFieldAction(
            Function<StagedOrderSetBillingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static StagedOrderSetBillingAddressCustomFieldAction ofUnset(final String name) {
        return StagedOrderSetBillingAddressCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetBillingAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetBillingAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetBillingAddressCustomFieldAction>";
            }
        };
    }
}
