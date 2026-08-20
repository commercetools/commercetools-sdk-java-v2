
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCheckoutUrlTemplateAction" rel="nofollow">Set Checkout Url Template</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreCheckoutUrlTemplateSetMessagePayloadImpl
        implements StoreCheckoutUrlTemplateSetMessagePayload, ModelBase {

    private String type;

    private String checkoutUrlTemplate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreCheckoutUrlTemplateSetMessagePayloadImpl(
            @JsonProperty("checkoutUrlTemplate") final String checkoutUrlTemplate) {
        this.checkoutUrlTemplate = checkoutUrlTemplate;
        this.type = STORE_CHECKOUT_URL_TEMPLATE_SET;
    }

    /**
     * create empty instance
     */
    public StoreCheckoutUrlTemplateSetMessagePayloadImpl() {
        this.type = STORE_CHECKOUT_URL_TEMPLATE_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <code>checkoutUrlTemplate</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCheckoutUrlTemplateAction" rel="nofollow">Set Checkout Url Template</a> update action.</p>
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

        StoreCheckoutUrlTemplateSetMessagePayloadImpl that = (StoreCheckoutUrlTemplateSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(checkoutUrlTemplate, that.checkoutUrlTemplate)
                .append(type, that.type)
                .append(checkoutUrlTemplate, that.checkoutUrlTemplate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(checkoutUrlTemplate).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("checkoutUrlTemplate", checkoutUrlTemplate)
                .build();
    }

    @Override
    public StoreCheckoutUrlTemplateSetMessagePayload copyDeep() {
        return StoreCheckoutUrlTemplateSetMessagePayload.deepCopy(this);
    }
}
