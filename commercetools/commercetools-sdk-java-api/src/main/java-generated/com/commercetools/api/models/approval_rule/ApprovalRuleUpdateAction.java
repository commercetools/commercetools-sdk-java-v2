
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
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.approval_rule.ApprovalRuleSetApproversActionImpl.class, name = ApprovalRuleSetApproversAction.SET_APPROVERS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.approval_rule.ApprovalRuleSetDescriptionActionImpl.class, name = ApprovalRuleSetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.approval_rule.ApprovalRuleSetKeyActionImpl.class, name = ApprovalRuleSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.approval_rule.ApprovalRuleSetNameActionImpl.class, name = ApprovalRuleSetNameAction.SET_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.approval_rule.ApprovalRuleSetPredicateActionImpl.class, name = ApprovalRuleSetPredicateAction.SET_PREDICATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.approval_rule.ApprovalRuleSetRequestersActionImpl.class, name = ApprovalRuleSetRequestersAction.SET_REQUESTERS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.approval_rule.ApprovalRuleSetStatusActionImpl.class, name = ApprovalRuleSetStatusAction.SET_STATUS) })
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
        if (template instanceof com.commercetools.api.models.approval_rule.ApprovalRuleSetApproversAction) {
            return com.commercetools.api.models.approval_rule.ApprovalRuleSetApproversAction
                    .deepCopy((com.commercetools.api.models.approval_rule.ApprovalRuleSetApproversAction) template);
        }
        if (template instanceof com.commercetools.api.models.approval_rule.ApprovalRuleSetDescriptionAction) {
            return com.commercetools.api.models.approval_rule.ApprovalRuleSetDescriptionAction
                    .deepCopy((com.commercetools.api.models.approval_rule.ApprovalRuleSetDescriptionAction) template);
        }
        if (template instanceof com.commercetools.api.models.approval_rule.ApprovalRuleSetKeyAction) {
            return com.commercetools.api.models.approval_rule.ApprovalRuleSetKeyAction
                    .deepCopy((com.commercetools.api.models.approval_rule.ApprovalRuleSetKeyAction) template);
        }
        if (template instanceof com.commercetools.api.models.approval_rule.ApprovalRuleSetNameAction) {
            return com.commercetools.api.models.approval_rule.ApprovalRuleSetNameAction
                    .deepCopy((com.commercetools.api.models.approval_rule.ApprovalRuleSetNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.approval_rule.ApprovalRuleSetPredicateAction) {
            return com.commercetools.api.models.approval_rule.ApprovalRuleSetPredicateAction
                    .deepCopy((com.commercetools.api.models.approval_rule.ApprovalRuleSetPredicateAction) template);
        }
        if (template instanceof com.commercetools.api.models.approval_rule.ApprovalRuleSetRequestersAction) {
            return com.commercetools.api.models.approval_rule.ApprovalRuleSetRequestersAction
                    .deepCopy((com.commercetools.api.models.approval_rule.ApprovalRuleSetRequestersAction) template);
        }
        if (template instanceof com.commercetools.api.models.approval_rule.ApprovalRuleSetStatusAction) {
            return com.commercetools.api.models.approval_rule.ApprovalRuleSetStatusAction
                    .deepCopy((com.commercetools.api.models.approval_rule.ApprovalRuleSetStatusAction) template);
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
