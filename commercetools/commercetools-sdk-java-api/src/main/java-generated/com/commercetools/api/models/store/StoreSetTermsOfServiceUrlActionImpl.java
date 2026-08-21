
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
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreTermsOfServiceUrlSetMessage" rel="nofollow">StoreTermsOfServiceUrlSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetTermsOfServiceUrlActionImpl implements StoreSetTermsOfServiceUrlAction, ModelBase {

    private String action;

    private String termsOfServiceUrl;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreSetTermsOfServiceUrlActionImpl(@JsonProperty("termsOfServiceUrl") final String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
        this.action = SET_TERMS_OF_SERVICE_URL;
    }

    /**
     * create empty instance
     */
    public StoreSetTermsOfServiceUrlActionImpl() {
        this.action = SET_TERMS_OF_SERVICE_URL;
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

    public String getTermsOfServiceUrl() {
        return this.termsOfServiceUrl;
    }

    public void setTermsOfServiceUrl(final String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreSetTermsOfServiceUrlActionImpl that = (StoreSetTermsOfServiceUrlActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(termsOfServiceUrl, that.termsOfServiceUrl)
                .append(action, that.action)
                .append(termsOfServiceUrl, that.termsOfServiceUrl)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(termsOfServiceUrl).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("termsOfServiceUrl", termsOfServiceUrl)
                .build();
    }

    @Override
    public StoreSetTermsOfServiceUrlAction copyDeep() {
        return StoreSetTermsOfServiceUrlAction.deepCopy(this);
    }
}
