
package com.commercetools.checkout.models.transaction;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransactionItemDraftBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionItemDraftBuilder {

    public com.commercetools.checkout.models.transaction.TransactionItemRecurringDraftBuilder recurringBuilder() {
        return com.commercetools.checkout.models.transaction.TransactionItemRecurringDraftBuilder.of();
    }

    /**
     * factory method for an instance of TransactionItemDraftBuilder
     * @return builder
     */
    public static TransactionItemDraftBuilder of() {
        return new TransactionItemDraftBuilder();
    }

}
