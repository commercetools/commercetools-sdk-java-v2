
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetImprintUrlAction" rel="nofollow">Set Imprint Url</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreImprintUrlSetMessagePayloadImpl implements StoreImprintUrlSetMessagePayload, ModelBase {

    private String type;

    private String imprintUrl;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreImprintUrlSetMessagePayloadImpl(@JsonProperty("imprintUrl") final String imprintUrl) {
        this.imprintUrl = imprintUrl;
        this.type = STORE_IMPRINT_URL_SET;
    }

    /**
     * create empty instance
     */
    public StoreImprintUrlSetMessagePayloadImpl() {
        this.type = STORE_IMPRINT_URL_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <code>imprintUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetImprintUrlAction" rel="nofollow">Set Imprint Url</a> update action.</p>
     */

    public String getImprintUrl() {
        return this.imprintUrl;
    }

    public void setImprintUrl(final String imprintUrl) {
        this.imprintUrl = imprintUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreImprintUrlSetMessagePayloadImpl that = (StoreImprintUrlSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(imprintUrl, that.imprintUrl)
                .append(type, that.type)
                .append(imprintUrl, that.imprintUrl)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(imprintUrl).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("imprintUrl", imprintUrl)
                .build();
    }

    @Override
    public StoreImprintUrlSetMessagePayload copyDeep() {
        return StoreImprintUrlSetMessagePayload.deepCopy(this);
    }
}
