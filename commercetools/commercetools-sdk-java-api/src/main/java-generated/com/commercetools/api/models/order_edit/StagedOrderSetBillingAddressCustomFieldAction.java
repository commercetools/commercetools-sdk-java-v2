
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    public void setName(final String name);

    public void setValue(final Object value);

    public static StagedOrderSetBillingAddressCustomFieldAction of() {
        return new StagedOrderSetBillingAddressCustomFieldActionImpl();
    }

    public static StagedOrderSetBillingAddressCustomFieldAction of(
            final StagedOrderSetBillingAddressCustomFieldAction template) {
        StagedOrderSetBillingAddressCustomFieldActionImpl instance = new StagedOrderSetBillingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static StagedOrderSetBillingAddressCustomFieldActionBuilder builder() {
        return StagedOrderSetBillingAddressCustomFieldActionBuilder.of();
    }

    public static StagedOrderSetBillingAddressCustomFieldActionBuilder builder(
            final StagedOrderSetBillingAddressCustomFieldAction template) {
        return StagedOrderSetBillingAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetBillingAddressCustomFieldAction(
            Function<StagedOrderSetBillingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static StagedOrderSetBillingAddressCustomFieldAction ofUnset(final String name) {
        return StagedOrderSetBillingAddressCustomFieldActionBuilder.of().name(name).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetBillingAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetBillingAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetBillingAddressCustomFieldAction>";
            }
        };
    }
}
