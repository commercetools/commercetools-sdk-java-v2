
package com.commercetools.checkout.models.application;

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
 * SetApplicationAgreementTextUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetApplicationAgreementTextUpdateActionImpl implements SetApplicationAgreementTextUpdateAction, ModelBase {

    private String action;

    private String agreementId;

    private com.commercetools.checkout.models.common.LocalizedString text;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetApplicationAgreementTextUpdateActionImpl(@JsonProperty("agreementId") final String agreementId,
            @JsonProperty("text") final com.commercetools.checkout.models.common.LocalizedString text) {
        this.agreementId = agreementId;
        this.text = text;
        this.action = SET_AGREEMENT_TEXT;
    }

    /**
     * create empty instance
     */
    public SetApplicationAgreementTextUpdateActionImpl() {
        this.action = SET_AGREEMENT_TEXT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>ID of the agreement to update.</p>
     */

    public String getAgreementId() {
        return this.agreementId;
    }

    /**
     *  <p>New text for the agreement.</p>
     */

    public com.commercetools.checkout.models.common.LocalizedString getText() {
        return this.text;
    }

    public void setAgreementId(final String agreementId) {
        this.agreementId = agreementId;
    }

    public void setText(final com.commercetools.checkout.models.common.LocalizedString text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetApplicationAgreementTextUpdateActionImpl that = (SetApplicationAgreementTextUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(agreementId, that.agreementId)
                .append(text, that.text)
                .append(action, that.action)
                .append(agreementId, that.agreementId)
                .append(text, that.text)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(agreementId).append(text).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("agreementId", agreementId)
                .append("text", text)
                .build();
    }

    @Override
    public SetApplicationAgreementTextUpdateAction copyDeep() {
        return SetApplicationAgreementTextUpdateAction.deepCopy(this);
    }
}
