
package com.commercetools.checkout.models.payment_integration;

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
 *  <p>Sets the sorting info of a PaymentIntegration.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetSortingInfoUpdateActionImpl implements SetSortingInfoUpdateAction, ModelBase {

    private String action;

    private com.commercetools.checkout.models.payment_integration.SortingInfo sortingInfo;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetSortingInfoUpdateActionImpl(
            @JsonProperty("sortingInfo") final com.commercetools.checkout.models.payment_integration.SortingInfo sortingInfo) {
        this.sortingInfo = sortingInfo;
        this.action = SET_SORTING_INFO;
    }

    /**
     * create empty instance
     */
    public SetSortingInfoUpdateActionImpl() {
        this.action = SET_SORTING_INFO;
    }

    /**
     *  <p>Type of update action to be performed on the PaymentIntegration.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public com.commercetools.checkout.models.payment_integration.SortingInfo getSortingInfo() {
        return this.sortingInfo;
    }

    public void setSortingInfo(final com.commercetools.checkout.models.payment_integration.SortingInfo sortingInfo) {
        this.sortingInfo = sortingInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetSortingInfoUpdateActionImpl that = (SetSortingInfoUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(sortingInfo, that.sortingInfo)
                .append(action, that.action)
                .append(sortingInfo, that.sortingInfo)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(sortingInfo).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("sortingInfo", sortingInfo)
                .build();
    }

    @Override
    public SetSortingInfoUpdateAction copyDeep() {
        return SetSortingInfoUpdateAction.deepCopy(this);
    }
}
