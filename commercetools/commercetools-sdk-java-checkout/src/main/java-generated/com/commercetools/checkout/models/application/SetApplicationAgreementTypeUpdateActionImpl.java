
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
 * SetApplicationAgreementTypeUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetApplicationAgreementTypeUpdateActionImpl implements SetApplicationAgreementTypeUpdateAction, ModelBase {

    private String action;

    private String agreementId;

    private com.commercetools.checkout.models.application.ApplicationAgreementType type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetApplicationAgreementTypeUpdateActionImpl(@JsonProperty("agreementId") final String agreementId,
            @JsonProperty("type") final com.commercetools.checkout.models.application.ApplicationAgreementType type) {
        this.agreementId = agreementId;
        this.type = type;
        this.action = SET_AGREEMENT_TYPE;
    }

    /**
     * create empty instance
     */
    public SetApplicationAgreementTypeUpdateActionImpl() {
        this.action = SET_AGREEMENT_TYPE;
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
     *  <p>New type for the agreement.</p>
     */

    public com.commercetools.checkout.models.application.ApplicationAgreementType getType() {
        return this.type;
    }

    public void setAgreementId(final String agreementId) {
        this.agreementId = agreementId;
    }

    public void setType(final com.commercetools.checkout.models.application.ApplicationAgreementType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetApplicationAgreementTypeUpdateActionImpl that = (SetApplicationAgreementTypeUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(agreementId, that.agreementId)
                .append(type, that.type)
                .append(action, that.action)
                .append(agreementId, that.agreementId)
                .append(type, that.type)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(agreementId).append(type).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("agreementId", agreementId)
                .append("type", type)
                .build();
    }

    @Override
    public SetApplicationAgreementTypeUpdateAction copyDeep() {
        return SetApplicationAgreementTypeUpdateAction.deepCopy(this);
    }
}
