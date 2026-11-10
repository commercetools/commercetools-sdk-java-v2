
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetTermsOfServiceUrlAction" rel="nofollow">Set Terms Of Service Url</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreTermsOfServiceUrlSetMessagePayloadImpl implements StoreTermsOfServiceUrlSetMessagePayload, ModelBase {

    private String type;

    private String termsOfServiceUrl;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreTermsOfServiceUrlSetMessagePayloadImpl(@JsonProperty("termsOfServiceUrl") final String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
        this.type = STORE_TERMS_OF_SERVICE_URL_SET;
    }

    /**
     * create empty instance
     */
    public StoreTermsOfServiceUrlSetMessagePayloadImpl() {
        this.type = STORE_TERMS_OF_SERVICE_URL_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <code>termsOfServiceUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetTermsOfServiceUrlAction" rel="nofollow">Set Terms Of Service Url</a> update action.</p>
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

        StoreTermsOfServiceUrlSetMessagePayloadImpl that = (StoreTermsOfServiceUrlSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(termsOfServiceUrl, that.termsOfServiceUrl)
                .append(type, that.type)
                .append(termsOfServiceUrl, that.termsOfServiceUrl)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(termsOfServiceUrl).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("termsOfServiceUrl", termsOfServiceUrl)
                .build();
    }

    @Override
    public StoreTermsOfServiceUrlSetMessagePayload copyDeep() {
        return StoreTermsOfServiceUrlSetMessagePayload.deepCopy(this);
    }
}
