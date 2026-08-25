
package com.commercetools.api.models.store;

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
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreShippingPolicyUrlSetMessage" rel="nofollow">StoreShippingPolicyUrlSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetShippingPolicyUrlActionImpl implements StoreSetShippingPolicyUrlAction, ModelBase {

    private String action;

    private String shippingPolicyUrl;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreSetShippingPolicyUrlActionImpl(@JsonProperty("shippingPolicyUrl") final String shippingPolicyUrl) {
        this.shippingPolicyUrl = shippingPolicyUrl;
        this.action = SET_SHIPPING_POLICY_URL;
    }

    /**
     * create empty instance
     */
    public StoreSetShippingPolicyUrlActionImpl() {
        this.action = SET_SHIPPING_POLICY_URL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
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

        StoreSetShippingPolicyUrlActionImpl that = (StoreSetShippingPolicyUrlActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(shippingPolicyUrl, that.shippingPolicyUrl)
                .append(action, that.action)
                .append(shippingPolicyUrl, that.shippingPolicyUrl)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(shippingPolicyUrl).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("shippingPolicyUrl", shippingPolicyUrl)
                .build();
    }

    @Override
    public StoreSetShippingPolicyUrlAction copyDeep() {
        return StoreSetShippingPolicyUrlAction.deepCopy(this);
    }
}
