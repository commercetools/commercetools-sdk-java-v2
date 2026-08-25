
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetPrivacyPolicyUrlAction" rel="nofollow">Set Privacy Policy Url</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StorePrivacyPolicyUrlSetMessagePayloadImpl implements StorePrivacyPolicyUrlSetMessagePayload, ModelBase {

    private String type;

    private String privacyPolicyUrl;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StorePrivacyPolicyUrlSetMessagePayloadImpl(@JsonProperty("privacyPolicyUrl") final String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
        this.type = STORE_PRIVACY_POLICY_URL_SET;
    }

    /**
     * create empty instance
     */
    public StorePrivacyPolicyUrlSetMessagePayloadImpl() {
        this.type = STORE_PRIVACY_POLICY_URL_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <code>privacyPolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetPrivacyPolicyUrlAction" rel="nofollow">Set Privacy Policy Url</a> update action.</p>
     */

    public String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public void setPrivacyPolicyUrl(final String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StorePrivacyPolicyUrlSetMessagePayloadImpl that = (StorePrivacyPolicyUrlSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(privacyPolicyUrl, that.privacyPolicyUrl)
                .append(type, that.type)
                .append(privacyPolicyUrl, that.privacyPolicyUrl)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(privacyPolicyUrl).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("privacyPolicyUrl", privacyPolicyUrl)
                .build();
    }

    @Override
    public StorePrivacyPolicyUrlSetMessagePayload copyDeep() {
        return StorePrivacyPolicyUrlSetMessagePayload.deepCopy(this);
    }
}
