
package com.commercetools.api.models.recurring_order;

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
 *  <p>Recurring Orders are automatically assigned the Store and/or Business Unit from the associated Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderDraftImpl implements RecurringOrderDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.cart.CartResourceIdentifier cart;

    private Long cartVersion;

    private java.time.ZonedDateTime startsAt;

    private java.time.ZonedDateTime expiresAt;

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("cart") final com.commercetools.api.models.cart.CartResourceIdentifier cart,
            @JsonProperty("cartVersion") final Long cartVersion,
            @JsonProperty("startsAt") final java.time.ZonedDateTime startsAt,
            @JsonProperty("expiresAt") final java.time.ZonedDateTime expiresAt,
            @JsonProperty("state") final com.commercetools.api.models.state.StateResourceIdentifier state,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.key = key;
        this.cart = cart;
        this.cartVersion = cartVersion;
        this.startsAt = startsAt;
        this.expiresAt = expiresAt;
        this.state = state;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public RecurringOrderDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the Cart from which the RecurringOrder is created.</p>
     */

    public com.commercetools.api.models.cart.CartResourceIdentifier getCart() {
        return this.cart;
    }

    /**
     *  <p>Current version of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     */

    public Long getCartVersion() {
        return this.cartVersion;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder will start. When specified, the date and time must be in the future. If not specified, the recurring order will start immediately.</p>
     */

    public java.time.ZonedDateTime getStartsAt() {
        return this.startsAt;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder will expire.</p>
     */

    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    /**
     *  <p>State for the RecurringOrder in a custom workflow.</p>
     */

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    /**
     *  <p>Custom Fields for the RecurringOrder.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setCart(final com.commercetools.api.models.cart.CartResourceIdentifier cart) {
        this.cart = cart;
    }

    public void setCartVersion(final Long cartVersion) {
        this.cartVersion = cartVersion;
    }

    public void setStartsAt(final java.time.ZonedDateTime startsAt) {
        this.startsAt = startsAt;
    }

    public void setExpiresAt(final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public void setState(final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderDraftImpl that = (RecurringOrderDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(cart, that.cart)
                .append(cartVersion, that.cartVersion)
                .append(startsAt, that.startsAt)
                .append(expiresAt, that.expiresAt)
                .append(state, that.state)
                .append(custom, that.custom)
                .append(key, that.key)
                .append(cart, that.cart)
                .append(cartVersion, that.cartVersion)
                .append(startsAt, that.startsAt)
                .append(expiresAt, that.expiresAt)
                .append(state, that.state)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(cart)
                .append(cartVersion)
                .append(startsAt)
                .append(expiresAt)
                .append(state)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("cart", cart)
                .append("cartVersion", cartVersion)
                .append("startsAt", startsAt)
                .append("expiresAt", expiresAt)
                .append("state", state)
                .append("custom", custom)
                .build();
    }

    @Override
    public RecurringOrderDraft copyDeep() {
        return RecurringOrderDraft.deepCopy(this);
    }
}
