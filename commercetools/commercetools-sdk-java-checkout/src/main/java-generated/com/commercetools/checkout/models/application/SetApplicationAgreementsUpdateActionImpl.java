
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
 * SetApplicationAgreementsUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetApplicationAgreementsUpdateActionImpl implements SetApplicationAgreementsUpdateAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.checkout.models.application.ApplicationAgreementDraft> agreements;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetApplicationAgreementsUpdateActionImpl(
            @JsonProperty("agreements") final java.util.List<com.commercetools.checkout.models.application.ApplicationAgreementDraft> agreements) {
        this.agreements = agreements;
        this.action = SET_AGREEMENTS;
    }

    /**
     * create empty instance
     */
    public SetApplicationAgreementsUpdateActionImpl() {
        this.action = SET_AGREEMENTS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public java.util.List<com.commercetools.checkout.models.application.ApplicationAgreementDraft> getAgreements() {
        return this.agreements;
    }

    public void setAgreements(
            final com.commercetools.checkout.models.application.ApplicationAgreementDraft... agreements) {
        this.agreements = new ArrayList<>(Arrays.asList(agreements));
    }

    public void setAgreements(
            final java.util.List<com.commercetools.checkout.models.application.ApplicationAgreementDraft> agreements) {
        this.agreements = agreements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetApplicationAgreementsUpdateActionImpl that = (SetApplicationAgreementsUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(agreements, that.agreements)
                .append(action, that.action)
                .append(agreements, that.agreements)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(agreements).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("agreements", agreements)
                .build();
    }

    @Override
    public SetApplicationAgreementsUpdateAction copyDeep() {
        return SetApplicationAgreementsUpdateAction.deepCopy(this);
    }
}
