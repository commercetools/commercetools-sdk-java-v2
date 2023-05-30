
package com.commercetools.api.predicates.query;

import java.util.Optional;

import com.commercetools.api.predicates.ContainerPredicate;
import com.commercetools.api.predicates.Predicate;

public class ContainerQueryPredicate implements ContainerPredicate<QueryPredicate>, QueryPredicate {
    private final QueryPredicate parent;

    private final QueryPredicate inner;

    private final boolean renderInnerWithoutParentheses;

    public ContainerQueryPredicate() {
        this.parent = null;
        this.inner = null;
        this.renderInnerWithoutParentheses = false;
    }

    public ContainerQueryPredicate(final QueryPredicate parent, final QueryPredicate inner) {
        this(parent, inner, false);
    }

    public ContainerQueryPredicate(final QueryPredicate parent, final QueryPredicate inner,
            final boolean renderInnerWithoutParentheses) {
        this.parent = parent;
        this.inner = inner;
        this.renderInnerWithoutParentheses = renderInnerWithoutParentheses;
    }

    @Override
    public QueryPredicate parent() {
        return parent;
    }

    @Override
    public QueryPredicate inner() {
        return inner;
    }

    @Override
    public boolean renderInnerWithOutParentheses() {
        return renderInnerWithoutParentheses;
    }

    public ContainerQueryPredicate parent(final QueryPredicate parent) {
        return new ContainerQueryPredicate(parent, inner, renderInnerWithoutParentheses);

    }

    public ContainerQueryPredicate inner(final QueryPredicate inner) {
        return new ContainerQueryPredicate(parent, inner, renderInnerWithoutParentheses);
    }

    public ContainerQueryPredicate renderInnerWithOutParentheses(final boolean renderInnerWithoutParentheses) {
        return new ContainerQueryPredicate(parent, inner, renderInnerWithoutParentheses);
    }

    /**
     * Remove Parentheses from Inner if RenderInnerWithOutParentheses is true
     * @return expression result as string
     */
    public String render() {
        if (this.renderInnerWithOutParentheses()) {
            return this.parent() != null
                    ? String.format("%s %s", parent().render(),
                        Optional.ofNullable(inner()).map(Predicate::render).orElse(""))
                    : Optional.ofNullable(inner()).map(Predicate::render).orElse("");
        }
        return this.parent() != null
                ? String.format("%s(%s)", parent().render(),
                    Optional.ofNullable(inner()).map(Predicate::render).orElse(""))
                : String.format("(%s)", Optional.ofNullable(inner()).map(Predicate::render).orElse(""));
    }

    public static ContainerQueryPredicate of() {
        return new ContainerQueryPredicate();
    }
}
