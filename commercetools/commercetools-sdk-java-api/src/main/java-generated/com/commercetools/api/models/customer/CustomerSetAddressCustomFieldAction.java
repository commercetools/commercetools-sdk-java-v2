
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Adding a Custom Field to an Address of a Customer generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerAddressCustomFieldAddedMessage" rel="nofollow">CustomerAddressCustomFieldAdded</a> Message, removing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerAddressCustomFieldRemovedMessage" rel="nofollow">CustomerAddressCustomFieldRemoved</a> Message, and updating an existing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerAddressCustomFieldChangedMessage" rel="nofollow">CustomerAddressCustomFieldChanged</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetAddressCustomFieldAction customerSetAddressCustomFieldAction = CustomerSetAddressCustomFieldAction.builder()
 *             .addressId("{addressId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAddressCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetAddressCustomFieldActionImpl.class)
public interface CustomerSetAddressCustomFieldAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetAddressCustomFieldAction
     */
    String SET_ADDRESS_CUSTOM_FIELD = "setAddressCustomField";

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to be updated.</p>
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
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to be updated.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of CustomerSetAddressCustomFieldAction
     */
    public static CustomerSetAddressCustomFieldAction of() {
        return new CustomerSetAddressCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerSetAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetAddressCustomFieldAction of(final CustomerSetAddressCustomFieldAction template) {
        CustomerSetAddressCustomFieldActionImpl instance = new CustomerSetAddressCustomFieldActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public CustomerSetAddressCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of CustomerSetAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetAddressCustomFieldAction deepCopy(
            @Nullable final CustomerSetAddressCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetAddressCustomFieldActionImpl instance = new CustomerSetAddressCustomFieldActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for CustomerSetAddressCustomFieldAction
     * @return builder
     */
    public static CustomerSetAddressCustomFieldActionBuilder builder() {
        return CustomerSetAddressCustomFieldActionBuilder.of();
    }

    /**
     * create builder for CustomerSetAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetAddressCustomFieldActionBuilder builder(
            final CustomerSetAddressCustomFieldAction template) {
        return CustomerSetAddressCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetAddressCustomFieldAction(Function<CustomerSetAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static CustomerSetAddressCustomFieldAction ofUnset(final String name) {
        return CustomerSetAddressCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetAddressCustomFieldAction>";
            }
        };
    }
}
