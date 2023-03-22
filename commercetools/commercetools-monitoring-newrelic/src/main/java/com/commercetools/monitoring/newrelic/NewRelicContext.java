
package com.commercetools.monitoring.newrelic;

import com.newrelic.api.agent.Token;
import com.newrelic.api.agent.Transaction;

import io.vrap.rmf.base.client.Context;

public interface NewRelicContext extends Context {
    @Override
    Transaction getValue();

    Transaction getTransaction();

    Token getToken();

    public static NewRelicContext of(final Transaction transaction, final Token token) {
        return new NewRelicContextImpl(transaction, token);
    }

    public static NewRelicContext of(final Transaction transaction) {
        return new NewRelicContextImpl(transaction);
    }
}
