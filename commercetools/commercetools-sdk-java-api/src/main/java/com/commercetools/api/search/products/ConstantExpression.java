
package com.commercetools.api.search.products;

public class ConstantExpression implements FilterExpression {
    private final String value;

    public ConstantExpression(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    @Override
    public String render() {
        return value;
    }

    public static ConstantExpression of(String value) {
        return new ConstantExpression(value);
    }
}
