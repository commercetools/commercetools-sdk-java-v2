
package com.commercetools.api.models.shipping_method;

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
 * ShippingMethodChangeIsDefaultAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodChangeIsDefaultActionImpl implements ShippingMethodChangeIsDefaultAction, ModelBase {

    private String action;

    private Boolean isDefault;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingMethodChangeIsDefaultActionImpl(@JsonProperty("isDefault") final Boolean isDefault) {
        this.isDefault = isDefault;
        this.action = CHANGE_IS_DEFAULT;
    }

    /**
     * create empty instance
     */
    public ShippingMethodChangeIsDefaultActionImpl() {
        this.action = CHANGE_IS_DEFAULT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. Only one ShippingMethod can be default in a Project.</p>
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(final Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingMethodChangeIsDefaultActionImpl that = (ShippingMethodChangeIsDefaultActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(isDefault, that.isDefault)
                .append(action, that.action)
                .append(isDefault, that.isDefault)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(isDefault).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("isDefault", isDefault)
                .build();
    }

    @Override
    public ShippingMethodChangeIsDefaultAction copyDeep() {
        return ShippingMethodChangeIsDefaultAction.deepCopy(this);
    }
}
