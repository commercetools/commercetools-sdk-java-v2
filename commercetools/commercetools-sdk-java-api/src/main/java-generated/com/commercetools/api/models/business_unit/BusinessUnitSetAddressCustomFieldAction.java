
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitSetAddressCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetAddressCustomFieldAction businessUnitSetAddressCustomFieldAction = BusinessUnitSetAddressCustomFieldAction.builder()
 *             .addressId("{addressId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetAddressCustomFieldActionImpl.class)
public interface BusinessUnitSetAddressCustomFieldAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitSetAddressCustomFieldAction
     */
    String SET_ADDRESS_CUSTOM_FIELD = "setAddressCustomField";

    /**
     *  <p>ID of the address to be extended.</p>
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
     *  <p>ID of the address to be extended.</p>
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
     * @return instance of BusinessUnitSetAddressCustomFieldAction
     */
    public static BusinessUnitSetAddressCustomFieldAction of() {
        return new BusinessUnitSetAddressCustomFieldActionImpl();
    }

    /**
     * factory method to copy an instance of BusinessUnitSetAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitSetAddressCustomFieldAction of(final BusinessUnitSetAddressCustomFieldAction template) {
        BusinessUnitSetAddressCustomFieldActionImpl instance = new BusinessUnitSetAddressCustomFieldActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitSetAddressCustomFieldAction
     * @return builder
     */
    public static BusinessUnitSetAddressCustomFieldActionBuilder builder() {
        return BusinessUnitSetAddressCustomFieldActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitSetAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSetAddressCustomFieldActionBuilder builder(
            final BusinessUnitSetAddressCustomFieldAction template) {
        return BusinessUnitSetAddressCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitSetAddressCustomFieldAction(
            Function<BusinessUnitSetAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static BusinessUnitSetAddressCustomFieldAction ofUnset(final String name) {
        return BusinessUnitSetAddressCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetAddressCustomFieldAction>";
            }
        };
    }
}
