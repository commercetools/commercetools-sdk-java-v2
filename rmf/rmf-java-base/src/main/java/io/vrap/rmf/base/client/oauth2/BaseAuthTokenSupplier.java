
package io.vrap.rmf.base.client.oauth2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.http.InternalLogger;
import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

public abstract class BaseAuthTokenSupplier extends AutoCloseableService implements TokenSupplier {
    protected final VrapHttpClient vrapHttpClient;
    protected final ApiHttpRequest apiHttpRequest;
    protected final InternalLogger logger = InternalLogger.getLogger(LOGGER_AUTH);

    public BaseAuthTokenSupplier(final VrapHttpClient vrapHttpClient, ApiHttpRequest apiHttpRequest) {
        this.vrapHttpClient = vrapHttpClient;
        this.apiHttpRequest = apiHttpRequest;
    }

    @Override
    public CompletableFuture<AuthenticationToken> getToken() {
        return vrapHttpClient.execute(apiHttpRequest).whenComplete((response, throwable) -> {
            logger.info(() -> String.format("%s %s %s", apiHttpRequest.getMethod().name(), apiHttpRequest.getUrl(),
                response.getStatusCode()));
            if (throwable != null) {
                logger.error(() -> response, throwable);
            }
            else {
                logger.debug(() -> response);
            }
        }).thenApply(apiHttpResponse -> {
            if (apiHttpResponse.getStatusCode() < 200 || apiHttpResponse.getStatusCode() > 299) {
                if (apiHttpResponse.getStatusCode() == 405) {
                    throw new CompletionException(new AuthException(apiHttpResponse.getStatusCode(),
                        new String(apiHttpResponse.getBody()), apiHttpRequest.getHeaders(),
                        apiHttpResponse.getMessage()
                                + " : auth token URI may be incorrect e.g. https://auth.europe-west1.gcp.commercetools.com/oauth/token",
                        apiHttpResponse));
                }
                throw new CompletionException(
                    new AuthException(apiHttpResponse.getStatusCode(), new String(apiHttpResponse.getBody()),
                        apiHttpRequest.getHeaders(), apiHttpResponse.getMessage(), apiHttpResponse));
            }
            return apiHttpResponse;
        })
                .thenApply(Utils.wrapToCompletionException((ApiHttpResponse<byte[]> response) -> JsonUtils
                        .fromJsonByteArray(response.getBody(), AuthenticationToken.class)));
    }

    @Override
    protected void internalClose() {
        if (vrapHttpClient instanceof AutoCloseable)
            closeQuietly((AutoCloseable) vrapHttpClient);
    }
}
