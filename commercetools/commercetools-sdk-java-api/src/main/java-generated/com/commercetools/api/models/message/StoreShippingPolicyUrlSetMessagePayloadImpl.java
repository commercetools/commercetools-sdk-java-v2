
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetShippingPolicyUrlAction" rel="nofollow">Set Shipping Policy Url</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreShippingPolicyUrlSetMessagePayloadImpl implements StoreShippingPolicyUrlSetMessagePayload, ModelBase {

    private String type;

    private String shippingPolicyUrl;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreShippingPolicyUrlSetMessagePayloadImpl(@JsonProperty("shippingPolicyUrl") final String shippingPolicyUrl) {
        this.shippingPolicyUrl = shippingPolicyUrl;
        this.type = STORE_SHIPPING_POLICY_URL_SET;
    }

    /**
     * create empty instance
     */
    public StoreShippingPolicyUrlSetMessagePayloadImpl() {
        this.type = STORE_SHIPPING_POLICY_URL_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <code>shippingPolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetShippingPolicyUrlAction" rel="nofollow">Set Shipping Policy Url</a> update action.</p>
     */

    public String getShippingPolicyUrl() {
        return this.shippingPolicyUrl;
    }

    public void setShippingPolicyUrl(final String shippingPolicyUrl) {
        this.shippingPolicyUrl = shippingPolicyUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreShippingPolicyUrlSetMessagePayloadImpl that = (StoreShippingPolicyUrlSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(shippingPolicyUrl, that.shippingPolicyUrl)
                .append(type, that.type)
                .append(shippingPolicyUrl, that.shippingPolicyUrl)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(shippingPolicyUrl).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("shippingPolicyUrl", shippingPolicyUrl)
                .build();
    }

    @Override
    public StoreShippingPolicyUrlSetMessagePayload copyDeep() {
        return StoreShippingPolicyUrlSetMessagePayload.deepCopy(this);
    }
}
