
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
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreOrderUrlTemplateSetMessage" rel="nofollow">StoreOrderUrlTemplateSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetOrderUrlTemplateActionImpl implements StoreSetOrderUrlTemplateAction, ModelBase {

    private String action;

    private String orderUrlTemplate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreSetOrderUrlTemplateActionImpl(@JsonProperty("orderUrlTemplate") final String orderUrlTemplate) {
        this.orderUrlTemplate = orderUrlTemplate;
        this.action = SET_ORDER_URL_TEMPLATE;
    }

    /**
     * create empty instance
     */
    public StoreSetOrderUrlTemplateActionImpl() {
        this.action = SET_ORDER_URL_TEMPLATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. Must be an <span>RFC 6570</span> URI template containing the <code>orderId</code> variable. If empty, any existing value is removed.</p>
     */

    public String getOrderUrlTemplate() {
        return this.orderUrlTemplate;
    }

    public void setOrderUrlTemplate(final String orderUrlTemplate) {
        this.orderUrlTemplate = orderUrlTemplate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreSetOrderUrlTemplateActionImpl that = (StoreSetOrderUrlTemplateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(orderUrlTemplate, that.orderUrlTemplate)
                .append(action, that.action)
                .append(orderUrlTemplate, that.orderUrlTemplate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(orderUrlTemplate).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("orderUrlTemplate", orderUrlTemplate)
                .build();
    }

    @Override
    public StoreSetOrderUrlTemplateAction copyDeep() {
        return StoreSetOrderUrlTemplateAction.deepCopy(this);
    }
}
