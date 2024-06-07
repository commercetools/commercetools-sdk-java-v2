
package com.commercetools.api.search.products;

import java.util.*;

public class ExistsTermFilterExpression extends TermFilterExpression<String> {

    public ExistsTermFilterExpression(PathExpression expression) {
        super(expression, TermFormatter::format);
    }

    public ExistsTermFilterExpression(PathExpression expression, List<FilterExpression> term) {
        super(expression, term, TermFormatter::format);
    }

    public FilterExpression missing() {
        return new ExistsTermFilterExpression(expression(),
            Collections.singletonList(ConstantExpression.of("missing")));
    }

    public FilterExpression exists() {
        return new ExistsTermFilterExpression(expression(), Collections.singletonList(ConstantExpression.of("exists")));
    }

    public static ExistsTermFilterExpression of(PathExpression expression) {
        return new ExistsTermFilterExpression(expression);
    }
}
