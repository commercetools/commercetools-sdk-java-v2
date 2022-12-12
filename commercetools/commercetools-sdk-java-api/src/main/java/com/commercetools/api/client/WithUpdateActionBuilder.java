
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

@FunctionalInterface
public interface WithUpdateActionBuilder<TAction, TActionBuilder, TMethod> {
    TMethod with(UnaryOperator<UpdateActionBuilder<TAction, TActionBuilder>> op);
}
