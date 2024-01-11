
package com.commercetools.api.search.products;

import java.util.Objects;

public class ContainerExpression implements FilterExpression {
    private final FilterExpression parent;

    private final FilterExpression inner;

    private final boolean renderInnerWithoutParentheses;

    public ContainerExpression() {
        parent = null;
        inner = null;
        renderInnerWithoutParentheses = false;
    }

    public ContainerExpression(final FilterExpression parent, final FilterExpression inner) {
        this.parent = parent;
        this.inner = inner;
        this.renderInnerWithoutParentheses = false;
    }

    public ContainerExpression(final FilterExpression parent, final FilterExpression inner, final boolean renderInnerWithoutParentheses) {
        this.parent = parent;
        this.inner = inner;
        this.renderInnerWithoutParentheses = renderInnerWithoutParentheses;
    }

    public FilterExpression parent() {
        return parent;
    }

    public FilterExpression inner() {
        return inner;
    }

    public boolean renderInnerWithOutParentheses() {
        return renderInnerWithoutParentheses;
    }

    public ContainerExpression parent(final FilterExpression parent) {
        return new ContainerExpression(parent, inner, renderInnerWithoutParentheses);
    }

    public ContainerExpression inner(final FilterExpression element) {
        return new ContainerExpression(parent, element, renderInnerWithoutParentheses);
    }

    public ContainerExpression renderInnerWithOutParentheses(final boolean renderInnerWithoutParentheses) {
        return new ContainerExpression(parent, inner, renderInnerWithoutParentheses);
    }

    @Override
    public String render() {
        if (renderInnerWithoutParentheses) {
            return parent().render() + " " + Objects.requireNonNull(inner).render();
        }
        return parent().render() + "(" + Objects.requireNonNull(inner).render() + ")";
    }

    public static ContainerExpression of() {
        return new ContainerExpression();
    }

    public static ContainerExpression of(final FilterExpression parent, final FilterExpression inner) {
        return new ContainerExpression(parent, inner);
    }

    public static ContainerExpression of(final FilterExpression parent, final FilterExpression inner, final boolean renderInnerWithoutParentheses) {
        return new ContainerExpression(parent, inner, renderInnerWithoutParentheses);
    }
}
