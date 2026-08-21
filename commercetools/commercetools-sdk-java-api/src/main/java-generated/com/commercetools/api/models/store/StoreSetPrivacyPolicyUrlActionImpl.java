
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
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StorePrivacyPolicyUrlSetMessage" rel="nofollow">StorePrivacyPolicyUrlSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetPrivacyPolicyUrlActionImpl implements StoreSetPrivacyPolicyUrlAction, ModelBase {

    private String action;

    private String privacyPolicyUrl;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreSetPrivacyPolicyUrlActionImpl(@JsonProperty("privacyPolicyUrl") final String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
        this.action = SET_PRIVACY_POLICY_URL;
    }

    /**
     * create empty instance
     */
    public StoreSetPrivacyPolicyUrlActionImpl() {
        this.action = SET_PRIVACY_POLICY_URL;
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

        StoreSetPrivacyPolicyUrlActionImpl that = (StoreSetPrivacyPolicyUrlActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(privacyPolicyUrl, that.privacyPolicyUrl)
                .append(action, that.action)
                .append(privacyPolicyUrl, that.privacyPolicyUrl)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(privacyPolicyUrl).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("privacyPolicyUrl", privacyPolicyUrl)
                .build();
    }

    @Override
    public StoreSetPrivacyPolicyUrlAction copyDeep() {
        return StoreSetPrivacyPolicyUrlAction.deepCopy(this);
    }
}
