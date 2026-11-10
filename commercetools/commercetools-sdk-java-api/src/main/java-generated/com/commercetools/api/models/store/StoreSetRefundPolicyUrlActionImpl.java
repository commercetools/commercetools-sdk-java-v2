
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
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreRefundPolicyUrlSetMessage" rel="nofollow">StoreRefundPolicyUrlSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetRefundPolicyUrlActionImpl implements StoreSetRefundPolicyUrlAction, ModelBase {

    private String action;

    private String refundPolicyUrl;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreSetRefundPolicyUrlActionImpl(@JsonProperty("refundPolicyUrl") final String refundPolicyUrl) {
        this.refundPolicyUrl = refundPolicyUrl;
        this.action = SET_REFUND_POLICY_URL;
    }

    /**
     * create empty instance
     */
    public StoreSetRefundPolicyUrlActionImpl() {
        this.action = SET_REFUND_POLICY_URL;
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

    public String getRefundPolicyUrl() {
        return this.refundPolicyUrl;
    }

    public void setRefundPolicyUrl(final String refundPolicyUrl) {
        this.refundPolicyUrl = refundPolicyUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreSetRefundPolicyUrlActionImpl that = (StoreSetRefundPolicyUrlActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(refundPolicyUrl, that.refundPolicyUrl)
                .append(action, that.action)
                .append(refundPolicyUrl, that.refundPolicyUrl)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(refundPolicyUrl).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("refundPolicyUrl", refundPolicyUrl)
                .build();
    }

    @Override
    public StoreSetRefundPolicyUrlAction copyDeep() {
        return StoreSetRefundPolicyUrlAction.deepCopy(this);
    }
}
