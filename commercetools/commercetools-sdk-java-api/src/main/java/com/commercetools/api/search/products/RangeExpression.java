
package com.commercetools.api.search.products;

public class RangeExpression implements FilterExpression {
    private final FilterExpression from;
    private final FilterExpression to;

    public RangeExpression(FilterExpression from, FilterExpression to) {
        this.from = from;
        this.to = to;
    }

    public FilterExpression from() {
        return from;
    }

    public FilterExpression to() {
        return to;
    }

    @Override
    public String render() {
        return String.format("(%s to %s)", from.render(), to.render());
    }

    public static RangeExpression from(FilterExpression from) {
        return new RangeExpression(from, ConstantExpression.of("*"));
    }

    public static RangeExpression to(FilterExpression to) {
        return new RangeExpression(ConstantExpression.of("*"), to);
    }

    public static RangeExpression of(FilterExpression from, FilterExpression to) {
        return new RangeExpression(from, to);
    }
}
