
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
 * StagedOrderSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomFieldAction stagedOrderSetCustomFieldAction = StagedOrderSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomFieldActionImpl.class)
public interface StagedOrderSetCustomFieldAction extends StagedOrderUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    /**
     *  <p>Name of the Custom Field.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static StagedOrderSetCustomFieldAction of() {
        return new StagedOrderSetCustomFieldActionImpl();
    }

    public static StagedOrderSetCustomFieldAction of(final StagedOrderSetCustomFieldAction template) {
        StagedOrderSetCustomFieldActionImpl instance = new StagedOrderSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static StagedOrderSetCustomFieldActionBuilder builder() {
        return StagedOrderSetCustomFieldActionBuilder.of();
    }

    public static StagedOrderSetCustomFieldActionBuilder builder(final StagedOrderSetCustomFieldAction template) {
        return StagedOrderSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetCustomFieldAction(Function<StagedOrderSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static StagedOrderSetCustomFieldAction ofUnset(final String name) {
        return StagedOrderSetCustomFieldActionBuilder.of().name(name).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCustomFieldAction>";
            }
        };
    }
}
