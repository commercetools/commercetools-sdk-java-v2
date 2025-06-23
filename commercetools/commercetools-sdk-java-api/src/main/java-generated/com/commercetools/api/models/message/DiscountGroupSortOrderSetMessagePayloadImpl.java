
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Generated after a successful Set SortOrder update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupSortOrderSetMessagePayloadImpl implements DiscountGroupSortOrderSetMessagePayload, ModelBase {

    private String type;

    private String sortOrder;

    private String oldSortOrder;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountGroupSortOrderSetMessagePayloadImpl(@JsonProperty("sortOrder") final String sortOrder,
            @JsonProperty("oldSortOrder") final String oldSortOrder) {
        this.sortOrder = sortOrder;
        this.oldSortOrder = oldSortOrder;
        this.type = DISCOUNT_GROUP_SORT_ORDER_SET;
    }

    /**
     * create empty instance
     */
    public DiscountGroupSortOrderSetMessagePayloadImpl() {
        this.type = DISCOUNT_GROUP_SORT_ORDER_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><code>sortOrder</code> value of the DiscountGroup after the Set SortOrder update action.</p>
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     *  <p><code>sortOrder</code> value of the DiscountGroup before the Set SortOrder update action.</p>
     */

    public String getOldSortOrder() {
        return this.oldSortOrder;
    }

    public void setSortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public void setOldSortOrder(final String oldSortOrder) {
        this.oldSortOrder = oldSortOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountGroupSortOrderSetMessagePayloadImpl that = (DiscountGroupSortOrderSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(sortOrder, that.sortOrder)
                .append(oldSortOrder, that.oldSortOrder)
                .append(type, that.type)
                .append(sortOrder, that.sortOrder)
                .append(oldSortOrder, that.oldSortOrder)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(sortOrder).append(oldSortOrder).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("sortOrder", sortOrder)
                .append("oldSortOrder", oldSortOrder)
                .build();
    }

    @Override
    public DiscountGroupSortOrderSetMessagePayload copyDeep() {
        return DiscountGroupSortOrderSetMessagePayload.deepCopy(this);
    }
}
