
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
 * SetApplicationAgreementNameUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetApplicationAgreementNameUpdateActionImpl implements SetApplicationAgreementNameUpdateAction, ModelBase {

    private String action;

    private String agreementId;

    private String name;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetApplicationAgreementNameUpdateActionImpl(@JsonProperty("agreementId") final String agreementId,
            @JsonProperty("name") final String name) {
        this.agreementId = agreementId;
        this.name = name;
        this.action = SET_AGREEMENT_NAME;
    }

    /**
     * create empty instance
     */
    public SetApplicationAgreementNameUpdateActionImpl() {
        this.action = SET_AGREEMENT_NAME;
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
     *  <p>New name for the agreement.</p>
     */

    public String getName() {
        return this.name;
    }

    public void setAgreementId(final String agreementId) {
        this.agreementId = agreementId;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetApplicationAgreementNameUpdateActionImpl that = (SetApplicationAgreementNameUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(agreementId, that.agreementId)
                .append(name, that.name)
                .append(action, that.action)
                .append(agreementId, that.agreementId)
                .append(name, that.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(agreementId).append(name).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("agreementId", agreementId)
                .append("name", name)
                .build();
    }

    @Override
    public SetApplicationAgreementNameUpdateAction copyDeep() {
        return SetApplicationAgreementNameUpdateAction.deepCopy(this);
    }
}
