
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
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
 *  <p>Returned when some of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">Line Items</a> are out of stock at the time of placing an <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders:POST" rel="nofollow">Create Order from Cart</a>, <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/orders:POST" rel="nofollow">Create Order in Store from Cart</a>, <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders/quotes:POST" rel="nofollow">Create Order from Quote</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders/import:POST" rel="nofollow">Create Order by Import</a> requests on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/orders:POST" rel="nofollow">Create Order from Cart</a>, <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/me/orders:POST" rel="nofollow">Create Order in Store from Cart</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/orders/quotes:POST" rel="nofollow">Create Order from Quote</a> requests on My Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/orders:POST" rel="nofollow">Create Order from Cart in BusinessUnit</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/orders/quotes:POST" rel="nofollow">Create Order from Quote in BusinessUnit</a> requests on Associate Orders.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OutOfStockErrorImpl implements OutOfStockError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private java.util.List<String> lineItems;

    private java.util.List<String> skus;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OutOfStockErrorImpl(@JsonProperty("message") final String message,
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("lineItems") final java.util.List<String> lineItems,
            @JsonProperty("skus") final java.util.List<String> skus) {
        this.message = message;
        this.values = values;
        this.lineItems = lineItems;
        this.skus = skus;
        this.code = OUT_OF_STOCK;
    }

    /**
     * create empty instance
     */
    public OutOfStockErrorImpl() {
        this.code = OUT_OF_STOCK;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"Some line items are out of stock at the time of placing the order: $itemSku."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p>Unique identifiers of the Line Items that are out of stock.</p>
     */

    public java.util.List<String> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p>SKUs of the Line Items that are out of stock.</p>
     */

    public java.util.List<String> getSkus() {
        return this.skus;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setLineItems(final String... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }

    public void setLineItems(final java.util.List<String> lineItems) {
        this.lineItems = lineItems;
    }

    public void setSkus(final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
    }

    public void setSkus(final java.util.List<String> skus) {
        this.skus = skus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OutOfStockErrorImpl that = (OutOfStockErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(lineItems, that.lineItems)
                .append(skus, that.skus)
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(lineItems, that.lineItems)
                .append(skus, that.skus)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(lineItems)
                .append(skus)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("values", values)
                .append("lineItems", lineItems)
                .append("skus", skus)
                .build();
    }

    @Override
    public OutOfStockError copyDeep() {
        return OutOfStockError.deepCopy(this);
    }
}
