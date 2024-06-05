
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.zone.ZoneExpansionBuilderDsl;

public interface ZoneExpansionMixin<T extends ExpandableRequest<T, ZoneExpansionBuilderDsl>>
        extends ExpandableRequest<T, ZoneExpansionBuilderDsl> {
    @Override
    default ZoneExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.zone();
    }
}
