
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
 *  <p>Configuration for automated reversal of payments.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AutomatedReversalConfigurationImpl implements AutomatedReversalConfiguration, ModelBase {

    private String status;

    private String predicate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AutomatedReversalConfigurationImpl(@JsonProperty("status") final String status,
            @JsonProperty("predicate") final String predicate) {
        this.status = status;
        this.predicate = predicate;
    }

    /**
     * create empty instance
     */
    public AutomatedReversalConfigurationImpl() {
    }

    /**
     *  <p>Indicates whether the automated reversal configuration is active or not.</p>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     *  <p>Cart-based predicate in JSONata format to determine when automated reversal should be applied.</p>
     */

    public String getPredicate() {
        return this.predicate;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public void setPredicate(final String predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AutomatedReversalConfigurationImpl that = (AutomatedReversalConfigurationImpl) o;

        return new EqualsBuilder().append(status, that.status)
                .append(predicate, that.predicate)
                .append(status, that.status)
                .append(predicate, that.predicate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(status).append(predicate).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("status", status)
                .append("predicate", predicate)
                .build();
    }

    @Override
    public AutomatedReversalConfiguration copyDeep() {
        return AutomatedReversalConfiguration.deepCopy(this);
    }
}
