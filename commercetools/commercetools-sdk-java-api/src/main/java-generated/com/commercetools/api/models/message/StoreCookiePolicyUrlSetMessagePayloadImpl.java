
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCookiePolicyUrlAction" rel="nofollow">Set Cookie Policy Url</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreCookiePolicyUrlSetMessagePayloadImpl implements StoreCookiePolicyUrlSetMessagePayload, ModelBase {

    private String type;

    private String cookiePolicyUrl;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreCookiePolicyUrlSetMessagePayloadImpl(@JsonProperty("cookiePolicyUrl") final String cookiePolicyUrl) {
        this.cookiePolicyUrl = cookiePolicyUrl;
        this.type = STORE_COOKIE_POLICY_URL_SET;
    }

    /**
     * create empty instance
     */
    public StoreCookiePolicyUrlSetMessagePayloadImpl() {
        this.type = STORE_COOKIE_POLICY_URL_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <code>cookiePolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCookiePolicyUrlAction" rel="nofollow">Set Cookie Policy Url</a> update action.</p>
     */

    public String getCookiePolicyUrl() {
        return this.cookiePolicyUrl;
    }

    public void setCookiePolicyUrl(final String cookiePolicyUrl) {
        this.cookiePolicyUrl = cookiePolicyUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreCookiePolicyUrlSetMessagePayloadImpl that = (StoreCookiePolicyUrlSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(cookiePolicyUrl, that.cookiePolicyUrl)
                .append(type, that.type)
                .append(cookiePolicyUrl, that.cookiePolicyUrl)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(cookiePolicyUrl).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("cookiePolicyUrl", cookiePolicyUrl)
                .build();
    }

    @Override
    public StoreCookiePolicyUrlSetMessagePayload copyDeep() {
        return StoreCookiePolicyUrlSetMessagePayload.deepCopy(this);
    }
}
