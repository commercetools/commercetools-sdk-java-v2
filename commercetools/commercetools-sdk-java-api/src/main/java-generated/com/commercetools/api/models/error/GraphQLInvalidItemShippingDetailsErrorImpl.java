
package com.commercetools.api.models.error;

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
 *  <p>Returned when Line Item or Custom Line Item quantities set under ItemShippingDetails do not match the sum of the quantities in their respective shipping details.</p>
 *  <p>The error is returned as a failed response to the Create Order from Cart and Create Order in Store from Cart requests.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLInvalidItemShippingDetailsErrorImpl implements GraphQLInvalidItemShippingDetailsError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private String subject;

    private String itemId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLInvalidItemShippingDetailsErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("subject") final String subject, @JsonProperty("itemId") final String itemId) {
        this.values = values;
        this.subject = subject;
        this.itemId = itemId;
        this.code = INVALID_ITEM_SHIPPING_DETAILS;
    }

    /**
     * create empty instance
     */
    public GraphQLInvalidItemShippingDetailsErrorImpl() {
        this.code = INVALID_ITEM_SHIPPING_DETAILS;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p><code>"LineItem"</code> or <code>"CustomLineItem"</code></p>
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     *  <p>Unique identifier of the Line Item or Custom Line Item.</p>
     */

    public String getItemId() {
        return this.itemId;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }

    public void setItemId(final String itemId) {
        this.itemId = itemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLInvalidItemShippingDetailsErrorImpl that = (GraphQLInvalidItemShippingDetailsErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(subject, that.subject)
                .append(itemId, that.itemId)
                .append(code, that.code)
                .append(values, that.values)
                .append(subject, that.subject)
                .append(itemId, that.itemId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(values).append(subject).append(itemId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("subject", subject)
                .append("itemId", itemId)
                .build();
    }

}
