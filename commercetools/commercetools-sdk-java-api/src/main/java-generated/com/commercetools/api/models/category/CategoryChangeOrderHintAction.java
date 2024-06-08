
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CategoryChangeOrderHintAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryChangeOrderHintAction categoryChangeOrderHintAction = CategoryChangeOrderHintAction.builder()
 *             .orderHint("{orderHint}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryChangeOrderHintActionImpl.class)
public interface CategoryChangeOrderHintAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategoryChangeOrderHintAction
     */
    String CHANGE_ORDER_HINT = "changeOrderHint";

    /**
     *  <p>New value to set. Must be a decimal value between 0 and 1.</p>
     * @return orderHint
     */
    @NotNull
    @JsonProperty("orderHint")
    public String getOrderHint();

    /**
     *  <p>New value to set. Must be a decimal value between 0 and 1.</p>
     * @param orderHint value to be set
     */

    public void setOrderHint(final String orderHint);

    /**
     * factory method
     * @return instance of CategoryChangeOrderHintAction
     */
    public static CategoryChangeOrderHintAction of() {
        return new CategoryChangeOrderHintActionImpl();
    }

    /**
     * factory method to create a shallow copy CategoryChangeOrderHintAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryChangeOrderHintAction of(final CategoryChangeOrderHintAction template) {
        CategoryChangeOrderHintActionImpl instance = new CategoryChangeOrderHintActionImpl();
        instance.setOrderHint(template.getOrderHint());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategoryChangeOrderHintAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryChangeOrderHintAction deepCopy(@Nullable final CategoryChangeOrderHintAction template) {
        if (template == null) {
            return null;
        }
        CategoryChangeOrderHintActionImpl instance = new CategoryChangeOrderHintActionImpl();
        instance.setOrderHint(template.getOrderHint());
        return instance;
    }

    /**
     * builder factory method for CategoryChangeOrderHintAction
     * @return builder
     */
    public static CategoryChangeOrderHintActionBuilder builder() {
        return CategoryChangeOrderHintActionBuilder.of();
    }

    /**
     * create builder for CategoryChangeOrderHintAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryChangeOrderHintActionBuilder builder(final CategoryChangeOrderHintAction template) {
        return CategoryChangeOrderHintActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryChangeOrderHintAction(Function<CategoryChangeOrderHintAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryChangeOrderHintAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryChangeOrderHintAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryChangeOrderHintAction>";
            }
        };
    }
}
