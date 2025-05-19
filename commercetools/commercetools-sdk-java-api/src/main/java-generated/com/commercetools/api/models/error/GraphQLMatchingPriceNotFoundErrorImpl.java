
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
 *  <p>Returned when the Product Variant does not have a Price according to the Product <code>priceMode</code> value for a selected currency, country, Customer Group, or Channel.</p>
 *  <p>The error can be returned as a failed response to all update actions on Carts and Staged Orders.</p>
 *  <p>The error is also returned as a failed response to:</p>
 *  <ul>
 *   <li>Authenticate (sign in) Customer and Authenticate (sign in) Customer in Store requests and Set CustomerGroup update action on Customers.</li>
 *   <li>Authenticate (sign in) Customer and Authenticate (sign in) Customer in Store requests on My Customer Profile.</li>
 *   <li>Create Cart, Create Cart in Store, Replicate Cart, and Replicate Cart in Store requests on Carts.</li>
 *   <li>Create Cart and Create Cart in Store and Replicate My Cart requests on My Carts.</li>
 *   <li>Create Cart in BusinessUnit and Replicate Cart in Business Unit requests on Associate Carts.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on Orders.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on My Orders.</li>
 *   <li>Create Order from Cart in BusinessUnit request on Associate Orders.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLMatchingPriceNotFoundErrorImpl implements GraphQLMatchingPriceNotFoundError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private String productId;

    private Integer variantId;

    private String currency;

    private String country;

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    private com.commercetools.api.models.channel.ChannelReference channel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLMatchingPriceNotFoundErrorImpl(
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("productId") final String productId, @JsonProperty("variantId") final Integer variantId,
            @JsonProperty("currency") final String currency, @JsonProperty("country") final String country,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup,
            @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelReference channel) {
        this.values = values;
        this.productId = productId;
        this.variantId = variantId;
        this.currency = currency;
        this.country = country;
        this.customerGroup = customerGroup;
        this.channel = channel;
        this.code = MATCHING_PRICE_NOT_FOUND;
    }

    /**
     * create empty instance
     */
    public GraphQLMatchingPriceNotFoundErrorImpl() {
        this.code = MATCHING_PRICE_NOT_FOUND;
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
     *  <p>Unique identifier of a Product.</p>
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p>Unique identifier of a ProductVariant in the Product.</p>
     */

    public Integer getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Currency code of the country.</p>
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     *  <p>Country code of the geographic location.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Customer Group associated with the Price.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Channel associated with the Price.</p>
     */

    public com.commercetools.api.models.channel.ChannelReference getChannel() {
        return this.channel;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setVariantId(final Integer variantId) {
        this.variantId = variantId;
    }

    public void setCurrency(final String currency) {
        this.currency = currency;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setChannel(final com.commercetools.api.models.channel.ChannelReference channel) {
        this.channel = channel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLMatchingPriceNotFoundErrorImpl that = (GraphQLMatchingPriceNotFoundErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(productId, that.productId)
                .append(variantId, that.variantId)
                .append(currency, that.currency)
                .append(country, that.country)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(code, that.code)
                .append(values, that.values)
                .append(productId, that.productId)
                .append(variantId, that.variantId)
                .append(currency, that.currency)
                .append(country, that.country)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(values)
                .append(productId)
                .append(variantId)
                .append(currency)
                .append(country)
                .append(customerGroup)
                .append(channel)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("productId", productId)
                .append("variantId", variantId)
                .append("currency", currency)
                .append("country", country)
                .append("customerGroup", customerGroup)
                .append("channel", channel)
                .build();
    }

    @Override
    public GraphQLMatchingPriceNotFoundError copyDeep() {
        return GraphQLMatchingPriceNotFoundError.deepCopy(this);
    }
}
