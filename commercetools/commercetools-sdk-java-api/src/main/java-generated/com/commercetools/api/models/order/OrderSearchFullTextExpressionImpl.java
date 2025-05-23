
package com.commercetools.api.models.order;

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
 * OrderSearchFullTextExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchFullTextExpressionImpl implements OrderSearchFullTextExpression, ModelBase {

    private com.commercetools.api.models.order.OrderSearchFullTextValue fullText;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchFullTextExpressionImpl(
            @JsonProperty("fullText") final com.commercetools.api.models.order.OrderSearchFullTextValue fullText) {
        this.fullText = fullText;
    }

    /**
     * create empty instance
     */
    public OrderSearchFullTextExpressionImpl() {
    }

    /**
     *
     */

    public com.commercetools.api.models.order.OrderSearchFullTextValue getFullText() {
        return this.fullText;
    }

    public void setFullText(final com.commercetools.api.models.order.OrderSearchFullTextValue fullText) {
        this.fullText = fullText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSearchFullTextExpressionImpl that = (OrderSearchFullTextExpressionImpl) o;

        return new EqualsBuilder().append(fullText, that.fullText).append(fullText, that.fullText).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(fullText).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("fullText", fullText).build();
    }

    @Override
    public OrderSearchFullTextExpression copyDeep() {
        return OrderSearchFullTextExpression.deepCopy(this);
    }
}
