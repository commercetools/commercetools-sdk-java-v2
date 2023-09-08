
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adding a Custom Field to an Address of a Business Unit generates the BusinessUnitAddressCustomFieldAdded Message, removing one generates the BusinessUnitAddressCustomFieldRemoved Message, and updating an existing one generates the BusinessUnitAddressCustomFieldChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitSetAddressCustomFieldAction myBusinessUnitSetAddressCustomFieldAction = MyBusinessUnitSetAddressCustomFieldAction.builder()
 *             .addressId("{addressId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitSetAddressCustomFieldActionImpl.class)
public interface MyBusinessUnitSetAddressCustomFieldAction extends MyBusinessUnitUpdateAction {

    /**
     * discriminator value for MyBusinessUnitSetAddressCustomFieldAction
     */
    String SET_ADDRESS_CUSTOM_FIELD = "setAddressCustomField";

    /**
     *  <p>ID of the <code>address</code> to be extended.</p>
     * @return addressId
     */
    @NotNull
    @JsonProperty("addressId")
    public String getAddressId();

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
     *  <p>ID of the <code>address</code> to be extended.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

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
     * @return instance of MyBusinessUnitSetAddressCustomFieldAction
     */
    public static MyBusinessUnitSetAddressCustomFieldAction of() {
        return new MyBusinessUnitSetAddressCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy MyBusinessUnitSetAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitSetAddressCustomFieldAction of(
            final MyBusinessUnitSetAddressCustomFieldAction template) {
        MyBusinessUnitSetAddressCustomFieldActionImpl instance = new MyBusinessUnitSetAddressCustomFieldActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyBusinessUnitSetAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitSetAddressCustomFieldAction deepCopy(
            @Nullable final MyBusinessUnitSetAddressCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        MyBusinessUnitSetAddressCustomFieldActionImpl instance = new MyBusinessUnitSetAddressCustomFieldActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitSetAddressCustomFieldAction
     * @return builder
     */
    public static MyBusinessUnitSetAddressCustomFieldActionBuilder builder() {
        return MyBusinessUnitSetAddressCustomFieldActionBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitSetAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitSetAddressCustomFieldActionBuilder builder(
            final MyBusinessUnitSetAddressCustomFieldAction template) {
        return MyBusinessUnitSetAddressCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitSetAddressCustomFieldAction(
            Function<MyBusinessUnitSetAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitSetAddressCustomFieldAction>";
            }
        };
    }
}
