
package com.commercetools.api.models.cart;

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
 *  <p>Freezes the Cart based on the provided <a href="https://docs.commercetools.com/apis/ctp:api:type:FreezeStrategy" rel="nofollow">FreezeStrategy</a>.</p>
 *  <p>The following behavior occurs:</p>
 *  <ul>
 *   <li>Changes the Cart State from <code>Active</code> to <code>Frozen</code>.</li>
 *   <li>Sets the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:FreezeStrategy" rel="nofollow">FreezeStrategy</a> on the Cart's <code>freezeStrategy</code> field.</li>
 *   <li>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartFrozenMessage" rel="nofollow">CartFrozen</a> Message.</li>
 *  </ul>
 *  <p>If the Cart is empty, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartFreezeCartActionImpl implements CartFreezeCartAction, ModelBase {

    private String action;

    private com.commercetools.api.models.cart.FreezeStrategy strategy;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartFreezeCartActionImpl(
            @JsonProperty("strategy") final com.commercetools.api.models.cart.FreezeStrategy strategy) {
        this.strategy = strategy;
        this.action = FREEZE_CART;
    }

    /**
     * create empty instance
     */
    public CartFreezeCartActionImpl() {
        this.action = FREEZE_CART;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Strategy that determines the freezing behavior.</p>
     */

    public com.commercetools.api.models.cart.FreezeStrategy getStrategy() {
        return this.strategy;
    }

    public void setStrategy(final com.commercetools.api.models.cart.FreezeStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartFreezeCartActionImpl that = (CartFreezeCartActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(strategy, that.strategy)
                .append(action, that.action)
                .append(strategy, that.strategy)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(strategy).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("strategy", strategy)
                .build();
    }

    @Override
    public CartFreezeCartAction copyDeep() {
        return CartFreezeCartAction.deepCopy(this);
    }
}
