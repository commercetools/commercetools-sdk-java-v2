
package com.commercetools.api.predicates.query.type;

public interface FieldContainerQueryBuilderMixin {

    default FieldContainerValueQueryBuilderDsl field(final String fieldName) {
        return new FieldContainerValueQueryBuilderDsl(fieldName);
    }
}
