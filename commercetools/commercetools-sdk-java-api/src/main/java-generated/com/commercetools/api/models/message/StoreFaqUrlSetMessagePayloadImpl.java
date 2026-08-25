
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetFaqUrlAction" rel="nofollow">Set Faq Url</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreFaqUrlSetMessagePayloadImpl implements StoreFaqUrlSetMessagePayload, ModelBase {

    private String type;

    private String faqUrl;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreFaqUrlSetMessagePayloadImpl(@JsonProperty("faqUrl") final String faqUrl) {
        this.faqUrl = faqUrl;
        this.type = STORE_FAQ_URL_SET;
    }

    /**
     * create empty instance
     */
    public StoreFaqUrlSetMessagePayloadImpl() {
        this.type = STORE_FAQ_URL_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <code>faqUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetFaqUrlAction" rel="nofollow">Set Faq Url</a> update action.</p>
     */

    public String getFaqUrl() {
        return this.faqUrl;
    }

    public void setFaqUrl(final String faqUrl) {
        this.faqUrl = faqUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreFaqUrlSetMessagePayloadImpl that = (StoreFaqUrlSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(faqUrl, that.faqUrl)
                .append(type, that.type)
                .append(faqUrl, that.faqUrl)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(faqUrl).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("faqUrl", faqUrl)
                .build();
    }

    @Override
    public StoreFaqUrlSetMessagePayload copyDeep() {
        return StoreFaqUrlSetMessagePayload.deepCopy(this);
    }
}
