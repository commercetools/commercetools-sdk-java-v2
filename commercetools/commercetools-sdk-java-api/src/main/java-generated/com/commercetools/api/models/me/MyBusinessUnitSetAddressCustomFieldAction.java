
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitSetAddressCustomFieldAction
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

    String SET_ADDRESS_CUSTOM_FIELD = "setAddressCustomField";

    /**
     *  <p>ID of the <code>address</code> to be extended.</p>
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

    public static MyBusinessUnitSetAddressCustomFieldAction of() {
        return new MyBusinessUnitSetAddressCustomFieldActionImpl();
    }

    public static MyBusinessUnitSetAddressCustomFieldAction of(
            final MyBusinessUnitSetAddressCustomFieldAction template) {
        MyBusinessUnitSetAddressCustomFieldActionImpl instance = new MyBusinessUnitSetAddressCustomFieldActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static MyBusinessUnitSetAddressCustomFieldActionBuilder builder() {
        return MyBusinessUnitSetAddressCustomFieldActionBuilder.of();
    }

    public static MyBusinessUnitSetAddressCustomFieldActionBuilder builder(
            final MyBusinessUnitSetAddressCustomFieldAction template) {
        return MyBusinessUnitSetAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withMyBusinessUnitSetAddressCustomFieldAction(
            Function<MyBusinessUnitSetAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitSetAddressCustomFieldAction>";
            }
        };
    }
}
