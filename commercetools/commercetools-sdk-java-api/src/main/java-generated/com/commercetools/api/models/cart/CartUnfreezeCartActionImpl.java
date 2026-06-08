
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Changes the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartState" rel="nofollow">CartState</a> from <code>Frozen</code> to <code>Active</code>. Reactivates a <a href="https://docs.commercetools.com/apis/ctp:api:type:FrozenCarts" rel="nofollow">Frozen Cart</a>. This action updates all prices in the Cart according to latest Prices on related Product Variants and Shipping Methods and by applying all discounts currently being active and applicable for the Cart.</p>
 *  <p>Unfreezing a Cart produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartUnfrozenMessage" rel="nofollow">CartUnfrozen</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartUnfreezeCartActionImpl implements CartUnfreezeCartAction, ModelBase {

    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    public CartUnfreezeCartActionImpl() {
        this.action = UNFREEZE_CART;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartUnfreezeCartActionImpl that = (CartUnfreezeCartActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(action, that.action).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action).build();
    }

    @Override
    public CartUnfreezeCartAction copyDeep() {
        return CartUnfreezeCartAction.deepCopy(this);
    }
}
