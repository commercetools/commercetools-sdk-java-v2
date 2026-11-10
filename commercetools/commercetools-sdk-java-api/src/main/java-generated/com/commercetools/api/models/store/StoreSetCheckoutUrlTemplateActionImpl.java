
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
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCheckoutUrlTemplateSetMessage" rel="nofollow">StoreCheckoutUrlTemplateSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetCheckoutUrlTemplateActionImpl implements StoreSetCheckoutUrlTemplateAction, ModelBase {

    private String action;

    private String checkoutUrlTemplate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreSetCheckoutUrlTemplateActionImpl(@JsonProperty("checkoutUrlTemplate") final String checkoutUrlTemplate) {
        this.checkoutUrlTemplate = checkoutUrlTemplate;
        this.action = SET_CHECKOUT_URL_TEMPLATE;
    }

    /**
     * create empty instance
     */
    public StoreSetCheckoutUrlTemplateActionImpl() {
        this.action = SET_CHECKOUT_URL_TEMPLATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. Must be an <span>RFC 6570</span> URI template containing the <code>checkoutId</code> variable. If empty, any existing value is removed.</p>
     */

    public String getCheckoutUrlTemplate() {
        return this.checkoutUrlTemplate;
    }

    public void setCheckoutUrlTemplate(final String checkoutUrlTemplate) {
        this.checkoutUrlTemplate = checkoutUrlTemplate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreSetCheckoutUrlTemplateActionImpl that = (StoreSetCheckoutUrlTemplateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(checkoutUrlTemplate, that.checkoutUrlTemplate)
                .append(action, that.action)
                .append(checkoutUrlTemplate, that.checkoutUrlTemplate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(checkoutUrlTemplate).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("checkoutUrlTemplate", checkoutUrlTemplate)
                .build();
    }

    @Override
    public StoreSetCheckoutUrlTemplateAction copyDeep() {
        return StoreSetCheckoutUrlTemplateAction.deepCopy(this);
    }
}
