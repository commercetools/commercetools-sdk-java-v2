
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ProductTypeSetInputTipAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeSetInputTipActionImpl implements ProductTypeSetInputTipAction, ModelBase {

    private String action;

    private String attributeName;

    private com.commercetools.api.models.common.LocalizedString inputTip;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTypeSetInputTipActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("inputTip") final com.commercetools.api.models.common.LocalizedString inputTip) {
        this.attributeName = attributeName;
        this.inputTip = inputTip;
        this.action = SET_INPUT_TIP;
    }

    /**
     * create empty instance
     */
    public ProductTypeSetInputTipActionImpl() {
        this.action = SET_INPUT_TIP;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getInputTip() {
        return this.inputTip;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setInputTip(final com.commercetools.api.models.common.LocalizedString inputTip) {
        this.inputTip = inputTip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeSetInputTipActionImpl that = (ProductTypeSetInputTipActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(inputTip, that.inputTip)
                .append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(inputTip, that.inputTip)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(inputTip).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("attributeName", attributeName)
                .append("inputTip", inputTip)
                .build();
    }

    @Override
    public ProductTypeSetInputTipAction copyDeep() {
        return ProductTypeSetInputTipAction.deepCopy(this);
    }
}
