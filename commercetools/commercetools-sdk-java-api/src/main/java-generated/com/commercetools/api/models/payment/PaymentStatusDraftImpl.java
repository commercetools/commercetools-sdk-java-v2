
package com.commercetools.api.models.payment;

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
 * PaymentStatusDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentStatusDraftImpl implements PaymentStatusDraft, ModelBase {

    private String interfaceCode;

    private String interfaceText;

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentStatusDraftImpl(@JsonProperty("interfaceCode") final String interfaceCode,
            @JsonProperty("interfaceText") final String interfaceText,
            @JsonProperty("state") final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.interfaceCode = interfaceCode;
        this.interfaceText = interfaceText;
        this.state = state;
    }

    /**
     * create empty instance
     */
    public PaymentStatusDraftImpl() {
    }

    /**
     *  <p>External reference that identifies the current status of the Payment.</p>
     */

    public String getInterfaceCode() {
        return this.interfaceCode;
    }

    /**
     *  <p>Text describing the current status of the Payment.</p>
     */

    public String getInterfaceText() {
        return this.interfaceText;
    }

    /**
     *  <p>ResourceIdentifier to a State.</p>
     */

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    public void setInterfaceCode(final String interfaceCode) {
        this.interfaceCode = interfaceCode;
    }

    public void setInterfaceText(final String interfaceText) {
        this.interfaceText = interfaceText;
    }

    public void setState(final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentStatusDraftImpl that = (PaymentStatusDraftImpl) o;

        return new EqualsBuilder().append(interfaceCode, that.interfaceCode)
                .append(interfaceText, that.interfaceText)
                .append(state, that.state)
                .append(interfaceCode, that.interfaceCode)
                .append(interfaceText, that.interfaceText)
                .append(state, that.state)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(interfaceCode).append(interfaceText).append(state).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("interfaceCode", interfaceCode)
                .append("interfaceText", interfaceText)
                .append("state", state)
                .build();
    }

    @Override
    public PaymentStatusDraft copyDeep() {
        return PaymentStatusDraft.deepCopy(this);
    }
}
