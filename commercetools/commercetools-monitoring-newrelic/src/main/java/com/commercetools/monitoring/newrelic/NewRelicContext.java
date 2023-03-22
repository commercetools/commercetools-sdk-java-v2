
package com.commercetools.monitoring.newrelic;

import com.newrelic.api.agent.Token;
import com.newrelic.api.agent.Transaction;

import io.vrap.rmf.base.client.ClassReferenceContext;

public interface NewRelicContext extends ClassReferenceContext {
    @Override
    Transaction getValue();

    Transaction getTransaction();

    Token getToken();

    @Override
    default Class<?> classReference() {
        return NewRelicContext.class;
    }

    public static NewRelicContext of(final Transaction transaction, final Token token) {
        return new NewRelicContextImpl(transaction, token);
    }

    public static NewRelicContext of(final Transaction transaction) {
        return new NewRelicContextImpl(transaction);
    }
}
