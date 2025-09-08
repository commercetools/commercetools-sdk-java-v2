
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetSortOrderAction" rel="nofollow">Set SortOrder</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupSortOrderSetMessagePayload discountGroupSortOrderSetMessagePayload = DiscountGroupSortOrderSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DiscountGroupSortOrderSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupSortOrderSetMessagePayloadImpl.class)
public interface DiscountGroupSortOrderSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for DiscountGroupSortOrderSetMessagePayload
     */
    String DISCOUNT_GROUP_SORT_ORDER_SET = "DiscountGroupSortOrderSet";

    /**
     *  <p><code>sortOrder</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetSortOrderAction" rel="nofollow">Set SortOrder</a> update action.</p>
     * @return sortOrder
     */

    @JsonProperty("sortOrder")
    public String getSortOrder();

    /**
     *  <p><code>sortOrder</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetSortOrderAction" rel="nofollow">Set SortOrder</a> update action.</p>
     * @return oldSortOrder
     */

    @JsonProperty("oldSortOrder")
    public String getOldSortOrder();

    /**
     *  <p><code>sortOrder</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetSortOrderAction" rel="nofollow">Set SortOrder</a> update action.</p>
     * @param sortOrder value to be set
     */

    public void setSortOrder(final String sortOrder);

    /**
     *  <p><code>sortOrder</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetSortOrderAction" rel="nofollow">Set SortOrder</a> update action.</p>
     * @param oldSortOrder value to be set
     */

    public void setOldSortOrder(final String oldSortOrder);

    /**
     * factory method
     * @return instance of DiscountGroupSortOrderSetMessagePayload
     */
    public static DiscountGroupSortOrderSetMessagePayload of() {
        return new DiscountGroupSortOrderSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupSortOrderSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupSortOrderSetMessagePayload of(final DiscountGroupSortOrderSetMessagePayload template) {
        DiscountGroupSortOrderSetMessagePayloadImpl instance = new DiscountGroupSortOrderSetMessagePayloadImpl();
        instance.setSortOrder(template.getSortOrder());
        instance.setOldSortOrder(template.getOldSortOrder());
        return instance;
    }

    public DiscountGroupSortOrderSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupSortOrderSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupSortOrderSetMessagePayload deepCopy(
            @Nullable final DiscountGroupSortOrderSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        DiscountGroupSortOrderSetMessagePayloadImpl instance = new DiscountGroupSortOrderSetMessagePayloadImpl();
        instance.setSortOrder(template.getSortOrder());
        instance.setOldSortOrder(template.getOldSortOrder());
        return instance;
    }

    /**
     * builder factory method for DiscountGroupSortOrderSetMessagePayload
     * @return builder
     */
    public static DiscountGroupSortOrderSetMessagePayloadBuilder builder() {
        return DiscountGroupSortOrderSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for DiscountGroupSortOrderSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupSortOrderSetMessagePayloadBuilder builder(
            final DiscountGroupSortOrderSetMessagePayload template) {
        return DiscountGroupSortOrderSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupSortOrderSetMessagePayload(
            Function<DiscountGroupSortOrderSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupSortOrderSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupSortOrderSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupSortOrderSetMessagePayload>";
            }
        };
    }
}
