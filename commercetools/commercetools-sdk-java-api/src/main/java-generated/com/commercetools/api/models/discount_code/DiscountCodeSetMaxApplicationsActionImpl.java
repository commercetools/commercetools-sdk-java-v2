
package com.commercetools.api.models.discount_code;

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
 * DiscountCodeSetMaxApplicationsAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeSetMaxApplicationsActionImpl implements DiscountCodeSetMaxApplicationsAction, ModelBase {

    private String action;

    private Long maxApplications;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountCodeSetMaxApplicationsActionImpl(@JsonProperty("maxApplications") final Long maxApplications) {
        this.maxApplications = maxApplications;
        this.action = SET_MAX_APPLICATIONS;
    }

    /**
     * create empty instance
     */
    public DiscountCodeSetMaxApplicationsActionImpl() {
        this.action = SET_MAX_APPLICATIONS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set.</p>
     *  <p>If empty, any existing value will be removed and the DiscountCode can be applied any number of times. This field does not limit discount applications for Orders created from a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a>.</p>
     */

    public Long getMaxApplications() {
        return this.maxApplications;
    }

    public void setMaxApplications(final Long maxApplications) {
        this.maxApplications = maxApplications;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountCodeSetMaxApplicationsActionImpl that = (DiscountCodeSetMaxApplicationsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(maxApplications, that.maxApplications)
                .append(action, that.action)
                .append(maxApplications, that.maxApplications)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(maxApplications).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("maxApplications", maxApplications)
                .build();
    }

    @Override
    public DiscountCodeSetMaxApplicationsAction copyDeep() {
        return DiscountCodeSetMaxApplicationsAction.deepCopy(this);
    }
}
