
package com.commercetools.api.models.approval_flow;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalFlowSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowSetCustomFieldAction approvalFlowSetCustomFieldAction = ApprovalFlowSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalFlowSetCustomFieldActionImpl.class)
public interface ApprovalFlowSetCustomFieldAction extends ApprovalFlowUpdateAction {

    /**
     * discriminator value for ApprovalFlowSetCustomFieldAction
     */
    String SET_CUSTOM_FIELD = "setCustomField";

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

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of ApprovalFlowSetCustomFieldAction
     */
    public static ApprovalFlowSetCustomFieldAction of() {
        return new ApprovalFlowSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalFlowSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalFlowSetCustomFieldAction of(final ApprovalFlowSetCustomFieldAction template) {
        ApprovalFlowSetCustomFieldActionImpl instance = new ApprovalFlowSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ApprovalFlowSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalFlowSetCustomFieldAction deepCopy(@Nullable final ApprovalFlowSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        ApprovalFlowSetCustomFieldActionImpl instance = new ApprovalFlowSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for ApprovalFlowSetCustomFieldAction
     * @return builder
     */
    public static ApprovalFlowSetCustomFieldActionBuilder builder() {
        return ApprovalFlowSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for ApprovalFlowSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowSetCustomFieldActionBuilder builder(final ApprovalFlowSetCustomFieldAction template) {
        return ApprovalFlowSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalFlowSetCustomFieldAction(Function<ApprovalFlowSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalFlowSetCustomFieldAction>";
            }
        };
    }
}
