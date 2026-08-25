
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
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreImprintUrlSetMessage" rel="nofollow">StoreImprintUrlSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetImprintUrlActionImpl implements StoreSetImprintUrlAction, ModelBase {

    private String action;

    private String imprintUrl;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreSetImprintUrlActionImpl(@JsonProperty("imprintUrl") final String imprintUrl) {
        this.imprintUrl = imprintUrl;
        this.action = SET_IMPRINT_URL;
    }

    /**
     * create empty instance
     */
    public StoreSetImprintUrlActionImpl() {
        this.action = SET_IMPRINT_URL;
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

        StoreSetImprintUrlActionImpl that = (StoreSetImprintUrlActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(imprintUrl, that.imprintUrl)
                .append(action, that.action)
                .append(imprintUrl, that.imprintUrl)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(imprintUrl).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("imprintUrl", imprintUrl)
                .build();
    }

    @Override
    public StoreSetImprintUrlAction copyDeep() {
        return StoreSetImprintUrlAction.deepCopy(this);
    }
}
