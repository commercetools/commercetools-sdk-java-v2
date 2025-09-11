
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
 *  <p>Returned when the Price or Tax Rate of some Line Items or Shipping Rate of some Shipping Methods changed since they were last added to the Cart.</p>
 *  <p>When a Cart is frozen, the error can be returned as a failed response to all update actions on <a href="https://docs.commercetools.com/apis/ctp:api:type:CartUpdateAction" rel="nofollow">Carts</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:MyCartUpdateAction" rel="nofollow">My Carts</a>.</p>
 *  <p>The error is also returned as a failed response to:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders:POST" rel="nofollow">Create Order from Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/orders:POST" rel="nofollow">Create Order in Store from Cart</a> requests on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/orders:POST" rel="nofollow">Create Order from Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/me/orders:POST" rel="nofollow">Create Order in Store from Cart</a> requests on My Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/orders:POST" rel="nofollow">Create Order from Cart in BusinessUnit</a> request on Associate Orders.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PriceChangedErrorImpl implements PriceChangedError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private java.util.List<String> lineItems;

    private Boolean shipping;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PriceChangedErrorImpl(@JsonProperty("message") final String message,
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("lineItems") final java.util.List<String> lineItems,
            @JsonProperty("shipping") final Boolean shipping) {
        this.message = message;
        this.values = values;
        this.lineItems = lineItems;
        this.shipping = shipping;
        this.code = PRICE_CHANGED;
    }

    /**
     * create empty instance
     */
    public PriceChangedErrorImpl() {
        this.code = PRICE_CHANGED;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Plain text description of the reason for the Price change. For example, <code>"The price or tax of some line items changed at the time of placing the order: $lineItems."</code>.</p>
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
     *  <p>Unique identifiers of the Line Items for which the Price or <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> has changed.</p>
     */

    public java.util.List<String> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p><code>true</code> if the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRate" rel="nofollow">ShippingRate</a> has changed.</p>
     */

    public Boolean getShipping() {
        return this.shipping;
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

    public void setShipping(final Boolean shipping) {
        this.shipping = shipping;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PriceChangedErrorImpl that = (PriceChangedErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(lineItems, that.lineItems)
                .append(shipping, that.shipping)
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(lineItems, that.lineItems)
                .append(shipping, that.shipping)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(lineItems)
                .append(shipping)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("values", values)
                .append("lineItems", lineItems)
                .append("shipping", shipping)
                .build();
    }

    @Override
    public PriceChangedError copyDeep() {
        return PriceChangedError.deepCopy(this);
    }
}
