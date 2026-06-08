
package com.commercetools.api.models.project;

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
 * ProjectChangePriceRoundingModeAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangePriceRoundingModeActionImpl implements ProjectChangePriceRoundingModeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.cart.RoundingMode priceRoundingMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectChangePriceRoundingModeActionImpl(
            @JsonProperty("priceRoundingMode") final com.commercetools.api.models.cart.RoundingMode priceRoundingMode) {
        this.priceRoundingMode = priceRoundingMode;
        this.action = CHANGE_PRICE_ROUNDING_MODE;
    }

    /**
     * create empty instance
     */
    public ProjectChangePriceRoundingModeActionImpl() {
        this.action = CHANGE_PRICE_ROUNDING_MODE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Project-level default rounding mode for calculating the total prices on <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>. See <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">CartsConfiguration</a>.</p>
     */

    public com.commercetools.api.models.cart.RoundingMode getPriceRoundingMode() {
        return this.priceRoundingMode;
    }

    public void setPriceRoundingMode(final com.commercetools.api.models.cart.RoundingMode priceRoundingMode) {
        this.priceRoundingMode = priceRoundingMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectChangePriceRoundingModeActionImpl that = (ProjectChangePriceRoundingModeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(priceRoundingMode, that.priceRoundingMode)
                .append(action, that.action)
                .append(priceRoundingMode, that.priceRoundingMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(priceRoundingMode).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("priceRoundingMode", priceRoundingMode)
                .build();
    }

    @Override
    public ProjectChangePriceRoundingModeAction copyDeep() {
        return ProjectChangePriceRoundingModeAction.deepCopy(this);
    }
}
