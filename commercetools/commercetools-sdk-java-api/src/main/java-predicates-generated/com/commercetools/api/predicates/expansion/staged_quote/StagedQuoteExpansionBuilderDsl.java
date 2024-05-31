
package com.commercetools.api.predicates.expansion.staged_quote;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class StagedQuoteExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private StagedQuoteExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static StagedQuoteExpansionBuilderDsl of() {
        return new StagedQuoteExpansionBuilderDsl(Collections.emptyList());
    }

    public static StagedQuoteExpansionBuilderDsl of(final List<String> path) {
        return new StagedQuoteExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl lastModifiedBy() {
        return com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl
                .of(appendOne(path, "lastModifiedBy"));
    }

    public com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl createdBy() {
        return com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl
                .of(appendOne(path, "createdBy"));
    }

    public com.commercetools.api.predicates.expansion.customer.CustomerReferenceExpansionBuilderDsl customer() {
        return com.commercetools.api.predicates.expansion.customer.CustomerReferenceExpansionBuilderDsl
                .of(appendOne(path, "customer"));
    }

    public com.commercetools.api.predicates.expansion.quote_request.QuoteRequestReferenceExpansionBuilderDsl quoteRequest() {
        return com.commercetools.api.predicates.expansion.quote_request.QuoteRequestReferenceExpansionBuilderDsl
                .of(appendOne(path, "quoteRequest"));
    }

    public com.commercetools.api.predicates.expansion.cart.CartReferenceExpansionBuilderDsl quotationCart() {
        return com.commercetools.api.predicates.expansion.cart.CartReferenceExpansionBuilderDsl
                .of(appendOne(path, "quotationCart"));
    }

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl custom() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "custom"));
    }

    public com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl state() {
        return com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl
                .of(appendOne(path, "state"));
    }
}
