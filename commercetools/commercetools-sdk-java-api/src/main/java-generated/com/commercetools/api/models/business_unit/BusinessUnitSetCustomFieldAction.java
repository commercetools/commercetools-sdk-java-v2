
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetCustomFieldAction businessUnitSetCustomFieldAction = BusinessUnitSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetCustomFieldActionImpl.class)
public interface BusinessUnitSetCustomFieldAction extends BusinessUnitUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

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

    public void setName(final String name);

    public void setValue(final Object value);

    public static BusinessUnitSetCustomFieldAction of() {
        return new BusinessUnitSetCustomFieldActionImpl();
    }

    public static BusinessUnitSetCustomFieldAction of(final BusinessUnitSetCustomFieldAction template) {
        BusinessUnitSetCustomFieldActionImpl instance = new BusinessUnitSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static BusinessUnitSetCustomFieldActionBuilder builder() {
        return BusinessUnitSetCustomFieldActionBuilder.of();
    }

    public static BusinessUnitSetCustomFieldActionBuilder builder(final BusinessUnitSetCustomFieldAction template) {
        return BusinessUnitSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withBusinessUnitSetCustomFieldAction(Function<BusinessUnitSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static BusinessUnitSetCustomFieldAction ofUnset(final String name) {
        return BusinessUnitSetCustomFieldActionBuilder.of().name(name).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetCustomFieldAction>";
            }
        };
    }
}
