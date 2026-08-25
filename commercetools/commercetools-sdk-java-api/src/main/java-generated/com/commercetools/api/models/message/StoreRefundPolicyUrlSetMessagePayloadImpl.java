
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetRefundPolicyUrlAction" rel="nofollow">Set Refund Policy Url</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreRefundPolicyUrlSetMessagePayloadImpl implements StoreRefundPolicyUrlSetMessagePayload, ModelBase {

    private String type;

    private String refundPolicyUrl;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreRefundPolicyUrlSetMessagePayloadImpl(@JsonProperty("refundPolicyUrl") final String refundPolicyUrl) {
        this.refundPolicyUrl = refundPolicyUrl;
        this.type = STORE_REFUND_POLICY_URL_SET;
    }

    /**
     * create empty instance
     */
    public StoreRefundPolicyUrlSetMessagePayloadImpl() {
        this.type = STORE_REFUND_POLICY_URL_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <code>refundPolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetRefundPolicyUrlAction" rel="nofollow">Set Refund Policy Url</a> update action.</p>
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

        StoreRefundPolicyUrlSetMessagePayloadImpl that = (StoreRefundPolicyUrlSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(refundPolicyUrl, that.refundPolicyUrl)
                .append(type, that.type)
                .append(refundPolicyUrl, that.refundPolicyUrl)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(refundPolicyUrl).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("refundPolicyUrl", refundPolicyUrl)
                .build();
    }

    @Override
    public StoreRefundPolicyUrlSetMessagePayload copyDeep() {
        return StoreRefundPolicyUrlSetMessagePayload.deepCopy(this);
    }
}
