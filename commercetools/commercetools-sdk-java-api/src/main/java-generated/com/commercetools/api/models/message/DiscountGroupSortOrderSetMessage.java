
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
 *     DiscountGroupSortOrderSetMessage discountGroupSortOrderSetMessage = DiscountGroupSortOrderSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DiscountGroupSortOrderSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupSortOrderSetMessageImpl.class)
public interface DiscountGroupSortOrderSetMessage extends Message {

    /**
     * discriminator value for DiscountGroupSortOrderSetMessage
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
     * @return instance of DiscountGroupSortOrderSetMessage
     */
    public static DiscountGroupSortOrderSetMessage of() {
        return new DiscountGroupSortOrderSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupSortOrderSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupSortOrderSetMessage of(final DiscountGroupSortOrderSetMessage template) {
        DiscountGroupSortOrderSetMessageImpl instance = new DiscountGroupSortOrderSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setSortOrder(template.getSortOrder());
        instance.setOldSortOrder(template.getOldSortOrder());
        return instance;
    }

    public DiscountGroupSortOrderSetMessage copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupSortOrderSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupSortOrderSetMessage deepCopy(@Nullable final DiscountGroupSortOrderSetMessage template) {
        if (template == null) {
            return null;
        }
        DiscountGroupSortOrderSetMessageImpl instance = new DiscountGroupSortOrderSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setSortOrder(template.getSortOrder());
        instance.setOldSortOrder(template.getOldSortOrder());
        return instance;
    }

    /**
     * builder factory method for DiscountGroupSortOrderSetMessage
     * @return builder
     */
    public static DiscountGroupSortOrderSetMessageBuilder builder() {
        return DiscountGroupSortOrderSetMessageBuilder.of();
    }

    /**
     * create builder for DiscountGroupSortOrderSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupSortOrderSetMessageBuilder builder(final DiscountGroupSortOrderSetMessage template) {
        return DiscountGroupSortOrderSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupSortOrderSetMessage(Function<DiscountGroupSortOrderSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupSortOrderSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupSortOrderSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupSortOrderSetMessage>";
            }
        };
    }
}
