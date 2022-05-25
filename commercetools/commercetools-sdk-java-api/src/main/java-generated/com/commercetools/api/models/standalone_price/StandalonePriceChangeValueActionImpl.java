
package com.commercetools.api.models.standalone_price;

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
 * StandalonePriceChangeValueAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceChangeValueActionImpl implements StandalonePriceChangeValueAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.Money value;

    @JsonCreator
    StandalonePriceChangeValueActionImpl(@JsonProperty("value") final com.commercetools.api.models.common.Money value) {
        this.value = value;
        this.action = CHANGE_VALUE;
    }

    public StandalonePriceChangeValueActionImpl() {
        this.action = CHANGE_VALUE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    public void setValue(final com.commercetools.api.models.common.Money value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceChangeValueActionImpl that = (StandalonePriceChangeValueActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(value).toHashCode();
    }

}
