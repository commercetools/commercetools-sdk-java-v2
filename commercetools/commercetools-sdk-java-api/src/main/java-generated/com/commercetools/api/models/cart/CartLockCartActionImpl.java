
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
 *  <p><span>Locks</span> a Cart, preventing all updates from API Clients without an elevated <span>OAuth 2.0 Scope</span>. This action sets the Cart's <code>lock</code> <span>field</span> which identifies the API Client that locked the Cart and when the lock was applied. This action requires an additional OAuth 2.0 Scope <code>manage_locked_carts</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartLockCartActionImpl implements CartLockCartAction, ModelBase {

    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    public CartLockCartActionImpl() {
        this.action = LOCK_CART;
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

        CartLockCartActionImpl that = (CartLockCartActionImpl) o;

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
    public CartLockCartAction copyDeep() {
        return CartLockCartAction.deepCopy(this);
    }
}
