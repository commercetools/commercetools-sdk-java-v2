
package com.commercetools.api.models.customer;

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
 *  <p>Setting a company name produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerCompanyNameSetMessage" rel="nofollow">CustomerCompanyNameSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetCompanyNameActionImpl implements CustomerSetCompanyNameAction, ModelBase {

    private String action;

    private String companyName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerSetCompanyNameActionImpl(@JsonProperty("companyName") final String companyName) {
        this.companyName = companyName;
        this.action = SET_COMPANY_NAME;
    }

    /**
     * create empty instance
     */
    public CustomerSetCompanyNameActionImpl() {
        this.action = SET_COMPANY_NAME;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerSetCompanyNameActionImpl that = (CustomerSetCompanyNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(companyName, that.companyName)
                .append(action, that.action)
                .append(companyName, that.companyName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(companyName).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("companyName", companyName)
                .build();
    }

    @Override
    public CustomerSetCompanyNameAction copyDeep() {
        return CustomerSetCompanyNameAction.deepCopy(this);
    }
}
