
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetOrderUrlTemplateAction" rel="nofollow">Set Order Url Template</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreOrderUrlTemplateSetMessagePayloadImpl implements StoreOrderUrlTemplateSetMessagePayload, ModelBase {

    private String type;

    private String orderUrlTemplate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreOrderUrlTemplateSetMessagePayloadImpl(@JsonProperty("orderUrlTemplate") final String orderUrlTemplate) {
        this.orderUrlTemplate = orderUrlTemplate;
        this.type = STORE_ORDER_URL_TEMPLATE_SET;
    }

    /**
     * create empty instance
     */
    public StoreOrderUrlTemplateSetMessagePayloadImpl() {
        this.type = STORE_ORDER_URL_TEMPLATE_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <code>orderUrlTemplate</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetOrderUrlTemplateAction" rel="nofollow">Set Order Url Template</a> update action.</p>
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

        StoreOrderUrlTemplateSetMessagePayloadImpl that = (StoreOrderUrlTemplateSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(orderUrlTemplate, that.orderUrlTemplate)
                .append(type, that.type)
                .append(orderUrlTemplate, that.orderUrlTemplate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(orderUrlTemplate).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("orderUrlTemplate", orderUrlTemplate)
                .build();
    }

    @Override
    public StoreOrderUrlTemplateSetMessagePayload copyDeep() {
        return StoreOrderUrlTemplateSetMessagePayload.deepCopy(this);
    }
}
