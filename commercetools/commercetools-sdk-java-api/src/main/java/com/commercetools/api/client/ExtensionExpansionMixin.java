
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.extension.ExtensionExpansionBuilderDsl;

public interface ExtensionExpansionMixin<T extends ExpandableRequest<T, ExtensionExpansionBuilderDsl>>
        extends ExpandableRequest<T, ExtensionExpansionBuilderDsl> {
    @Override
    default ExtensionExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.extension();
    }
}
