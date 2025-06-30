
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountGroupSortOrderSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupSortOrderSetMessagePayload discountGroupSortOrderSetMessagePayload = DiscountGroupSortOrderSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupSortOrderSetMessagePayloadBuilder
        implements Builder<DiscountGroupSortOrderSetMessagePayload> {

    @Nullable
    private String sortOrder;

    @Nullable
    private String oldSortOrder;

    /**
     *  <p><code>sortOrder</code> value of the DiscountGroup after the Set SortOrder update action.</p>
     * @param sortOrder value to be set
     * @return Builder
     */

    public DiscountGroupSortOrderSetMessagePayloadBuilder sortOrder(@Nullable final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     *  <p><code>sortOrder</code> value of the DiscountGroup before the Set SortOrder update action.</p>
     * @param oldSortOrder value to be set
     * @return Builder
     */

    public DiscountGroupSortOrderSetMessagePayloadBuilder oldSortOrder(@Nullable final String oldSortOrder) {
        this.oldSortOrder = oldSortOrder;
        return this;
    }

    /**
     *  <p><code>sortOrder</code> value of the DiscountGroup after the Set SortOrder update action.</p>
     * @return sortOrder
     */

    @Nullable
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     *  <p><code>sortOrder</code> value of the DiscountGroup before the Set SortOrder update action.</p>
     * @return oldSortOrder
     */

    @Nullable
    public String getOldSortOrder() {
        return this.oldSortOrder;
    }

    /**
     * builds DiscountGroupSortOrderSetMessagePayload with checking for non-null required values
     * @return DiscountGroupSortOrderSetMessagePayload
     */
    public DiscountGroupSortOrderSetMessagePayload build() {
        return new DiscountGroupSortOrderSetMessagePayloadImpl(sortOrder, oldSortOrder);
    }

    /**
     * builds DiscountGroupSortOrderSetMessagePayload without checking for non-null required values
     * @return DiscountGroupSortOrderSetMessagePayload
     */
    public DiscountGroupSortOrderSetMessagePayload buildUnchecked() {
        return new DiscountGroupSortOrderSetMessagePayloadImpl(sortOrder, oldSortOrder);
    }

    /**
     * factory method for an instance of DiscountGroupSortOrderSetMessagePayloadBuilder
     * @return builder
     */
    public static DiscountGroupSortOrderSetMessagePayloadBuilder of() {
        return new DiscountGroupSortOrderSetMessagePayloadBuilder();
    }

    /**
     * create builder for DiscountGroupSortOrderSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupSortOrderSetMessagePayloadBuilder of(
            final DiscountGroupSortOrderSetMessagePayload template) {
        DiscountGroupSortOrderSetMessagePayloadBuilder builder = new DiscountGroupSortOrderSetMessagePayloadBuilder();
        builder.sortOrder = template.getSortOrder();
        builder.oldSortOrder = template.getOldSortOrder();
        return builder;
    }

}
