
package com.commercetools.checkout.models.payment_integration;

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
 *  <p>Display information for the payment integration in the UI.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DisplayInfoImpl implements DisplayInfo, ModelBase {

    private com.commercetools.checkout.models.common.LocalizedString label;

    private com.commercetools.checkout.models.common.LocalizedUrl logoUrl;

    private com.commercetools.checkout.models.common.LocalizedString description;

    private com.commercetools.checkout.models.common.LocalizedString payButtonText;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DisplayInfoImpl(@JsonProperty("label") final com.commercetools.checkout.models.common.LocalizedString label,
            @JsonProperty("logoUrl") final com.commercetools.checkout.models.common.LocalizedUrl logoUrl,
            @JsonProperty("description") final com.commercetools.checkout.models.common.LocalizedString description,
            @JsonProperty("payButtonText") final com.commercetools.checkout.models.common.LocalizedString payButtonText) {
        this.label = label;
        this.logoUrl = logoUrl;
        this.description = description;
        this.payButtonText = payButtonText;
    }

    /**
     * create empty instance
     */
    public DisplayInfoImpl() {
    }

    /**
     *  <p>Label of the payment method displayed in the UI.</p>
     */

    public com.commercetools.checkout.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     *  <p>Logo of the payment method displayed in the UI.</p>
     */

    public com.commercetools.checkout.models.common.LocalizedUrl getLogoUrl() {
        return this.logoUrl;
    }

    /**
     *  <p>Description of the payment method displayed in the UI.</p>
     */

    public com.commercetools.checkout.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Text of the Pay button displayed in the UI when paying with the payment method.</p>
     */

    public com.commercetools.checkout.models.common.LocalizedString getPayButtonText() {
        return this.payButtonText;
    }

    public void setLabel(final com.commercetools.checkout.models.common.LocalizedString label) {
        this.label = label;
    }

    public void setLogoUrl(final com.commercetools.checkout.models.common.LocalizedUrl logoUrl) {
        this.logoUrl = logoUrl;
    }

    public void setDescription(final com.commercetools.checkout.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setPayButtonText(final com.commercetools.checkout.models.common.LocalizedString payButtonText) {
        this.payButtonText = payButtonText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DisplayInfoImpl that = (DisplayInfoImpl) o;

        return new EqualsBuilder().append(label, that.label)
                .append(logoUrl, that.logoUrl)
                .append(description, that.description)
                .append(payButtonText, that.payButtonText)
                .append(label, that.label)
                .append(logoUrl, that.logoUrl)
                .append(description, that.description)
                .append(payButtonText, that.payButtonText)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(label)
                .append(logoUrl)
                .append(description)
                .append(payButtonText)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("label", label)
                .append("logoUrl", logoUrl)
                .append("description", description)
                .append("payButtonText", payButtonText)
                .build();
    }

    @Override
    public DisplayInfo copyDeep() {
        return DisplayInfo.deepCopy(this);
    }
}
