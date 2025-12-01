
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
 * SetApplicationAgreementStatusUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetApplicationAgreementStatusUpdateActionImpl
        implements SetApplicationAgreementStatusUpdateAction, ModelBase {

    private String action;

    private String agreementId;

    private com.commercetools.checkout.models.application.ApplicationAgreementStatus status;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetApplicationAgreementStatusUpdateActionImpl(@JsonProperty("agreementId") final String agreementId,
            @JsonProperty("status") final com.commercetools.checkout.models.application.ApplicationAgreementStatus status) {
        this.agreementId = agreementId;
        this.status = status;
        this.action = SET_AGREEMENT_STATUS;
    }

    /**
     * create empty instance
     */
    public SetApplicationAgreementStatusUpdateActionImpl() {
        this.action = SET_AGREEMENT_STATUS;
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
     *  <p>New status for the agreement.</p>
     */

    public com.commercetools.checkout.models.application.ApplicationAgreementStatus getStatus() {
        return this.status;
    }

    public void setAgreementId(final String agreementId) {
        this.agreementId = agreementId;
    }

    public void setStatus(final com.commercetools.checkout.models.application.ApplicationAgreementStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetApplicationAgreementStatusUpdateActionImpl that = (SetApplicationAgreementStatusUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(agreementId, that.agreementId)
                .append(status, that.status)
                .append(action, that.action)
                .append(agreementId, that.agreementId)
                .append(status, that.status)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(agreementId).append(status).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("agreementId", agreementId)
                .append("status", status)
                .build();
    }

    @Override
    public SetApplicationAgreementStatusUpdateAction copyDeep() {
        return SetApplicationAgreementStatusUpdateAction.deepCopy(this);
    }
}
