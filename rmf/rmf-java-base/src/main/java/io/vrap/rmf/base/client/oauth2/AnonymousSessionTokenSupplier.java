package io.vrap.rmf.base.client.oauth2;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.http.InternalLogger;
import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class AnonymousSessionTokenSupplier implements TokenSupplier {
    private final InternalLogger logger = InternalLogger.getLogger(LOGGER_AUTH);

    private final VrapHttpClient vrapHttpClient;
    private final ApiHttpRequest apiHttpRequest;

    public AnonymousSessionTokenSupplier (
            String clientId,
            String clientSecret,
            String scope,
            String tokenEndpoint,
            VrapHttpClient vrapHttpClient
    ) {
        this.vrapHttpClient = vrapHttpClient;
        this.apiHttpRequest = constructApiHttpRequest(clientId, clientSecret, scope, tokenEndpoint);
    }

    @Override
    public CompletableFuture<AuthenticationToken> getToken() {
        return vrapHttpClient
                .execute(apiHttpRequest)
                .whenComplete((response, throwable) -> {
                    if (throwable != null) {
                        logger.error(() -> response, throwable);
                    } else {
                        logger.debug(() -> response);
                    }
                })
                .thenApply(apiHttpResponse -> {
                    if(apiHttpResponse.getStatusCode() < 200 || apiHttpResponse.getStatusCode() > 299) {
                        throw new CompletionException(new Throwable(new String(apiHttpResponse.getBody())));
                    }
                    return apiHttpResponse;
                })
                .thenApply(
                        Utils.wrapToCompletionException(
                                (ApiHttpResponse<byte[]> response) -> VrapJsonUtils.fromJsonByteArray(response.getBody(), AuthenticationToken.class)
                        )
                );
    }


    private static ApiHttpRequest constructApiHttpRequest(
            final String clientId,
            final String clientSecret,
            final String scope,
            final String tokenEndpoint
    ) {
        String auth = Base64.getEncoder().encodeToString((clientId + ":" + clientSecret).getBytes(StandardCharsets.UTF_8));
        final ApiHttpRequest apiHttpRequest = new ApiHttpRequest();
        apiHttpRequest.setUri(URI.create(tokenEndpoint));
        if (scope == null || scope.isEmpty()) {
            apiHttpRequest.setBody("grant_type=client_credentials");
        } else {
            apiHttpRequest.setBody("grant_type=client_credentials&scope=" + scope);
        }
        final ApiHttpHeaders apiHttpHeaders = new ApiHttpHeaders();
        apiHttpHeaders.withHeader("Authorization", "Basic " + auth);
        apiHttpHeaders.withHeader("Content-Type", "application/x-www-form-urlencoded");
        apiHttpRequest.setHeaders(apiHttpHeaders);
        apiHttpRequest.setMethod(ApiHttpMethod.POST);
        return apiHttpRequest;
    }

}
