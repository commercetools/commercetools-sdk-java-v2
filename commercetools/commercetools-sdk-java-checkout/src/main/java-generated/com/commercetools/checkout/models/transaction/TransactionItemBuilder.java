
package com.commercetools.checkout.models.transaction;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransactionItemBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionItemBuilder {

    public com.commercetools.checkout.models.transaction.TransactionItemRecurringBuilder recurringBuilder() {
        return com.commercetools.checkout.models.transaction.TransactionItemRecurringBuilder.of();
    }

    /**
     * factory method for an instance of TransactionItemBuilder
     * @return builder
     */
    public static TransactionItemBuilder of() {
        return new TransactionItemBuilder();
    }

}
