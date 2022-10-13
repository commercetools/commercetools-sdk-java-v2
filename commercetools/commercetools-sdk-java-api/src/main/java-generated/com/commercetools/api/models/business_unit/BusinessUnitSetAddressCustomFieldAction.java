
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

    String SET_ADDRESS_CUSTOM_FIELD = "setAddressCustomField";

    /**
     *  <p>ID of the address to be extended.</p>
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
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    @JsonProperty("value")
    public Object getValue();

    public void setAddressId(final String addressId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static BusinessUnitSetAddressCustomFieldAction of() {
        return new BusinessUnitSetAddressCustomFieldActionImpl();
    }

    public static BusinessUnitSetAddressCustomFieldAction of(final BusinessUnitSetAddressCustomFieldAction template) {
        BusinessUnitSetAddressCustomFieldActionImpl instance = new BusinessUnitSetAddressCustomFieldActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static BusinessUnitSetAddressCustomFieldActionBuilder builder() {
        return BusinessUnitSetAddressCustomFieldActionBuilder.of();
    }

    public static BusinessUnitSetAddressCustomFieldActionBuilder builder(
            final BusinessUnitSetAddressCustomFieldAction template) {
        return BusinessUnitSetAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withBusinessUnitSetAddressCustomFieldAction(
            Function<BusinessUnitSetAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetAddressCustomFieldAction>";
            }
        };
    }
}
