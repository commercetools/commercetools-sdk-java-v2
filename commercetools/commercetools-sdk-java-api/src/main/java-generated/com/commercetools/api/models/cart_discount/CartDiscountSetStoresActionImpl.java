
package com.commercetools.api.models.cart_discount;

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
 *  <p>If a referenced Store does not exist, a ReferencedResourceNotFound error is returned.</p>
 *  <p>This action generates a CartDiscountStoresSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountSetStoresActionImpl implements CartDiscountSetStoresAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountSetStoresActionImpl(
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        this.action = SET_STORES;
    }

    /**
     * create empty instance
     */
    public CartDiscountSetStoresActionImpl() {
        this.action = SET_STORES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Stores to set. Overrides the current list of Stores. If empty, any existing values will be removed.</p>
     *  <p>A failed update can return the following errors:</p>
     *  <ul>
     *   <li>If the referenced Stores exceed the limit, a MaxStoreReferencesReached error is returned.</li>
     *   <li>If the referenced Stores exceed the limit for Cart Discounts that do not require a Discount Code, a StoreCartDiscountsLimitReached error is returned.</li>
     *  </ul>
     */

    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    public void setStores(final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
    }

    public void setStores(final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartDiscountSetStoresActionImpl that = (CartDiscountSetStoresActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(stores, that.stores)
                .append(action, that.action)
                .append(stores, that.stores)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(stores).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("stores", stores)
                .build();
    }

}
