
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetAddressCustomFieldAction
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetAddressCustomFieldActionImpl.class)
public interface CustomerSetAddressCustomFieldAction extends CustomerUpdateAction {

    String SET_ADDRESS_CUSTOM_FIELD = "setAddressCustomField";

    /**
     *  <p>User-defined unique identifier of the Address to be updated.</p>
     */
    @NotNull
    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Name of the Custom Field.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an InvalidOperation error.</p>
     */

    @JsonProperty("value")
    public Object getValue();

    public void setAddressId(final String addressId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static CustomerSetAddressCustomFieldAction of() {
        return new CustomerSetAddressCustomFieldActionImpl();
    }

    public static CustomerSetAddressCustomFieldAction of(final CustomerSetAddressCustomFieldAction template) {
        CustomerSetAddressCustomFieldActionImpl instance = new CustomerSetAddressCustomFieldActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CustomerSetAddressCustomFieldActionBuilder builder() {
        return CustomerSetAddressCustomFieldActionBuilder.of();
    }

    public static CustomerSetAddressCustomFieldActionBuilder builder(
            final CustomerSetAddressCustomFieldAction template) {
        return CustomerSetAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withCustomerSetAddressCustomFieldAction(Function<CustomerSetAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetAddressCustomFieldAction>";
            }
        };
    }
}
