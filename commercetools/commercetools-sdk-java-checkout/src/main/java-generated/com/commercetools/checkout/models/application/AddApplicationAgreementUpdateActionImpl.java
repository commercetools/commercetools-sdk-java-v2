
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
 * AddApplicationAgreementUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddApplicationAgreementUpdateActionImpl implements AddApplicationAgreementUpdateAction, ModelBase {

    private String action;

    private com.commercetools.checkout.models.application.ApplicationAgreementDraft agreement;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AddApplicationAgreementUpdateActionImpl(
            @JsonProperty("agreement") final com.commercetools.checkout.models.application.ApplicationAgreementDraft agreement) {
        this.agreement = agreement;
        this.action = ADD_AGREEMENT;
    }

    /**
     * create empty instance
     */
    public AddApplicationAgreementUpdateActionImpl() {
        this.action = ADD_AGREEMENT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Agreement to add to the Application.</p>
     */

    public com.commercetools.checkout.models.application.ApplicationAgreementDraft getAgreement() {
        return this.agreement;
    }

    public void setAgreement(final com.commercetools.checkout.models.application.ApplicationAgreementDraft agreement) {
        this.agreement = agreement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AddApplicationAgreementUpdateActionImpl that = (AddApplicationAgreementUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(agreement, that.agreement)
                .append(action, that.action)
                .append(agreement, that.agreement)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(agreement).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("agreement", agreement)
                .build();
    }

    @Override
    public AddApplicationAgreementUpdateAction copyDeep() {
        return AddApplicationAgreementUpdateAction.deepCopy(this);
    }
}
