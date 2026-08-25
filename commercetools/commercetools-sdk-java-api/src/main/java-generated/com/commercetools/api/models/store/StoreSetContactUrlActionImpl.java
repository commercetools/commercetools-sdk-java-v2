
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
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreContactUrlSetMessage" rel="nofollow">StoreContactUrlSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetContactUrlActionImpl implements StoreSetContactUrlAction, ModelBase {

    private String action;

    private String contactUrl;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreSetContactUrlActionImpl(@JsonProperty("contactUrl") final String contactUrl) {
        this.contactUrl = contactUrl;
        this.action = SET_CONTACT_URL;
    }

    /**
     * create empty instance
     */
    public StoreSetContactUrlActionImpl() {
        this.action = SET_CONTACT_URL;
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

        StoreSetContactUrlActionImpl that = (StoreSetContactUrlActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(contactUrl, that.contactUrl)
                .append(action, that.action)
                .append(contactUrl, that.contactUrl)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(contactUrl).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("contactUrl", contactUrl)
                .build();
    }

    @Override
    public StoreSetContactUrlAction copyDeep() {
        return StoreSetContactUrlAction.deepCopy(this);
    }
}
