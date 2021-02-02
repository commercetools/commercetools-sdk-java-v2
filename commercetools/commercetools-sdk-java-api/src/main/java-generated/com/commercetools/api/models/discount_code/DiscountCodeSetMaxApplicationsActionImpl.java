
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeSetMaxApplicationsActionImpl implements DiscountCodeSetMaxApplicationsAction {

    private String action;

    private Long maxApplications;

    @JsonCreator
    DiscountCodeSetMaxApplicationsActionImpl(@JsonProperty("maxApplications") final Long maxApplications) {
        this.maxApplications = maxApplications;
        this.action = SET_MAX_APPLICATIONS;
    }

    public DiscountCodeSetMaxApplicationsActionImpl() {
        this.action = SET_MAX_APPLICATIONS;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>If the <code>maxApplications</code> parameter is not included, the field will be emptied.</p>
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

        return new EqualsBuilder().append(action, that.action).append(maxApplications, that.maxApplications).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(maxApplications).toHashCode();
    }

}
