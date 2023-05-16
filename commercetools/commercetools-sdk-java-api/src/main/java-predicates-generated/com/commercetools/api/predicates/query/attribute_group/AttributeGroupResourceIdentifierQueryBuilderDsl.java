
package com.commercetools.api.predicates.query.attribute_group;

import com.commercetools.api.predicates.query.*;

public class AttributeGroupResourceIdentifierQueryBuilderDsl {
    public AttributeGroupResourceIdentifierQueryBuilderDsl() {
    }

    public static AttributeGroupResourceIdentifierQueryBuilderDsl of() {
        return new AttributeGroupResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeGroupResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeGroupResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeGroupResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupResourceIdentifierQueryBuilderDsl::of));
    }

}
