
package com.commercetools.api.models.me;

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
 *  <p>When accepting, declining, or renegotiating B2B Quotes, the Customer must have the <code>AcceptMyQuotes</code>, <code>DeclineMyQuotes</code>, or <code>RenegotiateMyQuotes</code> Permission respectively.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyQuoteChangeMyQuoteStateActionImpl implements MyQuoteChangeMyQuoteStateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.me.MyQuoteState quoteState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyQuoteChangeMyQuoteStateActionImpl(
            @JsonProperty("quoteState") final com.commercetools.api.models.me.MyQuoteState quoteState) {
        this.quoteState = quoteState;
        this.action = CHANGE_MY_QUOTE_STATE;
    }

    /**
     * create empty instance
     */
    public MyQuoteChangeMyQuoteStateActionImpl() {
        this.action = CHANGE_MY_QUOTE_STATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New state to be set for the Quote.</p>
     */

    public com.commercetools.api.models.me.MyQuoteState getQuoteState() {
        return this.quoteState;
    }

    public void setQuoteState(final com.commercetools.api.models.me.MyQuoteState quoteState) {
        this.quoteState = quoteState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyQuoteChangeMyQuoteStateActionImpl that = (MyQuoteChangeMyQuoteStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(quoteState, that.quoteState).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(quoteState).toHashCode();
    }

}
