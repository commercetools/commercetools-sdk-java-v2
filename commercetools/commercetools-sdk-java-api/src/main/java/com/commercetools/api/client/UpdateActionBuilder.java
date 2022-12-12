
package com.commercetools.api.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import io.vrap.rmf.base.client.Builder;

//@FunctionalInterface
public class UpdateActionBuilder<TAction, TActionBuilder> {
    List<TAction> actions = new ArrayList<>();
    Supplier<TActionBuilder> actionBuilder;

    public UpdateActionBuilder(Supplier<TActionBuilder> actionBuilder) {
        this.actionBuilder = actionBuilder;
    }

    public static <TAction, TActionBuilder> UpdateActionBuilder<TAction, TActionBuilder> of(
            Supplier<TActionBuilder> actionBuilder) {
        return new UpdateActionBuilder<>(actionBuilder);
    }

    public UpdateActionBuilder<TAction, TActionBuilder> plus(TAction action) {
        actions.add(action);

        return this;
    }

    public UpdateActionBuilder<TAction, TActionBuilder> plus(Collection<TAction> action) {
        actions.addAll(action);

        return this;
    }

    public UpdateActionBuilder<TAction, TActionBuilder> plus(Builder<? extends TAction> action) {
        actions.add(action.build());

        return this;
    }

    public UpdateActionBuilder<TAction, TActionBuilder> plus(
            Function<TActionBuilder, Builder<? extends TAction>> updateFn) {
        actions.add(updateFn.apply(actionBuilder.get()).build());

        return this;
    }
}
