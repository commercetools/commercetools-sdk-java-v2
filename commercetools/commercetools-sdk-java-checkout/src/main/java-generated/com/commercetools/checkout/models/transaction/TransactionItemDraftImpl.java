
package com.commercetools.checkout.models.transaction;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Base type for creating a Transaction Item. If <code>type</code> is omitted, a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:TransactionItemPaymentIntegrationDraft" rel="nofollow">TransactionItemPaymentIntegrationDraft</a> is created to process the payment through a Payment Integration. Each supported payment flow has its own corresponding Transaction Item Draft type, like <a href="https://docs.commercetools.com/apis/ctp:checkout:type:TransactionItemRecurringDraft" rel="nofollow">TransactionItemRecurringDraft</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionItemDraftImpl implements TransactionItemDraft, ModelBase {

    private String type;

    private com.commercetools.checkout.models.common.Amount amount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TransactionItemDraftImpl(@JsonProperty("type") final String type,
            @JsonProperty("amount") final com.commercetools.checkout.models.common.Amount amount) {
        this.type = type;
        this.amount = amount;
    }

    /**
     * create empty instance
     */
    public TransactionItemDraftImpl() {
    }

    /**
     *  <p>Type of the Transaction Item to create.</p>
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Money value of the Transaction Item. If not present, the Connector resolves the amount from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     */

    public com.commercetools.checkout.models.common.Amount getAmount() {
        return this.amount;
    }

    public void setAmount(final com.commercetools.checkout.models.common.Amount amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TransactionItemDraftImpl that = (TransactionItemDraftImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(amount, that.amount)
                .append(type, that.type)
                .append(amount, that.amount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(amount).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("amount", amount)
                .build();
    }

    @Override
    public TransactionItemDraft copyDeep() {
        return TransactionItemDraft.deepCopy(this);
    }
}
