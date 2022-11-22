
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
 * StagedOrderSetReturnItemCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetReturnItemCustomFieldAction stagedOrderSetReturnItemCustomFieldAction = StagedOrderSetReturnItemCustomFieldAction.builder()
 *             .returnItemId("{returnItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetReturnItemCustomFieldActionImpl.class)
public interface StagedOrderSetReturnItemCustomFieldAction extends StagedOrderUpdateAction {

    String SET_RETURN_ITEM_CUSTOM_FIELD = "setReturnItemCustomField";

    /**
     *
     */
    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();

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

    public void setReturnItemId(final String returnItemId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static StagedOrderSetReturnItemCustomFieldAction of() {
        return new StagedOrderSetReturnItemCustomFieldActionImpl();
    }

    public static StagedOrderSetReturnItemCustomFieldAction of(
            final StagedOrderSetReturnItemCustomFieldAction template) {
        StagedOrderSetReturnItemCustomFieldActionImpl instance = new StagedOrderSetReturnItemCustomFieldActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static StagedOrderSetReturnItemCustomFieldActionBuilder builder() {
        return StagedOrderSetReturnItemCustomFieldActionBuilder.of();
    }

    public static StagedOrderSetReturnItemCustomFieldActionBuilder builder(
            final StagedOrderSetReturnItemCustomFieldAction template) {
        return StagedOrderSetReturnItemCustomFieldActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetReturnItemCustomFieldAction(
            Function<StagedOrderSetReturnItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetReturnItemCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetReturnItemCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetReturnItemCustomFieldAction>";
            }
        };
    }
}
