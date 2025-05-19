
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
 *  <p>Setting the name for an Approval Rule generates an ApprovalRuleNameSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleSetNameAction approvalRuleSetNameAction = ApprovalRuleSetNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleSetNameActionImpl.class)
public interface ApprovalRuleSetNameAction extends ApprovalRuleUpdateAction {

    /**
     * discriminator value for ApprovalRuleSetNameAction
     */
    String SET_NAME = "setName";

    /**
     *  <p>New name to set for the Approval Rule.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>New name to set for the Approval Rule.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of ApprovalRuleSetNameAction
     */
    public static ApprovalRuleSetNameAction of() {
        return new ApprovalRuleSetNameActionImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleSetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleSetNameAction of(final ApprovalRuleSetNameAction template) {
        ApprovalRuleSetNameActionImpl instance = new ApprovalRuleSetNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public ApprovalRuleSetNameAction copyDeep();

    /**
     * factory method to create a deep copy of ApprovalRuleSetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleSetNameAction deepCopy(@Nullable final ApprovalRuleSetNameAction template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleSetNameActionImpl instance = new ApprovalRuleSetNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleSetNameAction
     * @return builder
     */
    public static ApprovalRuleSetNameActionBuilder builder() {
        return ApprovalRuleSetNameActionBuilder.of();
    }

    /**
     * create builder for ApprovalRuleSetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleSetNameActionBuilder builder(final ApprovalRuleSetNameAction template) {
        return ApprovalRuleSetNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleSetNameAction(Function<ApprovalRuleSetNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleSetNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleSetNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleSetNameAction>";
            }
        };
    }
}
