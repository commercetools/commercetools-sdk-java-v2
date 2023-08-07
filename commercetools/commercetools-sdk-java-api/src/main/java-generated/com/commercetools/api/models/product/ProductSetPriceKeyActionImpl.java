
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

/**
 *  <p>Sets the key of an Embedded Price. Produces the ProductPriceKeySet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetPriceKeyActionImpl implements ProductSetPriceKeyAction, ModelBase {

    private String action;

    private String priceId;

    private Boolean staged;

    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSetPriceKeyActionImpl(@JsonProperty("priceId") final String priceId,
            @JsonProperty("staged") final Boolean staged, @JsonProperty("key") final String key) {
        this.priceId = priceId;
        this.staged = staged;
        this.key = key;
        this.action = SET_PRICE_KEY;
    }

    /**
     * create empty instance
     */
    public ProductSetPriceKeyActionImpl() {
        this.action = SET_PRICE_KEY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>id</code> of the Price to set the key.</p>
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public String getKey() {
        return this.key;
    }

    public void setPriceId(final String priceId) {
        this.priceId = priceId;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSetPriceKeyActionImpl that = (ProductSetPriceKeyActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(priceId, that.priceId)
                .append(staged, that.staged)
                .append(key, that.key)
                .append(action, that.action)
                .append(priceId, that.priceId)
                .append(staged, that.staged)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(priceId).append(staged).append(key).toHashCode();
    }

}
