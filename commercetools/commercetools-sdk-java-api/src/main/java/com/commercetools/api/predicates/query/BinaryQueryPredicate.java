
package com.commercetools.api.predicates.query;

import java.util.Objects;

import com.commercetools.api.predicates.BinaryPredicate;

import org.apache.commons.lang3.StringUtils;

public class BinaryQueryPredicate implements BinaryPredicate<QueryPredicate>, QueryPredicate {

    private final QueryPredicate left;
    private final QueryPredicate right;
    private final String operator;

    public BinaryQueryPredicate(QueryPredicate left, QueryPredicate right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public BinaryQueryPredicate() {
        this.left = null;
        this.right = null;
        this.operator = null;
    }

    @Override
    public QueryPredicate left() {
        return left;
    }

    @Override
    public QueryPredicate right() {
        return right;
    }

    @Override
    public String operator() {
        return operator;
    }

    public BinaryQueryPredicate left(QueryPredicate predicate) {
        return new BinaryQueryPredicate(predicate, right, operator);
    }

    public BinaryQueryPredicate right(QueryPredicate predicate) {
        return new BinaryQueryPredicate(left, predicate, operator);
    }

    public BinaryQueryPredicate operator(String operator) {
        return new BinaryQueryPredicate(left, right, operator);
    }

    @Override
    public String render() {
        Objects.requireNonNull(left);
        Objects.requireNonNull(right);
        // if the operator is empty or null, then remove it to avoid double spaces
        if (StringUtils.isBlank(operator())) {
            return String.format("%s %s", left().render(), right().render()).trim();
        }
        return String.format("%s %s %s", left().render(), operator(), right().render()).trim();
    }

    public static BinaryQueryPredicate of() {
        return new BinaryQueryPredicate();
    }
}
