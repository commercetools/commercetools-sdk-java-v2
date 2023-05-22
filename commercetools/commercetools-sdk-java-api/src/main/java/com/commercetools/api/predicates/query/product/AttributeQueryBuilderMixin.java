
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.CombinationQueryPredicate;
import com.commercetools.api.predicates.query.ConstantQueryPredicate;
import com.commercetools.api.predicates.query.ContainerQueryPredicate;
import com.commercetools.api.predicates.query.product_type.AttributePlainEnumValueQueryBuilderDsl;

public interface AttributeQueryBuilderMixin {
    default CombinationQueryPredicate<AttributeQueryBuilderDsl> plainEnum(
            Function<AttributePlainEnumValueQueryBuilderDsl, CombinationQueryPredicate<AttributePlainEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(new ConstantQueryPredicate("value"))
                .inner(fn.apply(AttributePlainEnumValueQueryBuilderDsl.of())),
            AttributeQueryBuilderDsl::of);
    }

}
