
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
 * RemoveApplicationAgreementUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveApplicationAgreementUpdateActionImpl implements RemoveApplicationAgreementUpdateAction, ModelBase {

    private String action;

    private String agreementId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RemoveApplicationAgreementUpdateActionImpl(@JsonProperty("agreementId") final String agreementId) {
        this.agreementId = agreementId;
        this.action = REMOVE_AGREEMENT;
    }

    /**
     * create empty instance
     */
    public RemoveApplicationAgreementUpdateActionImpl() {
        this.action = REMOVE_AGREEMENT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>ID of the agreement to remove from the Application.</p>
     */

    public String getAgreementId() {
        return this.agreementId;
    }

    public void setAgreementId(final String agreementId) {
        this.agreementId = agreementId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RemoveApplicationAgreementUpdateActionImpl that = (RemoveApplicationAgreementUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(agreementId, that.agreementId)
                .append(action, that.action)
                .append(agreementId, that.agreementId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(agreementId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("agreementId", agreementId)
                .build();
    }

    @Override
    public RemoveApplicationAgreementUpdateAction copyDeep() {
        return RemoveApplicationAgreementUpdateAction.deepCopy(this);
    }
}
