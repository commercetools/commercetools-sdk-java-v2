
package com.commercetools.api.search.products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PathExpression implements FilterExpression {
    private final List<FilterExpression> paths;

    public PathExpression() {
        paths = new ArrayList<>();
    }

    public PathExpression(FilterExpression path) {
        this.paths = Collections.singletonList(path);
    }

    public PathExpression(List<FilterExpression> paths) {
        this.paths = paths;
    }

    public List<FilterExpression> paths() {
        return paths;
    }

    public PathExpression add(String element) {
        List<FilterExpression> p = new ArrayList<>(paths);
        p.add(ConstantExpression.of(element));
        return new PathExpression(p);
    }

    public PathExpression add(FilterExpression element) {
        List<FilterExpression> p = new ArrayList<>(paths);
        p.add(element);
        return new PathExpression(p);
    }

    @Override
    public String render() {
        return paths.stream().map(FilterExpression::render).collect(Collectors.joining("."));
    }

    public static PathExpression of() {
        return new PathExpression();
    }

    public static PathExpression of(String parent) {
        return new PathExpression(ConstantExpression.of(parent));
    }

    public static PathExpression of(FilterExpression parent) {
        return new PathExpression(parent);
    }
}
