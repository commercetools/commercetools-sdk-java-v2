
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

/**
 * CustomerSetMiddleNameAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetMiddleNameActionImpl implements CustomerSetMiddleNameAction, ModelBase {

    private String action;

    private String middleName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerSetMiddleNameActionImpl(@JsonProperty("middleName") final String middleName) {
        this.middleName = middleName;
        this.action = SET_MIDDLE_NAME;
    }

    /**
     * create empty instance
     */
    public CustomerSetMiddleNameActionImpl() {
        this.action = SET_MIDDLE_NAME;
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

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(final String middleName) {
        this.middleName = middleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerSetMiddleNameActionImpl that = (CustomerSetMiddleNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(middleName, that.middleName)
                .append(action, that.action)
                .append(middleName, that.middleName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(middleName).toHashCode();
    }

}
