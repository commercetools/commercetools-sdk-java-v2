
package com.commercetools.api.models.approval_rule;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the key for an Approval Rule generates an ApprovalRuleKeySet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleSetKeyAction approvalRuleSetKeyAction = ApprovalRuleSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleSetKeyActionImpl.class)
public interface ApprovalRuleSetKeyAction extends ApprovalRuleUpdateAction {

    /**
     * discriminator value for ApprovalRuleSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. Must be unique within a Business Unit. If empty, any existing value will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Value to set. Must be unique within a Business Unit. If empty, any existing value will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ApprovalRuleSetKeyAction
     */
    public static ApprovalRuleSetKeyAction of() {
        return new ApprovalRuleSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleSetKeyAction of(final ApprovalRuleSetKeyAction template) {
        ApprovalRuleSetKeyActionImpl instance = new ApprovalRuleSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ApprovalRuleSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleSetKeyAction deepCopy(@Nullable final ApprovalRuleSetKeyAction template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleSetKeyActionImpl instance = new ApprovalRuleSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleSetKeyAction
     * @return builder
     */
    public static ApprovalRuleSetKeyActionBuilder builder() {
        return ApprovalRuleSetKeyActionBuilder.of();
    }

    /**
     * create builder for ApprovalRuleSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleSetKeyActionBuilder builder(final ApprovalRuleSetKeyAction template) {
        return ApprovalRuleSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleSetKeyAction(Function<ApprovalRuleSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleSetKeyAction>";
            }
        };
    }
}
