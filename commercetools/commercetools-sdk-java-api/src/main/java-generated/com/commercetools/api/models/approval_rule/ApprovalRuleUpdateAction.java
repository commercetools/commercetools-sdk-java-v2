
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
 * ApprovalRuleUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleUpdateAction approvalRuleUpdateAction = ApprovalRuleUpdateAction.setApproversBuilder()
 *             approvers(approversBuilder -> approversBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ApprovalRuleUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ApprovalRuleUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ApprovalRuleUpdateAction {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public ApprovalRuleUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of ApprovalRuleUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleUpdateAction deepCopy(@Nullable final ApprovalRuleUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ApprovalRuleUpdateActionImpl)) {
            return template.copyDeep();
        }
        ApprovalRuleUpdateActionImpl instance = new ApprovalRuleUpdateActionImpl();
        return instance;
    }

    /**
     * builder for setApprovers subtype
     * @return builder
     */
    public static com.commercetools.api.models.approval_rule.ApprovalRuleSetApproversActionBuilder setApproversBuilder() {
        return com.commercetools.api.models.approval_rule.ApprovalRuleSetApproversActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.approval_rule.ApprovalRuleSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.approval_rule.ApprovalRuleSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.approval_rule.ApprovalRuleSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.approval_rule.ApprovalRuleSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.approval_rule.ApprovalRuleSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.approval_rule.ApprovalRuleSetDescriptionActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.approval_rule.ApprovalRuleSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.approval_rule.ApprovalRuleSetKeyActionBuilder.of();
    }

    /**
     * builder for setName subtype
     * @return builder
     */
    public static com.commercetools.api.models.approval_rule.ApprovalRuleSetNameActionBuilder setNameBuilder() {
        return com.commercetools.api.models.approval_rule.ApprovalRuleSetNameActionBuilder.of();
    }

    /**
     * builder for setPredicate subtype
     * @return builder
     */
    public static com.commercetools.api.models.approval_rule.ApprovalRuleSetPredicateActionBuilder setPredicateBuilder() {
        return com.commercetools.api.models.approval_rule.ApprovalRuleSetPredicateActionBuilder.of();
    }

    /**
     * builder for setRequesters subtype
     * @return builder
     */
    public static com.commercetools.api.models.approval_rule.ApprovalRuleSetRequestersActionBuilder setRequestersBuilder() {
        return com.commercetools.api.models.approval_rule.ApprovalRuleSetRequestersActionBuilder.of();
    }

    /**
     * builder for setStatus subtype
     * @return builder
     */
    public static com.commercetools.api.models.approval_rule.ApprovalRuleSetStatusActionBuilder setStatusBuilder() {
        return com.commercetools.api.models.approval_rule.ApprovalRuleSetStatusActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleUpdateAction(Function<ApprovalRuleUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleUpdateAction>";
            }
        };
    }
}
