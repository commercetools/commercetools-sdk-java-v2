
package com.commercetools.api.models.approval_rule;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ApprovalRuleSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleSetCustomFieldAction approvalRuleSetCustomFieldAction = ApprovalRuleSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleSetCustomFieldActionImpl.class)
public interface ApprovalRuleSetCustomFieldAction extends ApprovalRuleUpdateAction {

    /**
     * discriminator value for ApprovalRuleSetCustomFieldAction
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
     * @return instance of ApprovalRuleSetCustomFieldAction
     */
    public static ApprovalRuleSetCustomFieldAction of() {
        return new ApprovalRuleSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleSetCustomFieldAction of(final ApprovalRuleSetCustomFieldAction template) {
        ApprovalRuleSetCustomFieldActionImpl instance = new ApprovalRuleSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ApprovalRuleSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleSetCustomFieldAction deepCopy(@Nullable final ApprovalRuleSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleSetCustomFieldActionImpl instance = new ApprovalRuleSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleSetCustomFieldAction
     * @return builder
     */
    public static ApprovalRuleSetCustomFieldActionBuilder builder() {
        return ApprovalRuleSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for ApprovalRuleSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleSetCustomFieldActionBuilder builder(final ApprovalRuleSetCustomFieldAction template) {
        return ApprovalRuleSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleSetCustomFieldAction(Function<ApprovalRuleSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleSetCustomFieldAction>";
            }
        };
    }
}
