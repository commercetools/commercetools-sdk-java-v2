
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
 * ReorderApplicationAgreementUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReorderApplicationAgreementUpdateActionImpl implements ReorderApplicationAgreementUpdateAction, ModelBase {

    private String action;

    private java.util.List<String> agreementIds;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReorderApplicationAgreementUpdateActionImpl(
            @JsonProperty("agreementIds") final java.util.List<String> agreementIds) {
        this.agreementIds = agreementIds;
        this.action = REORDER_AGREEMENT;
    }

    /**
     * create empty instance
     */
    public ReorderApplicationAgreementUpdateActionImpl() {
        this.action = REORDER_AGREEMENT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Array of agreement IDs.</p>
     */

    public java.util.List<String> getAgreementIds() {
        return this.agreementIds;
    }

    public void setAgreementIds(final String... agreementIds) {
        this.agreementIds = new ArrayList<>(Arrays.asList(agreementIds));
    }

    public void setAgreementIds(final java.util.List<String> agreementIds) {
        this.agreementIds = agreementIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReorderApplicationAgreementUpdateActionImpl that = (ReorderApplicationAgreementUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(agreementIds, that.agreementIds)
                .append(action, that.action)
                .append(agreementIds, that.agreementIds)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(agreementIds).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("agreementIds", agreementIds)
                .build();
    }

    @Override
    public ReorderApplicationAgreementUpdateAction copyDeep() {
        return ReorderApplicationAgreementUpdateAction.deepCopy(this);
    }
}
