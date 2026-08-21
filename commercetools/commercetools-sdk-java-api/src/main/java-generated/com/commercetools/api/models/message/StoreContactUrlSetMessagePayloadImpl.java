
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetContactUrlAction" rel="nofollow">Set Contact Url</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreContactUrlSetMessagePayloadImpl implements StoreContactUrlSetMessagePayload, ModelBase {

    private String type;

    private String contactUrl;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreContactUrlSetMessagePayloadImpl(@JsonProperty("contactUrl") final String contactUrl) {
        this.contactUrl = contactUrl;
        this.type = STORE_CONTACT_URL_SET;
    }

    /**
     * create empty instance
     */
    public StoreContactUrlSetMessagePayloadImpl() {
        this.type = STORE_CONTACT_URL_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <code>contactUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetContactUrlAction" rel="nofollow">Set Contact Url</a> update action.</p>
     */

    public String getContactUrl() {
        return this.contactUrl;
    }

    public void setContactUrl(final String contactUrl) {
        this.contactUrl = contactUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreContactUrlSetMessagePayloadImpl that = (StoreContactUrlSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(contactUrl, that.contactUrl)
                .append(type, that.type)
                .append(contactUrl, that.contactUrl)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(contactUrl).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("contactUrl", contactUrl)
                .build();
    }

    @Override
    public StoreContactUrlSetMessagePayload copyDeep() {
        return StoreContactUrlSetMessagePayload.deepCopy(this);
    }
}
