
package com.commercetools.api.search.products;

import java.util.Objects;

public class ContainerExpression implements FilterExpression {
    private final FilterExpression parent;

    private final FilterExpression inner;

    public ContainerExpression() {
        parent = null;
        inner = null;
    }

    public ContainerExpression(FilterExpression parent, FilterExpression inner) {
        this.parent = parent;
        this.inner = inner;
    }

    public FilterExpression parent() {
        return parent;
    }

    public FilterExpression inner() {
        return inner;
    }

    public ContainerExpression parent(FilterExpression parent) {
        return new ContainerExpression(parent, inner);
    }

    public ContainerExpression inner(FilterExpression element) {
        return new ContainerExpression(parent, element);
    }

    @Override
    public String render() {
        return parent().render() + "(" + Objects.requireNonNull(inner).render() + ")";
    }

    public static ContainerExpression of() {
        return new ContainerExpression();
    }

    public static ContainerExpression of(FilterExpression parent, FilterExpression inner) {
        return new ContainerExpression(parent, inner);
    }
}
