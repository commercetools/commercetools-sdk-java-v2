
package com.commercetools.api.models.product;

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
 * ProductRemovePriceAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductRemovePriceActionImpl implements ProductRemovePriceAction, ModelBase {

    private String action;

    private String priceId;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductRemovePriceActionImpl(@JsonProperty("priceId") final String priceId,
            @JsonProperty("staged") final Boolean staged) {
        this.priceId = priceId;
        this.staged = staged;
        this.action = REMOVE_PRICE;
    }

    /**
     * create empty instance
     */
    public ProductRemovePriceActionImpl() {
        this.action = REMOVE_PRICE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>id</code> of the Embedded Price to remove.</p>
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is removed. If <code>false</code>, both the current and staged Embedded Price are removed.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setPriceId(final String priceId) {
        this.priceId = priceId;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductRemovePriceActionImpl that = (ProductRemovePriceActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(priceId, that.priceId)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(priceId, that.priceId)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(priceId).append(staged).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("priceId", priceId)
                .append("staged", staged)
                .build();
    }

    @Override
    public ProductRemovePriceAction copyDeep() {
        return ProductRemovePriceAction.deepCopy(this);
    }
}
