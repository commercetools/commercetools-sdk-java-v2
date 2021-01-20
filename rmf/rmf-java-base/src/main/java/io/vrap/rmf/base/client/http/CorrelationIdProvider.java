
package io.vrap.rmf.base.client.http;

@FunctionalInterface
public interface CorrelationIdProvider {
    String getCorrelationId();
}
