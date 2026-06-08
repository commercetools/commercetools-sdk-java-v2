
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
 *  <p>Setting the sort order generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSortOrderSetMessage" rel="nofollow">DiscountGroupSortOrderSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupSetSortOrderAction discountGroupSetSortOrderAction = DiscountGroupSetSortOrderAction.builder()
 *             .sortOrder("{sortOrder}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setSortOrder")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupSetSortOrderActionImpl.class)
public interface DiscountGroupSetSortOrderAction extends DiscountGroupUpdateAction {

    /**
     * discriminator value for DiscountGroupSetSortOrderAction
     */
    String SET_SORT_ORDER = "setSortOrder";

    /**
     *  <p>New value to set (between <code>0</code> and <code>1</code>). A CartDiscount with a higher value will be prioritized.</p>
     *  <p>The sort order must be unique among all DiscountGroups and CartDiscounts.</p>
     * @return sortOrder
     */
    @NotNull
    @JsonProperty("sortOrder")
    public String getSortOrder();

    /**
     *  <p>New value to set (between <code>0</code> and <code>1</code>). A CartDiscount with a higher value will be prioritized.</p>
     *  <p>The sort order must be unique among all DiscountGroups and CartDiscounts.</p>
     * @param sortOrder value to be set
     */

    public void setSortOrder(final String sortOrder);

    /**
     * factory method
     * @return instance of DiscountGroupSetSortOrderAction
     */
    public static DiscountGroupSetSortOrderAction of() {
        return new DiscountGroupSetSortOrderActionImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupSetSortOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupSetSortOrderAction of(final DiscountGroupSetSortOrderAction template) {
        DiscountGroupSetSortOrderActionImpl instance = new DiscountGroupSetSortOrderActionImpl();
        instance.setSortOrder(template.getSortOrder());
        return instance;
    }

    public DiscountGroupSetSortOrderAction copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupSetSortOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupSetSortOrderAction deepCopy(@Nullable final DiscountGroupSetSortOrderAction template) {
        if (template == null) {
            return null;
        }
        DiscountGroupSetSortOrderActionImpl instance = new DiscountGroupSetSortOrderActionImpl();
        instance.setSortOrder(template.getSortOrder());
        return instance;
    }

    /**
     * builder factory method for DiscountGroupSetSortOrderAction
     * @return builder
     */
    public static DiscountGroupSetSortOrderActionBuilder builder() {
        return DiscountGroupSetSortOrderActionBuilder.of();
    }

    /**
     * create builder for DiscountGroupSetSortOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupSetSortOrderActionBuilder builder(final DiscountGroupSetSortOrderAction template) {
        return DiscountGroupSetSortOrderActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupSetSortOrderAction(Function<DiscountGroupSetSortOrderAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupSetSortOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupSetSortOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupSetSortOrderAction>";
            }
        };
    }
}
