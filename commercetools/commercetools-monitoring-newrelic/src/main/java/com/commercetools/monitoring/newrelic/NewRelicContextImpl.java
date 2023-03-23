
package com.commercetools.monitoring.newrelic;

import java.util.Optional;

import com.newrelic.api.agent.Token;
import com.newrelic.api.agent.Transaction;

public class NewRelicContextImpl implements AutoCloseable, NewRelicContext {
    private final Transaction transaction;

    private final Token token;

    public NewRelicContextImpl(final Transaction transaction) {
        this.transaction = transaction;
        this.token = transaction.getToken();
    }

    public NewRelicContextImpl(final Transaction transaction, final Token token) {
        this.transaction = transaction;
        this.token = token;
    }

    @Override
    public Transaction getValue() {
        return transaction;
    }

    @Override
    public Transaction getTransaction() {
        return transaction;
    }

    @Override
    public Token getToken() {
        return token;
    }

    @Override
    public void close() {
        Optional.ofNullable(this.token).ifPresent(Token::expire);
    }
}
