
package com.commercetools.api.models.me;

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
 *  <p>Setting the default billing address on a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitDefaultBillingAddressSetMessage" rel="nofollow">BusinessUnitDefaultBillingAddressSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitSetDefaultBillingAddressActionImpl
        implements MyBusinessUnitSetDefaultBillingAddressAction, ModelBase {

    private String action;

    private String addressId;

    private String addressKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyBusinessUnitSetDefaultBillingAddressActionImpl(@JsonProperty("addressId") final String addressId,
            @JsonProperty("addressKey") final String addressKey) {
        this.addressId = addressId;
        this.addressKey = addressKey;
        this.action = SET_DEFAULT_BILLING_ADDRESS;
    }

    /**
     * create empty instance
     */
    public MyBusinessUnitSetDefaultBillingAddressActionImpl() {
        this.action = SET_DEFAULT_BILLING_ADDRESS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>ID of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p>Key of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public String getAddressKey() {
        return this.addressKey;
    }

    public void setAddressId(final String addressId) {
        this.addressId = addressId;
    }

    public void setAddressKey(final String addressKey) {
        this.addressKey = addressKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyBusinessUnitSetDefaultBillingAddressActionImpl that = (MyBusinessUnitSetDefaultBillingAddressActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(addressId, that.addressId)
                .append(addressKey, that.addressKey)
                .append(action, that.action)
                .append(addressId, that.addressId)
                .append(addressKey, that.addressKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(addressId).append(addressKey).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("addressId", addressId)
                .append("addressKey", addressKey)
                .build();
    }

    @Override
    public MyBusinessUnitSetDefaultBillingAddressAction copyDeep() {
        return MyBusinessUnitSetDefaultBillingAddressAction.deepCopy(this);
    }
}
