
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
 * Shipping
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingImpl implements Shipping, ModelBase {

    private String shippingKey;

    private com.commercetools.api.models.cart.ShippingInfo shippingInfo;

    private com.commercetools.api.models.common.Address shippingAddress;

    private com.commercetools.api.models.cart.ShippingRateInput shippingRateInput;

    private com.commercetools.api.models.type.CustomFields shippingCustomFields;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingImpl(@JsonProperty("shippingKey") final String shippingKey,
            @JsonProperty("shippingInfo") final com.commercetools.api.models.cart.ShippingInfo shippingInfo,
            @JsonProperty("shippingAddress") final com.commercetools.api.models.common.Address shippingAddress,
            @JsonProperty("shippingRateInput") final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput,
            @JsonProperty("shippingCustomFields") final com.commercetools.api.models.type.CustomFields shippingCustomFields) {
        this.shippingKey = shippingKey;
        this.shippingInfo = shippingInfo;
        this.shippingAddress = shippingAddress;
        this.shippingRateInput = shippingRateInput;
        this.shippingCustomFields = shippingCustomFields;
    }

    /**
     * create empty instance
     */
    public ShippingImpl() {
    }

    /**
     *  <p>User-defined unique identifier of the Shipping in a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Automatically set when the Shipping Method is added.</p>
     */

    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo() {
        return this.shippingInfo;
    }

    /**
     *  <p>Determines the shipping rates and Tax Rates of associated Line Items.</p>
     */

    public com.commercetools.api.models.common.Address getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Used as an input to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is ClassificationShippingRateInput.</li>
     *   <li>If <code>CartScore</code>, it is ScoreShippingRateInput.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     */

    public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput() {
        return this.shippingRateInput;
    }

    /**
     *  <p>Custom Fields of Shipping with <code>Multiple</code> ShippingMode.</p>
     */

    public com.commercetools.api.models.type.CustomFields getShippingCustomFields() {
        return this.shippingCustomFields;
    }

    public void setShippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
    }

    public void setShippingInfo(final com.commercetools.api.models.cart.ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public void setShippingAddress(final com.commercetools.api.models.common.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setShippingRateInput(final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
    }

    public void setShippingCustomFields(final com.commercetools.api.models.type.CustomFields shippingCustomFields) {
        this.shippingCustomFields = shippingCustomFields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingImpl that = (ShippingImpl) o;

        return new EqualsBuilder().append(shippingKey, that.shippingKey)
                .append(shippingInfo, that.shippingInfo)
                .append(shippingAddress, that.shippingAddress)
                .append(shippingRateInput, that.shippingRateInput)
                .append(shippingCustomFields, that.shippingCustomFields)
                .append(shippingKey, that.shippingKey)
                .append(shippingInfo, that.shippingInfo)
                .append(shippingAddress, that.shippingAddress)
                .append(shippingRateInput, that.shippingRateInput)
                .append(shippingCustomFields, that.shippingCustomFields)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(shippingKey)
                .append(shippingInfo)
                .append(shippingAddress)
                .append(shippingRateInput)
                .append(shippingCustomFields)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("shippingKey", shippingKey)
                .append("shippingInfo", shippingInfo)
                .append("shippingAddress", shippingAddress)
                .append("shippingRateInput", shippingRateInput)
                .append("shippingCustomFields", shippingCustomFields)
                .build();
    }

    @Override
    public Shipping copyDeep() {
        return Shipping.deepCopy(this);
    }
}
