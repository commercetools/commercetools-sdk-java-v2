
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
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreFaqUrlSetMessage" rel="nofollow">StoreFaqUrlSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetFaqUrlActionImpl implements StoreSetFaqUrlAction, ModelBase {

    private String action;

    private String faqUrl;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreSetFaqUrlActionImpl(@JsonProperty("faqUrl") final String faqUrl) {
        this.faqUrl = faqUrl;
        this.action = SET_FAQ_URL;
    }

    /**
     * create empty instance
     */
    public StoreSetFaqUrlActionImpl() {
        this.action = SET_FAQ_URL;
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

        StoreSetFaqUrlActionImpl that = (StoreSetFaqUrlActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(faqUrl, that.faqUrl)
                .append(action, that.action)
                .append(faqUrl, that.faqUrl)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(faqUrl).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("faqUrl", faqUrl)
                .build();
    }

    @Override
    public StoreSetFaqUrlAction copyDeep() {
        return StoreSetFaqUrlAction.deepCopy(this);
    }
}
