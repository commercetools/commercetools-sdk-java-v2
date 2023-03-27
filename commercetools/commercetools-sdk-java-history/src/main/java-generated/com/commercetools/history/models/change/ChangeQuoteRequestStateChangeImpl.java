
package com.commercetools.history.models.change;

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
 *  <p>Update action for <code>changeQuoteRequestState</code> on <code>quote-request</code></p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeQuoteRequestStateChangeImpl implements ChangeQuoteRequestStateChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.QuoteRequestState nextValue;

    private com.commercetools.history.models.common.QuoteRequestState previousValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeQuoteRequestStateChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.QuoteRequestState nextValue,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.QuoteRequestState previousValue) {
        this.change = change;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = CHANGE_QUOTE_REQUEST_STATE_CHANGE;
    }

    /**
     * create empty instance
     */
    public ChangeQuoteRequestStateChangeImpl() {
        this.type = CHANGE_QUOTE_REQUEST_STATE_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getChange() {
        return this.change;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.QuoteRequestState getNextValue() {
        return this.nextValue;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.QuoteRequestState getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setNextValue(final com.commercetools.history.models.common.QuoteRequestState nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.QuoteRequestState previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeQuoteRequestStateChangeImpl that = (ChangeQuoteRequestStateChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
