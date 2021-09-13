
package io.vrap.rmf.base.client.http;

/**
 * Provider for a correlation id which may be added to a request as unique identifier
 */
@FunctionalInterface
public interface CorrelationIdProvider {
    String getCorrelationId();
}
