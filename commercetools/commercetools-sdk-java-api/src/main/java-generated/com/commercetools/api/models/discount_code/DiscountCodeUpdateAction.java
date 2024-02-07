
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeUpdateAction discountCodeUpdateAction = DiscountCodeUpdateAction.changeCartDiscountsBuilder()
 *             plusCartDiscounts(cartDiscountsBuilder -> cartDiscountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeChangeCartDiscountsActionImpl.class, name = DiscountCodeChangeCartDiscountsAction.CHANGE_CART_DISCOUNTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeChangeGroupsActionImpl.class, name = DiscountCodeChangeGroupsAction.CHANGE_GROUPS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeChangeIsActiveActionImpl.class, name = DiscountCodeChangeIsActiveAction.CHANGE_IS_ACTIVE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetCartPredicateActionImpl.class, name = DiscountCodeSetCartPredicateAction.SET_CART_PREDICATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetCustomFieldActionImpl.class, name = DiscountCodeSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetCustomTypeActionImpl.class, name = DiscountCodeSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetDescriptionActionImpl.class, name = DiscountCodeSetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetKeyActionImpl.class, name = DiscountCodeSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsActionImpl.class, name = DiscountCodeSetMaxApplicationsAction.SET_MAX_APPLICATIONS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsPerCustomerActionImpl.class, name = DiscountCodeSetMaxApplicationsPerCustomerAction.SET_MAX_APPLICATIONS_PER_CUSTOMER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetNameActionImpl.class, name = DiscountCodeSetNameAction.SET_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetValidFromActionImpl.class, name = DiscountCodeSetValidFromAction.SET_VALID_FROM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAndUntilActionImpl.class, name = DiscountCodeSetValidFromAndUntilAction.SET_VALID_FROM_AND_UNTIL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetValidUntilActionImpl.class, name = DiscountCodeSetValidUntilAction.SET_VALID_UNTIL) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = DiscountCodeUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = DiscountCodeUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface DiscountCodeUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<DiscountCodeUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * factory method to create a deep copy of DiscountCodeUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeUpdateAction deepCopy(@Nullable final DiscountCodeUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.discount_code.DiscountCodeChangeCartDiscountsAction) {
            return com.commercetools.api.models.discount_code.DiscountCodeChangeCartDiscountsAction.deepCopy(
                (com.commercetools.api.models.discount_code.DiscountCodeChangeCartDiscountsAction) template);
        }
        if (template instanceof com.commercetools.api.models.discount_code.DiscountCodeChangeGroupsAction) {
            return com.commercetools.api.models.discount_code.DiscountCodeChangeGroupsAction
                    .deepCopy((com.commercetools.api.models.discount_code.DiscountCodeChangeGroupsAction) template);
        }
        if (template instanceof com.commercetools.api.models.discount_code.DiscountCodeChangeIsActiveAction) {
            return com.commercetools.api.models.discount_code.DiscountCodeChangeIsActiveAction
                    .deepCopy((com.commercetools.api.models.discount_code.DiscountCodeChangeIsActiveAction) template);
        }
        if (template instanceof com.commercetools.api.models.discount_code.DiscountCodeSetCartPredicateAction) {
            return com.commercetools.api.models.discount_code.DiscountCodeSetCartPredicateAction
                    .deepCopy((com.commercetools.api.models.discount_code.DiscountCodeSetCartPredicateAction) template);
        }
        if (template instanceof com.commercetools.api.models.discount_code.DiscountCodeSetCustomFieldAction) {
            return com.commercetools.api.models.discount_code.DiscountCodeSetCustomFieldAction
                    .deepCopy((com.commercetools.api.models.discount_code.DiscountCodeSetCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.discount_code.DiscountCodeSetCustomTypeAction) {
            return com.commercetools.api.models.discount_code.DiscountCodeSetCustomTypeAction
                    .deepCopy((com.commercetools.api.models.discount_code.DiscountCodeSetCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.discount_code.DiscountCodeSetDescriptionAction) {
            return com.commercetools.api.models.discount_code.DiscountCodeSetDescriptionAction
                    .deepCopy((com.commercetools.api.models.discount_code.DiscountCodeSetDescriptionAction) template);
        }
        if (template instanceof com.commercetools.api.models.discount_code.DiscountCodeSetKeyAction) {
            return com.commercetools.api.models.discount_code.DiscountCodeSetKeyAction
                    .deepCopy((com.commercetools.api.models.discount_code.DiscountCodeSetKeyAction) template);
        }
        if (template instanceof com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsAction) {
            return com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsAction.deepCopy(
                (com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsAction) template);
        }
        if (template instanceof com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsPerCustomerAction) {
            return com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsPerCustomerAction.deepCopy(
                (com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsPerCustomerAction) template);
        }
        if (template instanceof com.commercetools.api.models.discount_code.DiscountCodeSetNameAction) {
            return com.commercetools.api.models.discount_code.DiscountCodeSetNameAction
                    .deepCopy((com.commercetools.api.models.discount_code.DiscountCodeSetNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAction) {
            return com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAction
                    .deepCopy((com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAction) template);
        }
        if (template instanceof com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAndUntilAction) {
            return com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAndUntilAction.deepCopy(
                (com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAndUntilAction) template);
        }
        if (template instanceof com.commercetools.api.models.discount_code.DiscountCodeSetValidUntilAction) {
            return com.commercetools.api.models.discount_code.DiscountCodeSetValidUntilAction
                    .deepCopy((com.commercetools.api.models.discount_code.DiscountCodeSetValidUntilAction) template);
        }
        DiscountCodeUpdateActionImpl instance = new DiscountCodeUpdateActionImpl();
        return instance;
    }

    /**
     * builder for changeCartDiscounts subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_code.DiscountCodeChangeCartDiscountsActionBuilder changeCartDiscountsBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeChangeCartDiscountsActionBuilder.of();
    }

    /**
     * builder for changeGroups subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_code.DiscountCodeChangeGroupsActionBuilder changeGroupsBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeChangeGroupsActionBuilder.of();
    }

    /**
     * builder for changeIsActive subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_code.DiscountCodeChangeIsActiveActionBuilder changeIsActiveBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeChangeIsActiveActionBuilder.of();
    }

    /**
     * builder for setCartPredicate subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_code.DiscountCodeSetCartPredicateActionBuilder setCartPredicateBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetCartPredicateActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_code.DiscountCodeSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_code.DiscountCodeSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_code.DiscountCodeSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetDescriptionActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_code.DiscountCodeSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetKeyActionBuilder.of();
    }

    /**
     * builder for setMaxApplications subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsActionBuilder setMaxApplicationsBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsActionBuilder.of();
    }

    /**
     * builder for setMaxApplicationsPerCustomer subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsPerCustomerActionBuilder setMaxApplicationsPerCustomerBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsPerCustomerActionBuilder.of();
    }

    /**
     * builder for setName subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_code.DiscountCodeSetNameActionBuilder setNameBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetNameActionBuilder.of();
    }

    /**
     * builder for setValidFrom subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_code.DiscountCodeSetValidFromActionBuilder setValidFromBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetValidFromActionBuilder.of();
    }

    /**
     * builder for setValidFromAndUntil subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAndUntilActionBuilder setValidFromAndUntilBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAndUntilActionBuilder.of();
    }

    /**
     * builder for setValidUntil subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_code.DiscountCodeSetValidUntilActionBuilder setValidUntilBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetValidUntilActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeUpdateAction(Function<DiscountCodeUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeUpdateAction>";
            }
        };
    }
}
