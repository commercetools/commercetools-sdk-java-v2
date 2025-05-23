
package com.commercetools.history.models.common;

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
 * ReturnInfo
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReturnInfoImpl implements ReturnInfo, ModelBase {

    private java.util.List<com.commercetools.history.models.common.ReturnItem> items;

    private String returnTrackingId;

    private String returnDate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReturnInfoImpl(
            @JsonProperty("items") final java.util.List<com.commercetools.history.models.common.ReturnItem> items,
            @JsonProperty("returnTrackingId") final String returnTrackingId,
            @JsonProperty("returnDate") final String returnDate) {
        this.items = items;
        this.returnTrackingId = returnTrackingId;
        this.returnDate = returnDate;
    }

    /**
     * create empty instance
     */
    public ReturnInfoImpl() {
    }

    /**
     *
     */

    public java.util.List<com.commercetools.history.models.common.ReturnItem> getItems() {
        return this.items;
    }

    /**
     *  <p>Identifies, which return tracking ID is connected to this particular return.</p>
     */

    public String getReturnTrackingId() {
        return this.returnTrackingId;
    }

    /**
     *
     */

    public String getReturnDate() {
        return this.returnDate;
    }

    public void setItems(final com.commercetools.history.models.common.ReturnItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.history.models.common.ReturnItem> items) {
        this.items = items;
    }

    public void setReturnTrackingId(final String returnTrackingId) {
        this.returnTrackingId = returnTrackingId;
    }

    public void setReturnDate(final String returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReturnInfoImpl that = (ReturnInfoImpl) o;

        return new EqualsBuilder().append(items, that.items)
                .append(returnTrackingId, that.returnTrackingId)
                .append(returnDate, that.returnDate)
                .append(items, that.items)
                .append(returnTrackingId, that.returnTrackingId)
                .append(returnDate, that.returnDate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(items).append(returnTrackingId).append(returnDate).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("items", items)
                .append("returnTrackingId", returnTrackingId)
                .append("returnDate", returnDate)
                .build();
    }

    @Override
    public ReturnInfo copyDeep() {
        return ReturnInfo.deepCopy(this);
    }
}
