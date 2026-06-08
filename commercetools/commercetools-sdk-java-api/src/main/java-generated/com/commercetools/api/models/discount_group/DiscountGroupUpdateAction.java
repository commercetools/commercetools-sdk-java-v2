
package com.commercetools.api.models.discount_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * DiscountGroupUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupUpdateAction discountGroupUpdateAction = DiscountGroupUpdateAction.setDescriptionBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = DiscountGroupUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = DiscountGroupUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface DiscountGroupUpdateAction {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public DiscountGroupUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupUpdateAction deepCopy(@Nullable final DiscountGroupUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof DiscountGroupUpdateActionImpl)) {
            return template.copyDeep();
        }
        DiscountGroupUpdateActionImpl instance = new DiscountGroupUpdateActionImpl();
        return instance;
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_group.DiscountGroupSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.discount_group.DiscountGroupSetDescriptionActionBuilder.of();
    }

    /**
     * builder for setIsActive subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_group.DiscountGroupSetIsActiveActionBuilder setIsActiveBuilder() {
        return com.commercetools.api.models.discount_group.DiscountGroupSetIsActiveActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_group.DiscountGroupSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.discount_group.DiscountGroupSetKeyActionBuilder.of();
    }

    /**
     * builder for setName subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_group.DiscountGroupSetNameActionBuilder setNameBuilder() {
        return com.commercetools.api.models.discount_group.DiscountGroupSetNameActionBuilder.of();
    }

    /**
     * builder for setSortOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_group.DiscountGroupSetSortOrderActionBuilder setSortOrderBuilder() {
        return com.commercetools.api.models.discount_group.DiscountGroupSetSortOrderActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupUpdateAction(Function<DiscountGroupUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupUpdateAction>";
            }
        };
    }
}
