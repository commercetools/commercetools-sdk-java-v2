
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
 *  <p>Setting the country can lead to changes in the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> prices.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCountryActionImpl implements CartSetCountryAction, ModelBase {

    private String action;

    private String country;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetCountryActionImpl(@JsonProperty("country") final String country) {
        this.country = country;
        this.action = SET_COUNTRY;
    }

    /**
     * create empty instance
     */
    public CartSetCountryActionImpl() {
        this.action = SET_COUNTRY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     *  <p>If the Cart is bound to a <code>store</code>, the provided value must be included in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store's</a> <code>countries</code>. Otherwise a <a href="https://docs.commercetools.com/apis/ctp:api:type:CountryNotConfiguredInStoreError" rel="nofollow">CountryNotConfiguredInStore</a> error is returned.</p>
     */

    public String getCountry() {
        return this.country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetCountryActionImpl that = (CartSetCountryActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(country, that.country)
                .append(action, that.action)
                .append(country, that.country)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(country).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("country", country)
                .build();
    }

    @Override
    public CartSetCountryAction copyDeep() {
        return CartSetCountryAction.deepCopy(this);
    }
}
