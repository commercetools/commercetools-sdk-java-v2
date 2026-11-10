
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodCustomTypeSetMessagePayloadQueryBuilderDsl {
    public PaymentMethodCustomTypeSetMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentMethodCustomTypeSetMessagePayloadQueryBuilderDsl of() {
        return new PaymentMethodCustomTypeSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodCustomTypeSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomTypeSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodCustomTypeSetMessagePayloadQueryBuilderDsl> customFields(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customFields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            PaymentMethodCustomTypeSetMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<PaymentMethodCustomTypeSetMessagePayloadQueryBuilderDsl> oldTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldTypeId")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomTypeSetMessagePayloadQueryBuilderDsl::of));
    }

}
