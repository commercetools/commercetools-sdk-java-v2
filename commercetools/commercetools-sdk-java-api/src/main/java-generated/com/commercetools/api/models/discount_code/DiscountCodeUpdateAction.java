
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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

    public DiscountCodeUpdateAction copyDeep();

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

        if (!(template instanceof DiscountCodeUpdateActionImpl)) {
            return template.copyDeep();
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
