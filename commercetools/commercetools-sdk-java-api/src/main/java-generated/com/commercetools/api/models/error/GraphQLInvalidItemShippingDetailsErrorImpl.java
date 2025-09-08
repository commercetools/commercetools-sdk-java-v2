
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
 *  <p>Returned when Line Item or Custom Line Item quantities set under <a href="https://docs.commercetools.com/apis/ctp:api:type:ItemShippingDetails" rel="nofollow">ItemShippingDetails</a> do not match the sum of the quantities in their respective shipping details.</p>
 *  <p>When a Cart is frozen, the error can be returned as a failed response to all update actions on <a href="https://docs.commercetools.com/apis/ctp:api:type:CartUpdateAction" rel="nofollow">Carts</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:MyCartUpdateAction" rel="nofollow">My Carts</a>.</p>
 *  <p>The error is also returned as a failed response to:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/carts:POST" rel="nofollow">Create Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/carts:POST" rel="nofollow">Create Cart in Store</a> requests and <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddLineItemAction" rel="nofollow">Add LineItem</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddCustomLineItemAction" rel="nofollow">Add CustomLineItem</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetLineItemShippingDetailsAction" rel="nofollow">Set LineItem ShippingDetails</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetCustomLineItemShippingDetailsAction" rel="nofollow">Set CustomLineItem ShippingDetails</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShoppingListAction" rel="nofollow">Add Shopping List</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveLineItemAction" rel="nofollow">Remove LineItem</a> update actions on Carts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/carts:POST" rel="nofollow">Create Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/me/carts:POST" rel="nofollow">Create Cart in Store</a> requests, and <a href="https://docs.commercetools.com/apis/ctp:api:type:MyCartAddLineItemAction" rel="nofollow">Add LineItem</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:MyCartSetLineItemShippingDetailsAction" rel="nofollow">Set LineItem ShippingDetails</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:MyCartRemoveLineItemAction" rel="nofollow">Remove LineItem</a> update actions on My Carts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/carts:POST" rel="nofollow">Create Cart in BusinessUnit</a> request on Associate Carts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders:POST" rel="nofollow">Create Order from Cart</a>, <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/orders:POST" rel="nofollow">Create Order in Store from Cart</a>, <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders/quotes:POST" rel="nofollow">Create Order from Quote</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders/import:POST" rel="nofollow">Create Order by Import</a> requests on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/orders:POST" rel="nofollow">Create Order from Cart</a>, <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/me/orders:POST" rel="nofollow">Create Order in Store from Cart</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/orders/quotes:POST" rel="nofollow">Create Order from Quote</a> requests on My Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderAddLineItemAction" rel="nofollow">Add LineItem</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderAddCustomLineItemAction" rel="nofollow">Add CustomLineItem</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetLineItemShippingDetailsAction" rel="nofollow">Set LineItem ShippingDetails</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomLineItemShippingDetailsAction" rel="nofollow">Set CustomLineItem ShippingDetails</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderAddShoppingListAction" rel="nofollow">Add Shopping List</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderRemoveLineItemAction" rel="nofollow">Remove LineItem</a> update actions on Order Edits.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/orders:POST" rel="nofollow">Create Order from Cart in BusinessUnit</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/orders/quotes:POST" rel="nofollow">Create Order from Quote in BusinessUnit</a> requests on Associate Orders.</li>
 *  </ul>
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
    GraphQLInvalidItemShippingDetailsErrorImpl(
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
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

    @Override
    public GraphQLInvalidItemShippingDetailsError copyDeep() {
        return GraphQLInvalidItemShippingDetailsError.deepCopy(this);
    }
}
